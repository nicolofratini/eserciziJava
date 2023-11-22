package eserciziSugliArray;
import java.util.Scanner;


public class ricercaMaxMin {

	public static void main(String[] args) {
		int numeri[] = new int[10];
		Scanner input = new Scanner(System.in);
		int num;
		int i;
		for(i=0;i<numeri.length;i++) {
			System.out.print("Inserisi un numero: ");
			num = input.nextInt();
			numeri[i]=num;
		}
		int max=numeri[0];
		int min=numeri[0];
		for(i=0;i<numeri.length;i++) {
			if(numeri[i]>max) {
				max=numeri[i];
			}
		}
		for(i=0;i<numeri.length;i++) {
			if(numeri[i]<min) {
				min=numeri[i];
			}
		}
		
		System.out.println("Il numero maggiore è " + max + " e il numero minore è " + min);
		
	}

}
