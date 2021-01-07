package controller.cadastro.funcionarios;

public class CadastroBibliotecario extends Funcionario{
	
	public CadastroBibliotecario(String nome, String senha, String login, String sobrenome) {
		super(nome, senha, login, sobrenome);
		this.setNivelAcesso("2");
	}
}
