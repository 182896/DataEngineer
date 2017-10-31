package no.hvl.dat100.jpl9.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import no.hvl.dat100.jpl9.*;

public class TestLaerer {

	private int salary;
	private int kontonr;

	@Test
	public void testConstructor() {
		Laerer laerer = new Laerer("Olsen", "Ole", 7L, 1000, 7676);

		assertEquals(laerer.getEtternavn(), "Olsen");
		assertEquals(laerer.getFornavn(), "Ole");
		assertEquals(laerer.getFnummer(), Long.valueOf(7L));
		assertEquals(laerer.getSalary(), 1000);
		assertEquals(laerer.getKontonr(), 7676);
	}

	@Test
	public void testSet() {
		Laerer laerer = new Laerer();

		laerer.setEtternavn("Olsen");
		laerer.setFornavn("Ole");
		laerer.setFnummer(7L);
		laerer.setSalary(1000);
		laerer.setKontonr(7676);

		assertEquals(laerer.getEtternavn(), "Olsen");
		assertEquals(laerer.getFornavn(), "Ole");
		assertEquals(laerer.getFnummer(), Long.valueOf(7L));
		assertEquals(laerer.getSalary(), 1000);
		assertEquals(laerer.getKontonr(), 7676);
	}

	@Test
	public void testToString() {
		Laerer laerer = new Laerer("Olsen", "Ole", 7L, 1000, 7676);

		String str = "LAERER\n7\nOlsen\nOle\n1000\n7676\n";

		assertEquals(laerer.toString(), str);
	}
}
