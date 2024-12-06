import { InventoryItem } from "./InventoryItem";
import { Mountain } from "./Mountain";

let mountainArray:Mountain[] = [
    { name: "Kilimanjaro", height: 19341 },
    { name: "Everest", height: 29029 },
    { name: "Denali", height: 20310 }
];

function findTallestMountain(mountains:Mountain[]){
    let tallestHeight = 0;
    let tallestName = "";

    for(let mountain of mountains){
        if(mountain.height > tallestHeight){
            tallestHeight = mountain.height;
            tallestName = mountain.name;
        }
    }

    // for(let i = 0; i < mountains.length; i++){
    //     if(mountains[i].height > tallestHeight){
    //         tallestHeight = mountains[i].height;
    //     }
    // }

    return tallestName;
}

let testMountainName = findTallestMountain(mountainArray);

console.log(testMountainName);

let inventoryItems:InventoryItem[] = [
    { product: { name: "Sneakers", price: 100 }, quantity: 100 }
]