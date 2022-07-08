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
	

	public ArrayList<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(ArrayList<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public ArrayList<Professeur> getProfesseurs() {
		return professeurs;
	}

	public void setProfesseurs(ArrayList<Professeur> professeurs) {
		this.professeurs = professeurs;
	}

	public ArrayList<Module> getModules() {
		return modules;
	}

	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}

	public void inscrireEtudiant(String nom, String prenom) {
		
		Etudiant nouvelEtudiant = new Etudiant(nom, prenom); 
		this.etudiants.add(nouvelEtudiant); 
		
	}
	
	public void afficherEtudiants() {
		
		for(Etudiant etudiant:etudiants) {
			System.out.println("Nom : " + etudiant.getNom() + "Prenom : " + etudiant.getPrenom());
		}
		
	}
	
	
}
