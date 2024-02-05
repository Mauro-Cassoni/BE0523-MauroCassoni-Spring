package it.epicode.w5d1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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



}
