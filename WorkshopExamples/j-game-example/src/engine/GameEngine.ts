import { GameNode } from "../models/GameNode";

export class GameEngine {
    gameNodes:GameNode[];
    currentPlayerName:string;
    currentPlayerNode:GameNode;

    constructor(gameNodes:GameNode[], currentPlayerName:string){
        this.gameNodes = gameNodes;
        this.currentPlayerName = currentPlayerName;
        this.currentPlayerNode = this.gameNodes[0];
    }

    move(direction: string): void {
        const exit = this.currentPlayerNode.exits.find(e => e.direction === direction);
        if (exit) {
            const targetNode = this.gameNodes.find(node => node.id === exit.targetId);
            if (targetNode) {
                this.currentPlayerNode = targetNode;
                this.updateDisplay();
            } else {
                console.error(`Target node with ID ${exit.targetId} not found.`);
            }
        } else {
            alert(`No exit in direction: ${direction}`);
        }
    }

    updateDisplay(): void {
        // Update the game screen with the new node description
        const descriptionElement = document.getElementById("node-description");
        if (descriptionElement) {
            descriptionElement.textContent = this.currentPlayerNode.description;
        }

        // Update the player's info (name, stats, etc.)
        const playerNameElement = document.getElementById("player-name");
        if (playerNameElement) {
            playerNameElement.textContent = `Player: ${this.currentPlayerName}`;
        }
    }
}