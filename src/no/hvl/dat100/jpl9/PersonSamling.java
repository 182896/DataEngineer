package no.hvl.dat100.jpl9;

import no.hvl.dat100.jpl9.Person;

public class PersonSamling {
	private Person[] personer;
	private int nesteLedige;
	private int antall;

	public PersonSamling() {
		personer = new Person[20];
		nesteLedige = 0;
		antall = personer.length;
	}

	public PersonSamling(int lengde) {
		personer = new Person[lengde];
		nesteLedige = 0;
		antall = lengde;
	}

	public int getAntall() {
		return antall;
	}

	public Person[] getSamling() {
		return personer;
	}

	public int finnPerson(Person p) {
		for(int i = 0; i<personer.length; i++) {
			if(personer[i].erLik(p)) {
				return i;
			}else {
				return -1;
			}
		}return -1;
	}

	public boolean finnes(Person p) {
		if(finnPerson(p) != -1) {
			return true;
		}else {
			return false;
		}
	}

	public String toString() {
		String utskrift = String.valueOf(antall);
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
		if(antall<personer.length) {
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
		for(int i = finnPerson(p); i<personer.length; i++) {
			if((personer[i] == null) || (personer[i+1] == null)) {
				break;
			}
			personer[i] = personer[i+1];
		}
	}
}