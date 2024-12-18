import { FlashCard } from "./FlashCard";

export interface Deck {
    id:number;
    name:string;
    description:string;
    cards:FlashCard[];
}