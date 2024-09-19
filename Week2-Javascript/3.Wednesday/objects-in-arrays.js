//array of strings
let fruits = ["strawberry", "orange", "plum"];

let menuItems = [
    { item: "Nachos", price: 5.99 },
    { item: "Burrito", price: 8.99 },
    { item: "Churros", price: 2.99 }
];

//how do we loop through an array? normally?
for(let i = 0; i < menuItems.length; i++){

}

//for of loop
for(let menuItem of menuItems){
    console.log(`${menuItem.item} ${menuItem.price}`);
}