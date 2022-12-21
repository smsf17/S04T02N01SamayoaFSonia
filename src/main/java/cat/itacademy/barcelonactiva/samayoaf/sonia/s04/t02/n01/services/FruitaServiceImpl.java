package cat.itacademy.barcelonactiva.samayoaf.sonia.s04.t02.n01.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.samayoaf.sonia.s04.t02.n01.domain.Fruita;
import cat.itacademy.barcelonactiva.samayoaf.sonia.s04.t02.n01.repository.FruitaRepo;

@Service
public class FruitaServiceImpl implements FruitaService {
	
	@Autowired
	FruitaRepo fruitaRepo;
	

	@Override
	public Fruita addFruita(Fruita fruita) {
		
		return fruitaRepo.save(fruita);

	}

	@Override
	public String updateFruita(Fruita fruitaUpdate) {
		
		int num = (int) fruitaUpdate.getId();
		
		if(fruitaRepo.findById(num).isPresent()) {
			Fruita fr = new Fruita();
			fr=fruitaRepo.findById(num).get();
			fr.setNom(fruitaUpdate.getNom());
			fr.setQuilos(fruitaUpdate.getQuilos());
			fruitaRepo.save(fr);
			return "Fruita modificada";
		}else {
		return "Error al modificar fruita";
		}
	}

	@Override
	public String deleteFruita(int id) {
		fruitaRepo.deleteById(id);
		return "Fruita con Id: "+id+" eliminada";
	}

	@Override
	public Optional<Fruita> getOneFruita(int id) {
		
		return fruitaRepo.findById(id);
	}

	@Override
	public List<Fruita> getAllFruita() {
		
		return fruitaRepo.findAll();
	}

}
