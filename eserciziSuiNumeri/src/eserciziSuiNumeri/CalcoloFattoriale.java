package eserciziSuiNumeri;
import java.util.Scanner;

public class CalcoloFattoriale {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci un numero: ");
		int n = input.nextInt();
		int i, fattoriale=1;
		for(i=1;i<=n;i++) {
			fattoriale=fattoriale*i;
		}
		System.out.println("Il fattoriale di " + n + " è " + fattoriale);
		
	}

}
