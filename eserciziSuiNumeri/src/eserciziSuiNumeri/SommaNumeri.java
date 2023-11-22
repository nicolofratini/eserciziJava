package eserciziSuiNumeri;

import java.util.Scanner;

public class SommaNumeri {

	public static void main(String[] args) {
		int somma = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci un numero: ");
		int n1 = input.nextInt();
		System.out.print("Inserisci un numero: ");
		int n2 = input.nextInt();
		System.out.print("Inserisci un numero: ");
		int n3 = input.nextInt();
		System.out.print("Inserisci un numero: ");
		int n4 = input.nextInt();
		System.out.print("Inserisci un numero: ");
		int n5 = input.nextInt();
		somma = n1 + n2 + n3 + n4 + n5;
		System.out.println("La somma dei numeri è: " + somma);

	}

}
