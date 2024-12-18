import { gameService } from "./services/gameService";


document.addEventListener("DOMContentLoaded", async () => {
    const form = document.getElementById("prediction-form") as HTMLFormElement;
    const gameDropdown = document.getElementById("game-dropdown") as HTMLSelectElement;
    const teamALabel = document.getElementById("label-teamA") as HTMLLabelElement;
    const teamBLabel = document.getElementById("label-teamB") as HTMLLabelElement;
    const submitMessage = document.getElementById("submit-message") as HTMLParagraphElement;

    // Fetch games and populate the dropdown
    const games = await gameService.getAll();
    games.forEach((game) => {
        const option = document.createElement("option");
        option.value = game.id.toString();
        option.textContent = `${game.teamA} vs ${game.teamB} (${game.gameDate})`;
        gameDropdown.appendChild(option);
    });

    // Update team labels when a game is selected
    gameDropdown.addEventListener("change", () => {
        const selectedGame = games.find((game) => game.id.toString() === gameDropdown.value);
        if (selectedGame) {
            teamALabel.textContent = selectedGame.teamA;
            teamBLabel.textContent = selectedGame.teamB;
            submitMessage.textContent = ""; // Clear any previous messages
        }
    });

    // Handle form submission
    form.addEventListener("submit", async (event) => {
        event.preventDefault(); // Prevent default form submission behavior

        const formData = new FormData(form);
        const gameId = formData.get("gameId");
        const winner = formData.get("winner");
        const username = formData.get("username");

        // Validate form data
        if (!gameId || !winner || !username) {
            submitMessage.textContent = "Please complete all fields.";
            submitMessage.classList.add("text-danger");
            submitMessage.classList.remove("text-success");
            return;
        }

        // Prepare prediction data
        const prediction = {
            gameId: parseInt(gameId.toString()),
            username: username.toString(),
            winner: winner.toString(),
        };

        try {
            const response = await gameService.postPrediction(prediction);
            if (response.success) {
                submitMessage.textContent = response.message;
                submitMessage.classList.add("text-success");
                submitMessage.classList.remove("text-danger");
                form.reset(); // Clear the form after submission
            } else {
                submitMessage.textContent = "Failed to submit prediction. Try again.";
                submitMessage.classList.add("text-danger");
                submitMessage.classList.remove("text-success");
            }
        } catch (error) {
            console.error("Error submitting prediction:", error);
            submitMessage.textContent = "An error occurred. Please try again.";
            submitMessage.classList.add("text-danger");
            submitMessage.classList.remove("text-success");
        }
    });
});
