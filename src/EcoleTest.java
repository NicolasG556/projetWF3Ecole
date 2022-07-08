
public class EcoleTest {

	public static void main(String[] args) {
	
		Ecole ecole1 = new Ecole("Ecole Jeanne d'Arc", "12, Rue du bucher"); 
		
		ecole1.inscrireEtudiant("Amalia", "Sabou");
		ecole1.afficherEtudiants();
		
	}

}
