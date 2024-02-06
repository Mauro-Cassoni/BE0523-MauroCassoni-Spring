package it.epicode.w5d1;

import java.util.List;

public class Menu {
    private List<PizzaAstratta> pizze;

    public void aggiungiPizza(PizzaAstratta pizza) {
        pizze.add(pizza);
    }

    public void stampaMenu(){
        System.out.println("Pizze");
        pizze.forEach(pizzaAstratta -> System.out.println(pizzaAstratta.getNome() +
                ", calorie: " + pizzaAstratta.getCalorie() +
                ", prezzo: " + pizzaAstratta.getPrezzo() +
                ", ingredienti: " + pizzaAstratta.getIngredienti()));
    }
}
