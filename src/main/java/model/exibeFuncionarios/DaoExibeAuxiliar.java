package model.exibeFuncionarios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller.exibeFuncionarios.ExibeAuxiliar;
import model.Conexao;
import view.ExibeFuncionarios;

public class DaoExibeAuxiliar {
	Conexao conexao = new Conexao();

	
	public void selectAuxiliarBanco() {
		try (
			PreparedStatement preparedStatement = conexao.getConexao().prepareStatement("SELECT NOME, LOGIN FROM AUTENTICAAUXILIAR")){

			 ResultSet rs = preparedStatement.executeQuery();
			 ExibeFuncionarios.populaAuxiliar.removeAllElements();
			 
			while(rs.next()) {
				String nome = rs.getString("NOME");
				String  login = rs.getString("LOGIN");
				ExibeFuncionarios.populaAuxiliar.addElement(nome + "   " + login);
			}
			
		}catch(SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
