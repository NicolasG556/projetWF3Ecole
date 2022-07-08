import java.util.ArrayList;

public class Cours {

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
	
	
}
