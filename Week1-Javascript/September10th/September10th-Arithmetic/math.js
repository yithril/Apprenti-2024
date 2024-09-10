let addition = 10 + 20 + 200 + 5;

let subtraction = 500 - 275;

let multiplication = 10 * 50;

let division = 200 / 20;

//modulo
let moduloExample = 20 % 15;

//even numbers
//Even numbers the modulus is 0 when divided by 2
let evenNumber = 200 % 2; //evenNumber is 0
let oddNumber = 201 % 2; //oddNumber is 1

let salary = 45_000;

salary = salary + 10_000;

//There is a shorter way to write this
salary += 20_000; //salary = salary + 20_000

salary -= 5_000; //salary = salary - 5_000

//what if I want a number to go up by 1
let lineNumber = 10;

lineNumber++; //lineNumber += 1 OR lineNumber = lineNumber + 1
lineNumber++; //Now its 12

lineNumber--; //Go down by one

//exponents
let exponent = 2 ** 3;

//3 to the 5th power
let secondExponent = 3 ** 5;

//percentages
let restaurantBill= 50.55;

//You want to give a 15% tip
//Figure out what the bill is after the tip
let totalBill = restaurantBill * 1.15;

//EXPLANATION
//Normally you calculate 15% of the tip and add it to the 
//base amount. The base amount is 100%. 15% + 100% is 115%.

//multiple steps
//This is normal and this is fine
let tip = restaurantBill * .15;
totalBill = tip + restaurantBill;

//DISCOUNTS
//Normally
let bigScreenTv = 500;

let discountAmount = 500 * .2;

let totalPriceNormal = bigScreenTv - discountAmount;

//Another way to look at it
bigScreenTv = bigScreenTv * .8;