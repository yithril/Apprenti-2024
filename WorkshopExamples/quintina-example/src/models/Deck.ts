import { FlashCard } from "./Flashcard";

export interface Deck {
    id:number;
    name:string;
    description:string;
    cards:FlashCard[];
}