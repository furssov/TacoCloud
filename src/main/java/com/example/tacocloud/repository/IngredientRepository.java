package com.example.tacocloud.repository;

import com.example.tacocloud.model.Ingredient;

import java.util.Optional;


public interface IngredientRepository {
    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);
}
