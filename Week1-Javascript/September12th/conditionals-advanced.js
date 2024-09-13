let isSunny = true;
let temperature = 70;

//multiple conditions
//AND - OR
//&& = And
// || = OR

if(isSunny === false && temperature <= 20){
    console.log('Put on a scarf and a coat.');
}
//if the temperature is above 20 but less than 40
else if(temperature > 20 && temperature < 40){
    console.log('Put on a hoodie');
}
//the temperature is equal to or above 40 and less than 70
else if(temperature >= 40 && temperature < 70){
    console.log('Wear a light coat, maybe.');
}
else{
    console.log("Its hot, do you what you wanna do.");
}

//OR
let isWindy = false;
let isSnowing = false;

if(isWindy === true || isSnowing === true){
    console.log("I need my coat.");
}