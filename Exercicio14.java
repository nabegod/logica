/* Faça um programa que receba a idade e o peso de uma pessoa e informe o grupo de risco */

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		int idade;
		double peso;
		int risco;

		System.out.print("Digite a idade: ");
		idade = input.nextInt();

		System.out.print("Digite o peso (kg): ");
		peso = input.nextDouble();

		if (idade < 20) {
			if (peso <= 60) {
				risco = 9;
			} else if (peso <= 90) {
				risco = 8;
			} else {
				risco = 7;
			}
		} else if (idade <= 50) {
			if (peso <= 60) {
				risco = 6;
			} else if (peso <= 90) {
				risco = 5;
			} else {
				risco = 4;
			}
		} else {
			if (peso <= 60) {
				risco = 3;
			} else if (peso <= 90) {
				risco = 2;
			} else {
				risco = 1;
			}
		}

		System.out.println("Grupo de risco: " + risco);

		input.close();
	}
}