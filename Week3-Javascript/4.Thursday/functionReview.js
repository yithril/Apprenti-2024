// 1. Read this:
// A function is a block of code that we can call to perform a task.
// It has a **name** (which identifies it), it **takes arguments** (inputs),
// and it can **return a value** (output).

// 2. Write a function called `addNumbers` that takes two arguments: `a` and `b`.
// The function should return the sum of these two numbers.

// (Your function code here)
function addNumbers(a, b){
    return a + b;
}

// 3. Now call the function `addNumbers`, passing in the arguments 5 and 3.
// Store the result in a variable called `sum`.

// (Your function call here)
let sum = addNumbers(5, 3);

// 4. Print the result to the console.

// (Your console.log here)
console.log(sum);

let secondSum = addNumbers(10, 20);

// 5. Answer these questions in comments:

// - What is the **name** of the function being called?

// - What are the **arguments** being passed into the function?

// - When you call the function `addNumbers(5, 3)`, what line of code will the program jump to?
//   (Answer in terms of line number where the function is defined)

// - What does the function return?

// - What will be printed to the console when the function is called?


// BONUS: Write another function called `greet` that takes in a `name` as an argument.
// It should return the greeting: "Hello, " + name + "!".
// Then call the `greet` function with your name, and print the result to the console.

// (Your greet function code here)
// (Your greet function call and console.log here)

function greet(name){
    return `Hello ${name}!`;
}

let greeting = greet("Jonathan");

console.log(greeting);