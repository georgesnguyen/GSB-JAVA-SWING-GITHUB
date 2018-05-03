package app.gsb.vues;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import app.gsb.controleurs.ControleurModifierMdp;
public class VuePraticien extends JPanel {
	private JPasswordField pwdMdp1;
	private JPasswordField pwdMdp2;
	private JPasswordField pwdMdp3;
	private VueAppRv vue;
	private ControleurModifierMdp ctrl ;
	private JButton btnAnnuler  = new JButton("Annuler");
	private JButton btnLister  = new JButton("Lister");
	/**
	 * Create the panel.
	 */
	public VuePraticien(VueAppRv vueAppRv) {
			this.vue = vueAppRv;
			setBackground(new Color(25, 25, 112));
			setLayout(null);
			
			JLabel lblModificationMotDe = new JLabel("Liste des praticiens");
			lblModificationMotDe.setFont(new Font("SansSerif", Font.BOLD, 18));
			lblModificationMotDe.setForeground(new Color(248, 248, 255));
			lblModificationMotDe.setBounds(288, 44, 500, 15);
			add(lblModificationMotDe);
			
			pwdMdp1 = new JPasswordField();
			pwdMdp1.setBounds(429, 135, 114, 19);
			add(pwdMdp1);
			
			pwdMdp2 = new JPasswordField();
			pwdMdp2.setBounds(429, 185, 114, 19);
			add(pwdMdp2);
			
			pwdMdp3 = new JPasswordField();
			pwdMdp3.setBounds(429, 235, 114, 19);
			add(pwdMdp3);
			
			
			btnAnnuler.setBounds(500, 361, 117, 25);
			add(btnAnnuler);
			
			btnLister.setBounds(181, 361, 117, 25);
			add(btnLister);
			
			

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
		return this.btnLister;
	}

	public JButton getBtnModifier() {
		return this.btnAnnuler;
	}

	public ControleurModifierMdp getCtrl() {
		return ctrl;
	}

	//public VuePraticien getVue(){
	//	return this.vue;
	//}
	
}
