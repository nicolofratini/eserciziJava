package eserciziSuiNumeri;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci un numero: ");
		int num = input.nextInt();
		int i;
		boolean check=false;
		
		if(num==0 || num==1) {
			System.out.println("Il numero non è primo");
		}
		else {
			i=1;
			while(i!=num || check==false) {
				if(num%i==0) {
					System.out.println("Il numero non è primo");
				}
				else {
					System.out.println("Il numero è primo");
					check=true;
				}
				i=i+2;
			}
		}
	}
}
