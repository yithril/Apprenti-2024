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

  //imperative style
  let nurseArray = [];
  for(let person of people){
    if(person.occupation === "Nurse"){
        teacherArray.push(person);
    }
  }