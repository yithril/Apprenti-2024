// 1. Use `document.getElementById` to select the <h1> element with the id of "main-title".
// Change its text content to "Assignment Completed!" below:
const mainTitle = document.getElementById("main-title");
mainTitle.textContent = "Assignment Completed!";

// 2. Use `document.getElementsByClassName` to select all elements with the class "description".
// Log these elements to the console and change the font color of the second description paragraph to "blue".
const descriptions = document.getElementsByClassName("description");
console.log(descriptions);
if (descriptions.length > 1) {
  descriptions[1].style.color = "blue";
}

// 3. Use `document.getElementsByTagName` to select all <li> elements.
// Change the background color of the first <li> to "lightgray".
const listItems = document.getElementsByTagName("li");
if (listItems.length > 0) {
  listItems[0].style.backgroundColor = "lightgray";
}

// 4. Use `document.querySelector` to select the button with the id "action-button".
// Add a "clicked" class to it. Write the code below:
const actionButton = document.querySelector("#action-button");
actionButton.classList.add("clicked");

// 5. Use `document.querySelectorAll` to select all <li> elements with the class "item".
// Loop through the elements and add a "highlight" class to each one. Write your loop below:
const itemList = document.querySelectorAll(".item");
itemList.forEach(item => {
  item.classList.add("highlight");
});

// 6. Add an event listener to the button so that when it is clicked, the "main-title" changes its text color to "green". 
// Write your code below:
actionButton.addEventListener("click", () => {
  mainTitle.style.color = "green";
});

// 7. Remove the "description" class from the second paragraph. Add a "notice" class to it instead. Write your code below:
if (descriptions.length > 1) {
  descriptions[1].classList.remove("description");
  descriptions[1].classList.add("notice");
}

// 8. Create a function that toggles the "highlight" class on the <ul> element when the button is clicked. 
// Link this function to the button’s click event. Write your code below:
const ulElement = document.querySelector("ul");
function toggleHighlight() {
  ulElement.classList.toggle("highlight");
}
actionButton.addEventListener("click", toggleHighlight);

// 9. Extra Challenge: Select the <body> element and add an inline style to set the background color to 
// "lightblue" using JavaScript.
document.body.style.backgroundColor = "lightblue";