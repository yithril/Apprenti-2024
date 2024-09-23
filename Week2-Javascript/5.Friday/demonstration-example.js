//target the h1 tag
const welcomeTag = document.getElementById("welcome-title");

//console.log(welcomeTag);

//Let's change the welcome message
welcomeTag.textContent = "Wilkommen";

//target by a class
const messageTag = document.getElementsByClassName("message");

console.log(messageTag);

//target by the kind of tag
const button = document.querySelector("button");

console.log(button);