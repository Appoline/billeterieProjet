package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.FormulaireException;
import modele.Reservation;
import vue.Fenetre;

class BilletterieTest {

	@Test
	void test() {
		Fenetre fenTest = new Fenetre("","Jacques","jacques.coucou@gmail.com","Bigflo et Oli 12/04/2018","Assise");
		Reservation resaTest = new Reservation(fenTest);
		try {
			resaTest.champsValide(fenTest);
			fail("Il faut que tous les champs soient remplis.");
		} catch (FormulaireException exp) {
			assert(true);
		}
	}

}
