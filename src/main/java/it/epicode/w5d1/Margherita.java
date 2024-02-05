package it.epicode.w5d1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
public class Margherita extends PizzaAstratta{
    public Margherita(){
        nome = "Margherita";
        calorie = 1104;
        prezzo = 4.99;
    }

    @Override
    public String getNome(){
        return nome;
    }

    @Override
    public int getCalorie(){
        return calorie;
    }

    @Override
    public double getPrezzo(){
        return prezzo;
    }

}
