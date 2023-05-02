package principale;

import java.util.Scanner;

import modelli.Studenti;
import sistema.ClasseA;

public class Test {

	public static void main(String[] args) {
		Scanner in;
		in=new Scanner(System.in);
		ClasseA ca = new ClasseA();
		ca.m1B();
		Studenti studente = new Studenti();
		studente.setNome("Mario");
		studente.setCognome("Rossi");
		studente.setMatricola(20);
		studente.setPf("Informatica");
		studente.setTelefono("3367788636");
	}

}
