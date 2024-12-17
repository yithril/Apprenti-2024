import { apiService } from './services/apiService';

async function loadRecipeTable() {
  const tableBody = document.querySelector('#recipe-table tbody');

  if (tableBody) {
    tableBody.innerHTML = '<tr><td colspan="6" class="text-center">Loading...</td></tr>';

    try {
      const recipes = await apiService.getAll('recipe');
      tableBody.innerHTML = ''; // Clear the loading message

      recipes.forEach(recipe => {
        const row = document.createElement('tr');
        const imagePath = recipe.recipeImage ? `/images/${recipe.recipeImage}` : '/images/default.jpg';

        row.innerHTML = `
          <td>${recipe.id}</td>
          <td>${recipe.name}</td>
          <td>${recipe.ingredients}</td>
          <td>${recipe.instructions}</td>
          <td>${recipe.isVegan ? 'Yes' : 'No'}</td>
          <td>
            <img src="${imagePath}" alt="${recipe.name}" style="width: 50px; height: auto;">
          </td>
        `;

        tableBody.appendChild(row);
      });
    } catch (error) {
      tableBody.innerHTML = '<tr><td colspan="6" class="text-danger text-center">Failed to load recipes.</td></tr>';
    }
  }
}

document.addEventListener('DOMContentLoaded', loadRecipeTable);
