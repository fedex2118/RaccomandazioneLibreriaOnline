package entities;

public class Recensione {
	private Utente utente;
	private Libro libro;
	private int valutazione;
	private String commento;
	
	public Recensione(Utente utente, Libro libro, int valutazione, String commento) {
		this.utente = utente;
		this.libro = libro;
		this.valutazione = valutazione;
		this.commento = commento;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public int getValutazione() {
		return valutazione;
	}

	public void setValutazione(int valutazione) {
		this.valutazione = valutazione;
	}

	public String getCommento() {
		return commento;
	}

	public void setCommento(String commento) {
		this.commento = commento;
	}
	
	public String toString() {
		return "Utente: " + utente + "Libro: " + libro + "\nValutazione: " + valutazione + "\nCommento: " + commento;
	}
}
