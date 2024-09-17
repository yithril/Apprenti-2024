//use when you know how many times you want to do something
//3 parts in side the parenthesis
//each part is separated by a ;

//first part: what number does the loop start at?
//second part: should we continue the loop? condition to continue
//third part: at the end of the loop, what do we do with the variable
for(let i = 0; i < 4; i++){
    console.log(i);
}

for(let i = 20; i > 0; i--){
    console.log(i);
}

//what if we want to stop early?
for(let j = 0; j < 20; j++){
    if(j % 5 === 0){
        console.log('Stopping the loop...');
        break;
    }
}
