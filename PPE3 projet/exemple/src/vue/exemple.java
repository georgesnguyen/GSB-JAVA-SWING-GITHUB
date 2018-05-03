package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class exemple extends JFrame {
    public exemple() {
        super();
 
        setTitle("JTable basique dans un JPanel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        Object[][] donnees = {
                {"Johnathan", "Sykes", Color.red, true},
                {"Nicolas", "Van de Kampf", Color.black, true},
                {"Damien", "Cuthbert", Color.cyan, true},
                {"Corinne", "Valance", Color.blue, false},
                {"Emilie", "Schrödinger", Color.magenta, false},
                {"Delphine", "Duke", Color.yellow, false},
                {"Eric", "Trump", Color.pink, true},
        };
 
        String[] entetes = {"Prénom", "Nom", "Couleur favorite", "Homme"};
 
        JTable tableau = new JTable(donnees, entetes);
 
        getContentPane().add(tableau.getTableHeader(), BorderLayout.NORTH);
        getContentPane().add(tableau, BorderLayout.CENTER);
 
        pack();
    }
 
    public static void main(String[] args) {
        new exemple().setVisible(true);
    }
}