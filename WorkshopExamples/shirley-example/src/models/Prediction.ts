export interface Prediction {
    id:number;
    gameId: number;
    username: string;
    winnerName: string;
    predictionStatus:string;
    predictionDate:Date; 
}