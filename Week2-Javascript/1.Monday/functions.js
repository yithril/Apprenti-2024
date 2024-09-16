//function declaration
//say hello

//write the word function first
//give the function a name
//between the curly braces you write your algorithm
//the word for the space between the curly braces is the function scope
function sayHello(){
    //console.log("Hi there, good morning.");
}


//in order for a function to DO something, you must call it
sayHello();
sayHello();

//what if the function calculates things?
//variables inside the paranethesis are called parameters (some folks say arguments);
function add(firstNumber, secondNumber){
    let sum = firstNumber + secondNumber;

    return sum;
}

let twoNumbers = add(2, 15);
//console.log("The sum is: " + twoNumbers);

//you can have as many parameters as you want
//your function may or may not have a return statement. That is up to you.
//If there is a return statement, there can only be ONE return statement unless you have conditionals
//Once you return the value, the function stops

//What about conditionals?
//Take in the weather, and return what you should wear
function whatToWear(weather){
    //if the weather is sunny, wear t-shirt and jeans
    //if the weather is snowy, wear a parka and a scarf
    //if the weather is rainy, wear a raincoat

    if(weather === "sunny"){
        return "Wear T-shirt and jeans";
    }
    else if(weather === "snowy"){
        return "Wear a parka and a scarf";
    }
    else{
        return "Wear a raincost";
    }
}

console.log(whatToWear("sunny"));

whatToWear("snow");

