package no.hvl.dat100.jpl9;

import no.hvl.dat100.jpl9.Person;

public class PersonSamling {
	private Person[] personer;
	private int nesteLedige;
	private int antall;

	public PersonSamling() {
		personer = new Person[20];
		nesteLedige = 0;
		antall = 20;
	}

	public PersonSamling(int lengde) {
		personer = new Person[lengde];
		nesteLedige = 0;
		antall = lengde;
	}

	public int getAntall() {
		return nesteLedige;
	}

	public Person[] getSamling() {
		return personer;
	}

	public int finnPerson(Person p) {
		int index = 0;
		boolean funnet = false;
		for(int i = 0; i<=personer.length; i++) {
			if(personer[i] == null) {
				break;
			}
			if(personer[i].erLik(p)) {
				funnet = true;
				break;
			}else {
				index++;
			}
		}
		if(funnet == false) {
			index = -1;
		}
		return index;
	}

	public boolean finnes(Person p) {
		if(finnPerson(p) != -1) {
			return true;
		}else {
			return false;
		}
	}

	public String toString() {
		String utskrift = String.valueOf(antall)+"\n";
		for(int i = 0; i<personer.length; i++) {
				utskrift += personer[i].toString();
		}
		return utskrift;
	}

	public void utvid() {
		Person[] temp = personer;
		personer = new Person[temp.length*2];
		for(int i=0; i<temp.length;i++) {
			personer[i] = temp[i];
		}
		nesteLedige++;
	}

	public boolean ledigPlass() {
		if(nesteLedige<personer.length) {
			return true;
		}else {
			return false;
		}
	}

	public boolean leggTil(Person p) {
		if(finnes(p)) {
			return false;
		}
		if(nesteLedige == personer.length) {
			Person[] temp = personer;
			personer = new Person[temp.length*2];
			for(int i=0; i<temp.length;i++) {
				personer[i] = temp[i];
			}
			personer[nesteLedige] = p;
			nesteLedige++;
			return true;
		}else{
			personer[nesteLedige] = p;
			nesteLedige++;
			return true;
		}
	}

	public void slett(Person p) {
		nesteLedige--;
		personer[finnPerson(p)] = personer[nesteLedige];
		personer[nesteLedige] = null;
	}
}