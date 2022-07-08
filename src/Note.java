
public class Note {

	private float valeur;
	private Etudiant etudiant; 
	private Cours cours;
	
	
	public Note(float valeur, Etudiant etudiant, Cours cours) {
		super();
		this.valeur = valeur;
		this.etudiant = etudiant;
		this.cours = cours;
	}


	public float getValeur() {
		return valeur;
	}


	public void setValeur(float valeur) {
		this.valeur = valeur;
	}


	public Etudiant getEtudiant() {
		return etudiant;
	}


	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}


	public Cours getCours() {
		return cours;
	}


	public void setCours(Cours cours) {
		this.cours = cours;
	} 
	
	
}
