/*
    JavaScript Warmup Activity
    Topics: Arithmetic, PEMDAS, String Concatenation, prompt
    Extra Credit: String Interpolation and Exponents

    Instructions:
    - Answer the conceptual questions as multi-line comments.
    - Complete the coding exercises below.
    - For extra credit, complete the string interpolation and exponent sections.
*/

// Part 1: Quick Conceptual Questions

/*
1. What does PEMDAS stand for, and why is it important when evaluating arithmetic expressions?
Answer:

2. How can we combine strings and the value of variables together in messages?
Answer:

3. What is the purpose of the prompt function in JavaScript?
Answer:

4. Javascript cannot run by itself. What are the two things we can use to
   run a Javascript program?
Answer:

5. In an HTML file, how do we bring the Javascript file in?
Answer:
*/

// Part 2: Coding Exercises

// Exercise 1: Evaluate the following expression using PEMDAS 
let result = 3 + 4 * 2 / (1 - 3);

//Expected result:

// Exercise 2: String Concatenation
let firstName = "John";
let age = 25;

//Write code to output "John is 25 years old" to the console on the next line
//Make sure you use the variables!
console.log(firstName + " is " + age + " years old");

// Exercise 3: String Interpolation with backticks
// Complete this part using backticks (``) for string interpolation.
//Print out 'Javascript is 29 years old!' to the screen using the variables
let programmingLanguage = "Javascript";
let yearsOld = 29.

console.log(`${programmingLanguage} is ${yearsOld} years old!`);

// Exercise 4: Shorthand Operators (++, +=)
// Using the shorthand operators ++ and +=, complete the following:

let counter = 0;

counter++;
counter += 10;

//What is the final value of the variable counter?