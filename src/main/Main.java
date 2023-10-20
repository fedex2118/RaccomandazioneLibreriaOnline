package main;

import entities.Libro;
import entities.Recensione;
import entities.Utente;

public class Main {

	public static void main(String[] args) {
		// TESTING
		
		//UTENTI
		Utente utente1 = new Utente(1, "Alice", "alice@example.com");
	    Utente utente2 = new Utente(2, "Bob", "bob@example.com");
	    
	    //LIBRI
	    Libro libro1 = new Libro(1, "Il Signore degli Anelli", "J.R.R. Tolkien", "Fantasy", 20.0f);
        Libro libro2 = new Libro(2, "Cronache di Narnia", "C.S. Lewis", "Fantasy", 18.0f);
        Libro libro3 = new Libro(3, "1984", "George Orwell", "Fiction", 15.0f);
        
        // Recensioni
        Recensione recensione1 = new Recensione(utente1, libro1, 5, "Fantastico libro!");
        Recensione recensione2 = new Recensione(utente2, libro1, 4, "Molto interessante.");
        Recensione recensione3 = new Recensione(utente1, libro2, 4, "Mi è piaciuto molto.");
        
        utente1.toString();
        utente2.toString();
        libro1.mostraDettagli();
        libro2.mostraDettagli();
        libro3.mostraDettagli();
        recensione1.toString();
        recensione2.toString();
        recensione3.toString();
	}

}
