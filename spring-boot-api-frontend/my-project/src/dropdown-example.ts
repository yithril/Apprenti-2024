import { Recipe } from "./models/Recipe";
import { apiService } from "./services/apiService";

async function loadDropdown(){
    //target the dropdown list
    let dropdownList = document.getElementById("recipe-dropdown") as HTMLSelectElement;

    // Check if dropdown exists
    if (!dropdownList) {
        console.error("Dropdown element not found!");
        return;
    }

    try {
        // Call the API to get the list of recipes
        let recipes: Recipe[] = await apiService.getAll('recipe');

        // Populate the dropdown with recipes
        recipes.forEach(recipe => {
            let option = document.createElement("option");
            option.value = recipe.id.toString(); // Use the recipe ID as the value
            option.textContent = recipe.name;   // Display the recipe name
            dropdownList.appendChild(option);
        });
    } catch (error) {
        console.error("Error loading recipes:", error);
    }
}

document.addEventListener('DOMContentLoaded', loadDropdown);