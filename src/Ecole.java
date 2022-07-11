import java.util.ArrayList;

public class Ecole implements Inscription{
	private String nom;
	private String adresse;
	private ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>(); 
	private ArrayList<Professeur> professeurs = new ArrayList<Professeur>(); 
	private ArrayList<Module> modules = new ArrayList<Module>(); 
	
	public Ecole(String nom, String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void inscrireEtudiant(String nom, String prenom) {
		
		Etudiant nouvelEtudiant = new Etudiant(nom, prenom); 
		this.etudiants.add(nouvelEtudiant); 
		
	}
	
	public void afficherEtudiants() {
		System.out.println("La liste des etudiants est la suivante :");
		for(Etudiant etudiant:etudiants) {
			System.out.println("Nom : " + etudiant.getNom() + " Prenom : " + etudiant.getPrenom());
		}
		
	}
	
	
}
