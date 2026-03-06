// Faça um programa que receba um valor que foi depositado e exiba o valor com rendimento após um mês. 
// Considere fixo o juro da poupança em 0.70% a. m.

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in); 
		 
		 double deposito;
		 double rendimento;
		 double valorFinal;
		 
		 System.out.print("Digite o valor depositado: ");
		 deposito = input.nextDouble();
		 
		 rendimento = deposito * 0.007;
		 valorFinal = deposito + rendimento;
		 
		 System.out.println("Valor após 1 mês: R$ " + valorFinal);

		 input.close();
	}
}