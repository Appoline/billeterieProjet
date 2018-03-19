package controleur;

import javax.swing.JOptionPane;

import main.FormulaireException;
import modele.Reservation;

public class Controleur {
	private Connexion connec = new Connexion();
	
	public void reserverPlace(String nom, String prenom, String mail, String concert, String place) throws FormulaireException{
		Reservation resa=new Reservation(nom, prenom, mail, concert, place);
		if (resa.champsValide()){
			int option=JOptionPane.showConfirmDialog(null,"Es-tu certain de vouloir r�server une place pour "+concert+" ?","Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
			if (option == JOptionPane.OK_OPTION){
				connec.connecter(resa);
				JOptionPane.showMessageDialog(null, "Vous avez bien r�serv� une place pour "+resa.getConcert(), "Information", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
	}
}
