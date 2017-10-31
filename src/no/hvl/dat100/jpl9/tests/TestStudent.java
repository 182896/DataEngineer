package no.hvl.dat100.jpl9.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import no.hvl.dat100.jpl9.*;

public class TestStudent {

	@Test
	public void testConstructor() {
		Student student = new Student("Olsen", "Ole", 7L, 100, "1A");

		assertEquals(student.getEtternavn(), "Olsen");
		assertEquals(student.getFornavn(), "Ole");
		assertEquals(student.getFnummer(), Long.valueOf(7L));
		assertEquals(student.getStudnr(), 100);
		assertEquals(student.getKlasse(), "1A");
	}

	@Test
	public void testSet() {
		Student student = new Student();

		student.setEtternavn("Olsen");
		student.setFornavn("Ole");
		student.setFnummer(7L);
		student.setStudnr(100);
		student.setKlasse("1A");

		assertEquals(student.getEtternavn(), "Olsen");
		assertEquals(student.getFornavn(), "Ole");
		assertEquals(student.getFnummer(), Long.valueOf(7L));
		assertEquals(student.getStudnr(), 100);
		assertEquals(student.getKlasse(), "1A");
	}

	@Test
	public void testToString() {
		Student student = new Student("Olsen", "Ole", 7L, 100, "1A");

		String str = "STUDENT\n7\nOlsen\nOle\n100\n1A\n";

		assertEquals(student.toString(), str);
	}

}
