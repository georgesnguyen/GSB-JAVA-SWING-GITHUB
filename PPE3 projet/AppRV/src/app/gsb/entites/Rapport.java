package app.gsb.entites;

public class Rapport {
	private String matricule;
	private String bilan;
	private int rapportNumero;
	private int praticienNumero;
	
	
	
	
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getBilan() {
		return bilan;
	}
	public void setBilan(String bilan) {
		this.bilan = bilan;
	}
	public int getRapportNumero() {
		return rapportNumero;
	}
	public void setRapportNumero(int rapportNumero) {
		this.rapportNumero = rapportNumero;
	}
	public int getPraticienNumero() {
		return praticienNumero;
	}
	public void setPraticienNumero(int praticienNumero) {
		this.praticienNumero = praticienNumero;
	}
	
	
	
	public Rapport(String matricule, String bilan, int rapportNumero, int praticienNumero) {
		super();
		this.matricule = matricule;
		this.bilan = bilan;
		this.rapportNumero = rapportNumero;
		this.praticienNumero = praticienNumero;
	}

	
	
	@Override
	public String toString() {
		return "Rapport [matricule=" + matricule + ", bilan=" + bilan + ", rapportNumero=" + rapportNumero
				+ ", praticienNumero=" + praticienNumero + "]";
	}
	
}
