// Assignment: JavaScript Targeting and Style Manipulation

// 1. Use `document.getElementById` to select the <h1> element with the id of "main-title".
// Change its text content to "Assignment Completed!" below:

// 2. Use `document.getElementsByClassName` to select all elements with the class "description".
// Log these elements to the console and change the font color of the second description paragraph to "blue".

// 3. Use `document.getElementsByTagName` to select all <li> elements.
// Change the background color of the first <li> to "lightgray".

// 4. Use `document.querySelector` to select the button with the id "action-button".
// Add a "clicked" class to it. Write the code below:

// 5. Use `document.querySelectorAll` to select all <li> elements with the class "item".
// Loop through the elements and add a "highlight" class to each one. Write your loop below:

// 6. Add an event listener to the button so that when it is clicked, the "main-title" changes its text color to "green". 
//Write your code below:

// 7. Remove the "description" class from the second paragraph. Add a "notice" class to it instead. Write your code below:
let paragraphs = document.getElementsByClassName('description');

if(paragraphs.length > 0){
    paragraphs[1].classList.add('notice');
    paragraphs[1].classList.remove('description');
}

// 8. Create a function that toggles the "highlight" class on the <ul> element when the button is clicked. 
//Link this function to the button’s click event. Write your code below:

let targetButton = document.getElementById("action-button");

targetButton.addEventListener('click', function() {
    let ulTag = document.getElementById('item-list');
    ulTag.classList.toggle('highlight');
});

// 9. Extra Challenge: Select the <body> element and add an inline style to set the background color to 
//"lightblue" using JavaScript.
