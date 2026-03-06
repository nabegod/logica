/* Programa para identificar polígono e calcular área */

import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int nLados;
		double lado;

		System.out.print("Digite o número de lados do polígono: ");
		nLados = input.nextInt();

		System.out.print("Digite a medida do lado (cm): ");
		lado = input.nextDouble();

		if (nLados == 3) {
			double area = (lado * lado * Math.sqrt(3)) / 4;
			System.out.println("TRIÂNGULO");
			System.out.printf("Área: %.2f cm²\n", area);
		} else if (nLados == 4) {
			double area = lado * lado;
			System.out.println("QUADRADO");
			System.out.printf("Área: %.2f cm²\n", area);
		} else if (nLados == 5) {
			System.out.println("PENTÁGONO");
		} else {
			System.out.println("Polígono não suportado.");
		}
		
		input.close();
	}
}