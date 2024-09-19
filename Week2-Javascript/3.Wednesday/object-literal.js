//car object
//2010 Dodge Charger 50,000 miles

let car = {
    //key-value pairs
    make: "Dodge",
    model: "Charger",
    mileage: 50_000,
    year: 2010
}

//we drive the car some, we add more mileage
car.mileage += 10_000;

//console.log("This car is a " + car.make + " " + car.model);

let car2 = {
    make: "Jeep",
    model: "Patriot",
    mileage: 90_000,
    year: 2015
}

//when naming a function try to use verbs
function printCarInfo(car){
   console.log(`Car info- Make: ${car.make} Model: ${car.model} 
    Mileage: ${car.mileage} Year: ${car.year}`);
}

printCarInfo(car);