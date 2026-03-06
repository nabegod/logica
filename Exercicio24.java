/* Programa para calcular o peso ideal com base em altura e gênero */

import java.util.Scanner;

public class Exercicio24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int genero;
		double altura, pesoIdeal = 0;
		
		System.out.print("Digite o sexo (1 - feminino, 2 - masculino): ");
		genero = input.nextInt();
		
		System.out.print("Digite a altura (em metros): ");
		altura = input.nextDouble();
		
		if (genero == 1) { // feminino
			pesoIdeal = (62.1 * altura) - 44.7;
		} else if (genero == 2) { // masculino
			pesoIdeal = (72.7 * altura) - 58;
		} else {
			System.out.println("Gênero inválido.");
		}
		
		if (pesoIdeal > 0) {
			System.out.printf("Peso ideal: %.2f kg\n", pesoIdeal);
		}
		
		input.close();
	}
}