package model.cadastro;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import controller.cadastro.segurança.HashSenha;
import controller.cadastro.tratamentoCampos.BotaoCargo;
import controller.cadastro.tratamentoCampos.CampoLogin;
import controller.cadastro.tratamentoCampos.CampoNome;
import controller.cadastro.tratamentoCampos.CampoSenha;
import controller.cadastro.tratamentoCampos.CampoSobrenome;
import controller.cadastro.tratamentoCampos.FuncionarioEstaticoCadastro;
import view.Cadastro;

public class DaoCadastroCompleto {
	
	HashSenha hashSenha = new HashSenha();
	DaoCadastro dao = new DaoCadastro();
	BotaoCargo botaoCargo = new BotaoCargo();
	public void enviaCadBanco() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		botaoCargo.botaoCargo();
		boolean cadastroCompleto = false;
		System.out.println(CampoNome.nomeErro + "" + CampoLogin.loginErroTamanho + "" + CampoSenha.senhaErroEquals + "" + CampoSenha.senhaErroNull + "" + CampoLogin.loginErroExiste + "" + botaoCargo.getBotaoErro() + "" + CampoSobrenome.sobrenomeErro + "" + Cadastro.cargoFuncionario);

	
		if(CampoNome.nomeErro == true && CampoLogin.loginErroTamanho == true && CampoSenha.senhaErroEquals == true && CampoSenha.senhaErroNull == true && CampoLogin.loginErroExiste == true && botaoCargo.getBotaoErro() == true && CampoSobrenome.sobrenomeErro == true && Cadastro.cargoFuncionario.equals("Bibliotecario")) {
		FuncionarioEstaticoCadastro.cadastroAuxiliar.setNome(Cadastro.textField.getText());
		FuncionarioEstaticoCadastro.cadastroAuxiliar.setSobrenome(Cadastro.textField_2.getText());
		FuncionarioEstaticoCadastro.cadastroAuxiliar.setLogin(Cadastro.textField_1.getText());
		String senha = hashSenha.geraHash(String.valueOf(Cadastro.passwordField.getPassword()).trim());
		FuncionarioEstaticoCadastro.cadastroAuxiliar.setSenha(senha);
		dao.CadastrarAuxiliar(FuncionarioEstaticoCadastro.cadastroAuxiliar);
		System.out.println("teste");
		cadastroCompleto = true;
		}
		
		//if(CampoNome.nomeErro == true && CampoLogin.loginErroTamanho == true && CampoSenha.senhaErroEquals == true && CampoSenha.senhaErroNull == true && CampoLogin.loginErroExiste == true && botaoCargo.getBotaoErro() == true) {
			//dao.CadastrarAuxiliar(FuncionarioEstaticoCadastro.cadastroAuxiliar);
			//cadastroCompleto = true;
			//}
		
		if(cadastroCompleto == true) {
			Cadastro.textPane.setText("Cadastro completo!");
		}
	}
}
