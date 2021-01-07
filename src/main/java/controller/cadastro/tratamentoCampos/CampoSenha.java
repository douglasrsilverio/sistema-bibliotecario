package controller.cadastro.tratamentoCampos;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import controller.cadastro.segurança.HashSenha;
import view.Cadastro;

public class CampoSenha {
	public static boolean senhaErroNull = true;
	public static boolean senhaErroEquals = true;
	HashSenha hashSenha = new HashSenha();
	public void condSenha() {
		String senhaCampo1 = String.valueOf(Cadastro.passwordField.getPassword()).trim();
		String senhaCampo2 = String.valueOf(Cadastro.passwordField_1.getPassword()).trim();
		int tamanhoSenha = senhaCampo1.length();
		
		if(tamanhoSenha < 6) {
			senhaErroNull = false;
		}
		
		else {
			senhaErroNull = true;
			if (senhaCampo1.equals(senhaCampo2)) {
				String senhaEmHashCadastro = null;
		
				senhaErroEquals = true;
			}
			else {
				senhaErroEquals = false;
			}
			
		}
	}
}
