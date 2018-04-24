package util;
// importa intero package
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.shoppinglist.Articolo;


public class ListaConnection {
	
	
	public Connection getConnection() throws Exception {

		ResultSet res = null;
		Statement cmd = null;
		Connection conn = null;

		String driver = "com.mysql.jdbc.Driver";
		Class.forName(driver);
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lista", "root", "");

		return conn;

	}
	
	//da un oggetto da db (res) , e con il metodo map creo un oggetto Java  (articolo) , 

	private Articolo creaArticoloDaDb(ResultSet res) throws Exception {

		Articolo a = new Articolo();
		a.setId(res.getInt("id"));
		a.setNome(res.getString("nome"));
		a.setQuantita(res.getInt("quantita"));
	
		return a;
	}
	
	private String stampa(ArrayList a, ResultSet res) {
		
		a = new ArrayList<Articolo>();
		
//        System.out.println(res.getString("nomeColonna1"));
//        System.out.println(res.getString("nomeColonna2"));	
		return null;
	}

	public ArrayList<Articolo> visTutti() throws Exception {
		
		ArrayList<Articolo> lista = new ArrayList<Articolo>();
		ResultSet rs;

		Connection conn = getConnection();
		Statement cmd = conn.createStatement();
		try {
			String selectAll = "SELECT * FROM Lista.articolo;";

			rs = cmd.executeQuery(selectAll);
			while (rs.next()) {
				lista.add(creaArticoloDaDb(rs));
				System.out.print("id -> " + rs.getInt("id"));
				System.out.print(";  nome -> " + rs.getString("nome"));
				System.out.println(";  quantita -> " + rs.getInt("quantita"));
			}
			rs.close();
			cmd.close();
			conn.close();

		} catch (SQLException se) {

		} 
		return lista;
	}

	public void nuovo(Articolo a) throws Exception {

		Connection conn = getConnection();
		Statement cmd = conn.createStatement();

		int id = a.getId();
		String nome = a.getNome();
		int quantita = a.getQuantita();

		String insert = "insert into articolo(id, nome , quantita)" + "values ('" + id + "','" + nome + "','" + quantita
				+ "');";

		cmd.execute(insert);
		cmd.close();
		conn.close();
	}

}
