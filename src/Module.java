import java.util.ArrayList;

public class Module implements Inscription{

	private String titre;
	ArrayList<Cours> cours = new ArrayList<Cours>(); 
	ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>(); 

	
	public Module(String titre) {
		this.titre = titre;
		
	}



	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public ArrayList<Cours> getCours() {
		return cours;
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
	
	public void ajouterCours(String titre) {
		Cours nouveauCours = new Cours(titre);
		this.cours.add(nouveauCours);
	}
	
	public void afficherCours() {
		System.out.println("Le module " + this.getTitre() + " comprend les cours suivants :");
		for(Cours cour:cours) {
			System.out.println( cour.getTitre());
		}
		
	}
}
