package dao;

import java.sql.ResultSet;

import gestoreConnessioni.GestoreConnessioni;
import libreriaManager.LibreriaOnline;

public class UtenteDAO {
	public static void prendiUtenti(GestoreConnessioni gc, LibreriaOnline libreria) {
		String query = "SELECT * FROM Utente";
		
		ResultSet rs = gc.eseguiStatementQuery(query);
		
		
	}
}
