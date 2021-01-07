package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.border.EmptyBorder;

import controller.cadastro.funcionarios.CadastroAuxiliar;
import model.exibeFuncionarios.DaoExibeAuxiliar;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.Color;

public class ExibeFuncionarios extends JFrame {

	private JPanel contentPane;
	public static DefaultListModel<String> populaAuxiliar = new DefaultListModel<>();

	DaoExibeAuxiliar daoExibeAuxiliar = new DaoExibeAuxiliar();
	static JList list = new JList(populaAuxiliar);
	/**
	 * Create the frame.
	 */
	public ExibeFuncionarios() {
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 350, 650, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(506, 365, 118, 35);
		contentPane.add(btnNewButton);
		
		
		daoExibeAuxiliar.selectAuxiliarBanco();

		list.setBounds(163, 224, 461, 130);
		contentPane.add(list);
		
		
		
		
		
		JButton btnNewButton_1 = new JButton("Deletar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnNewButton_1.setBounds(10, 366, 118, 35);
		contentPane.add(btnNewButton_1);
		
		JTextPane txtpnBibliotecrios = new JTextPane();
		txtpnBibliotecrios.setForeground(Color.RED);
		txtpnBibliotecrios.setBackground(SystemColor.menu);
		txtpnBibliotecrios.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnBibliotecrios.setText("Bibliotec\u00E1rios");
		txtpnBibliotecrios.setEditable(false);
		txtpnBibliotecrios.setBounds(28, 11, 125, 24);
		contentPane.add(txtpnBibliotecrios);
		
		JTextPane txtpnAuxiliares = new JTextPane();
		txtpnAuxiliares.setForeground(Color.BLUE);
		txtpnAuxiliares.setBackground(SystemColor.menu);
		txtpnAuxiliares.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnAuxiliares.setText("Auxiliares");
		txtpnAuxiliares.setEditable(false);
		txtpnAuxiliares.setBounds(61, 198, 92, 24);
		contentPane.add(txtpnAuxiliares);
		
		JTextPane txtpnNomeLogin = new JTextPane();
		txtpnNomeLogin.setBackground(SystemColor.menu);
		txtpnNomeLogin.setEditable(false);
		txtpnNomeLogin.setText("Nome");
		txtpnNomeLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpnNomeLogin.setBounds(163, 198, 129, 35);
		contentPane.add(txtpnNomeLogin);
		
		JTextPane txtpnSobrenome = new JTextPane();
		txtpnSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpnSobrenome.setEditable(false);
		txtpnSobrenome.setText("Sobrenome");
		txtpnSobrenome.setBackground(SystemColor.menu);
		txtpnSobrenome.setBounds(302, 198, 135, 35);
		contentPane.add(txtpnSobrenome);
		
		JTextPane txtpnLogin = new JTextPane();
		txtpnLogin.setBackground(SystemColor.menu);
		txtpnLogin.setText("Login");
		txtpnLogin.setForeground(SystemColor.desktop);
		txtpnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpnLogin.setEditable(false);
		txtpnLogin.setBounds(485, 198, 139, 35);
		contentPane.add(txtpnLogin);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal principal = new Principal();
				principal.setBounds(getBounds());
				setVisible(false);
				principal.setVisible(true);
				
			}
			
			
		});
	}
}
