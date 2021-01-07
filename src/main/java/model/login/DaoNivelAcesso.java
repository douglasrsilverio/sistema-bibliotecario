package model.login;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Conexao;

public class DaoNivelAcesso{

	public static String nivelAcessoUsuario;

	public static void nivelAcessoUsuario(String login) {
		
			Conexao conexao = new Conexao();

			try(PreparedStatement preparedStatement = conexao.getConexao().prepareStatement(
					  "SELECT NIVELACESSO FROM AUTENTICAAUXILIAR WHERE LOGIN=? UNION SELECT NIVELACESSO FROM AUTENTICABIBLIOTECARIO WHERE LOGIN=?")){
				String acesso = "ADMINS";
				preparedStatement.setString(1, acesso);
				preparedStatement.setString(2, acesso);
				ResultSet rs;
				
				rs = preparedStatement.executeQuery();
				  while (rs.next()) {
					  nivelAcessoUsuario = rs.getString("NIVELACESSO");
				  }
				
				  
				
				
				
			}catch(SQLException e){
				System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
			}catch(Exception e) {
				e.printStackTrace();
			}

	}


} 