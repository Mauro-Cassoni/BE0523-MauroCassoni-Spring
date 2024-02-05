package it.epicode.w5d1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class ExtraSalameDecorator extends ExtraIngredienti {

    public ExtraSalameDecorator(PizzaAstratta pizzaAstratta){
        this.pizzaAstratta = pizzaAstratta;
    }

    @Override
    public String getNome(){
        return pizzaAstratta.getNome() + " + salame";
    }

    public int getCalorie(){
        return pizzaAstratta.getCalorie() + 86;
    }

    public double getPrezzo(){
        return pizzaAstratta.getPrezzo() + 0.99;
    }

    public List<IngredientiEnum> getIngredienti(){
        return pizzaAstratta.getIngredienti();
    }




}
