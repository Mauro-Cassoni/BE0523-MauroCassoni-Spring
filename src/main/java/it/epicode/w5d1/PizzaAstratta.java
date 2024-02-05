package it.epicode.w5d1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public abstract class PizzaAstratta {
    String nome = "";
    int calorie;
    double prezzo;
    List<IngredientiEnum> ingredienti;

    public String getNome(){
        return nome;
    }

    public int getCalorie(){
        return calorie;
    }

    public double getPrezzo(){
        return prezzo;
    }

    public List<IngredientiEnum> getIngredienti(){
        return ingredienti;
    }


}
