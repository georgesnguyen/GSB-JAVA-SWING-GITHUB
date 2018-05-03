package app.gsb.vues;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.SQLException;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import app.gsb.controleurs.ControleurRapportVisite;
import app.gsb.techniques.ConnexionException;

public class VueRapportVisite extends JPanel {
	private ControleurRapportVisite ctrl ;
	private JComboBox comboBox = new JComboBox();
	private JComboBox comboBox_1 = new JComboBox();
	private JComboBox comboBox_2 = new JComboBox();
	private JButton btnRecheche;
	private JTable table_1;
	/**
	 * Create the panel.
	 * @throws SQLException 
	 * @throws ConnexionException 
	 */
	public VueRapportVisite() {
		
	
		
		setBackground(new Color(25, 25, 112));
		setLayout(null);
		
		JLabel lblRapportDeVisite = new JLabel("Rapport de visite");
		lblRapportDeVisite.setForeground(new Color(255, 250, 240));
		lblRapportDeVisite.setFont(new Font("SansSerif", Font.BOLD, 56));
		lblRapportDeVisite.setBounds(150, 33, 545, 61);
		add(lblRapportDeVisite);
		
		JPanel panel = new JPanel();	
		panel.setBounds(12, 205, 793, 205);
		panel.setBackground(new Color(25, 25, 112));
		add(panel);
		panel.setLayout(null);	
		
		comboBox.setBackground(new Color(255, 250, 250));
		comboBox.setForeground(new Color(25, 25, 112));
		comboBox.setBounds(132, 153, 117, 24);
		add(comboBox);
		
		
		comboBox_1.setBackground(new Color(255, 250, 250));
		comboBox_1.setForeground(new Color(25, 25, 112));
		comboBox_1.setBounds(289, 153, 102, 24);
		add(comboBox_1);
		
		comboBox_2.setBackground(new Color(255, 250, 250));
		comboBox_2.setForeground(new Color(25, 25, 112));
		comboBox_2.setBounds(432, 153, 102, 24);
		add(comboBox_2);
		
		JLabel lblNomVisiteur = new JLabel("Nom visiteur");
		lblNomVisiteur.setForeground(new Color(255, 250, 250));
		lblNomVisiteur.setBounds(147, 126, 102, 15);
		add(lblNomVisiteur);
		
		JLabel lblMois = new JLabel("Mois");
		lblMois.setForeground(new Color(255, 250, 250));
		lblMois.setBounds(289, 126, 102, 15);
		add(lblMois);
		
		JLabel lblAnnee = new JLabel("Année");
		lblAnnee.setForeground(new Color(255, 250, 250));
		lblAnnee.setBounds(422, 126, 102, 15);
		add(lblAnnee);
		
		JButton btnRecheche = new JButton("Recherche");
		btnRecheche.setForeground(new Color(25, 25, 112));
		btnRecheche.setBackground(Color.WHITE);
		btnRecheche.setBounds(609, 146, 117, 31);
		add(btnRecheche);
		ctrl = new ControleurRapportVisite(this);


		
		
		
		
		
		
		
		 
		  String  title[] = {"Nom", "Ville", "Date de visite", "Date de redaction"};
		  
	   
	      JLabel lblNom = new JLabel("Nom");
	      lblNom.setForeground(new Color(255, 255, 255));
	      lblNom.setBounds(0, 23, 70, 15);
	      panel.add(lblNom);
	   
	      JLabel lblVille = new JLabel("Ville");
	      lblVille.setForeground(new Color(255, 255, 255));
	      lblVille.setBounds(198, 23, 61, 15);
	      panel.add(lblVille);
	      
	      JLabel lblDateVisite = new JLabel("Date de visite");
	      lblDateVisite.setForeground(new Color(255, 255, 255));
	      lblDateVisite.setBounds(399, 23, 118, 15);
	      panel.add(lblDateVisite);
	      
	      JLabel lblDateRedaction = new JLabel("Date de redaction");
	      lblDateRedaction.setForeground(new Color(255, 255, 255));
	      lblDateRedaction.setBounds(598, 23, 141, 15);
	      panel.add(lblDateRedaction);
	      
	      table_1 = new JTable();
	      table_1.setBounds(0, 69, 781, 82);
	      panel.add(table_1);
	      
	      
	      
	      
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public JComboBox getComboBox_1() {
		return comboBox_1;
	}

	public JComboBox getComboBox_2() {
		return comboBox_2;
	}
	
	public JButton getBtnRecherche() {
		return btnRecheche;
	}
	public JTable getTable(){
		return table_1;
	}
}


