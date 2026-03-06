// Programa para ler 3 valores inteiros e mostrar o maior

import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1, num2, num3, maior;

		System.out.print("Digite o primeiro valor: ");
		num1 = input.nextInt();

		System.out.print("Digite o segundo valor: ");
		num2 = input.nextInt();

		System.out.print("Digite o terceiro valor: ");
		num3 = input.nextInt();

		// Comparando para encontrar o maior
		if (num1 > num2 && num1 > num3) {
			maior = num1;
		} else if (num2 > num1 && num2 > num3) {
			maior = num2;
		} else { // num3 é o maior
			maior = num3;
		}

		System.out.println("O maior valor é: " + maior);

		input.close();
	}
}