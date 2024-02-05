package it.epicode.w5d1;

import lombok.Data;

import java.util.List;

@Data
public class Pizza {
    private String nome;
    private double prezzo;
    private int calorie;
    private List<Ingredienti> ingredienti;

}
