package app.gsb.controleurs;
import app.gsb.vues.VueAppRv;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ControleurAppRv implements ActionListener{
	
	private VueAppRv vue ;
	public ControleurAppRv(VueAppRv vue){
		
		this.vue = vue;
		this.ecouteur();
		
	}
	private void ecouteur(){
		
		this.vue.getMntmAccueil().addActionListener(this);
		this.vue.getMntmSeConnecter().addActionListener(this);
		this.vue.getMntmQuiiter().addActionListener(this);
		this.vue.getMntmAPropos().addActionListener(this);
		this.vue.getMntmRapportDeVisite().addActionListener(this);
		this.vue.getMntmModifierMdp().addActionListener(this);
		this.vue.getMntmDeconnexion().addActionListener(this);
		this.vue.getMntmPraticien().addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.vue.getMntmAccueil()){
			
			this.afficherAccueil();
			
		}else if(e.getSource() == this.vue.getMntmSeConnecter()){
			
			this.afficherConnexion();
			
		}else if(e.getSource() == this.vue.getMntmQuiiter()){
			
			this.quitter();
			
		}else if(e.getSource() == this.vue.getMntmAPropos()){
			
			this.aPropos();
		}else if(e.getSource() == this.vue.getMntmRapportDeVisite()){
			
			this.rapportDeVisite();
			
		}else if(e.getSource() == this.vue.getMntmPraticien()){
				
			this.praticien();
			
		}else if(e.getSource() == this.vue.getMntmModifierMdp()){
			
			this.modfifierMdp();
			
		}else if(e.getSource() == this.vue.getMntmDeconnexion()){
			
			this.Deconnection();
		}
		
	}
	
	public void afficherAccueil(){
		
		this.vue.changerVue("vue accueil");
	}
	
	public void afficherConnexion(){
		
		this.vue.changerVue("vue connexion");
	}
	public void quitter(){
		
		JLabel qst = new JLabel("Voulez-vous vraiment quitter ?");
		qst.setForeground(Color.white);
		qst.setFont(new Font("SansSerif", Font.BOLD, 15));
		
		UIManager.put("OptionPane.background", new Color(25, 25, 112));
		UIManager.put("Panel.background", new Color(25, 25, 112));
		UIManager.put("Button.background", new Color(255,255,255));
		UIManager.put("Button.forground", new Color(25, 25, 112));
		int reponse = JOptionPane.showConfirmDialog(this.vue, qst,"Quitter",JOptionPane.YES_NO_OPTION) ;
		
		if( reponse == JOptionPane.YES_OPTION ){
			
			System.exit(0) ;
		}
	}
	public void aPropos(){
		
		this.vue.changerVue("aide");
	}
	
	public void rapportDeVisite(){
		
		this.vue.changerVue("rapportVisite");
	}
	
	
	public void praticien(){
		
		this.vue.changerVue("praticien");
	}
	
	
	public void modfifierMdp(){
		
		this.vue.changerVue("modifierMdp");
	}
	
	public void Deconnection(){
		this.vue.itemSeConnecterActiver();
		this.vue.itemDeconnexionDesactiver();
		this.vue.menuConsulterDesactiver();
		this.vue.itemModifierMdpDesactiver();
		this.vue.changerVue("vue connexion");
	}
	
}
