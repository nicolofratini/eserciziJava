package eserciziSulleStringhe;
import java.util.Scanner;

public class conteggioVocaliConsonanti {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci una stringa: ");
		String frase = input.nextLine();
		String frase2=frase.toLowerCase();
		
		
		int vocale=0, consonante=0;
		
		int i;
		for(i=0;i<=frase2.length();i++) {
			char carattere;
			carattere=frase2[i];
			if(frase2[i]=="97" || frase2[i]=="101" || frase2[i]=="105" || frase2[i]=="111" || frase2[i]=="117") {
				vocale++;
			}
			else {
				consonante++;
			}
		}
		
		System.out.println("Ci sono " + vocale + " vocali e " + consonante + " consonanti");

	}

}
