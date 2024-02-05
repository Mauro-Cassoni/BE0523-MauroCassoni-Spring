package it.epicode.w5d1;

import java.util.List;

public class Menu {
    private List<PizzaAstratta> pizze;

    public void stampaMenu(){
        System.out.println("Pizze");
        pizze.stream().forEach(pizzaAstratta -> System.out.println(pizzaAstratta.getNome() +
                ", calorie: " + pizzaAstratta.getCalorie() +
                ", prezzo: " + pizzaAstratta.getPrezzo() +
                ", ingredienti: " + pizzaAstratta.getIngredienti()));
    }
}
