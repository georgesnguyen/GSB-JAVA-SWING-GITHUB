package app.gsb.vues;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class VueAccueilRv extends JPanel {

	
	public VueAccueilRv() {
		setForeground(new Color(230, 230, 250));
		setBackground(new Color(25, 25, 112));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(289, 5, 1, 1);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblGsb = new JLabel("GSB");
		lblGsb.setBounds(367, 88, 150, 152);
		lblGsb.setBackground(new Color(25, 25, 112));
		lblGsb.setFont(new Font("SansSerif", Font.BOLD, 65));
		lblGsb.setForeground(new Color(248, 248, 255));
		add(lblGsb);
	}
}
