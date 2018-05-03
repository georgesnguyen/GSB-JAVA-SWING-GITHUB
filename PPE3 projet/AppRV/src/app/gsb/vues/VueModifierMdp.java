package app.gsb.vues;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import app.gsb.controleurs.ControleurModifierMdp;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class VueModifierMdp extends JPanel {
	private JPasswordField pwdMdp1;
	private JPasswordField pwdMdp2;
	private JPasswordField pwdMdp3;
	private VueAppRv vue;
	private ControleurModifierMdp ctrl ;
	private JButton btnAnnuler = new JButton("Annuler");
	private JButton btnModifier  = new JButton("Modifier");
	private JButton btnRetour  = new JButton("Retour");
	/**
	 * Create the panel.
	 */
	public VueModifierMdp(VueAppRv vue) {
			this.vue = vue;
			setBackground(new Color(25, 25, 112));
			setLayout(null);
			
			JLabel lblModificationMotDe = new JLabel("Modification mot de passe");
			lblModificationMotDe.setFont(new Font("SansSerif", Font.BOLD, 18));
			lblModificationMotDe.setForeground(new Color(248, 248, 255));
			lblModificationMotDe.setBounds(227, 43, 500, 15);
			add(lblModificationMotDe);
			
			JLabel lblAncienMotDe = new JLabel("Ancien mot de passe:");
			lblAncienMotDe.setFont(new Font("SansSerif", Font.BOLD, 18));
			lblAncienMotDe.setForeground(new Color(248, 248, 255));
			lblAncienMotDe.setBounds(197, 136, 500, 15);
			add(lblAncienMotDe);
			
			JLabel lblNouveauMotDe = new JLabel("Nouveau mot de passe:");
			lblNouveauMotDe.setFont(new Font("SansSerif", Font.BOLD, 18));
			lblNouveauMotDe.setForeground(new Color(248, 248, 255));
			lblNouveauMotDe.setBounds(178, 186, 500, 15);
			add(lblNouveauMotDe);
			
			JLabel lblConfirmationNouveauMot = new JLabel("Confirmation nouveau mot de passe:");
			lblConfirmationNouveauMot.setFont(new Font("SansSerif", Font.BOLD, 18));
			lblConfirmationNouveauMot.setForeground(new Color(248, 248, 255));
			lblConfirmationNouveauMot.setBounds(43, 236, 500, 15);
			add(lblConfirmationNouveauMot);
			
			pwdMdp1 = new JPasswordField();
			pwdMdp1.setBounds(429, 135, 114, 19);
			add(pwdMdp1);
			
			pwdMdp2 = new JPasswordField();
			pwdMdp2.setBounds(429, 185, 114, 19);
			add(pwdMdp2);
			
			pwdMdp3 = new JPasswordField();
			pwdMdp3.setBounds(429, 235, 114, 19);
			add(pwdMdp3);
			
			
			btnModifier.setBounds(527, 361, 117, 25);
			add(btnModifier);
			
			btnRetour.setBounds(93, 361, 117, 25);
			add(btnRetour);
			
			btnAnnuler.setBounds(310, 361, 117, 25);
			add(btnAnnuler);
			
			ctrl = new ControleurModifierMdp(this);

	}
	
	public void reset(){
		
		this.getPwdMdp1().setText("");
		this.getPwdMdp2().setText("");
		this.getPwdMdp3().setText("");
	}
	

	public JPasswordField getPwdMdp1() {
		return pwdMdp1;
	}
	
	public JPasswordField getPwdMdp2() {
		return pwdMdp2;
	}
	
	public JPasswordField getPwdMdp3() {
		return pwdMdp3;
	}
	
	public JButton getBtnAnnuler() {
		return this.btnAnnuler;
	}

	public JButton getBtnRetour() {
		return this.btnRetour;
	}

	public JButton getBtnModifier() {
		return this.btnModifier;
	}

	public ControleurModifierMdp getCtrl() {
		return ctrl;
	}

	public VueAppRv getVue(){
		return this.vue;
	}
	
}
