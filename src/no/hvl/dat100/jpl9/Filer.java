package no.hvl.dat100.jpl9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Filer {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jpl9/";

	private static String STUDENT = "STUDENT";
	private static String LAERER = "LAERER";

	public boolean skriv(PersonSamling samling, String filnavn) {

		boolean skrevet = true;
		PrintWriter writer = null;

		File fil = new File(MAPPE+filnavn);
		
		try{
			writer = new PrintWriter(fil);
		}
		catch(FileNotFoundException e) {
			System.out.println("Fant ikke filen");
		}
		
		writer.print(samling.toString());
		
		writer.close();
		return skrevet;

	}

	public PersonSamling les(String filnavn) {

		PersonSamling samling = null;
		File fil = new File(MAPPE+filnavn);
		Scanner leser = null;
		
		try {
			leser = new Scanner(fil);
		} catch(FileNotFoundException e) {
			System.out.println("Fant ikke filen.");
		}
		
		int teller = 0;
		String linje;
		while(leser.hasNextLine()) {
			if(teller == 0) {
				samling = new PersonSamling(Integer.parseInt(leser.next()));
				teller++;
			}
			
			linje = leser.nextLine();
			if(linje.equals(LAERER)) {
				linje = leser.nextLine();
				Laerer laerer = new Laerer(leser.nextLine(), leser.nextLine(), Long.parseLong(linje), Integer.parseInt(leser.nextLine()), Integer.parseInt(leser.nextLine()));
				samling.leggTil(laerer);
			}else if(linje.equals(STUDENT)) {
				linje = leser.nextLine();
				Student student = new Student(leser.nextLine(), leser.nextLine(), Long.parseLong(linje), Integer.parseInt(leser.nextLine()), leser.nextLine());
				samling.leggTil(student);
			}

		}
		
		leser.close();
		return samling;
	}
}
