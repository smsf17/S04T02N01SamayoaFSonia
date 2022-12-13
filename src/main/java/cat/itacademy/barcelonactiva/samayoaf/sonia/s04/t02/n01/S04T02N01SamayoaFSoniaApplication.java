package cat.itacademy.barcelonactiva.samayoaf.sonia.s04.t02.n01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class S04T02N01SamayoaFSoniaApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04T02N01SamayoaFSoniaApplication.class, args);
	}
	// Ruta a la Página Principal 
	@GetMapping("/")
	public String mensaje(@RequestParam(value = "saludo", defaultValue = "Soy un Sistema CRUD") String saludo) {
		return String.format("<h1>Hola %s ! </h1>", saludo);
	}

}
