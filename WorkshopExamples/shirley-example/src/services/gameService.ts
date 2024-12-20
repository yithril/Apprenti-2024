import { Game } from "../models/Game";
import { Prediction } from "../models/Prediction";

//I'm not really using an api here, I don't want ot build one so I just
//wrote some values down for the sake of the example. Use your real API please
export const gameService = {
    baseUrl: 'http://localhost:8080/api', 
    async getAll(): Promise<Game[]> {
        // Simulate an API call by returning hardcoded games
        return new Promise((resolve) => {
            setTimeout(() => {
                resolve([
                    { id: 1, teamA: "Lakers", teamB: "Warriors", gameDate: "2024-12-20" },
                    { id: 2, teamA: "Celtics", teamB: "Nets", gameDate: "2024-12-21" },
                    { id: 3, teamA: "Bulls", teamB: "Knicks", gameDate: "2024-12-22" },
                ]);
            }, 500); // Simulate network delay
        });
    },
    async postPrediction(prediction: Prediction): Promise<{ success: boolean; message: string }> {
        // Simulate an API call to submit the prediction
        return new Promise((resolve) => {
            setTimeout(() => {
                resolve({
                    success: true,
                    message: `Prediction submitted: Game ID ${prediction.gameId}, Winner ${prediction.winner}`,
                });
            }, 500); // Simulate network delay
        });
    }
}