// Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
// A fórmula de conversão é: F = (9*C + 160) / 5

import java.util.Scanner; 

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double C, F;
		
		System.out.print("Digite a temperatura em Celsius: ");
		C = input.nextDouble();
		
		F = (9 * C + 160) / 5;
		
		System.out.println("Temperatura em Fahrenheit: " + F);
		 
		input.close();
	}
}
