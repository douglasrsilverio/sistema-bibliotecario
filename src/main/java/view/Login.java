package view;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import controller.login.Logar;
import model.cadastro.DaoCadastro;
import model.login.DaoNivelAcesso;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import controller.cadastro.*;
import controller.cadastro.funcionarios.CadastroAuxiliar;
import controller.cadastro.funcionarios.CadastroBibliotecario;

import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Login extends JFrame {
	
	
	Logar logar = new Logar();
	DaoCadastro dao = new DaoCadastro();
	Principal principal = new Principal();
	private JPanel contentPane;
	public static JTextField textField;
	public static JPasswordField passwordField;
	static Login frame = new Login();
	DaoNivelAcesso nivelAcesso = new DaoNivelAcesso();	
	

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setResizable(false);
		setTitle("Sistema Bibliotec\u00E1rio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 300, 650, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Sistema Bibliotec\u00E1rio\r\n");
		lblNewLabel.setBounds(-37, 24, 729, 31);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(94, 178, 73, 31);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(94, 234, 69, 20);
		contentPane.add(lblNewLabel_2);

		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		textField.setBounds(192, 184, 319, 26);
		contentPane.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		passwordField.setBounds(192, 235, 319, 26);
		contentPane.add(passwordField);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Login.class.getResource("/view/resources/images/icons/Books-icon.png")));
		lblNewLabel_3.setBounds(293, 79, 96, 96);
		contentPane.add(lblNewLabel_3);
		
		final JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPane.setForeground(Color.RED);
		textPane.setBackground(SystemColor.menu);
		textPane.setBounds(255, 272, 218, 20);
		contentPane.add(textPane);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(logar.autenticaUsuario() == true) {
					nivelAcesso.nivelAcessoUsuario(textField.getText());
					principal.setBounds(getBounds());
					principal.setVisible(true);
					setVisible(false);
					
					
				}
				else{
					textPane.setText("Login ou usuário incorreto!");
				}		
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton.setBounds(281, 305, 124, 37);
		contentPane.add(btnNewButton);
		
		
	}
}
