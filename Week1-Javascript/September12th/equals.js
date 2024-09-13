// == vs ===

let inputAge = "18"; //string
let actualAge = 18; //number

if(inputAge === actualAge){
    console.log("input age and actual age are the same");
}

//truthy and falsy
if(1 === true){
    console.log("1 equals true");
}

let value = null;

if(value == undefined){
    console.log("null and undefined are equal");
}

if(0 === ''){
    console.log("Zero is equal to blank string");
}
