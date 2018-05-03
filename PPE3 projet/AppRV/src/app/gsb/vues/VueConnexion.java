package app.gsb.vues;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;

import app.gsb.controleurs.ControleurConnexion;

import javax.swing.JPasswordField;

public class VueConnexion extends JPanel {
	private JTextField textField;
	private JPasswordField pwdMdp;
	private JButton btnLogin;
	private JButton btnAnnuler;
	private VueAppRv vue;
	/**
	 * Create the panel.
	 */
	public VueConnexion(VueAppRv vue) {
		
		this.vue = vue;
		setBackground(new Color(25, 25, 112));
		setForeground(new Color(253, 245, 230));
		setLayout(null);
		
		JLabel lblSeConnecter = new JLabel("Se Connecter");
		lblSeConnecter.setBounds(278, 10, 95, 15);
		lblSeConnecter.setForeground(new Color(25, 25, 112));
		add(lblSeConnecter);
		
		JLabel lblSeConnecter_1 = new JLabel("Se Connecter");
		lblSeConnecter_1.setBounds(213, 37, 430, 97);
		lblSeConnecter_1.setFont(new Font("SansSerif", Font.BOLD, 56));
		lblSeConnecter_1.setForeground(Color.WHITE);
		add(lblSeConnecter_1);
		
		textField = new JTextField();
		textField.setBounds(278, 183, 285, 31);
		add(textField);
		textField.setColumns(10);
		
		pwdMdp = new JPasswordField();
		pwdMdp.setBounds(278, 247, 285, 31);
		add(pwdMdp);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(278, 156, 79, 15);
		lblLogin.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblLogin.setForeground(Color.WHITE);
		add(lblLogin);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setBounds(278, 231, 111, 15);
		lblMotDePasse.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblMotDePasse.setForeground(Color.WHITE);
		add(lblMotDePasse);
		
		btnLogin = new JButton("Login");
		btnLogin.setBounds(288, 290, 117, 31);
		btnLogin.setForeground(new Color(25, 25, 112));
		btnLogin.setBackground(Color.WHITE);
		add(btnLogin);
		
		btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(433, 290, 117, 31);
		btnAnnuler.setForeground(new Color(25, 25, 112));
		btnAnnuler.setBackground(Color.WHITE);
		add(btnAnnuler);
		ControleurConnexion ctrlCo = new ControleurConnexion(this);
	}
	
	public void reset(){
		
		getTextField().setText("");
		getPwdMdp().setText("");
	}
	
	public JTextField getTextField() {
		return textField;
	}
	public JPasswordField getPwdMdp() {
		return pwdMdp;
	}
	public JButton getBtnLogin() {
		return btnLogin;
	}
	public JButton getBtnAnnuler() {
		return btnAnnuler;
	}
	
	public VueAppRv getVue(){
		
		return this.vue;
	}
	
}
