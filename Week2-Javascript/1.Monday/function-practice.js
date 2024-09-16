// 1. Write a function named `multiply` that takes two parameters, `a` and `b`, 
//    and returns their product.

function multiply(a, b){
    return a * b;
}

// 2. Create a function called `greet` that takes a single parameter, `name`, 
//    and returns the string 'Hello, ' followed by the `name`.

function greet(name){
    return "Hello " + name;
}

// 3. Define a function named `subtract` that takes in two parameters, `num1` and `num2`. 
//    The function should return the difference between `num1` and `num2`.

function subtract(num1, num2){
    return num1 - num2;
}

// 4. Write a function named `isEven` that takes in one parameter, `number`, 
//    and returns `true` if the number is even, or `false` otherwise.

function isEven(number){
    if(number % 2 === 0){
        return true;
    }
    else{
        return false;
    }
}

// 5. Write a function called `sayHello` that takes one parameter, `name`. 
//    It should return the string 'Hello, ' followed by `name`. 
//    Call this function with the argument 'John' and store the result in a variable named `greeting`.

function sayHello(name){
    return "Hello, " + name;
}

let greeting = sayHello("John");

// 6. Create a function named `square` that takes one parameter, `n`, 
//    and returns its square. Call this function with the number `5` 
//    and log the result to the console.

function square(n){
    return n ** 2;
}

console.log(square(5));

// 7. Write a function named `combineStrings` that takes in two parameters, `str1` and `str2`, 
//    and returns them combined into a single string.

function combineStrings(str1, str2){
    return str1 + str2;
}

// 8. Define a function named `average` that takes in three parameters: `num1`, `num2`, and `num3`. 
//    Return the average of the three numbers.

function average(num1, num2, num3){
    return (num1 + num2 + num3) / 3;
}