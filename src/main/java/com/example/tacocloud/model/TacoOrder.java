package com.example.tacocloud.model;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;

@Data
public class TacoOrder {
    @NotBlank(message="Delivery name is required")
    //tag::allButValidation[]
    private String deliveryName;
    //end::allButValidation[]

    @NotBlank(message="Street is required")
    //tag::allButValidation[]
    private String deliveryStreet;
    //end::allButValidation[]

    @NotBlank(message="City is required")
    //tag::allButValidation[]
    private String deliveryCity;
    //end::allButValidation[]

    @NotBlank(message="State is required")
    //tag::allButValidation[]
    private String deliveryState;
    //end::allButValidation[]

    @NotBlank(message="Zip code is required")
    //tag::allButValidation[]
    private String deliveryZip;
    //end::allButValidation[]

    @CreditCardNumber(message="Not a valid credit card number")
    //tag::allButValidation[]
    private String ccNumber;
    //end::allButValidation[]

    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",
            message="Must be formatted MM/YY")
    //tag::allButValidation[]
    private String ccExpiration;
    //end::allButValidation[]

    @Digits(integer=3, fraction=0, message="Invalid CVV")
    //tag::allButValidation[]
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}
