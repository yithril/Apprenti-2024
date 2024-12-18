import { RoomExit } from "./RoomExit";

export interface GameNode {
    id:number;
    exits:RoomExit[];
    description:string;
}