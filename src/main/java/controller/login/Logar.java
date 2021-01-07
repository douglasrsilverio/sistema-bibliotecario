package controller.login;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller.cadastro.segurança.HashSenha;
import model.Conexao;
import model.login.DaoLogin;
import model.*;
import view.Cadastro;
import view.Login;



public class Logar {
		
		DaoLogin daoLogin = new DaoLogin();
		HashSenha hashSenha = new HashSenha();
		
		public boolean autenticaUsuario() {
			
			
			String loginCampo = Login.textField.getText();
			String passwordString = String.valueOf(Login.passwordField.getPassword()).trim();	
			String senhaEmHashLogin = null;
			try {
				senhaEmHashLogin = hashSenha.geraHash(passwordString);
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			boolean usuarioAutenticado;
			usuarioAutenticado = daoLogin.autenticaDao(loginCampo, senhaEmHashLogin);
			
			
			
			
			
			return usuarioAutenticado;
		}
	
}
