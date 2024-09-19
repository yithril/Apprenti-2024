const people = [
    { name: "John Doe", state: "California", occupation: "Software Engineer", age: 30 },
    { name: "Jane Smith", state: "California", occupation: "Graphic Designer", age: 28 },
    { name: "Mike Johnson", state: "Texas", occupation: "Teacher", age: 45 },
    { name: "Emily Davis", state: "Florida", occupation: "Nurse", age: 32 },
    { name: "Chris Brown", state: "Nevada", occupation: "Sales Manager", age: 40 },
    { name: "Sarah Wilson", state: "Oregon", occupation: "Writer", age: 29 },
    { name: "David Lee", state: "California", occupation: "Chef", age: 35 },
    { name: "Anna Scott", state: "Arizona", occupation: "Photographer", age: 27 },
    { name: "Paul Walker", state: "Georgia", occupation: "Mechanic", age: 50 },
    { name: "Laura Martinez", state: "Illinois", occupation: "Architect", age: 38 },
    { name: "Sophia Harris", state: "Florida", occupation: "Nurse", age: 30 },
    { name: "James King", state: "Texas", occupation: "Software Engineer", age: 26 },
    { name: "Megan Carter", state: "New York", occupation: "Writer", age: 31 },
    { name: "Ethan Reed", state: "California", occupation: "Teacher", age: 48 },
    { name: "Grace Lewis", state: "Nevada", occupation: "Chef", age: 22 },
    { name: "Noah Walker", state: "Georgia", occupation: "Architect", age: 34 },
    { name: "Olivia Turner", state: "Florida", occupation: "Photographer", age: 27 },
    { name: "Liam Baker", state: "Texas", occupation: "Sales Manager", age: 40 },
    { name: "Ava Scott", state: "Arizona", occupation: "Software Engineer", age: 28 },
    { name: "Isabella Lee", state: "California", occupation: "Nurse", age: 24 },
    { name: "Lucas White", state: "New York", occupation: "Mechanic", age: 52 },
    { name: "Mia Moore", state: "Nevada", occupation: "Writer", age: 33 },
    { name: "Charlotte Green", state: "Oregon", occupation: "Graphic Designer", age: 29 },
    { name: "Henry Young", state: "Illinois", occupation: "Teacher", age: 39 },
    { name: "Amelia Adams", state: "Florida", occupation: "Architect", age: 45 }
  ];
  
// 1. Find all people who live in "California".
let peopleWhoAreInCalifornia = people.filter(x => x.state === "California");

// 2. Find all "Nurses".
//declarative style
let findAllNurses = people.filter(x => x.occupation === "Nurse");

// 3. Find all people older than 30.
let over30 = people.filter(x => x.age > 30);

// 4. Find all "Software Engineers" who live in "Texas".
let softEngTexas = people.filter(x => x.occupation === "Software Engineer" && x.state === "Texas");

// 5. Find all people who are either "Photographers" or "Writers".
let artists = people.filter(x => x.occupation === "Photographer" || x.occupation === "Writer");

console.log(artists);

// 6. Find all people who are older than 35 and live in "Nevada".
let olderNevada = people.filter(x => x.age > 35 && x.state === "Nevada");

// 7. Find all people who are younger than 25 or live in "Arizona".
let younger25AndArizona = people.filter(x => x.age < 25 || x.state === "Arizona");

// 8. Find all "Mechanics" who do not live in "Georgia".
let mechXGA = people.filter(x => x.state !== "Georgia" && x.occupation === "Mechanic");

// 9. Find all people who live in "California" or "Florida" and are younger than 30.
//let allInFlorida = people.filter(x => x.state === "California" && x.age < 30 || x.state === "Florida" && x.age < 30);

//function chain
let allInFlorida = people.filter(x => x.state === "California" || x.state === "Florida")
                         .filter(x => x.age < 30);

// 10. Find all "Doctors".
let allDoctors = people.filter(x => x.occupation === "Doctor");

// Challenge Question: Find all people who are "Writers" or "Graphic Designers", 
// live in either "California" or "Oregon", and are between the ages of 25 and 40.
let challenge = people.filter(x => x.occupation === "Writer" || x.occupation === "Graphic Designer")
                      .filter(y => y.state === "California" || y.state === "Oregon")
                      .filter(z => z.age >= 25 && z.age <= 40);