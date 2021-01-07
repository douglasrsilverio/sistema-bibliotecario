package model.login;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Conexao;
import view.ExibeFuncionarios;

public class DaoExibeNome {
Conexao conexao = new Conexao();
	
	public String selectNome(String login, String senha) {
		String nome = null;
		try(PreparedStatement preparedStatement = conexao.getConexao().prepareStatement("SELECT NOME FROM AUTENTICAAUXILIAR WHERE LOGIN=? AND PASSWORD=?")){
			preparedStatement.setString(1, login);
			preparedStatement.setString(2, senha);
			ResultSet rs;
		
			rs = preparedStatement.executeQuery();
			
			  while (rs.next()) {
				  nome = rs.getString("NOME");
			  }
			
			
		}catch(SQLException e){
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
		}
		return nome;
		
	
	}
}
