/*
Uma empresa decidiu implementar um sistema de cálculo de gratificação mensal para seus colaboradores.
*/

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double horasExtras, horasFaltas;
		double H, minutos;
		double gratificacao;

		System.out.print("Digite o total de horas extras realizadas: ");
		horasExtras = input.nextDouble();

		System.out.print("Digite o total de horas de falta registradas: ");
		horasFaltas = input.nextDouble();

		H = horasExtras - (0.67 * horasFaltas);
		minutos = H * 60;

		if (minutos < 600) {
			gratificacao = 100;
		} else if (minutos <= 1200) {
			gratificacao = 200;
		} else if (minutos <= 1800) {
			gratificacao = 300;
		} else if (minutos <= 2400) {
			gratificacao = 400;
		} else {
			gratificacao = 500;
		}

		System.out.printf("Valor da gratificação: R$ %.2f\n", gratificacao);

		input.close();
	}
}