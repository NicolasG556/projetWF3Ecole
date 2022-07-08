import java.util.ArrayList;

public class CoursFacultatif extends Cours{

	private String titre;
	ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>(); 

	public CoursFacultatif(String titre) {
		super(titre);
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	} 
	
	
}
