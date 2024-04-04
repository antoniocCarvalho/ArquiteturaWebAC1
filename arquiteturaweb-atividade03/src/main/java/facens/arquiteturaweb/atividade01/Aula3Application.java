package facens.arquiteturaweb.atividade01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication


@RestController

@RequestMapping("/api/alunos")
public class Aula3Application {


	public static void main(String[] args) {
		SpringApplication.run(Aula3Application.class, args);
	}


}
