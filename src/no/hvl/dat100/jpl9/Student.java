package no.hvl.dat100.jpl9;

public class Student extends Person {
	private int studnr;
	private String klasse;
	
	public Student() {
		setEtternavn("Nordmann");
		setFornavn("Ola");
		setFnummer(10100012345L);
		studnr = 100;
		klasse = "1A";
	}
	
	public Student(String etternavn, String fornavn, Long fnummer, int studnr, String klasse) {
		super(etternavn, fornavn, fnummer);
		this.studnr = studnr;
		this.klasse = klasse;
	}
	
	@Override
	public String toString() {
		return "STUDENT\n" + super.toString() + "\n" + studnr + "\n" + klasse + "\n";
	}

	public int getStudnr() {
		return studnr;
	}

	public void setStudnr(int studnr) {
		this.studnr = studnr;
	}

	public String getKlasse() {
		return klasse;
	}

	public void setKlasse(String klasse) {
		this.klasse = klasse;
	}

}
