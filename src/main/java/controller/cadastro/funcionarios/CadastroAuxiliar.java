package controller.cadastro.funcionarios;

public class CadastroAuxiliar extends Funcionario{
	
	public CadastroAuxiliar(String nome, String senha, String login, String sobrenome) {
		super(nome, senha, login, sobrenome);
		this.setNivelAcesso("1");
	}
	
	
}
