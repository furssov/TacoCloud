package com.example.tacocloud.converter;

import java.util.HashMap;
import java.util.Map;

import com.example.tacocloud.model.Ingredient;
import com.example.tacocloud.repository.IngredientRepository;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;



@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    @Autowired
   private IngredientRepository ingredientRepository;

    @Override
    public Ingredient convert(String id) {
        return ingredientRepository.findById(id).orElse(null);
    }
}