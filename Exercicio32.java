/* Função recursiva para calcular somatório de 1 a N */

import java.util.Scanner;

public class Exercicio32 {

    // Função recursiva
    public static int somar(int numero) {
        if (numero == 0) return 0;
        return numero + somar(numero - 1);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Informe um número: ");
        int num = input.nextInt();
        
        if (num < 0) {
            System.out.println("Número inválido. Digite um inteiro positivo.");
        } else {
            System.out.println("O somatório de 1 a " + num + " é: " + somar(num));
        }
        
        input.close();
    }
}