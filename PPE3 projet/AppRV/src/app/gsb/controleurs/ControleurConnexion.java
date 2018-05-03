package app.gsb.controleurs;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

import app.gsb.vues.*;
import app.gsb.entites.User;
import app.gsb.modeles.*;

public class ControleurConnexion implements ActionListener{
	
	private VueAppRv vue1;
	private VueConnexion vue;
	private ModelesGsbRvDr modele = new ModelesGsbRvDr();
	
	public ControleurConnexion(VueConnexion vue){
		
		this.vue = vue;
		this.ecouteur();
	}
	
	public void ecouteur(){
		
		this.vue.getBtnAnnuler().addActionListener(this);
		
		this.vue.getBtnLogin().addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.vue.getBtnAnnuler()){
			
			this.vue.reset();
			
		}else if(e.getSource() == this.vue.getBtnLogin()){
			
			String login = null ;
			String mdp = null;
			
			login = this.vue.getTextField().getText();
			
			char [] pwd = this.vue.getPwdMdp().getPassword();
			mdp = new String (pwd);
			
			try {
				
				if(this.modele.seConnecter(login, mdp) == true){
					this.vue.getVue().itemSeConnecterDesactiver();
					this.vue.getVue().itemDeconnexionActiver();
					this.vue.getVue().menuConsulterActiver();
					this.vue.getVue().itemModifierMdpActiver();
					//redirection ;
					this.vue.getVue().changerVue("consulter");
					
				}else{
					
					JOptionPane jop1;
					jop1 = new JOptionPane();
					JLabel qst = new JLabel("Le login et ou le mot de passe est inccorecte");
					qst.setForeground(Color.white);
					qst.setFont(new Font("SansSerif", Font.BOLD, 15));
					UIManager.put("OptionPane.background", new Color(25, 25, 112));
					UIManager.put("Panel.background", new Color(25, 25, 112));
					UIManager.put("Button.background", new Color(255,255,255));
					UIManager.put("Button.forground", new Color(25, 25, 112));
					jop1.showMessageDialog(null, qst, "Erreur", JOptionPane.ERROR_MESSAGE);
				}
				
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
		}
	}
	

}
