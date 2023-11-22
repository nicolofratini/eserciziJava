package eserciziSugliArray;
import java.util.Scanner;
import java.util.Random;


public class ricercaValore {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci un numero: ");
		int num = input.nextInt();
		
		int numeri[] = new int[10];
		Random rand = new Random();
		int numRand;
		
		int i;
		for(i=0;i<numeri.length;i++) {
			numRand = rand.nextInt(10);
			numRand+=1;
			numeri[i]=numRand;
		}
		
		for(i=0;i<numeri.length;i++) {
			if(num==numeri[i]) {
				System.out.println("Il numero è presente");
			}
			else {
				System.out.println("Il numero non è presente");
			}
		}

	}

}
