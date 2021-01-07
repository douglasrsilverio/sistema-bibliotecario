package controller.cadastro.tratamentoCampos;

import view.Cadastro;

public class PrintaErros {
	public void printaErros() {
		Cadastro.textPane.setText(OrdenaErrosCampos.erro1[0] + OrdenaErrosCampos.erro1[1] + OrdenaErrosCampos.erro1[2] + OrdenaErrosCampos.erro1[3] + OrdenaErrosCampos.erro1[4] + OrdenaErrosCampos.erro1[5] + OrdenaErrosCampos.erro1[6]);
	}
}
