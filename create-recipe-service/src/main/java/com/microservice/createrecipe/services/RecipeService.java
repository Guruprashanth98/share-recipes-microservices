package com.microservice.createrecipe.services;

import com.microservice.createrecipe.model.Recipe;
import com.microservice.createrecipe.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    RecipeRepository recipeRepository;
    public List<Recipe> getAllRecipes(){
        return recipeRepository.findAll();
    }

    public String createRecipe(Recipe recipe) {
        recipeRepository.save(recipe);
        return "Created Recipe";
    }
}
