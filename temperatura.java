package temperatura;

import java.text.DecimalFormat;
import java.util.Scanner;

public class conversorTemperatura {

	public static void main(String[] args) {
		//variaveis
		double c, f; 
    
		// objetos 
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		
		// entrada de dados 
		System.out.println("Conversão de Temperatura");
		System.out.println("Digite a temperatura em fahrenheit:");
		f = teclado.nextDouble();
		// processar 
		c = (5 * (f - 32)) / 9;
    
		// saida 
		System.out.println("temperatura em Celsius: " + formatador.format(c) + "ºC"); 
		teclado.close();

	}

}
