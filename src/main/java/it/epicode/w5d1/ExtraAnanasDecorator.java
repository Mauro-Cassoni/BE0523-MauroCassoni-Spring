package it.epicode.w5d1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class ExtraAnanasDecorator extends ExtraIngredienti {

    public ExtraAnanasDecorator(PizzaAstratta pizzaAstratta){
        this.pizzaAstratta = pizzaAstratta;
    }

    @Override
    public String getNome(){
        return pizzaAstratta.getNome() + " + ananas";
    }

    public int getCalorie(){
        return pizzaAstratta.getCalorie() + 24;
    }

    public double getPrezzo(){
        return pizzaAstratta.getPrezzo() + 0.79;
    }

    public List<IngredientiEnum> getIngredienti(){return pizzaAstratta.getIngredienti();}



}
