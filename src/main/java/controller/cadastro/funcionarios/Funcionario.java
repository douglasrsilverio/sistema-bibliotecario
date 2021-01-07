package controller.cadastro.funcionarios;

public abstract class Funcionario {
	private String nome;
	private String sobrenome;
	private String password;
	private String login;
	private String nivelAcesso;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getPassword() {
		return password;
	}
	public void setSenha(String senha) {
		this.password = senha;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getNivelAcesso() {
		return nivelAcesso;
	}
	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
	public Funcionario(String nome, String sobrenome, String senha, String login) {
		super();
		this.nome = nome;
		this.password = senha;
		this.login = login;
		this.nivelAcesso = "0";
		this.sobrenome = sobrenome;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
