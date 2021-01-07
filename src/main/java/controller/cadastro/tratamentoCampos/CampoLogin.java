package controller.cadastro.tratamentoCampos;

import controller.cadastro.funcionarios.CadastroAuxiliar;
import model.cadastro.DaoFiltroCadastroLoginExiste;
import view.Cadastro;

public class CampoLogin {
	public static boolean loginErroTamanho = false;
	public static boolean loginErroExiste = true;
	DaoFiltroCadastroLoginExiste daoFiltroCadastro = new DaoFiltroCadastroLoginExiste();
	public void condLogin() {
		String loginCampo = Cadastro.textField_1.getText();
		int tamanhoLogin = loginCampo.length();
		
		if(tamanhoLogin < 6) {
			
			loginErroTamanho = false;
		}
		else {
			boolean loginExiste = daoFiltroCadastro.checaLoginExiste(loginCampo);
			if(loginExiste == false){
				loginErroExiste = true;
			}
			else {
				loginErroExiste = false;
			}
			loginErroTamanho = true;
		}
	}
}
