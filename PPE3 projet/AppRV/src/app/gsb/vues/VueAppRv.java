package app.gsb.vues;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import app.gsb.controleurs.*;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;

public class VueAppRv extends JFrame {
	
	private Container conteneur ;
	private ControleurAppRv ctrl ;
	private CardLayout clVues = new CardLayout(5,5) ;
	
	private VueAccueilRv vueAccueil = new VueAccueilRv() ;
	private VueConnexion vueCnx = new VueConnexion(this);
	private VueAide vueAide = new VueAide();
	private Consulter consulter = new Consulter(this);
	private VueRapportVisite rapportVisite = new VueRapportVisite() ;
	private VueModifierMdp ModifierMdp = new VueModifierMdp(this) ;
	private VuePraticien praticien = new VuePraticien(this);
	
	private JMenu mnConsulter = new JMenu("Consulter");
	private JMenuItem mntmAccueil = new JMenuItem("Accueil");
	private JMenuItem mntmQuiiter = new JMenuItem("Quitter");
	private JMenuItem mntmSeConnecter = new JMenuItem("Se connecter");
	///////////////////////////////////////////////////////////////////////////////////////////////
	private JMenuItem mntmModifierMdp = new JMenuItem("Modifier Mot De Passe");
	private JMenuItem mntmDconnexion = new JMenuItem("Déconnexion");
	private JMenuItem mntmPraticien = new JMenuItem("Praticien");
	private JMenuItem mntmRapportDeVisite = new JMenuItem("Rapport de visite"); 
	private JMenuItem mntmAPropos = new JMenuItem("A propos");
	
	

	/**
	 * Create the frame.
	 */
	public VueAppRv() {
		setType(Type.UTILITY);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		getContentPane().setBackground(new Color(25, 25, 112));
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 525);
		setLocationRelativeTo(null) ;
		setResizable(false);
		
		this.ctrl = new ControleurAppRv(this) ;
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAccueil = new JMenu("Accueil");
		menuBar.add(mnAccueil);
		
		
		mnAccueil.add(mntmAccueil);
		
		JSeparator separator = new JSeparator();
		mnAccueil.add(separator);
		
		
		mnAccueil.add(mntmQuiiter);
		
		JMenu mnConnexion = new JMenu("Connexion");
		menuBar.add(mnConnexion);
		
		
		mnConnexion.add(mntmSeConnecter);
		
		JSeparator separator_2 = new JSeparator();
		mnConnexion.add(separator_2);
		///////////////////////////////////////////////////////////////////////////////////////////////

		mnConnexion.add(mntmModifierMdp);
		JSeparator separator_3 = new JSeparator();
		mnConnexion.add(separator_3);
		mnConnexion.add(mntmDconnexion);
		
		menuBar.add(mnConsulter);
		
		
		
		
		mnConsulter.add(mntmPraticien);
		
		JSeparator separator_1 = new JSeparator();
		mnConsulter.add(separator_1);
		
		
		mnConsulter.add(mntmRapportDeVisite);
		
		JMenu mnNewMenu = new JMenu("Aide");
		menuBar.add(mnNewMenu);
		
		
		mnNewMenu.add(mntmAPropos);
		
		conteneur = this.getContentPane();
		conteneur.setLayout(clVues);
		
		conteneur.add(vueAccueil, "vue accueil");
		conteneur.add(vueCnx, "vue connexion");
		conteneur.add(vueAide, "aide");
		conteneur.add(ModifierMdp, "modifierMdp");
		conteneur.add(consulter, "consulter");
		conteneur.add(rapportVisite, "rapportVisite");
		conteneur.add(praticien, "praticien");
		vueAccueil.setLayout(null);
		
		menuConsulterDesactiver();
		itemDeconnexionDesactiver();
		itemModifierMdpDesactiver();
		setVisible(true);
	}

	
	
	
	
	public void menuConsulterDesactiver(){
		
		this.mnConsulter.setEnabled(false);
	}
	
	public void itemDeconnexionDesactiver(){
		
		this.mntmDconnexion.setEnabled(false);
	}
	
	public void itemDeconnexionActiver(){
		
		this.mntmDconnexion.setEnabled(true);
	}
	
	
	
	
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////
	public void itemModifierMdpDesactiver(){
		
		this.mntmModifierMdp.setEnabled(false);
	}
	
	public void itemModifierMdpActiver(){
		
		this.mntmModifierMdp.setEnabled(true);
	}
	
	
	
	
	public void itemSeConnecterActiver(){
		
		this.mntmSeConnecter.setEnabled(true);
	}	
	
	
	
	public void itemSeConnecterDesactiver(){
		
		this.mntmSeConnecter.setEnabled(false);
	}
	
	public void menuConsulterActiver(){
		
		this.mnConsulter.setEnabled(true);
	}
	
	public void changerVue(String nomVue){
		
		this.clVues.show(conteneur, nomVue);
	}
	
	
	


	public JMenuItem getMntmAccueil() {
		return mntmAccueil;
	}

	public JMenuItem getMntmQuiiter() {
		return mntmQuiiter;
	}

	public JMenuItem getMntmSeConnecter() {
		return mntmSeConnecter;
	}

	public JMenuItem getMntmPraticien() {
		return mntmPraticien;
	}

	public JMenuItem getMntmRapportDeVisite() {
		return mntmRapportDeVisite;
	}
	

	public JMenuItem getMntmAPropos() {
		return mntmAPropos;
	}

	public JMenuItem getMntmDeconnexion() {
		return mntmDconnexion;
	}
	
	public JMenuItem getMntmModifierMdp() {
		return mntmModifierMdp;
	}





	
}
