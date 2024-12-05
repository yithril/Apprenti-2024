import './style.css';
import { apiService } from './services/apiService'

async function loadRecipes() {
  const recipeList = document.getElementById('recipe-list');
  if (recipeList) {
    recipeList.innerHTML = '<div class="text-center">Loading...</div>';
    try {
      const recipes = await apiService.getAll('recipe');
      recipeList.innerHTML = '';

      recipes.forEach(recipe => {
        const recipeCard = document.createElement('div');
        recipeCard.className = 'col-md-4 recipe-card';
        recipeCard.innerHTML = `
          <div class="card">
            <div class="card-body">
              <h5 class="card-title">${recipe.name}</h5>
              <p class="card-text">${recipe.ingredients}</p>
              <p class="card-text">${recipe.instructions}</p>
            </div>
          </div>
        `;
        recipeList.appendChild(recipeCard);
      });
    } catch (error) {
      recipeList.innerHTML = '<p class="text-danger">Failed to load recipes.</p>';
    }
  }
}

document.addEventListener('DOMContentLoaded', loadRecipes);
