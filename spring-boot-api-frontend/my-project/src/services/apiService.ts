import { Recipe } from "../models/Recipe";
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
    },
    async getById(endpoint:string, id:string):Promise<Recipe> {
        try{
            const response = await axios.get<Recipe>(`${this.baseUrl}/${endpoint}/${id}`);
            return response.data;
        }
        catch(error){
            console.error('Error in getById:', error);
            throw error;
        }
    },
    async addRecipe(endpoint:string, recipe: Partial<Recipe>) : Promise<Recipe> {
        try{
            const response = await axios.post<Recipe>(`${this.baseUrl}/${endpoint}`, recipe);
            return response.data;
        }
        catch(error){
            console.error('Error in getAll:', error);
            throw error;
        }
    },
    //Below are examples of the other crud functions you may find useful
    async getOne(endpoint: string, id: number): Promise<Recipe> {
        try {
            const response = await axios.get<Recipe>(`${this.baseUrl}/${endpoint}/${id}`);
            return response.data; // Returns the single recipe
        } catch (error) {
            console.error("Error in getOne:", error);
            throw error;
        }
    },
    async update(endpoint: string, id: number, updatedRecipe: Partial<Recipe>): Promise<Recipe> {
        try {
            const response = await axios.put<Recipe>(`${this.baseUrl}/${endpoint}/${id}`, updatedRecipe);
            return response.data; // Returns the updated recipe
        } catch (error) {
            console.error("Error in update:", error);
            throw error;
        }
    },

    async delete(endpoint: string, id: number): Promise<void> {
        try {
            await axios.delete(`${this.baseUrl}/${endpoint}/${id}`);
        } catch (error) {
            console.error("Error in delete:", error);
            throw error;
        }
    }
};
