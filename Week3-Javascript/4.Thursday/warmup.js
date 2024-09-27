const people = [
    { name: 'John', age: 25, occupation: 'Engineer', city: 'New York' },
    { name: 'Jane', age: 30, occupation: 'Teacher', city: 'Chicago' },
    { name: 'Mike', age: 22, occupation: 'Designer', city: 'Los Angeles' },
    { name: 'Emily', age: 28, occupation: 'Engineer', city: 'New York' },
    { name: 'Chris', age: 35, occupation: 'Doctor', city: 'Houston' },
    { name: 'Anna', age: 27, occupation: 'Engineer', city: 'San Francisco' },
  ];

  //Lets practice the filter function
  
  // 1. Filter the array to get all people who are Engineers.
  let engineers = people.filter(x => x.occupation === "Engineer");
  
  // 2. Filter the array to get all people who live in New York.
  let newYorkers = people.filter(x => x.city === "New York");
  
  // 3. Filter the array to get all people who are older than 25.
  let over25 = people.filter(x => x.age > 25);
  
  // 4. Filter the array to get all people whose name starts with the letter 'J'.
  let jStart = people.filter(x => x.name.startsWith("J"));

  let jDifferentStart = people.filter(x => x.name[0] === "J");
  
  // 5. Filter the array to get all people who are either Engineers or Designers.
  let career = people.filter(x => x.occupation === "Engineer" || x.occupation === "Designer");
  