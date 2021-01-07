package controller.cadastro.tratamentoCampos;

import java.awt.TextField;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import controller.cadastro.funcionarios.CadastroAuxiliar;
import model.cadastro.DaoCadastro;
import model.cadastro.DaoFiltroCadastroLoginExiste;
import view.Cadastro;

public class CampoNome{
	
	DaoCadastro dao = new DaoCadastro();

	public static boolean nomeErro = false;
	public void condNome(){
		String nomeCampo = Cadastro.textField.getText();
	
		if(nomeCampo.equals("")) {
			nomeErro = false;
		}
		else {
			
			nomeErro = true;
		}
	}
}
