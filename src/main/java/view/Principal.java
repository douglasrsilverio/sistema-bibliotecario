package view;

//Bug com windowbuilder: necessário excluir todos os dados da classe Cadastro antes de abrir o painel de design

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.exibeFuncionarios.ExibeAuxiliar;
import model.exibeFuncionarios.DaoExibeAuxiliar;
import model.login.DaoExibeNome;
import model.login.DaoLogin;
import model.login.DaoNivelAcesso;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;

public class Principal extends JFrame {
	
	Cadastro cadastro = new Cadastro();
	public static JTextPane textPane = new JTextPane();
	ExibeFuncionarios exibeFuncionarios = new ExibeFuncionarios();
	DaoExibeAuxiliar daoExibeAuxiliar = new DaoExibeAuxiliar();


	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Menu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Cadastrar novo funcion\u00E1rio");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastro.setBounds(getBounds());
				setVisible(false);
				cadastro.setVisible(true);
				
				
				
			}
		});
		btnNewButton.setBounds(148, 214, 314, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Adicionar livros");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(148, 180, 314, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Procurar livros");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(148, 146, 314, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Logoff");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setBounds(getBounds());
				setVisible(false);
				login.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(497, 357, 102, 33);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Exibir funcion\u00E1rios cadastrados");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ExibeFuncionarios exibeFuncionarios = new ExibeFuncionarios();
				exibeFuncionarios.setBounds(getBounds());
				setVisible(false);
				exibeFuncionarios.setVisible(true);
				
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setBounds(148, 248, 314, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("Bem Vindo(a)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(148, 357, 126, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Principal.class.getResource("/view/resources/images/icons/Books.png")));
		lblNewLabel_2.setBounds(241, 11, 186, 124);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Principal.class.getResource("/view/resources/images/icons/Book.png")));
		lblNewLabel_3.setBounds(10, 25, 146, 96);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Principal.class.getResource("/view/resources/images/icons/Book-icon.png")));
		lblNewLabel_4.setBounds(453, 25, 146, 96);
		contentPane.add(lblNewLabel_4);
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textPane.setEditable(false);
		
	
		textPane.setBackground(SystemColor.menu);
		textPane.setBounds(284, 313, 315, 33);
		contentPane.add(textPane);
	}
}
