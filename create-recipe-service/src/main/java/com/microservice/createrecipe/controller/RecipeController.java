package com.microservice.createrecipe.controller;

import com.microservice.createrecipe.model.Recipe;
import com.microservice.createrecipe.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("recipe")
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    @GetMapping("get-recipes")
    public List<Recipe> getAllRecipes(){
        return recipeService.getAllRecipes();
    }

    @PostMapping("create-recipe")
    public String createRecipe(@RequestBody Recipe recipe){
        return recipeService.createRecipe(recipe);
    }
}
