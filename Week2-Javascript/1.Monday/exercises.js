//exercise 3
// let a = 4;
// function test3(){
//     a = 3;
//     console.log("a = " + a);
// }

// test3();
// console.log("a = " + a);

// //exercise 4
// let a = 4;
// function test4(){
//     let a = 7;
//     console.log("a = " + a);
// }

// test4();
// console.log("a = " + a);

"use strict";
let a = 4;

function test5() {
    a = 7; 
    function again() {
        let a = 8; 
        console.log("a = " + a);  
    }
    again(); 
    console.log("a = " + a);  
}

test5(); 
console.log("a = " + a); 
