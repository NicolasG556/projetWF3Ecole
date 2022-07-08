
public class Etudiant extends Personne {
	private String email;

	public Etudiant(String nom, String prenom, String email) {
		super(nom, prenom);
		this.setEmail(email);
	}


	public Etudiant(String nom, String prenom) {
		super(nom, prenom);	
		}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String afficherEtudiants() {
		
	return "Nom : " + this.getNom() + ", Prenom : " + this.getPrenom();
		
	}
	
	
	
	
}
