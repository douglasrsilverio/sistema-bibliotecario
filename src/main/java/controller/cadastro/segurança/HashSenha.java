package controller.cadastro.segurança;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class HashSenha {
	public String geraHash(String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		  
        MessageDigest algorithm = MessageDigest.getInstance("MD5"); //tipo de hash
        byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8")); //armazena hash em um array de bytes
         
        String arrayParaString = Base64.getEncoder().encodeToString(messageDigest);  //converte array de bytes para String
	
        return arrayParaString;
	}
}
