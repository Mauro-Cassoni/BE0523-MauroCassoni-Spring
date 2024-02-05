package it.epicode.w5d1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class ExtraIngredienti extends PizzaAstratta{
    protected PizzaAstratta pizzaAstratta;

    @Override
    public abstract String getNome();

    public abstract int getCalorie();

    public abstract double getPrezzo();

}
