import { Game } from "./models/Game";
import { gameService } from "./services/gameService";

async function loadDropdown() {
    const dropdown = document.getElementById("game-dropdown") as HTMLSelectElement;
    const teamSelection = document.getElementById("team-selection") as HTMLDivElement;
    const teamALabel = document.getElementById("label-teamA") as HTMLLabelElement;
    const teamBLabel = document.getElementById("label-teamB") as HTMLLabelElement;
    const teamAInput = document.getElementById("teamA") as HTMLInputElement;
    const teamBInput = document.getElementById("teamB") as HTMLInputElement;

    try {
        // Fetch games from the API
        const games: Game[] = await gameService.getAll();

        // Populate the dropdown with games
        games.forEach((game) => {
            const option = document.createElement("option");
            option.value = game.id.toString();
            option.textContent = `${game.teamA} vs ${game.teamB} (${game.gameDate})`;
            dropdown.appendChild(option);
        });

        // Add event listener for dropdown change
        dropdown.addEventListener("change", () => {
            const selectedGame = games.find(game => game.id.toString() === dropdown.value);
            if (selectedGame) {
                // Show team selection radio buttons
                teamSelection.classList.remove("d-none");

                // Update radio button labels and values
                teamALabel.textContent = selectedGame.teamA;
                teamBLabel.textContent = selectedGame.teamB;
                teamAInput.value = selectedGame.teamA;
                teamBInput.value = selectedGame.teamB;
            }
        });
    } catch (error) {
        console.error("Error loading games:", error);
    }
}

document.addEventListener("DOMContentLoaded", loadDropdown);