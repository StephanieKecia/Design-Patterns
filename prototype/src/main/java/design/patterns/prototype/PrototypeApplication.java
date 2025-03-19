package design.patterns.prototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class PrototypeApplication {

	public static void main(String[] args)
	{

		var user1 = new User();
		user1.setId(UUID.randomUUID());
		user1.setEmail("teste@teste.com");
		user1.setUsername("Teste");
		user1.setPassword("12345");


		var userClone = user1.clone();

		System.out.println(user1);
		System.out.println(userClone);
	}

}
