package controleur;

import javax.swing.JOptionPane;

import main.FormulaireException;
import modele.Reservation;
import vue.Fenetre;

public class Controleur {
	private Connexion connec = new Connexion();
	
	public void reserverPlace(Fenetre fen) throws FormulaireException{
		Reservation resa=new Reservation(fen);
		if (resa.champsValide(fen)){
			int option=JOptionPane.showConfirmDialog(null,"Es-tu certain de vouloir réserver une place pour "+resa.getConcert()+" ?","Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
			if (option == JOptionPane.OK_OPTION){
				connec.connecter(resa);
			}
		}
		
	}
}
