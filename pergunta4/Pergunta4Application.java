package pergunta4;

import java.util.Scanner;

public class Pergunta4Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int linhas = 0;
		System.out.print("Insira a quantidade de linhas: ");
		linhas = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < linhas; i++) {
			String frase = "";
			while(frase.length() < 2 || frase.length() > 100) {
				System.out.print("Insira a frase a ser decifrada: ");
				frase = sc.nextLine();
			}
			frase = frase.toUpperCase();
			int meio = frase.length() / 2;
			String frase1 = frase.substring(0, meio);
			String frase2 = frase.substring(meio);
			
			StringBuilder frase1reverse = new StringBuilder(frase1);
			frase1reverse.reverse();
			StringBuilder frase2reverse = new StringBuilder(frase2);
			frase2reverse.reverse();
			frase1reverse.append(frase2reverse);
			System.out.println(frase1reverse);
			
		}
		sc.close();
	}

}
