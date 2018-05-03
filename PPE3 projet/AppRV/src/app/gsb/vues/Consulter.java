package app.gsb.vues;
import app.gsb.controleurs.*;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Consulter extends JPanel {
	
	private JButton btnRapportDeVisite = new JButton("Rapport");
	private JButton btnPraticien = new JButton("Praticien");
	private VueAppRv vue ;
	/**
	 * Create the panel.
	 */
	public Consulter(VueAppRv vue) {
		this.vue = vue;
		setBackground(new Color(25, 25, 112));
		setLayout(null);
		
		JLabel lblConsulter = new JLabel("Consulter");
		lblConsulter.setForeground(new Color(248, 248, 255));
		lblConsulter.setFont(new Font("SansSerif", Font.BOLD, 56));
		lblConsulter.setBounds(272, 123, 325, 71);
		add(lblConsulter);
		
		
		btnPraticien.setForeground(new Color(25, 25, 112));
		btnPraticien.setBackground(Color.WHITE);
		btnPraticien.setBounds(296, 238, 117, 31);
		add(btnPraticien);
		
		
		btnRapportDeVisite.setForeground(new Color(25, 25, 112));
		btnRapportDeVisite.setBackground(Color.WHITE);
		btnRapportDeVisite.setBounds(463, 238, 117, 31);
		add(btnRapportDeVisite);
		ControleurConsulter ctrl = new ControleurConsulter(this);
	}
	
	public JButton getBtnRapportDeVisite() {
		return btnRapportDeVisite;
	}
	public JButton getBtnPraticien() {
		return btnPraticien;
	}
	
	
	public VueAppRv getVue(){
		
		return this.vue ;
	}
	
}
