package org.lessons.java.valutazioni;

public class Studente {
	
	public int id;
	public int percAss;
	public float avgVote;
	
	public Studente(int id, int percAss, float avgVote) {
		this.id = id;
		this.percAss = percAss;
		this.avgVote = avgVote;
	}
	
	public String getInfo() {
		return "Studente: " + id + " - Media voti: " + String.format("%.2f", avgVote) + " - Percentuale assenze: " + percAss; 
	}
	
	public boolean isPassed() {
		boolean isPassed = true;
		
		if(percAss >= 50) {
			isPassed = false;
		} else {
			if(percAss >= 25 && avgVote <= 2) {
				isPassed = false;
			} else if (percAss < 25 && avgVote < 2) {
				isPassed = false;
			}
		}
		
		return isPassed;
	}

}
