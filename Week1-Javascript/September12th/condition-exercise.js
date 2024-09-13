// Example 1: Three Conditions (AND and OR)

let temperature = 20;
let isSunny = true;
let isWeekend = false;

if (temperature > 25 && isSunny) {
    console.log("Go to the beach!");
} else if (temperature < 15 || !isSunny) {
    console.log("Stay indoors.");
} else {
    console.log("Go for a walk in the park.");
}

// Questions:
// Scenario 1: What will print if temperature = 28, isSunny = true, and isWeekend = false?
// Scenario 2: What will print if temperature = 10, isSunny = false, and isWeekend = true?
// Scenario 3: What will print if temperature = 20, isSunny = false, and isWeekend = true?


// Example 2: Four Conditions (Using AND and OR)

let grade = 85;
let hasExtraCredit = true;
let hasLateSubmission = false;
let teacherApproval = true;

if (grade > 90 && hasExtraCredit) {
    console.log("You get an A+!");
} else if (grade > 80 && !hasLateSubmission) {
    console.log("You get an A.");
} else if (grade > 70 || teacherApproval) {
    console.log("You get a B.");
} else {
    console.log("You need to improve.");
}

// Questions:
// Scenario 1: What will print if grade = 95, hasExtraCredit = true, hasLateSubmission = false, and teacherApproval = true?
// Scenario 2: What will print if grade = 85, hasExtraCredit = false, hasLateSubmission = true, and teacherApproval = true?
// Scenario 3: What will print if grade = 75, hasExtraCredit = false, hasLateSubmission = false, and teacherApproval = false?


// Extra Credit: Complex AND and OR Logic (3 Conditions)

let age = 17;
let hasLicense = false;
let parentPermission = true;

if (age >= 18 && hasLicense) {
    console.log("You can drive.");
} else if ((age >= 16 && parentPermission) || hasLicense) {
    console.log("You can drive with parental permission.");
} else {
    console.log("You cannot drive.");
}

// Questions:
// Scenario 1: What will print if age = 18, hasLicense = true, and parentPermission = false?
// Scenario 2: What will print if age = 17, hasLicense = false, and parentPermission = true?
// Scenario 3: What will print if age = 15, hasLicense = false, and parentPermission = false?
