const employees = [
    { name: "Alice Brown", age: 25, department: "Engineering", jobTitle: "Software Engineer" },
    { name: "Bob Smith", age: 40, department: "Sales", jobTitle: "Sales Manager" },
    { name: "Charlie Davis", age: 35, department: "Marketing", jobTitle: "Content Strategist" },
    { name: "Dana Lee", age: 29, department: "HR", jobTitle: "HR Specialist" },
    { name: "Eve Johnson", age: 45, department: "Engineering", jobTitle: "Engineering Manager" },
    { name: "Frank Miller", age: 38, department: "Sales", jobTitle: "Sales Associate" },
    { name: "Grace Wilson", age: 31, department: "Marketing", jobTitle: "Social Media Manager" },
    { name: "Henry Clark", age: 27, department: "Engineering", jobTitle: "Software Engineer" },
    { name: "Ivy Scott", age: 42, department: "Finance", jobTitle: "Financial Analyst" },
    { name: "John Green", age: 50, department: "Sales", jobTitle: "Sales Manager" },
    { name: "Kimberly Baker", age: 30, department: "HR", jobTitle: "HR Specialist" },
    { name: "Liam White", age: 28, department: "Engineering", jobTitle: "DevOps Engineer" },
    { name: "Mia Moore", age: 39, department: "Finance", jobTitle: "Accountant" },
    { name: "Noah King", age: 29, department: "Engineering", jobTitle: "Software Engineer" },
    { name: "Olivia Lee", age: 33, department: "Sales", jobTitle: "Sales Associate" }
  ];
  
//1 Find the first employee who is a "Sales Manager".
let saleManager = employees.find(x => x.jobTitle === "Sales Manager");

//2 Find the first employee in the "Engineering" department who is younger than 30.
let engineerUnder30 = employees.find(x => x.department === "Engineering" && x.age < 30);

//3 Find the first employee who works in "HR" and is older than 30.
let hrdept = employees.find(x => x.department === "HR" && x.age > 30);

//CHALLENGE 
//4 Find the first employee whose name starts with "I"
//There MAY just be a special function for this! Check MDN
let firstI = employees.find(x => x.name.startsWith("I"));

let findI = employees.find(x => x.name[0] === "I");

//5 Check if any employee is a "DevOps Engineer".
let devEngineer = employees.some(y => y.department === "DevOps Engineer");

//6 Check if there is at least one employee in "Marketing" who is over 35.
let marketing = employees.some(x => x.department === "Marketing" && x.age > 35);

//7 Verify if any employee in "HR" is younger than 28.
let employee = employees.some(x => x.department === "HR" && x.age < 28);

//8 Check if all employees in "Engineering" are younger than 50.
let employeesInEngineering = employees.filter(x => x.department === "Engineering")
                                      .every(x => x.age < 50);

//console.log(employeesInEngineering);

//9 Check if every employee in "Sales" is a "Sales Manager".

//10 Verify if every employee is at least 25 years old.

//CHALLENGE
//Try out the following code:
//this is a for loop
employees.forEach(y => console.log(`${y.name} - ${y.age} - ${y.jobTitle} - ${y.department}`));
//11 What does forEach do?