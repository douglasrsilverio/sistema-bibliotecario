package controller.exibeFuncionarios;

import controller.cadastro.funcionarios.Funcionario;

public class ExibeAuxiliar {
	
	String nome;
	String login;
	
	public ExibeAuxiliar(String nome, String login) {
		super();
		this.nome = nome;
		this.login = login;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
}
