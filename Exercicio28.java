/* Programa para classificar triângulo pelos ângulos */

import java.util.Scanner;

public class Exercicio28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int ang1, ang2, ang3;

		System.out.print("Digite o primeiro ângulo (em graus): ");
		ang1 = input.nextInt();

		System.out.print("Digite o segundo ângulo (em graus): ");
		ang2 = input.nextInt();

		System.out.print("Digite o terceiro ângulo (em graus): ");
		ang3 = input.nextInt();

		int soma = ang1 + ang2 + ang3;

		if (soma != 180) {
			System.out.println("Ângulos inválidos para um triângulo.");
		} else if (ang1 == 90 || ang2 == 90 || ang3 == 90) {
			System.out.println("Triângulo Retângulo");
		} else if (ang1 > 90 || ang2 > 90 || ang3 > 90) {
			System.out.println("Triângulo Obtusângulo");
		} else { // todos < 90
			System.out.println("Triângulo Acutângulo");
		}

		input.close();
	}
}