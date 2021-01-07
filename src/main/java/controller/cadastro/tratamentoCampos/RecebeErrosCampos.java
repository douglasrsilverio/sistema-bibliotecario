package controller.cadastro.tratamentoCampos;

public class RecebeErrosCampos {
	static String nomeErroMensagem;
	static String sobrenomeErroMensagem;
	static String loginErroExisteMensagem;
	static String loginErroMensagem;
	static String senhaErroEqualsMensagem;
	static String senhaErroNullMensagem;
	static String botaoErroMensagem;
	BotaoCargo botaoCargo = new BotaoCargo();
	public void recebeErro() {


		if (CampoNome.nomeErro == false) {
			nomeErroMensagem = "* O campo nome deve ser preenchido!\n";
		} else {
			nomeErroMensagem = "";
		}
		if (CampoLogin.loginErroTamanho == false) {
			loginErroMensagem = "* O login deve possuir ao menos seis dígitos!\n";
		} else {
			loginErroMensagem = "";
		}
		if (CampoLogin.loginErroExiste == false) {
			loginErroExisteMensagem = "* Login já existente!";
		} else {
			loginErroExisteMensagem = "";
		}
		if (CampoSenha.senhaErroEquals == false) {
			senhaErroEqualsMensagem = "* As senhas não coincidem!\n";
		} else {
			senhaErroEqualsMensagem = "";
		}
		if (CampoSenha.senhaErroNull == false) {
			senhaErroNullMensagem = "* A senha deve possuir ao menos seis dígitos!\n";
		} else {
			senhaErroNullMensagem = "";
		}
	
		botaoCargo.botaoCargo();
		if (botaoCargo.getBotaoErro() == false) {
			botaoErroMensagem = "* Selecione o cargo do funcionário!\n";
		
		}
		else {
			botaoErroMensagem = "";
			
		}
		if(CampoSobrenome.sobrenomeErro == false) {
			sobrenomeErroMensagem = "* O campo sobrenome deve ser preenchido";
		}
		else {
			sobrenomeErroMensagem = "";
		}
	}
}
