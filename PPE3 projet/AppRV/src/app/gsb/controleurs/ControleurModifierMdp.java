package app.gsb.controleurs;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.UIManager;

import app.gsb.modeles.ModelesGsbRvDr;
import app.gsb.vues.VueAppRv;
import app.gsb.vues.VueModifierMdp;

public class ControleurModifierMdp implements ActionListener{

	private VueModifierMdp vue;
	private ModelesGsbRvDr modele = new ModelesGsbRvDr();
	
	public ControleurModifierMdp(VueModifierMdp vue){

		this.vue = vue;
		this.ecouteur();
	}
	
	public void ecouteur(){
		
		this.vue.getBtnAnnuler().addActionListener(this);
		this.vue.getBtnRetour().addActionListener(this);
		this.vue.getBtnModifier().addActionListener(this);

		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.vue.getBtnAnnuler()){
			
			this.vue.reset();
			
		}
		else if(e.getSource() == this.vue.getBtnRetour()){
			this.vue.getVue().changerVue("consulter");
		}
		else if(e.getSource() == this.vue.getBtnModifier()){
			String ancienMdp = null ;
			String NouveauMdp = null;
			String ConfirmeNouveauMdp = null;

			char [] pwd = this.vue.getPwdMdp1().getPassword();
			ancienMdp = new String (pwd);
			
			char [] pwd1 = this.vue.getPwdMdp2().getPassword();
			 NouveauMdp = new String (pwd1);
			
			char [] pwd2 = this.vue.getPwdMdp3().getPassword();
			ConfirmeNouveauMdp = new String (pwd2);
			
			
			try {
				
				if(this.modele.modifierLeMdp(ancienMdp, NouveauMdp, ConfirmeNouveauMdp) == true){
	
					this.vue.getVue().changerVue("consulter");
					
				}
				
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
		}
	}
	
}
