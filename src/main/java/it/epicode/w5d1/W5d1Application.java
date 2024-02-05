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
		Pizza margherita = ctx.getBean("p1", Pizza.class);

		System.out.println(margherita);

		Pizza hawaiana = ctx.getBean("p1", Pizza.class);
		hawaiana.setNome("Hawaiana");

	}

}
