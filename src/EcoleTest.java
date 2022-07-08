import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.xml.transform.Source;

public class EcoleTest extends JFrame implements ActionListener{
	
	JButton inscriptionEtudiant = new JButton("Inscrire Etudiant"); 
	Border grayline = BorderFactory.createLineBorder(Color.gray);
	
	Ecole ecole1 = new Ecole("Ecole Jeanne d'Arc", "12, Rue du bucher"); 
	
	JTextField etudiantsAfficher = new JTextField(); 
	
	public EcoleTest() {

			setSize(700,580);
			setLayout(null);
			setTitle("Ecole");
			
			Container c = getContentPane();
			
			Panel nomEcolePanel = new Panel(); 
			nomEcolePanel.setBounds(150, 25, 400, 50);
			nomEcolePanel.setBackground(Color.gray);;
			JTextField nomEcoleText = new JTextField(ecole1.getNom());
			nomEcoleText.setBackground(Color.gray);
			nomEcoleText.setBorder(grayline);
			//nomEcoleText.setFont(Font.BOLD);
			
			Panel etudiantsPanel = new Panel();
			etudiantsPanel.setBounds(10, 80, 600, 210);
			etudiantsPanel.setBackground(Color.white);
			
			inscriptionEtudiant.setBounds(450, 300, 150, 30);
			inscriptionEtudiant.addActionListener(this);
			
			
			for(Etudiant etudiant:ecole1.getEtudiants()) {
				etudiantsAfficher.setText(etudiant.afficherEtudiants());
			}
			 
			
			c.add(nomEcolePanel); 
			c.add(inscriptionEtudiant); 
			c.add(etudiantsPanel); 
			etudiantsPanel.add(etudiantsAfficher); 
			nomEcolePanel.add(nomEcoleText); 
			
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object source = e.getSource(); 
		
		JFrame k = new JFrame();
		k.setSize(250,300);
		k.setLayout(null);
		k.setTitle("Inscription Etudiant");
		 
		
		JPanel panelInscription = new JPanel(); 
		panelInscription.setBounds(0, 0, 200, 300);
		
		JLabel labelNomEtudiant = new JLabel();
		labelNomEtudiant.setBounds(10, 20, 50 ,50);
		labelNomEtudiant.setText("Nom : ");
		
		JTextField NomEtudiant = new JTextField();
		labelNomEtudiant.setBounds(10, 80, 50 ,50);
		
		JLabel labelPrenomEtudiant = new JLabel();
		labelNomEtudiant.setBounds(10, 140, 50 ,50);
		labelNomEtudiant.setText("Prenom : ");
		
		
		JTextField PrenomEtudiant = new JTextField();
		labelNomEtudiant.setBounds(10, 200, 50 ,50);
		
		panelInscription.add(labelNomEtudiant);
		panelInscription.add(NomEtudiant);
		panelInscription.add(labelPrenomEtudiant);
		panelInscription.add(PrenomEtudiant);
		k.add(panelInscription); 
		
		
		k.setVisible(true);
		k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		
		new EcoleTest(); 
		
}
	
	}


