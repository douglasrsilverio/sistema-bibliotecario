package model.cadastro;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Conexao;
import model.login.DaoExibeNome;
import view.Principal;

public class DaoFiltroCadastroLoginExiste {

	
	public boolean checaLoginExiste(String login) {
		Conexao conexao = new Conexao();
		boolean loginExiste = false;
		DaoExibeNome daoExibeNome = new DaoExibeNome();
		try(PreparedStatement preparedStatement = conexao.getConexao().prepareStatement(
				  "SELECT LOGIN FROM AUTENTICAAUXILIAR WHERE LOGIN=? "
				+ "UNION "
				+ "SELECT LOGIN FROM AUTENTICABIBLIOTECARIO WHERE LOGIN=?")){
			preparedStatement.setString(1, login);
			preparedStatement.setString(2, login);
			ResultSet rs;
			
			rs = preparedStatement.executeQuery();
    		String loginBanco = null;
			  while (rs.next()) {
				  loginBanco = rs.getString("LOGIN");
			  }
			
			if(loginBanco != null){
				loginExiste = true;
			}
			else {
				loginExiste = false;
			}
			
			
			
		}catch(SQLException e){
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	return loginExiste;
	}
}
	
	

