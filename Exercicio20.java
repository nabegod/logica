/* Programa que verifica se a pessoa pode votar */

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		int anoNascimento, idade;
		final int anoAtual = 2026; // ano atual fixo

		System.out.print("Digite o ano de nascimento: ");
		anoNascimento = input.nextInt();

		idade = anoAtual - anoNascimento;

		if (idade >= 16) {
			System.out.println("Você pode votar este ano.");
		} else {
			System.out.println("Você não pode votar este ano.");
		}

		input.close();
	}
}