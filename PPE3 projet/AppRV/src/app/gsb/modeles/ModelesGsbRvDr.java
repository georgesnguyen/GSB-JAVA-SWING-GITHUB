package app.gsb.modeles;
/////////////////////////////////////////////////
import com.mysql.jdbc.Connection;

import app.gsb.entites.Visiteur;
import app.gsb.techniques.ConnexionBD;
import app.gsb.techniques.ConnexionException;
import app.gsb.techniques.Session;

import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ModelesGsbRvDr {
	
	public ModelesGsbRvDr(){
		
		super();
	}
	
	public boolean seConnecter(String matricule, String mdp) throws Exception{
		
		Connection connexion = (Connection) ConnexionBD.getConnexion() ;
		
		PreparedStatement requetePrepare = null;
		String requete = null;
		ResultSet resultat = null ;
		
		boolean connexionOk = false ;
		
		requete = "SELECT *"
				+ " FROM VISITEUR"
				+ " WHERE VIS_MATRICULE = ?"
				+ " AND VIS_MDP = ?";
		
		requetePrepare = (PreparedStatement) connexion.prepareStatement(requete);
		requetePrepare.setString(1, matricule);
		requetePrepare.setString(2, mdp);
		
		resultat = requetePrepare.executeQuery();
		
		if(resultat.next()){
			Session.ouvrir(new Visiteur(resultat.getString("VIS_MATRICULE"),resultat.getString("VIS_MDP")));
			connexionOk = true ;
		
		}else{
			
			connexionOk = false ;
		}
		requetePrepare.close();
		
		return connexionOk ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//////////////////////////////////////////////////////////////////////////////////////////////
public boolean modifierLeMdp(String ancienMdp, String NouveauMdp, String ConfirmationNouveauMdp) throws Exception{
		
		Connection connexion = (Connection) ConnexionBD.getConnexion() ;
		
		PreparedStatement requetePrepare = null;
		String requete = null;
		ResultSet resultat = null ;
		boolean mdfok = false;
		String matricule=Session.getSession().getLeVisiteur().getMatricule();
		String mdp=Session.getSession().getLeVisiteur().getMdp();
		if(ancienMdp.equals(mdp)){
			if(NouveauMdp.equals(ConfirmationNouveauMdp)){
				requete = "UPDATE "
						+ "VISITEUR SET VIS_MDP = ?" 
						+ " WHERE VIS_MATRICULE = ?";
						
				requetePrepare = (PreparedStatement) connexion.prepareStatement(requete);
				requetePrepare.setString(2, matricule);
				requetePrepare.setString(1, NouveauMdp);
				int res = requetePrepare.executeUpdate();
				mdfok = true ;
			}
			else{
				JOptionPane jop1;
				jop1 = new JOptionPane();
				JLabel qst = new JLabel("Nouveau mot de passe et confirmation mot de passe differents!!");
				qst.setForeground(Color.white);
				qst.setFont(new Font("SansSerif", Font.BOLD, 15));
				UIManager.put("OptionPane.background", new Color(25, 25, 112));
				UIManager.put("Panel.background", new Color(25, 25, 112));
				UIManager.put("Button.background", new Color(255,255,255));
				UIManager.put("Button.forground", new Color(25, 25, 112));
				jop1.showMessageDialog(null, qst, "Erreur", JOptionPane.ERROR_MESSAGE);
			}
		}
		else{
			JOptionPane jop1;
			jop1 = new JOptionPane();
			JLabel qst = new JLabel("ancien mot de passe et mot de passe actuelle differents!!");
			qst.setForeground(Color.white);
			qst.setFont(new Font("SansSerif", Font.BOLD, 15));
			UIManager.put("OptionPane.background", new Color(25, 25, 112));
			UIManager.put("Panel.background", new Color(25, 25, 112));
			UIManager.put("Button.background", new Color(255,255,255));
			UIManager.put("Button.forground", new Color(25, 25, 112));
			jop1.showMessageDialog(null, qst, "Erreur", JOptionPane.ERROR_MESSAGE);
			mdfok = false ;
		}
		requetePrepare.close();
		
		return mdfok ;

}
//////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public ArrayList<Visiteur> listeVisi() throws ConnexionException, SQLException{
		
		Connection connexion = (Connection) ConnexionBD.getConnexion() ;
		ArrayList<Visiteur> lesVisi = new ArrayList<Visiteur>() ;
		Statement requeteSt = connexion.createStatement();
		String requete = null;
		ResultSet resultat = null ;
		requete = "SELECT *"
				+ " FROM VISITEUR";
		
		resultat = requeteSt.executeQuery(requete);
		
		while (resultat.next()){
			
			lesVisi.add(new Visiteur(resultat.getString("VIS_MATRICULE"),
					resultat.getString("VIS_NOM"),
					resultat.getString("VIS_PRENOM"),
					resultat.getString("VIS_ADRESSE"),
					resultat.getInt("VIS_CP"),
					resultat.getString("VIS_VILLE"),
					resultat.getDate("VIS_DATEEMBAUCHE"),
					resultat.getString("LAB_CODE")
					));
		}
		return lesVisi ;
}
	
public ArrayList<Visiteur> listeRapportVisite() throws ConnexionException, SQLException{
		
		Connection connexion = (Connection) ConnexionBD.getConnexion() ;
		ArrayList<Visiteur> lesVisi = new ArrayList<Visiteur>() ;
		Statement requeteSt = connexion.createStatement();
		String requete = null;
		ResultSet resultat = null ;
		requete = "SELECT *"
				+ " FROM RAPPORT_VISITE";
		
		resultat = requeteSt.executeQuery(requete);
		
		while (resultat.next()){
			
			lesVisi.add(new Visiteur(resultat.getString("VIS_MATRICULE"),
					resultat.getString("VIS_NOM"),
					resultat.getString("VIS_PRENOM"),
					resultat.getString("VIS_ADRESSE"),
					resultat.getInt("VIS_CP"),
					resultat.getString("VIS_VILLE"),
					resultat.getDate("VIS_DATEEMBAUCHE"),
					resultat.getString("LAB_CODE")
					));
		}
		return lesVisi ;
	}
}
