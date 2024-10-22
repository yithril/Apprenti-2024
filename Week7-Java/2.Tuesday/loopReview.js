// Warm-up with Loops

// 1. Counting Up with a `for` Loop
// Write a `for` loop that prints the numbers from 1 to 10 in order.
// Use console.log() to print the numbers to the console.

for(let i = 1; i < 11; i++){
    console.log(i);
}

// 2. Counting Down with a `while` Loop
// Write a `while` loop that prints the numbers from 10 down to 1.
// Don’t forget to update the variable inside the loop to avoid an infinite loop.

let i = 10;
while(i > 0){
    console.log(i);
    i--;
}

// 3. Looping Through an Array
// Create an array of five different fruits.
// Use a `for` loop to print each fruit to the console.

const fruits = ['apple', 'banana', 'cherry', 'date', 'elderberry'];

for(let c = 0; c < fruits.length; c++){
    //console.log(fruits[c]);
}

fruits.push('orange');
fruits.unshift('blueberries');

//console.log(fruits);

fruits.pop();
fruits.shift();

//console.log(fruits);

//console.log(fruits[3]);

fruits.push(10);

console.log(fruits);