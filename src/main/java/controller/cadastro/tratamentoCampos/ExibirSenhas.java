package controller.cadastro.tratamentoCampos;

import view.Cadastro;

public class ExibirSenhas {
	public void exibeSenha() {
		if(Cadastro.chckbxNewCheckBox.isSelected()) {
			Cadastro.passwordField.setEchoChar((char)0);
			Cadastro.passwordField_1.setEchoChar((char)0);
		}
		else {
			Cadastro.passwordField.setEchoChar('*');
			Cadastro.passwordField_1.setEchoChar('*');
		}
	}
}
