/* Programa de folha de pagamento para 10 funcionários */

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int codigo, horasTrabalhadas, qtdeFuncionarios = 10;
		char turno, categoria;
		double valorHora, salarioInicial, auxilioAlimentacao;
		double salarioMinimo = 450.00;
		
		for (int i = 0; i < qtdeFuncionarios; i++ ) {
			turno = 'X';
			categoria = 'X';
		
			System.out.print("Insira o código do funcionário: ");
			codigo = input.nextInt();
			
			System.out.print("Turno (M - matutino, V - vespertino ou N - noturno): ");
			while (turno != 'M' && turno != 'V' && turno != 'N') {
				turno = input.next().charAt(0);
				if (turno != 'M' && turno != 'V' && turno != 'N') {
					System.out.println("Turno inválido. Digite novamente:");
				}
			}
			
			System.out.print("Insira a categoria do funcionário (O - operário ou G - gerente): ");
			while (categoria != 'G' && categoria != 'O') {
				categoria = input.next().charAt(0);
				if (categoria != 'G' && categoria != 'O') {
					System.out.println("Categoria inválida. Digite novamente:");
				}
			}
			
			System.out.print("Insira o número de horas trabalhadas: ");
			horasTrabalhadas = input.nextInt();
			
			// --- Calculando valor da hora ---
			if (categoria == 'G') {
				if (turno == 'N') {
					valorHora = 0.18 * salarioMinimo;
				} else { // M ou V
					valorHora = 0.15 * salarioMinimo;
				}
			} else { // categoria O
				if (turno == 'N') {
					valorHora = 0.13 * salarioMinimo;
				} else { // M ou V
					valorHora = 0.10 * salarioMinimo;
				}
			}
			
			// --- Calculando salário inicial ---
			salarioInicial = valorHora * horasTrabalhadas;
			
			// --- Calculando auxílio-alimentação ---
			if (salarioInicial <= 300) {
				auxilioAlimentacao = 0.20 * salarioInicial;
			} else if (salarioInicial <= 600) {
				auxilioAlimentacao = 0.15 * salarioInicial;
			} else {
				auxilioAlimentacao = 0.05 * salarioInicial;
			}
			
			// --- Exibindo resultados ---
			System.out.println("\n--- Folha do Funcionário ---");
			System.out.println("Código: " + codigo);
			System.out.println("Horas trabalhadas: " + horasTrabalhadas);
			System.out.printf("Valor da hora trabalhada: R$ %.2f\n", valorHora);
			System.out.printf("Salário inicial: R$ %.2f\n", salarioInicial);
			System.out.printf("Auxílio-alimentação: R$ %.2f\n", auxilioAlimentacao);
			System.out.printf("Salário final: R$ %.2f\n", salarioInicial + auxilioAlimentacao);
			System.out.println("-------------------------------\n");
		}

		input.close();
	} 
}