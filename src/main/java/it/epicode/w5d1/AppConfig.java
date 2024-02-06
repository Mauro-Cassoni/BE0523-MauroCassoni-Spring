package it.epicode.w5d1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class AppConfig {
//    @Bean("margherita")
//    @Scope("prototype")
//    public Pizza getPizza(){
//        Pizza p = new Pizza();
//        p.setNome("Margherita");
//        p.setCalorie(1104);
//        p.setPrezzo(4.99);
//        List<Ingredienti> ingredienti = Arrays.asList(Ingredienti.POMODORO, Ingredienti.MOZZARELLA);
//        p.setIngredienti(ingredienti);
//        return  p;


    @Bean("pomodoro")
    public Ingredienti pomodoro(){
        Ingredienti pomodoro = new Ingredienti();
        pomodoro.setNome("pomodoro");
        pomodoro.setCalorie(80);
        pomodoro.setPrezzo(0.79);
        return pomodoro;
    }

    @Bean("mozzarella")
    public Ingredienti mozzarella(){
        Ingredienti mozzarella = new Ingredienti();
        mozzarella.setNome("mozzarella");
        mozzarella.setCalorie(92);
        mozzarella.setPrezzo(0.69);
        return mozzarella;
    }

    @Bean("prosciutto")
    public Ingredienti prosciutto(){
        Ingredienti prosciutto = new Ingredienti();
        prosciutto.setNome("prosciutto");
        prosciutto.setCalorie(35);
        prosciutto.setPrezzo(0.99);
        return prosciutto;
    }

    @Bean("cipolle")
    public Ingredienti cipolle(){
        Ingredienti cipolle = new Ingredienti();
        cipolle.setNome("cipolle");
        cipolle.setCalorie(22);
        cipolle.setPrezzo(0.69);
        return cipolle;
    }

    @Bean("ananas")
    public Ingredienti ananas(){
        Ingredienti ananas = new Ingredienti();
        ananas.setNome("ananas");
        ananas.setCalorie(24);
        ananas.setPrezzo(0.79);
        return ananas;
    }

    @Bean("salame")
    public Ingredienti salame(){
        Ingredienti salame = new Ingredienti();
        salame.setNome("salame");
        salame.setCalorie(86);
        salame.setPrezzo(0.99);
        return salame;
    }

    @Bean("margherita")
    public PizzaAstratta margherita(){
        PizzaAstratta margherita = new Margherita();
        return margherita;
    }


}
