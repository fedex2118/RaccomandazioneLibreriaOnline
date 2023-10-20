package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entities.Recensione;
import gestoreConnessioni.GestoreConnessioni;
import libreriaManager.LibreriaOnline;

public class RecensioneDAO {
	public ArrayList<Recensione> prendiRecensioni(GestoreConnessioni gc, LibreriaOnline libreria) {
		String query = "SELECT * FROM Recensione";
		
		ResultSet rs = gc.eseguiStatementQuery(query);
		
		ArrayList<Recensione> recensioni = libreria.getRecensioni();
		
		try {
			while(rs.next()) {
				int idLibro = Integer.parseInt(rs.getString(0));
				int idUtente = Integer.parseInt(rs.getString(1));
				int valutazione = Integer.parseInt(rs.getString(2));
				String commento = rs.getString(3);
				Recensione recensione = new Recensione(idUtente, idLibro, 
						valutazione, commento);
				recensioni.add(recensione);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return recensioni;
	}
}
