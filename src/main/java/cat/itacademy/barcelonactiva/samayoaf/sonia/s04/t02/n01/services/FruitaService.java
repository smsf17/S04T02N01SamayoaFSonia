package cat.itacademy.barcelonactiva.samayoaf.sonia.s04.t02.n01.services;

import java.util.List;
import java.util.Optional;

import cat.itacademy.barcelonactiva.samayoaf.sonia.s04.t02.n01.domain.Fruita;

public interface FruitaService {
	/* http://localhost:8080/fruita/add

	http://localhost:8080/fruita/update

	http://localhost:8080/fruita/delete/{id}

	http://localhost:8080/fruita/getOne/{id}

	http://localhost:8080/fruita/getAll*/
	public Fruita addFruita(Fruita fruita);
	
	public Fruita updateFruita(Fruita fruita);
	
	public String deleteFruita(int id);
	
	public Optional<Fruita> getOneFruita(int id);
	
	public List<Fruita> getAllFruita();

}
