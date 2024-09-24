//Step 1 target stuff the user is going to work with

const form = document.getElementById("budget-form");
const descriptionInput = document.getElementById("description");
const amount = document.getElementById("amount");
const category = document.getElementById("category");
const expenseList = document.getElementById("expense-list");

//Hey, if someone submits the form, let me know
//Inside the parenthesis there are two arguments
//first argument, what is the event?
//second argument, what function do you run when that event happens?
form.addEventListener('submit', submitForm);

function submitForm(event){
    //when submitting a form, the first piece of code should be preventDefault
    event.preventDefault();
    console.log("Form submitted");

    //grab the data from the input boxes and the dropdown
    const description = descriptionInput.value;
    const amountValue = amount.value;
    const categoryChoice = category.value;

    console.log(description);
    console.log(amountValue);
    console.log(categoryChoice);
}