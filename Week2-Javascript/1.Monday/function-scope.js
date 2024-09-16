// Global variable
let globalVar = 10;

function exampleFunction() {
    // Local variable
    let localVar = 5;

    // Modify the global variable
    globalVar = 20;

    // Attempt to access an undefined variable
    console.log(undeclaredVar); // Q2: What happens here? Why does this cause an error?
}

console.log("Before function call, globalVar:", globalVar); // Q1: What will be printed here?

// Call the function
exampleFunction();

console.log("After function call, globalVar:", globalVar); // Q3: What will this print? Why did it change?

// Attempt to access localVar outside of its scope
console.log(localVar); // Q4: Will this cause an error? Why?

// Q5: What is the difference between global and local variables in this example? How does scope affect variable accessibility?
