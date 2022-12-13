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
	public Fruita updateFruita(Fruita fruita) {
		Fruita fr=null;
		Optional<Fruita> optionalFruita = fruitaRepo.findById((int) fruita.getId());
		if(optionalFruita.isPresent()) {
			fr=optionalFruita.get();
			fr.setNom(fruita.getNom());
			fr.setQuilos(fruita.getQuilos());
			fruitaRepo.save(fr);
		}else {
			return new Fruita();
		}
		return fr;
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
		// TODO Auto-generated method stub
		return fruitaRepo.findAll();
	}

}
