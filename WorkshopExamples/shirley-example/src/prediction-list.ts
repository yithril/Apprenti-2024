import { Prediction } from "./models/Prediction";

const fetchButton = document.getElementById("fetchButton")!;
const usernameInput = document.getElementById("usernameInput") as HTMLInputElement;
const errorDiv = document.getElementById("error")!;
const predictionTableContainer = document.getElementById("predictionTableContainer")!;

fetchButton.addEventListener("click", async () => {
  const username = usernameInput.value.trim();
  if (!username) {
    errorDiv.textContent = "Username cannot be empty.";
    return;
  }

  errorDiv.textContent = ""; 
  try {
    const response = await fetch(`http://localhost:8080/api/predictions/${username}`);
    if (!response.ok) {
      throw new Error("Failed to fetch predictions.");
    }
    const predictions: Prediction[] = await response.json();
    renderPredictions(predictions);
  } catch (error) {
    errorDiv.textContent = "Failed to fetch predictions. Please try again.";
  }
});

function renderPredictions(predictions: Prediction[]) {
  if (predictions.length === 0) {
    predictionTableContainer.innerHTML = "<p>No predictions found.</p>";
    return;
  }

  const table = document.createElement("table");
  table.className = "table table-striped";
  table.innerHTML = `
    <thead>
      <tr>
        <th>Game ID</th>
        <th>Username</th>
        <th>Team A</th>
        <th>Team B</th>
        <th>Winner</th>
        <th>Status</th>
      </tr>
    </thead>
    <tbody>
      ${predictions
        .map(
          (prediction) => `
        <tr>
          <td>${prediction.gameId}</td>
          <td>${prediction.username}</td>
          <td>${prediction.winnerName}</td>
          <td>
            ${
              prediction.predictionStatus === "CORRECT"
                ? `<span class="badge badge-success">✔ Correct</span>`
                : prediction.predictionStatus === "INCORRECT"
                ? `<span class="badge badge-danger">✘ Incorrect</span>`
                : `<span class="badge badge-pending">Pending</span>`
            }
          </td>
        </tr>
      `
        )
        .join("")}
    </tbody>
  `;

  predictionTableContainer.innerHTML = "";
  predictionTableContainer.appendChild(table);
}