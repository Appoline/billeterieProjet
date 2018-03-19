package controleur;

import java.sql.Connection;
import java.sql.DriverManager;

import modele.Reservation;

public class Connexion {
	//Constructeur
	public Connexion() {
		
	}
	public void connecter(Reservation resa) {
		try {
			//Création d'une instance de l'objet Driver dans le fichier .jar qu'on a téléchargé
			//Un "pont" est crée entre notre BDD et Java mais il faut faire la connexion
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver O.K.");

			//On fait la connexion : 
			String url = "jdbc:postgresql://localhost:5432/Utilisateurs";
			String user = "postgres";
			String passwd = "postgres";

			Connection conn = DriverManager.getConnection(url, user, passwd);
			System.out.println("Connexion effective !"); 
			
			//Création d'un objet Statement
			java.sql.Statement state = conn.createStatement();
			String query = "INSERT INTO spec VALUES ('"+resa.getNom()+"','"+resa.getPrenom()+"','"+resa.getMail()+"','"+resa.getConcert()+"','"+resa.getPlace()+"')";
			state.executeUpdate(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
