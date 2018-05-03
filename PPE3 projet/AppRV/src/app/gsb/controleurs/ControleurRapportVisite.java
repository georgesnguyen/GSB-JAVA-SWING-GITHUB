package app.gsb.controleurs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;

import app.gsb.entites.Visiteur;
import app.gsb.modeles.ModelesGsbRvDr;
import app.gsb.techniques.ConnexionException;
import app.gsb.vues.VueRapportVisite;

public class ControleurRapportVisite {
	
	private ModelesGsbRvDr modele = new ModelesGsbRvDr();
	private VueRapportVisite vue ;
	private ArrayList<Visiteur> visi = new ArrayList<Visiteur>() ;
	
	
	public ControleurRapportVisite(VueRapportVisite vue){
		
		super();
		this.vue = vue ;
		this.peuplerComboVisi();
		this.peuplerAnneeCombo();
		this.peuplerMois();
	}
	
	

	
	
	
	
	public void peuplerComboVisi(){
		
		try {
			this.visi = this.modele.listeVisi();
		} catch (ConnexionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0 ; i < visi.size(); i++){
			//Peupler la liste de visiteur RAPPORT DE VISITE
			this.vue.getComboBox().addItem(visi.get(i).getNom());
		}
	}
	
	
	public void peuplerAnneeCombo(){
		
		int annee = 1980;
		for(int i = 0; i< 39; i++){
			int anneeP = annee + i ;
			this.vue.getComboBox_2().addItem(anneeP);
		}
	}
	
	public void peuplerMois(){
		
		int mois = 1;
		for(int i = 0; i < 12; i++ ){
			
			this.vue.getComboBox_1().addItem(mois + i);
			
		}
	}

	
	/*public void peuplerTableauVisite(){
			
			try {
				this.visi = this.modele.listeVisi();
			} catch (ConnexionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i = 0 ; i < visi.size(); i++){
				//Peupler la liste de visiteur RAPPORT DE VISITE
				if(e.getSource() == this.vue.getBtnAnnuler()){
					
					this.vue.reset();
					
				}
				this.vue.getBtnRecherche()
				this.vue.getComboBox().addItem(visi.get(i).getNom());
			}
	} */
	

	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.vue.getBtnRecherche()){
			

			try {
				
				Object[][] donnees = {
			            {"Johnathan", "Sykes", Color.red, true},
			            {"Nicolas", "Van de Kampf", Color.black, true},
			            {"Damien", "Cuthbert", Color.cyan, true},
			            {"Corinne", "Valance", Color.blue, false},
			            {"Emilie", "Schrödinger", Color.magenta},
			            {"Delphine", "Duke", Color.yellow, false},
			            {"Eric", "Trump", Color.pink, true},
			    };

			    String[] entetes = {"Prénom", "Nom", "Couleur favorite", "Homme", };
			    
			    this.vue.getTable();
			    JTable tableau = new JTable(donnees, entetes);

			    getContentPane().add(BorderLayout.NORTH);
			    getContentPane().add(BorderLayout.CENTER);

			    pack();
				
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
		}
	}







	private void pack() {
		// TODO Auto-generated method stub
		
	}







	private List getContentPane() {
		// TODO Auto-generated method stub
		return null;
	}
	


/*	public List<Visiteur> getTableauRapportVisite(String nom, int mois, int annee){

		//this.peupler();
		List<Visiteur> visiteurs = new ArrayList<>() ;

		for(RapportVisite unRapport : this.lesRapportsVisites){
			System.out.println("1");
			if(visi.getLeVisiteur().getMatricule().equals(matricule)){
				System.out.println("2");
				if(unRapport.getDateVisite().get(Calendar.MONTH) == mois){
					System.out.println("3");
					if(unRapport.getDateVisite().get(Calendar.YEAR) == annee ){
						System.out.println("4");
						this.vue.getComboBox().addItem(visi.get(i).getNom());
					}			
				}
			}
		}
		
		
	}*/
	
	
}
