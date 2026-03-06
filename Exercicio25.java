/* Programa para identificar polígono e calcular área com novos casos */

import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int nLados;
		double lado;

		System.out.print("Digite o número de lados do polígono: ");
		nLados = input.nextInt();

		if (nLados < 3) {
			System.out.println("NÃO É UM POLÍGONO");
		} else if (nLados == 3) {
			System.out.print("Digite a medida do lado (cm): ");
			lado = input.nextDouble();
			double area = (lado * lado * Math.sqrt(3)) / 4;
			System.out.println("TRIÂNGULO");
			System.out.printf("Área: %.2f cm²\n", area);
		} else if (nLados == 4) {
			System.out.print("Digite a medida do lado (cm): ");
			lado = input.nextDouble();
			double area = lado * lado;
			System.out.println("QUADRADO");
			System.out.printf("Área: %.2f cm²\n", area);
		} else if (nLados == 5) {
			System.out.println("PENTÁGONO");
		} else { // nLados > 5
			System.out.println("POLÍGONO NÃO IDENTIFICADO");
		}
		
		input.close();
	}
}