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
		// TODO Auto-generated method stub
		
	}
	
	
}
