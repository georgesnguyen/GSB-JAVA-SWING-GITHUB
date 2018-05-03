package app.gsb.techniques;
import app.gsb.entites.*;
public class Session {
	
	private static Session session = null ;
	
	private Visiteur leVisiteur ;
	private Visiteur mdp ;
	
	
	private Session( Visiteur leVisiteur){
		
		super();
		this.leVisiteur = leVisiteur ;
	}
	
	public static void ouvrir(Visiteur leVisiteur1){
			
		Session.session = new Session(leVisiteur1);
		
	}
	
	public static void fermer(){
		
		Session.session = null;
		
	}
	
	public static Session getSession(){
		
		return Session.session;
	}
	public Visiteur getLeVisiteur(){
		
		return this.leVisiteur ;
	}
	

	@Override
	public String toString() {
		return "Session [leVisiteur=" + leVisiteur + "]";
	}
	
	
}
