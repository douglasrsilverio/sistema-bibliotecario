package controller.cadastro.tratamentoCampos;

import view.Cadastro;

public class BotaoCargoSelecionado {
	
	
	
	public void campoAuxiliar() {
		if(Cadastro.rdbtnNewRadioButton_1.isSelected()) {
			Cadastro.rdbtnNewRadioButton.setSelected(false);
			Cadastro.cargoFuncionario = "Auxiliar";
		}	
	}
	
	public void campoBibliotecario() {
		if(Cadastro.rdbtnNewRadioButton.isSelected()) {
			Cadastro.rdbtnNewRadioButton_1.setSelected(false);
			Cadastro.cargoFuncionario = "Bibliotecario";
		}
	}
	
	
	
}
