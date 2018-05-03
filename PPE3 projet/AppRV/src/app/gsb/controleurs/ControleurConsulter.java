package app.gsb.controleurs;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

import app.gsb.vues.*;
import app.gsb.entites.User;
import app.gsb.modeles.*;

public class ControleurConsulter implements ActionListener {
	
	
	private Consulter vue ;
	private VueAppRv vueApp ;
	
	public ControleurConsulter(Consulter vue){
		
		this.vue = vue ;
		this.ecouteur();
	}
	
	public void ecouteur(){
		
		this.vue.getBtnPraticien().addActionListener(this);
		this.vue.getBtnRapportDeVisite().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.vue.getBtnPraticien()){
			this.vue.getVue().changerVue("praticien");
		}
		else if(e.getSource() == this.vue.getBtnRapportDeVisite()){
			
			this.vue.getVue().changerVue("rapportVisite");
		}
	}
	
	
}
