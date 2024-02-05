package it.epicode.w5d1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ExtraMozzarellaDecorator extends ExtraIngredienti {

    public ExtraMozzarellaDecorator(PizzaAstratta pizzaAstratta){
        this.pizzaAstratta = pizzaAstratta;
    }

    @Override
    public String getNome(){
        return pizzaAstratta.getNome() + " + mozzarella";
    }

    public int getCalorie(){
        return pizzaAstratta.getCalorie() + 92;
    }

    public double getPrezzo(){
        return pizzaAstratta.getPrezzo() + 0.69;
    }



}
