package controller.cadastro.tratamentoCampos;

public class OrdenaErrosCampos {
	public static String[] erro1 = new String[7]; //Percorrer Array
	static boolean[] erro2 = new boolean[7];
	BotaoCargo botaoCargo = new BotaoCargo();
	public void ordemErros() {
	
		
		erro1[0] = "";
		erro1[1] = "";
		erro1[2] = "";
		erro1[3] = "";
		erro1[4] = "";
		erro1[5] = "";
		erro1[6] = "";
		//Verificar se a posição do array já foi preenchida
		
		erro2[0] = false;
		erro2[1] = false;
		erro2[2] = false;
		erro2[3] = false;
		erro2[4] = false;
		erro2[5] = false;
		erro2[6] = false;
		
		for(int i = 0 ; i < 7; i++) {
				if(CampoNome.nomeErro == false && erro1[i] == "" && erro2[0] == false) {
					erro1[i] = RecebeErrosCampos.nomeErroMensagem;
					erro2[0] = true;
				}
				if(CampoLogin.loginErroTamanho == false && erro1[i] == "" && erro2[1] == false) {
					erro1[i] = RecebeErrosCampos.loginErroMensagem;
					erro2[1] = true;
				}
				if(CampoLogin.loginErroExiste == false && erro1[i] == "" && erro2[2] == false) {
					erro1[i] = RecebeErrosCampos.loginErroExisteMensagem;
					erro2[2] = true;
				}
				if(CampoSenha.senhaErroEquals == false && erro1[i] == "" && erro2[3] == false) {
					erro1[i] = RecebeErrosCampos.senhaErroEqualsMensagem;
					erro2[3] = true;
				}
				if(CampoSenha.senhaErroNull == false && erro1[i] == "" && erro2[4] == false) {
					erro1[i] = RecebeErrosCampos.senhaErroNullMensagem;
					erro2[4] = true;
				}
				
				if(botaoCargo.getBotaoErro() == false && erro1[i] == "" && erro2[5] == false) {
					erro1[i] = RecebeErrosCampos.botaoErroMensagem;
					erro2[5] = true;
				}
				if(CampoSobrenome.sobrenomeErro == false && erro1[i] == "" && erro2[6] == false) {
					erro1[i] = RecebeErrosCampos.sobrenomeErroMensagem;
					erro2[6] = true;
				}
	
		}
	}
}
