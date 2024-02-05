package it.epicode.w5d1;

import lombok.Data;

@Data
public class Hawaiana extends PizzaAstratta{
    public Hawaiana(){
        nome = "Hawaiana";
        calorie = 1024;
        prezzo = 6.49;
    }

}
