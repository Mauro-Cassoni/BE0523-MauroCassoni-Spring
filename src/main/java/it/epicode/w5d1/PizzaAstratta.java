package it.epicode.w5d1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class PizzaAstratta {
    String nome = "";
    int calorie;
    double prezzo;
//    Ingredienti ingredienti;

    public String getNome(){
        return nome;
    }

    public int getCalorie(){
        return calorie;
    }

    public double getPrezzo(){
        return prezzo;
    }

}
