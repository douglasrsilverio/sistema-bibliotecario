package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.awt.event.ActionEvent;

import controller.cadastro.funcionarios.CadastroAuxiliar;
import controller.cadastro.tratamentoCampos.AsteriscoErro;
import controller.cadastro.tratamentoCampos.BotaoCargo;
import controller.cadastro.tratamentoCampos.BotaoCargoSelecionado;
import controller.cadastro.tratamentoCampos.ExibirSenhas;
import controller.cadastro.tratamentoCampos.CampoLogin;
import controller.cadastro.tratamentoCampos.CampoNome;
import controller.cadastro.tratamentoCampos.CampoSenha;
import controller.cadastro.tratamentoCampos.CampoSobrenome;
import controller.cadastro.tratamentoCampos.OrdenaErrosCampos;
import controller.cadastro.tratamentoCampos.PrintaErros;
import controller.cadastro.tratamentoCampos.RecebeErrosCampos;
import model.cadastro.DaoCadastroCompleto;
import model.cadastro.DaoCadastro;
import model.login.DaoNivelAcesso;

import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	public static JTextField textField;
	public static JTextField textField_1;
	public static JTextField textField_2;
	public static JCheckBox chckbxNewCheckBox = new JCheckBox("Exibir senha");
	public static JPasswordField passwordField;
	public static JPasswordField passwordField_1;
	public static JTextPane textPane = new JTextPane();
	public static JTextPane textPane_1 = new JTextPane();
	public static JTextPane textPane_2 = new JTextPane();
	public static JTextPane textPane_4 = new JTextPane();
	public static JTextPane textPane_3 = new JTextPane();
	public static JTextPane textPane_5 = new JTextPane();
	public static JRadioButton rdbtnNewRadioButton = new JRadioButton("Bibliotecario");
	public static JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Auxiliar");
	
	public static String cargoFuncionario = "";
	

	
	CampoNome campoNome = new CampoNome();
	CampoLogin campoLogin = new CampoLogin();
	CampoSenha campoSenha = new CampoSenha();
	RecebeErrosCampos recebeErrosCampos = new RecebeErrosCampos();
	OrdenaErrosCampos ordenaErrosCampos = new OrdenaErrosCampos();
	PrintaErros printaErros = new PrintaErros();
	DaoCadastroCompleto cadastroCompleto = new DaoCadastroCompleto();
	DaoCadastro dao = new DaoCadastro();
	BotaoCargo botaoCargo = new BotaoCargo();
	BotaoCargoSelecionado botaoCargoSelecionado = new BotaoCargoSelecionado();
	AsteriscoErro asteriscoErro = new AsteriscoErro();
	CampoSobrenome campoSobrenome = new CampoSobrenome();
	
	

	/**
	 * Create the frame.
	 */
	public Cadastro() {
		setResizable(false);
		setTitle("Cadastro de Funcion\u00E1rios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 350, 650, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(40, 160, 46, 14);
		contentPane.add(lblNewLabel);
		
		
		
		
		
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botaoCargoSelecionado.campoAuxiliar();
			}
		});
		rdbtnNewRadioButton_1.setBounds(336, 83, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		

		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botaoCargoSelecionado.campoBibliotecario();
			}
		});
		rdbtnNewRadioButton.setBounds(204, 83, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		

		
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Principal principal = new Principal();
				principal.setBounds(getBounds());
				setVisible(false);
				principal.setVisible(true);
			}
		});
		btnNewButton.setBounds(509, 362, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setBounds(40, 205, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setBounds(365, 205, 52, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(83, 157, 176, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(83, 202, 176, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		textPane.setForeground(Color.RED);
		textPane.setBackground(SystemColor.menu);
		textPane.setEditable(false);
		textPane.setBounds(40, 292, 273, 94);
		contentPane.add(textPane);
		
		JLabel lblNewLabel_3 = new JLabel("Confirmar senha");
		lblNewLabel_3.setBounds(310, 249, 106, 14);
		contentPane.add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(422, 202, 176, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(422, 243, 176, 20);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton_1 = new JButton("Cadastrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			campoNome.condNome();
			campoLogin.condLogin();
			campoSenha.condSenha();
			botaoCargo.botaoCargo();
			campoSobrenome.condSobrenome();
			recebeErrosCampos.recebeErro();
			ordenaErrosCampos.ordemErros();
			asteriscoErro.asteriscoErros();
			printaErros.printaErros();
			try {
				cadastroCompleto.enviaCadBanco();
			} catch (NoSuchAlgorithmException | UnsupportedEncodingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		
		btnNewButton_1.setBounds(78, 245, 99, 23);
		contentPane.add(btnNewButton_1);
		
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ExibirSenhas exibirSenhaCampos = new ExibirSenhas();
				exibirSenhaCampos.exibeSenha();
			}
		});
		chckbxNewCheckBox.setBounds(422, 272, 152, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Cadastro.class.getResource("/view/resources/images/icons/register-iconnn.png")));
		lblNewLabel_4.setBounds(45, 11, 128, 128);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Sobrenome");
		lblNewLabel_5.setBounds(339, 160, 69, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(422, 157, 176, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		textPane_1.setForeground(new Color(255, 0, 0));
		textPane_1.setEditable(false);
		
		textPane_1.setBackground(SystemColor.menu);
		textPane_1.setBounds(261, 154, 16, 20);
		contentPane.add(textPane_1);
		
		textPane_2.setForeground(Color.RED);
		textPane_2.setBackground(SystemColor.menu);
		textPane_2.setEditable(false);
		textPane_2.setBounds(261, 199, 16, 20);
		contentPane.add(textPane_2);
		
		textPane_3.setBackground(SystemColor.menu);
		textPane_3.setEditable(false);
		textPane_3.setForeground(Color.RED);
		textPane_3.setBounds(602, 199, 16, 20);
		contentPane.add(textPane_3);
		
		
		textPane_4.setBackground(SystemColor.menu);
		textPane_4.setEditable(false);
		textPane_4.setForeground(Color.RED);
		textPane_4.setBounds(602, 243, 16, 20);
		contentPane.add(textPane_4);
		textPane_5.setForeground(Color.RED);
		textPane_5.setEditable(false);
		textPane_5.setBackground(SystemColor.menu);
		textPane_5.setBounds(602, 154, 16, 20);
		
		contentPane.add(textPane_5);
		
	
		
		
		


		
	
	}
}
