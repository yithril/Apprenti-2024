import { GameEngine } from "./engine/GameEngine";
import { GameNode } from "./models/GameNode";
import { gameService } from "./services/gameService";

let gameEngine: GameEngine;

document.addEventListener("DOMContentLoaded", async () => {
    try {
        // Simulate fetching game nodes from the service
        const gameNodes: GameNode[] = await gameService.getAll();

        // Initialize the game engine with fetched nodes and player name
        gameEngine = new GameEngine(gameNodes, "Player1");

        //DO NOT FORGET THIS
        //OR THE GAME ENGINE GOES AWAY
        (window as any).gameEngine = gameEngine;
        
        // Set the initial display
        gameEngine.updateDisplay();
    } catch (error) {
        console.error("Error initializing the game:", error);
    }
});