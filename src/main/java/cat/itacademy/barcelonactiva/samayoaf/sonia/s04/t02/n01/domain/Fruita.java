package cat.itacademy.barcelonactiva.samayoaf.sonia.s04.t02.n01.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fruita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String nom;

	private int quilos;

	public Fruita() {

	}

	public Fruita(String nom, int quilos) {
		this.nom = nom;
		this.quilos = quilos;
	}
	
	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getQuilos() {
		return quilos;
	}

	public void setQuilos(int quilos) {
		this.quilos = quilos;
	}


}
