package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


import parking.Auto;

public class ParkConnection {

	public Connection getConnection() throws Exception {

		ResultSet res = null;
		Statement cmd = null;
		Connection conn = null;

		String driver = "com.mysql.jdbc.Driver";
		Class.forName(driver);
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Parcheggio", "root", "");

		return conn;

	}
	
	private Auto creaAutoDaDb(ResultSet res) throws Exception {

		Auto a = new Auto(null);
		a.setTarga(res.getString("targa"));
	
		return a;
	}

}
