import { apiService } from "./services/apiService";

const form = document.getElementById("recipe-form") as HTMLFormElement;

form.addEventListener('submit', async (event) => {
    //prevent from auto refreshing on submit
    event.preventDefault();

    //lets use form data to package our form into an object
    const formData = new FormData(form);

    //we need to take what the user typed in, and post it to the API
    const recipe = {
        name: formData.get("name") as string,
        ingredients: formData.get("ingredients") as string,
        instructions: formData.get("instructions") as string,
        isVegan: formData.get("isVegan") === "on"
    }

    try{
        const createdRecipe = await apiService.addRecipe("recipe", recipe);

        //redirect the user to the home page
        window.location.href = 'index.html';
    }
    catch(error){
        alert("Failed to add recipe, so sorry.");
        console.error("Error adding recipe", error);
    }
})