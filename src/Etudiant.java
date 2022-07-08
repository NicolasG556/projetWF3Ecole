
public class Etudiant extends Personne {
	private String email;

	public Etudiant(String nom, String prenom, String email) {
		super(nom, prenom);
		this.setEmail(email);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
