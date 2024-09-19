// 1. Use a for loop to print numbers 1 to 10 to the console.
// (Hint: You don't need any conditionals for this one.)

// 2. Write a while loop that prints the numbers 5 to 1 in reverse order.
// (Hint: Use a counter variable that starts at 5 and decreases by 1 each time through the loop. 
// This is called "decrementing" – subtracting 1 from the counter on each loop.)

// 3. Use a for loop to print the even numbers between 1 and 10.
// (Hint: You will need to use an if statement to check if a number is even.)

// 4. Write a while loop that asks the user to input a number until they enter a number greater than 10.
// (Hint: Use prompt and an if statement to check the input.)

while(true){
    let userInput = prompt("Give me a number");

    if(parseInt(userInput) > 10){
        alert("That number is greater than 10, goodbye!");
        break;
    }

    alert("The number is not greater than 10");
}

// 5. Write a while loop that starts with the number 1 and keeps doubling it until it is greater than 1000. 
// Print each number as it doubles. (No conditionals needed.)

// --- Array Manipulation Exercises ---

// 6. Given the array: let colors = ["red", "green", "blue"];
// Use the push() method to add "yellow" to the end of the array. Print the array to the console.

// 7. Given the array: let numbers = [1, 2, 3, 4, 5];
// Use the pop() method to remove the last item from the array. Print the array to the console.

// 8. Given the array: let fruits = ["apple", "banana", "orange"];
// Use the shift() method to remove the first item from the array. Print the array to the console.

// 9. Given the array: let animals = ["cat", "dog", "fish"];
// Use the unshift() method to add "bird" to the beginning of the array. Print the array to the console.

// 10. Given the array: let drinks = ["water", "soda", "juice", "tea"];
// What is at index 2? Write a comment with the answer.

// 11. Given the array: let letters = ["a", "b", "c", "d", "e"];
// What happens if you try to access an element at index 10? Write a comment explaining the result.

// --- Looping Through Arrays ---

// 12. Use a for loop to print each element in the following array: let pets = ["dog", "cat", "rabbit", "hamster"];

// 13. Write a while loop to print each element in the array: let scores = [80, 90, 75, 85];
// (Hint: Use a counter variable to keep track of the current index.)

// 14. Given the array: let names = ["Alice", "Bob", "Charlie", "David"];
// Use a for loop to print the names that start with the letter "C".
// (Hint: Use an if statement to check the first character of each name.)

// 15. Use a for loop to print the numbers in the array: let ages = [21, 30, 25, 18, 35];
// but skip the number 25 using an if statement and the `continue` keyword.