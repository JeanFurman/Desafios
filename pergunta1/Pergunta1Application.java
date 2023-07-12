package pergunta1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pergunta1Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantity = 0;
		List<Integer> valoresPares = new ArrayList<>();
		List<Integer> valoresImpares = new ArrayList<>();
		while(quantity <= 0 || quantity > 100000) {
			System.out.print("Insira um número positivo correspondente a quantidade de linhas de entradas: ");
			quantity = sc.nextInt();
		}
		for(int i=0; i < quantity; i++) {
			int numeroSelecionado = 0;
			while(numeroSelecionado <= 0) {
				System.out.print("Insira o "+ (i+1) +" número positivo: ");
				numeroSelecionado = sc.nextInt();
			}
			if(numeroSelecionado % 2 == 1) {
				valoresImpares.add(numeroSelecionado);
			}else {
				valoresPares.add(numeroSelecionado);
			}
		}
		Collections.sort(valoresPares);
		Collections.sort(valoresImpares, Collections.reverseOrder());
		for(int v : valoresPares) {
			System.out.println(v);
		}
		for(int v : valoresImpares) {
			System.out.println(v);
		}
		sc.close();
	}

}
