// Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. 
// No final informar o nome do aluno e a sua média (aritmética).

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nome;
		double nota1, nota2, nota3, media;
		
		System.out.print("Digite o nome do aluno: ");
		nome = input.nextLine();
		
		System.out.print("Digite a primeira nota: ");
		nota1 = input.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = input.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = input.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Aluno: " + nome);
		System.out.println("Média: " + media);
		
		input.close();
	}
}
