import { apiService } from './services/apiService';

async function loadRecipeDetails() {
  const recipeDetailsContainer = document.getElementById('recipe-details');

  if (recipeDetailsContainer) {
    // Parse the recipe ID from the URL query string
    const params = new URLSearchParams(window.location.search);
    const recipeId = params.get('id');

    if (!recipeId) {
      recipeDetailsContainer.innerHTML = '<p class="text-danger">No recipe ID provided.</p>';
      return;
    }

    try {
      // Fetch the recipe details
      const recipe = await apiService.getById('recipe', recipeId);

      // Construct the image path (use a default if missing)
      const imagePath = recipe.recipeImage ? `/images/${recipe.recipeImage}` : '/images/default.jpg';

      // Render the recipe details with the image
      recipeDetailsContainer.innerHTML = `
        <img src="${imagePath}" class="card-img-top" alt="${recipe.name}">
        <div class="card-body">
          <h2 class="card-title">${recipe.name}</h2>
          <p><strong>Ingredients:</strong> ${recipe.ingredients}</p>
          <p><strong>Instructions:</strong> ${recipe.instructions}</p>
          <p><strong>Vegan:</strong> ${recipe.isVegan ? 'Yes' : 'No'}</p>
        </div>
      `;
    } catch (error) {
      recipeDetailsContainer.innerHTML = '<p class="text-danger">Failed to load recipe details.</p>';
    }
  }
}

document.addEventListener('DOMContentLoaded', loadRecipeDetails);
