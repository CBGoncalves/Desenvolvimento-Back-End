package com.carloseduardo.primeiroitext.dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public Connection getConnection() throws ClassNotFoundException {
		Connection con = null;
		System.out.println("Chamando conexão");
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smgerentesobra","root","root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
