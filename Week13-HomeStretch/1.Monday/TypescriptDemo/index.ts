import { Person } from "./Person";

//variables
//string, boolean, number, big int, null, symbol, undefined

let firstName:string = "Jonathan";

let age:number = 40;

let isProgrammer:boolean = true;

let someVariable:any = 500;

//union type
let userName:string | null = "Bob";

//functions are different

function addTwoNumbers(firstNum:number, secondNum:number) : number {
    return firstNum + secondNum;
}

function sayHello(greeting:string) : void {
    console.log(`Hi there ${greeting}!`);
}

let newUser:Person = {
    name: "Bob",
    age: 35,
    favoriteFood: "Pizza"
}

let users:Person[] = [
    { name: "George", age: 25, favoriteFood: "Ravioli"},
    { name: "Mergatroid", age: 99, favoriteFood: "Minestrone"},
    { name: "Bob", age: 53, favoriteFood: "Pizza" }
];

console.log('Hi');