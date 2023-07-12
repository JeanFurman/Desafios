package pergunta2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Pergunta2Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float valor = 0;
		while(valor <= 0 || valor > 1000000) {
			System.out.print("Insira o dinheiro a ser calculado: ");
			valor = sc.nextFloat();
		}
		
		BigDecimal valorPreciso = BigDecimal.valueOf(valor);
		float[] cedulas = {100, 50, 20, 10, 5, 2};
		float[] moedas = {1, 0.5f, 0.25f, 0.1f, 0.05f, 0.01f};
		
		System.out.println("NOTAS: ");
		for(float c : cedulas) {
			valorPreciso = valorPreciso.setScale(2, RoundingMode.HALF_UP);
			valorPreciso = calcularNotasMoedas(valorPreciso,BigDecimal.valueOf(c), "nota");		
		}
		
		System.out.println("MOEDAS: ");
		for(float m : moedas) {
			valorPreciso = valorPreciso.setScale(2, RoundingMode.HALF_UP);
			valorPreciso = calcularNotasMoedas(valorPreciso,BigDecimal.valueOf(m), "moeda");	
		}
		sc.close();
	}
	
	public static BigDecimal calcularNotasMoedas(BigDecimal valorTotal, BigDecimal valorDinheiro, String tipoDinheiro) {
		int notas = valorTotal.divide(valorDinheiro, RoundingMode.HALF_UP).intValue(); 
		System.out.println(notas + "   " + tipoDinheiro + "(s) de R$ " + String.format("%.2f", valorDinheiro));
		return valorTotal.subtract(valorDinheiro.multiply(BigDecimal.valueOf(notas)));
	}

}
