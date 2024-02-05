package it.epicode.w5d1;

import lombok.Data;

@Data
public class Salame extends PizzaAstratta{
    public Salame(){
        nome = "Salame";
        calorie = 1160;
        prezzo = 5.99;
    }

}
