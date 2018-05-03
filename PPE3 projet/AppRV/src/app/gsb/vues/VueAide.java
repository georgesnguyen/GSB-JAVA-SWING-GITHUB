package app.gsb.vues;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class VueAide extends JPanel {

	/**
	 * Create the panel.
	 */
	public VueAide() {
		setBackground(new Color(25, 25, 112));
		setLayout(null);
		
		JLabel lblApplicationRalisePar = new JLabel("Application réalisée par Georges NGUYEN & Hamza ESSAMAMI");
		lblApplicationRalisePar.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblApplicationRalisePar.setForeground(Color.WHITE);
		lblApplicationRalisePar.setBounds(80, 110, 730, 60);
		add(lblApplicationRalisePar);
		
		JLabel lblCopyrightGsb = new JLabel("Copyright GSB 2017");
		lblCopyrightGsb.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblCopyrightGsb.setForeground(new Color(248, 248, 255));
		lblCopyrightGsb.setBounds(345, 235, 206, 31);
		add(lblCopyrightGsb);
		
	}
}
