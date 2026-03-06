/* Faça um programa que receba um número inteiro entre 1 e 7 e informe o dia da semana correspondente 
   (1 = domingo, 2 = segunda, ... 7 = sábado) */

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		int dia;

		System.out.print("Digite um número entre 1 e 7: ");
		dia = input.nextInt();

		if (dia == 1) {
			System.out.println("Domingo");
		} else if (dia == 2) {
			System.out.println("Segunda-feira");
		} else if (dia == 3) {
			System.out.println("Terça-feira");
		} else if (dia == 4) {
			System.out.println("Quarta-feira");
		} else if (dia == 5) {
			System.out.println("Quinta-feira");
		} else if (dia == 6) {
			System.out.println("Sexta-feira");
		} else if (dia == 7) {
			System.out.println("Sábado");
		} else {
			System.out.println("Número inválido! Digite entre 1 e 7.");
		}

		input.close();
	}
}