/* Programa para calcular quantos meses João precisa para igualar ou ultrapassar Carlos */

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		double salarioCarlos, salarioJoao;
		int meses = 0;

		System.out.print("Digite o salário de Carlos: R$ ");
		salarioCarlos = input.nextDouble();

		salarioJoao = salarioCarlos / 3.0;

		double valorCarlos = salarioCarlos;
		double valorJoao = salarioJoao;

		while (valorJoao < valorCarlos) {
			valorCarlos *= 1.02; // rendimento 2% ao mês
			valorJoao *= 1.05;   // rendimento 5% ao mês
			meses++;
		}

		System.out.println("Meses necessários para João igualar ou ultrapassar Carlos: " + meses);

		input.close();
	}
}