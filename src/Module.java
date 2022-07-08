import java.util.ArrayList;

public class Module implements Inscription{

	private String titre;
	ArrayList<Cours> cours = new ArrayList<Cours>(); 
	ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>(); 

	
	public Module(String titre, ArrayList<Cours> cours) {
		this.titre = titre;
		this.cours = cours;
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
		// TODO Auto-generated method stub
		
	}

	
	
}
