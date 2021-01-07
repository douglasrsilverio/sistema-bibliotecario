package model.cadastro;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import controller.cadastro.funcionarios.CadastroAuxiliar;
import controller.cadastro.funcionarios.CadastroBibliotecario;
import controller.login.Logar;
import model.Conexao;

public class DaoCadastro {
	Conexao conexao = new Conexao();
	Logar logar = new Logar();

	public void CadastrarBibliotecario(CadastroBibliotecario bibliotecario) {
		try (PreparedStatement preparedStatement = conexao.getConexao().prepareStatement(
				"INSERT INTO AUTENTICABIBLIOTECARIO(NIVELACESSO, NOME, SOBRENOME LOGIN, PASSWORD) VALUES (?, ?, ?, ?, ?)")) {

			preparedStatement.setString(1, bibliotecario.getNivelAcesso());
			preparedStatement.setString(2, bibliotecario.getNome());
			preparedStatement.setString(3, bibliotecario.getSobrenome());
			preparedStatement.setString(4, bibliotecario.getLogin());
			preparedStatement.setString(5, bibliotecario.getPassword());

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void CadastrarAuxiliar(CadastroAuxiliar auxiliar) {
		try (PreparedStatement preparedStatement = conexao.getConexao().prepareStatement(
				"INSERT INTO AUTENTICAAUXILIAR(NIVELACESSO, NOME, SOBRENOME, LOGIN, PASSWORD) VALUES (?, ?, ?, ?, ?)")) {

			preparedStatement.setString(1, auxiliar.getNivelAcesso());
			preparedStatement.setString(2, auxiliar.getNome());
			preparedStatement.setString(3, auxiliar.getSobrenome());
			preparedStatement.setString(4, auxiliar.getLogin());
			preparedStatement.setString(5, auxiliar.getPassword());

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
