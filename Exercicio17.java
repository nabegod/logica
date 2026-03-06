/* Programa que lê valores e mostra quadrado, cubo e raiz quadrada. 
   Finaliza quando valor <= 0 */

import java.util.Scanner;
import java.lang.Math;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		double quadrado, cubo, raiz;
		
		do {
			System.out.print("Digite um número maior do que 0 (ou 0/negativo para sair): ");
			num = input.nextInt();
			
			if (num > 0) {
				quadrado = Math.pow(num, 2);
				cubo = Math.pow(num, 3);
				raiz = Math.sqrt(num);
				
				System.out.println("Número: " + num);
				System.out.println("Quadrado: " + quadrado);
				System.out.println("Cubo: " + cubo);
				System.out.println("Raiz quadrada: " + raiz);
				System.out.println("---------------------------");
			}
			
		} while (num > 0);
		
		System.out.println("Programa encerrado.");
		input.close();
	}
}