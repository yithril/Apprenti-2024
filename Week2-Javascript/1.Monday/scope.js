//global scope
let cartSum = 0;

//function scope or block scope

function sayHello(){
    let greeting = "Hi there";
    console.log(greeting);
}

function saySomething(){
    let greeting = "Salutations";
    console.log(greeting);
}

function addToCart(){
    cartSum += 10;
}

sayHello();
saySomething();

addToCart();
addToCart();

console.log(cartSum);