let firstNumber = prompt("What is the first number you want to add?");

let secondNumber = prompt("What is the second number you want to add?");

//let sum = Number(firstNumber) + Number(secondNumber);

//unary operator
//let sum = +firstNumber + +secondNumber;

//let sum = parseInt(firstNumber) + parseInt(secondNumber);

//what if my number is a fraction? 10.5 or 100.3
let sum = parseFloat(firstNumber) + parseFloat(secondNumber);

console.log('Your result is: ' + sum);