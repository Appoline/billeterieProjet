package main;

public class FormulaireException extends RuntimeException {
	public FormulaireException() {
		System.out.println("Vous n'avez pas rempli tous les champs.");
	}
}
