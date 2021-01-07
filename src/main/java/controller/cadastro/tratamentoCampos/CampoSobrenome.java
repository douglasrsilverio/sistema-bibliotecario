package controller.cadastro.tratamentoCampos;

import view.Cadastro;

public class CampoSobrenome {
	
	public static boolean sobrenomeErro;
	
	public void condSobrenome() {
		if(Cadastro.textField_2.getText().equals("")) {
			sobrenomeErro = false;
		
			
		}
		else {
			sobrenomeErro = true;
		
		}
	}
}
