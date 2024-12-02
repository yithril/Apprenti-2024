import { Recipe } from "./Recipe";
import axios from 'axios';

export const apiService = {
    baseUrl: 'http://localhost:8080/api', 

    async getAll(endpoint: string): Promise<Recipe[]> {
        try {
            const response = await axios.get<Recipe[]>(`${this.baseUrl}/${endpoint}`);
            return response.data; // Returns the list of recipes
        } catch (error) {
            console.error('Error in getAll:', error);
            throw error;
        }
    }
};
