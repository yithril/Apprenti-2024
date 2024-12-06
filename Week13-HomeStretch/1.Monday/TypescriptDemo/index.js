"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
//variables
//string, boolean, number, big int, null, symbol, undefined
var firstName = "Jonathan";
var age = 40;
var isProgrammer = true;
var someVariable = 500;
//union type
var userName = "Bob";
//functions are different
function addTwoNumbers(firstNum, secondNum) {
    return firstNum + secondNum;
}
function sayHello(greeting) {
    console.log("Hi there ".concat(greeting, "!"));
}
var newUser = {
    name: "Bob",
    age: 35,
    favoriteFood: "Pizza"
};
var users = [
    { name: "George", age: 25, favoriteFood: "Ravioli" },
    { name: "Mergatroid", age: 99, favoriteFood: "Minestrone" },
    { name: "Bob", age: 53, favoriteFood: "Pizza" }
];
