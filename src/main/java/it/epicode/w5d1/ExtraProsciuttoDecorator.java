package it.epicode.w5d1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExtraProsciuttoDecorator extends ExtraIngredienti {

    public ExtraProsciuttoDecorator(PizzaAstratta pizzaAstratta){
        this.pizzaAstratta = pizzaAstratta;
    }

    @Override
    public String getNome(){
        return pizzaAstratta.getNome() + " + prosciutto";
    }

    public int getCalorie(){
        return pizzaAstratta.getCalorie() + 35;
    }

    public double getPrezzo(){
        return pizzaAstratta.getPrezzo() + 0.99;
    }



}
