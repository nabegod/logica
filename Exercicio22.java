//* Programa para ler 3 valores inteiros e mostrar em ordem crescente */

import java.util.Scanner;

public class Exercicio22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Digite o primeiro valor: ");
		num1 = input.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		num2 = input.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		num3 = input.nextInt();
		
		int menor, medio, maior;
		
		// Determinando o menor
		if (num1 < num2 && num1 < num3) {
			menor = num1;
			if (num2 < num3) {
				medio = num2;
				maior = num3;
			} else {
				medio = num3;
				maior = num2;
			}
		} else if (num2 < num1 && num2 < num3) {
			menor = num2;
			if (num1 < num3) {
				medio = num1;
				maior = num3;
			} else {
				medio = num3;
				maior = num1;
			}
		} else { // num3 é o menor
			menor = num3;
			if (num1 < num2) {
				medio = num1;
				maior = num2;
			} else {
				medio = num2;
				maior = num1;
			}
		}
		
		System.out.println("Ordem crescente: " + menor + " - " + medio + " - " + maior);
		
		input.close();
	}
}