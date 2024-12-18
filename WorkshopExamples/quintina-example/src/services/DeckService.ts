import { Deck } from "../models/Deck";

export const deckService = {
    async getAllDecks(): Promise<Deck[]> {
        // Simulate an API call with a delay
        return new Promise((resolve) => {
            setTimeout(() => {
                resolve([
                    {
                        id: 1,
                        name: "JavaScript Basics",
                        description: "Learn the fundamentals of JavaScript.",
                        cards: [
                            { id: 1, question: "What is a variable?", answer: "A variable stores data values." },
                            { id: 2, question: "What is an array?", answer: "An array is a collection of items." },
                            { id: 3, question: "What is a function?", answer: "A function is a block of code that performs a task." },
                        ],
                    },
                    {
                        id: 2,
                        name: "TypeScript Advanced",
                        description: "Deep dive into TypeScript features.",
                        cards: [
                            { id: 4, question: "What is a type?", answer: "A type defines the shape of data." },
                            { id: 5, question: "What is an interface?", answer: "An interface is a contract for an object structure." },
                            { id: 6, question: "What is a union type?", answer: "A union type allows multiple types for a variable." },
                        ],
                    },
                ]);
            }, 500); // Simulate network delay
        });
    },
};