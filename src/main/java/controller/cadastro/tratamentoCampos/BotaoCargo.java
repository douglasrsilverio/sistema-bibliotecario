package controller.cadastro.tratamentoCampos;

import view.Cadastro;

public class BotaoCargo {
	
	private boolean botaoErro;
	
	public void botaoCargo() {

	

		if(Cadastro.rdbtnNewRadioButton_1.isSelected() || Cadastro.rdbtnNewRadioButton.isSelected()) {
			this.botaoErro = true;

		}
		else {
			this.botaoErro = false;
		}
	}
	
	
	public boolean getBotaoErro() {
		return botaoErro;	
	}
	
		

}
