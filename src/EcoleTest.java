import java.util.ArrayList;

public class EcoleTest {

	public static void main(String[] args) {
	
		Ecole ecole1 = new Ecole("Ecole Jeanne d'Arc", "12, Rue du bucher");
		ArrayList<Cours> listeCours = new ArrayList<Cours>();
		Module module1 = new Module("Mathémathiques");
		ecole1.inscrireEtudiant("Sabou", "Amalia");
		ecole1.inscrireEtudiant("Guingouain", "Nicolas");
		ecole1.afficherEtudiants();
		
		module1.ajouterCours("Literature");
		module1.ajouterCours("Géométrie");
		module1.ajouterCours("Algebre");
		module1.afficherCours();
		
	}

}
