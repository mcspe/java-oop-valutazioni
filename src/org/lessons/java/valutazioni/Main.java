package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int lng = 20;
		Studente[] classe6 = new Studente[lng];
		Studente[] promossi = new Studente[lng];
		Studente[] bocciati = new Studente[lng];
		Random rnd = new Random();
		int promotedStud = 0;
		
		for (int i = 1; i <= lng; i++) {
			classe6[i - 1] = new Studente(i, rnd.nextInt(101), rnd.nextFloat(1, 5));
			System.out.println(classe6[i - 1].getInfo() + " - " + (classe6[i - 1].isPassed() ? "Promosso" : "Bocciato"));
			if (classe6[i - 1].isPassed()) {
				promotedStud++;
				promossi[i - 1] = classe6[i - 1];
			} else {
				bocciati[i - 1] = classe6[i - 1];				
			}
		}
		System.out.println("\nTotale studenti promossi: " + promotedStud);
		
		Studente[] promossiRid = new Studente[promotedStud];
		Studente[] bocciatiRid = new Studente[lng - promotedStud];
		
		int p = 0;
		int b = 0;
		for(int i = 0; i < lng; i++) {
			if(promossi[i] != null) {
				promossiRid[p] = promossi[i];
				p++;
			}
			if(bocciati[i] != null) {
				bocciatiRid[b] = bocciati[i];
				b++;
			}
		}
		
		System.out.println("\nStudenti promossi: ");	
		
		int firstId = 0;
		float firstVote = 0f;
		
		for(int i = 0; i < promossiRid.length; i++) {
			System.out.println(promossiRid[i].getInfo());
			if (promossiRid[i].avgVote > firstVote) {
				firstVote = promossiRid[i].avgVote;
				firstId = promossiRid[i].id;
			}
		}
		System.out.println("\nIl miglior studente promosso è lo studente con id: " + firstId);	
		
		System.out.println("\nStudenti bocciati: ");
		
		int lastId = Integer.MAX_VALUE;
		float lastVote = Float.MAX_VALUE;
		
		for(int i = 0; i < bocciatiRid.length; i++) {
			System.out.println(bocciatiRid[i].getInfo());	
			if (bocciatiRid[i].avgVote < lastVote) {
				lastVote = bocciatiRid[i].avgVote;
				lastId = bocciatiRid[i].id;
			}
		}
		System.out.println("\nIl peggior studente bocciato è lo studente con id: " + lastId);	

	}

}
