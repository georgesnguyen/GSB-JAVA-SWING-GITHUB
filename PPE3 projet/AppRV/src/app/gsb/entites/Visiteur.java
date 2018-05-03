package app.gsb.entites;

import java.sql.Date;

public class Visiteur {
	
	private String matricule ;
	private String nom ;
	private String prenom ;
	private String adresse ;
	private int cp ;
	private String ville ;
	private Date dateEmbauche ;
	private String labCode ;
	private String mdp ;
	
	public Visiteur(String matricule, String nom, String prenom, String adresse, int cp, String ville,
			Date dateEmbauche, String labCode) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		this.dateEmbauche = dateEmbauche;
		this.labCode = labCode;
	}
	
	public Visiteur(String matricule, String mdp) {
		super();
		this.matricule = matricule;
		this.mdp= mdp;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Date getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	public String getLabCode() {
		return labCode;
	}

	public void setLabCode(String labCode) {
		this.labCode = labCode;
	}
	
	
	
	
	
}
