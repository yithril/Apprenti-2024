import { GameNode } from "../models/GameNode";

export const gameService = {
    async getAll(): Promise<GameNode[]> {
        return new Promise((resolve) => {
            setTimeout(() => {
                resolve([
                    {
                        id: 1,
                        exits: [{ id: 1, nodeId: 1, targetId: 2, direction: "north" }],
                        description: "You are in a bright, sunny clearing.",
                    },
                    {
                        id: 2,
                        exits: [{ id: 2, nodeId: 2, targetId: 1, direction: "south" }],
                        description: "You are in a dark, spooky forest.",
                    },
                ]);
            }, 500); 
        });
    },
};