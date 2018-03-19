package modele;

import main.FormulaireException;

public class Reservation {
	//Attributs 
		private String nom;
		private String prenom;
		private String mail;
		private String concert;
		private String place;
		
		//Constructeur
		public Reservation(String nom, String prenom, String mail, String concert, String place) {
			this.nom=nom;
			this.prenom=prenom;
			this.mail=mail;
			this.concert=concert;
			this.place=place;
		}
		//Les méthodes
		//Créer une méthode pour vérifier la validation des champs
		public boolean champsValide() throws FormulaireException {
			if (this.nom.equals("") || this.prenom.equals("") || this.mail.equals("")) {
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
