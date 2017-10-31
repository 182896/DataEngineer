package no.hvl.dat100.jpl9;

public class Laerer extends Person {

	private int kontonr;
	private int salary;
	
	public Laerer() {
		setEtternavn("Nordmann");
		setFornavn("Ola");
		setFnummer(10100012345L);
		kontonr = 7676;
		salary = 1000;
	}
	
	public Laerer(String etternavn, String fornavn, Long fnummer, int salary, int kontonr) {
		super(etternavn, fornavn, fnummer);
		this.kontonr = kontonr;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "LAERER\n" + super.toString()+ "\n" + salary + "\n" + kontonr + "\n";
	}

	public int getKontonr() {
		return kontonr;
	}

	public void setKontonr(int kontonr) {
		this.kontonr = kontonr;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
