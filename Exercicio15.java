/* Programa para calcular salário a receber com gratificação e desconto de imposto */

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		double salarioBruto, gratificacao, imposto, salarioLiquido;

		System.out.print("Digite o salário bruto: R$ ");
		salarioBruto = input.nextDouble();

		// Definindo gratificação
		if (salarioBruto <= 350) {
			gratificacao = 100;
		} else if (salarioBruto <= 600) {
			gratificacao = 75;
		} else if (salarioBruto <= 900) {
			gratificacao = 50;
		} else {
			gratificacao = 35;
		}

		// Calculando imposto
		imposto = salarioBruto * 0.07;

		// Calculando salário líquido
		salarioLiquido = salarioBruto + gratificacao - imposto;

		System.out.printf("Valor a receber: R$ %.2f\n", salarioLiquido);

		input.close();
	}
}