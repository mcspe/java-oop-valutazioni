package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int lng = 20;
		Studente[] classe6 = new Studente[lng];
		Random rnd = new Random();
		
		for (int i = 1; i <= lng; i++) {
			classe6[i - 1] = new Studente(i, rnd.nextInt(101), rnd.nextFloat(1, 5));
			System.out.println(classe6[i - 1].getInfo() + " - " + (classe6[i - 1].isPassed() ? "Promosso" : "Bocciato"));
		}

	}

}
