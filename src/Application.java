import java.time.LocalDate;
public class Application {

	public static void main(String[] args) {
		
		Patient hillary = new Patient();
		
		hillary.setNom("Vambuce");
		hillary.setPrenom("Hillary");
		hillary.setNumeroDeTelephone("0123456789");
		hillary.setSexe('F');
		hillary.setNumSecu(287060244010154L);
		hillary.setDateNaissance(LocalDate.of(1987, 6, 2)) ;
		hillary.setCommentaires("Allergie aux arachides");
		
		hillary.afficher();
		
	}
}
