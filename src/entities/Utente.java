package entities;

import java.util.ArrayList;

public class Utente {
	private int id;
	private String nome;
	private String email;
	private ArrayList<Libro> libriAcquistati;
	
	public Utente(int id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.libriAcquistati = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Libro> getLibriAcquistati() {
		return libriAcquistati;
	}

	public void setLibriAcquistati(ArrayList<Libro> libriAcquistati) {
		this.libriAcquistati = libriAcquistati;
	}
	
	public void acquistaLibro (Libro libro) {
		libriAcquistati.add(libro);
	}
	
	public List<Libro> raccomandaLibri() {
		
	}
	
	
}
