const people = [
    { name: "John Doe", state: "California", occupation: "Software Engineer" },
    { name: "Jane Smith", state: "New York", occupation: "Graphic Designer" },
    { name: "Mike Johnson", state: "Texas", occupation: "Teacher" },
    { name: "Emily Davis", state: "Florida", occupation: "Nurse" },
    { name: "Chris Brown", state: "Nevada", occupation: "Sales Manager" },
    { name: "Sarah Wilson", state: "Oregon", occupation: "Writer" },
    { name: "David Lee", state: "Washington", occupation: "Chef" },
    { name: "Anna Scott", state: "Arizona", occupation: "Photographer" },
    { name: "Paul Walker", state: "Georgia", occupation: "Mechanic" },
    { name: "Laura Martinez", state: "Illinois", occupation: "Architect" },
    { name: "Joe Everybody", state: "Nevada", occupation: "DJ"}
  ];

//you want to look through a list of objects
//we already know push, pop, shift, unshift

//I want to find everyone who lives in Nevada
// => is lambda or arrow
let peopleWhoAreInNevada = people.filter(x => x.state === "Nevada");

//console.log(peopleWhoAreInNevada);

//find everybody who is a nurse
let peopleWhoAreNurses = people.filter(x => x.occupation === "Nurse");

//console.log(peopleWhoAreNurses);

//photographers who live in Arizona
let arizonaPhotographer = people.filter(x => x.state === "Arizona" && x.occupation === "Photographer");

//console.log(arizonaPhotographer);

//people who live in florida or georgia
let livingPeople = people.filter(x => x.state === "Florida" || x.state === "Georgia");

//console.log(livingPeople);

//people who don't live in Texas
let notInTexas = people.filter(person => person.state !== "Texas");

//console.log(notInTexas);

//find
//I want to find Sarah Wilson
let sarahWilson = people.find(x => x.name === "Sarah Wilson");

//console.log(sarahWilson);

//what would happen if we look for someone thats not there?
let jonathan = people.find(x => x.name === "Jonathan Hop");

//console.log(jonathan);

let personFromNevada = people.find(x => x.state === "Nevada");

//console.log(personFromNevada);

//some
//Is anybody in this list from Texas?

let isAnybodyFromTexas = people.some(x => x.state === "Texas");

//console.log(isAnybodyFromTexas);

//every
//Is everyone in my list a Software Engineer?

let everyoneEngineer = people.every(x => x.occupation === "Software Engineer");

console.log(everyoneEngineer);