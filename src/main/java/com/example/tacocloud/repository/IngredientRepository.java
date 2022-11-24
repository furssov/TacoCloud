package com.example.tacocloud.repository;

import com.example.tacocloud.model.Ingredient;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
