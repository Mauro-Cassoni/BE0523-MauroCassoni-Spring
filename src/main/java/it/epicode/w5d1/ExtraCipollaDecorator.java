package it.epicode.w5d1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ExtraCipollaDecorator extends ExtraIngredienti {

    public ExtraCipollaDecorator(PizzaAstratta pizzaAstratta){
        this.pizzaAstratta = pizzaAstratta;
    }

    @Override
    public String getNome(){
        return pizzaAstratta.getNome() + " + cipolla";
    }

    public int getCalorie(){
        return pizzaAstratta.getCalorie() + 22;
    }

    public double getPrezzo(){
        return pizzaAstratta.getPrezzo() + 0.69;
    }



}
