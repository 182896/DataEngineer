package no.hvl.dat100.jpl9;

public abstract class Person {
	private String etternavn;
	private String fornavn;
	private Long fnummer;
	
	public Person() {
		etternavn = "Nordmann";
		fornavn = "Ola";
		fnummer = 10100012345L;
	}
		
	public Person(String etternavn, String fornavn, long fnummer) {
		this.etternavn = etternavn;
		this.fornavn = fornavn;
		this.fnummer = fnummer;
	}
		
	@Override
	public String toString() {
		return fnummer + "\n" + etternavn + "\n" + fornavn;
	}
		
	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}
	
	public String getEtternavn() {
		return etternavn;
	}
		
	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}
		
	public String getFornavn() {
		return fornavn;
	}
		
	public void setFnummer(Long fnummer) {
		this.fnummer = fnummer;
	}
		
	public Long getFnummer() {
		return fnummer;
	}	

	public boolean erLik(Person person) {
		if(fnummer.equals(person.getFnummer())) {
			return true;
		}else{
			return false;
		}
			
	}

	public boolean erKvinne() {
		String kvinne = String.valueOf(fnummer);
		String[] kvinner = kvinne.split("(?<=.)");
		int gender = Integer.parseInt(kvinner[8]);
		if(gender%2!=0) {
			return false;
		}else {
			return true;
		}
	}

	public boolean erMann() {
		String mann = String.valueOf(fnummer);
		String[] menn = mann.split("(?<=.)");
		int gender = Integer.parseInt(menn[8]);
		if(gender%2!=0) {
			return true;
		}else {
			return false;
		}
	}

}
