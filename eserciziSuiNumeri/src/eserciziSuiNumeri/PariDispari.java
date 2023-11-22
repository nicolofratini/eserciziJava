package eserciziSuiNumeri;
import java.util.Scanner;

public class PariDispari {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci un numero: ");
		int n = input.nextInt();
		
		if(n%2==0) {
			System.out.println("Il numero " + n + " è pari");
		}
		else {
			System.out.println("Il numero " + n + " è dispari");
		}
	}

}
