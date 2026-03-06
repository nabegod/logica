/* As maçãs custam R$ 0,30 cada se forem compradas menos de uma dúzia e R$ 0,25 se forem compradas pelo menos doze. 
 * Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.
 */

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		int quantidade;
		double preco;
		double total;

		System.out.print("Digite a quantidade de maçãs: ");
		quantidade = input.nextInt();

		if (quantidade < 12) {
			preco = 0.30;
		} else {
			preco = 0.25;
		}

		total = quantidade * preco;

		System.out.println("Total da compra: R$ " + total);

		input.close();
	}
}