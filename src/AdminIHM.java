import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class AdminIHM {

	public static void main(String[] args) {
		
		JFrame j = new JFrame();
		j.setSize(700,580);
		j.setLayout(null);
		j.setTitle("Ecole");
		
		Container c = j.getContentPane();
		
		Panel nomEcole = new Panel(); 
		nomEcole.setBounds(150, 25, 400, 50);
		nomEcole.setBackground(Color.gray);;
		
		Panel etudiantsPanel = new Panel();
		etudiantsPanel.setBounds(10, 80, 600, 210);
		etudiantsPanel.setBackground(Color.white);
		
		JTextField etudiants = new JTextField(); 
		
		
		
		c.add(nomEcole); 
		c.add(etudiantsPanel); 
		
		etudiantsPanel.add(etudiants); 
		
		
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}
}
