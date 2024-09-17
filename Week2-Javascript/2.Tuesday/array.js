//grocery list of stuff I wanna buy
//array is used to put together many pieces of data

//each piece of data in an array is called an element
//arrays have indexes, or slots where you can insert elements
//each index has a number. The numbering starts at 0
//the length of an array is how many elements are in the array

//console.log(groceryList[0]);

let groceryList = ["apples", "potato chips", "cereal", "milk"];

//add something to an array
groceryList.push("Graham Crackers");

console.log(groceryList);

groceryList.pop();

console.log(groceryList);

//shift and unshift are at the beginning
groceryList.unshift("strawberries");

console.log(groceryList);

groceryList.shift();

console.log(groceryList);

console.log(groceryList.length);