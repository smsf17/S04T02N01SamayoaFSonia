package cat.itacademy.barcelonactiva.samayoaf.sonia.s04.t02.n01.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.samayoaf.sonia.s04.t02.n01.domain.Fruita;
import cat.itacademy.barcelonactiva.samayoaf.sonia.s04.t02.n01.services.FruitaService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/fruita")
public class FruitaController {
	
	@Autowired
	FruitaService fruitaService;
	
	@PostMapping("/add")
	public Fruita addFruita(@RequestBody Fruita fruita) {
		return fruitaService.addFruita(fruita);
	}
	
	@PutMapping("/update")
	public Fruita updateFruita(@RequestBody Fruita fruita) {
		return fruitaService.updateFruita(fruita);
		
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteFruita(@PathVariable int id) {
		return fruitaService.deleteFruita(id);
	}
	
	@GetMapping("/getOne/{id}")
	public Optional<Fruita> getOneFruita(@PathVariable int id){
		return fruitaService.getOneFruita(id);
	}
	
	@GetMapping("/getAll")
	public List<Fruita> getAllFruita(){
		return fruitaService.getAllFruita();
	}

}
