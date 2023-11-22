package eserciziSuiNumeri;
import java.util.Scanner;
import java.util.Random;

public class IndovinaNumeriCasuali {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int numRand = rand.nextInt(10);
		numRand+=1;
		
		Scanner input = new Scanner(System.in);
		
		boolean exit=false;
		
		while(exit==false) {
			System.out.print("Inserisci un numero: ");
			int numGuess = input.nextInt();
			if(numGuess==numRand) {
				System.out.println("Complimenti hai indovinato il numero!");
				exit=true;
			}
			else {
				if(numGuess>numRand) {
					System.out.println("Peccato, ritenta. Il numero inserito è troppo alto");
				}
				else {
					System.out.println("Peccato, ritenta. Il numero inserito è troppo basso");
				}
			}
		}

	}

}
