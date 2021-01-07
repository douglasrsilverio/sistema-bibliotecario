package controller.cadastro.tratamentoCampos;

import view.Cadastro;

public class AsteriscoErro {
	
	public void asteriscoErros() {
		if (OrdenaErrosCampos.erro2[0] == true) {
			Cadastro.textPane_1.setText("*");	
		}
		else {
			Cadastro.textPane_1.setText("");
		}
		if (OrdenaErrosCampos.erro2[1] == true || OrdenaErrosCampos.erro2[2] == true) {
			Cadastro.textPane_2.setText("*");
		}
		else {
			Cadastro.textPane_2.setText("");
		}
		if (OrdenaErrosCampos.erro2[3] == true || OrdenaErrosCampos.erro2[4] == true) {
			Cadastro.textPane_3.setText("*");
			Cadastro.textPane_4.setText("*");
		}
		else {
			Cadastro.textPane_3.setText("");
			Cadastro.textPane_4.setText("");
		}
		if (OrdenaErrosCampos.erro2[6] == true) {
			Cadastro.textPane_5.setText("*");
		}
		else {
			Cadastro.textPane_5.setText("");
		}
	}
}
