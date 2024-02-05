package it.epicode.w5d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class W5d1Application {

	public static void main(String[] args) {

		SpringApplication.run(W5d1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);


		//Persona persona = (Persona) ctx.getBean("p1");
		//Pizza margherita = ctx.getBean("p1", Pizza.class);

		//System.out.println(margherita);

		//Pizza hawaiana = ctx.getBean("p1", Pizza.class);
		//hawaiana.setNome("Hawaiana");

		PizzaAstratta margherita = new Margherita();
		System.out.println("Prodotto: " + margherita.getNome());
		System.out.println("Prezzo: " + margherita.getPrezzo() + "€");
		System.out.println("Calorie: " + margherita.getCalorie());
		System.out.println("Ingredienti " + margherita.getIngredienti());

		System.out.println();

		PizzaAstratta margheritaSalame = new ExtraSalameDecorator(margherita);
		System.out.println("Prodotto: " + margheritaSalame.getNome());
		System.out.println("Prezzo: " + margheritaSalame.getPrezzo() + "€");
		System.out.println("Calorie: " + margheritaSalame.getCalorie());
		System.out.println("Ingredienti " + margheritaSalame.getIngredienti());

		System.out.println();

		PizzaAstratta hawaiana = new Hawaiana();
		System.out.println("Prodotto: " + hawaiana.getNome());
		System.out.println("Prezzo: " + hawaiana.getPrezzo() + "€");
		System.out.println("Calorie: " + hawaiana.getCalorie());
		System.out.println("Ingredienti " + hawaiana.getIngredienti());
		System.out.println();

		PizzaAstratta hawaianaSalame = new ExtraSalameDecorator(hawaiana);
		System.out.println("Prodotto: " + hawaianaSalame.getNome());
		System.out.println("Prezzo: " + hawaianaSalame.getPrezzo() + "€");
		System.out.println("Calorie: " + hawaianaSalame.getCalorie());
		System.out.println("Ingredienti " + hawaianaSalame.getIngredienti());
		System.out.println();



	}

}
