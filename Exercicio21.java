/* Verifica a validade de uma senha */

import java.util.Scanner;

public class Exercicio21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int senha;

		System.out.print("Digite a senha: ");
		senha = input.nextInt();

		if (senha == 1234) {
			System.out.println("ACESSO PERMITIDO");
		} else {
			System.out.println("ACESSO NEGADO");
		}

		input.close();
	}
}