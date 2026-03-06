// Escreva um programa que entre com um número e o imprima caso seja maior do que 20. 

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um número: ");
		numero = input.nextInt();
		
		if (numero > 20) {
			System.out.println("Número digitado: " + numero);
		}

		input.close();
	}
}