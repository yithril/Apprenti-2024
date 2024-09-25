//Step 1 target stuff the user is going to work with

const form = document.getElementById("budget-form");
const descriptionInput = document.getElementById("description");
const amount = document.getElementById("amount");
const category = document.getElementById("category");
const expenseList = document.getElementById("expense-list");

//This array will hold ALL my expenses
let expenses = [];

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

    let expense = {
        description: description,
        amount: amountValue,
        category: categoryChoice
    }

    //add expense to the array of expenses
    expenses.push(expense);

    console.log("Expenses array", expenses);

    form.reset();
    displayExpenses();
}

function displayExpenses(){
    //clear the list before we write anything
    expenseList.innerHTML = "";

    //loop through the expenses array
    for(let i = 0; i < expenses.length; i++){
        let currentExpense = expenses[i];

        //create an html element with JS
        //This is like writing <li></li>
        const li = document.createElement("li");

        if(currentExpense.category === "Rent"){
            //add a class to the li element
            li.classList.add("rent-expense");
        }
        else if(currentExpense.category === "Entertainment"){
            li.classList.add("entertainment-expense");
        }
        else{
            li.classList.add("groceries-expense");
        }

        //fill it with data from the expense
        //<li>description - amount - category</li>
        li.textContent = `${currentExpense.description} - ${currentExpense.amount} - ${currentExpense.category}`;

        //add it to the page
        expenseList.appendChild(li);
    }

}