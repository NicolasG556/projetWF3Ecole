import java.util.ArrayList;

public class Cours implements Inscription{

	private String titre;
	ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>(); 

	public Cours(String titre) {
		this.titre = titre;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
	

	@Override
	public void inscrireEtudiant(String nom, String prenom) {
		Etudiant nouvelEtudiant = new Etudiant(nom, prenom); 
		this.etudiants.add(nouvelEtudiant);
		
	}
	public void afficherEtudiants() {
		
		for(Etudiant etudiant:etudiants) {
			System.out.println("Nom : " + etudiant.getNom() + " Prenom : " + etudiant.getPrenom());
		}
		
	}
	
}
