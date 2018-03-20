package modele;

import main.FormulaireException;
import java.awt.event.ActionEvent;
import vue.Fenetre;

public class Reservation {
		//Attributs 
		private String nom;
		private String prenom;
		private String mail;
		private String concert;
		private String place;
		
		//Constructeur
		public Reservation(Fenetre fen) {
			this.setNom(fen.getNom());
			this.setPrenom(fen.getPrenom());
			this.setMail(fen.getMail());
			this.setConcert(fen.getConcert());
			this.setPlace(fen.getPlace());
		}
		//Les méthodes
		//Créer une méthode pour vérifier la validation des champs
		public boolean champsValide(Fenetre fen) throws FormulaireException {
			if (this.getNom().equals("") || this.getPrenom().equals("") || this.getMail().equals("")) {
				fen.setVisible(false); //you can't see me!
				fen.dispose();
				throw new FormulaireException();
			} else {
				return true;
			}
		}
		
		//Les getter
		public String getNom() {
			return this.nom;
		}
		public String getPrenom() {
			return this.prenom;
		}
		public String getMail() {
			return this.mail;
		}
		public String getConcert() {
			return this.concert;
		}
		public String getPlace() {
			return this.place;
		}
		
		//Les setter
		public void setNom(String n) {
			this.nom=n;
		}
		public void setPrenom(String p) {
			this.prenom=p;
		}
		public void setMail(String m) {
			this.mail=m;
		}
		public void setConcert(String c) {
			this.concert=c;
		}
		public void setPlace(String p) {
			this.place=p;
		}
}
