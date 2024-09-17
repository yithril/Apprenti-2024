// 1. Write a function called `describePerson` that takes two parameters: `age` and `occupation`.
//    Inside the function, use if statements to check the age:
//    - If `age` is less than 18, return the string: "You are a minor."
//    - If `age` is between 18 and 65, return: "You are an adult working as [occupation]."
//    - If `age` is over 65, return: "You are a retiree."

function describePerson(age, occupation){
    if(age < 18){
        return "You are a minor.";
    }
    else if(age >= 18 && age < 65){
        return "You are an adult working as " + occupation;
    }
    else{
        return "You are a retiree.";
    }
}

let description1 = describePerson(25, "developer");
let description2 = describePerson(15, "student");
let description3 = describePerson(70, "teacher");

console.log(description1);
console.log(description2);
console.log(description3);

//shortcut
console.log(describePerson(25, "developer"));

// 2. Call the function `describePerson` with the arguments 25 and 'developer'. 
//    Store the result in a variable named `description1`.

// 3. Call the function `describePerson` with the arguments 15 and 'student'. 
//    Store the result in a variable named `description2`.

// 4. Call the function `describePerson` with the arguments 70 and 'teacher'. 
//    Store the result in a variable named `description3`.

// 5. Log `description1`, `description2`, and `description3` to the console.
