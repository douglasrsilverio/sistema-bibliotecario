package model.login;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Conexao;
import view.Principal;

public class DaoLogin {
	Conexao conexao = new Conexao();
	
	public boolean autenticaDao(String login, String senha) {
	
		DaoExibeNome daoExibeNome = new DaoExibeNome();
		boolean retorno = false;
		try(PreparedStatement preparedStatement = conexao.getConexao().prepareStatement("SELECT * FROM AUTENTICAAUXILIAR WHERE LOGIN=? AND PASSWORD=? ")){
			preparedStatement.setString(1, login);
			preparedStatement.setString(2, senha);
			ResultSet rs;
			
			rs = preparedStatement.executeQuery();
			
		
			

    		
			if(rs.next()) {
    			retorno = true;
    			Principal.textPane.setText(daoExibeNome.selectNome(login, senha));

    		}
			else {
				retorno = false;
	
			}

		}catch(SQLException e){
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
		}
		return retorno; 
		
	
	}
}

