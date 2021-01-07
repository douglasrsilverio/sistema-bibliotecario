package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.sqlite.*;

public class Conexao {
	Connection conn;
	
	
	public Connection getConexao() throws ClassNotFoundException {
		try {
			
			if (conn == null || conn.isClosed()) {
				
				Class.forName("org.sqlite.JDBC");
				conn = DriverManager.getConnection(
						"jdbc:sqlite:src\\main\\resources\\database\\sistemaDatabase.db");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
	
	
	
	
	
}
