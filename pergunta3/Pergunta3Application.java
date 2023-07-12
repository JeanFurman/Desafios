package pergunta3;

import java.util.Scanner;

public class Pergunta3Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tamanho = 0;
		while(tamanho <= 0) {
			System.out.print("Insira o tamanho do array: ");
			tamanho = sc.nextInt();
		}
		int[] arr = new int[tamanho];
		int valorAlvo = 0;
		while(valorAlvo <= 0) {
			System.out.print("Insira o valor alvo: ");
			valorAlvo = sc.nextInt();
		}
		for(int i=0; i< tamanho; i++) {
			int valorArray = 0;
			while(valorArray <= 0) {
				System.out.print("Insira o " + (i+1) + "º valor: ");
				valorArray = sc.nextInt();
			}
			arr[i] = valorArray;
		}
		int quantidade = 0;
		for(int c : arr) {
			for(int d : arr) {
				if(d - c == valorAlvo) {
					quantidade++;
				}
			}
		}
		System.out.println("O número de pares que satisfazem o critério é " + quantidade);
		sc.close();
	}

}
