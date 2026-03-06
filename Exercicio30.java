//* Função recursiva para calcular fatorial */

import java.util.Scanner;

public class Exercicio30 {

    // Função recursiva fatorial
    public static int fatorial(int numero) {
        if (numero <= 1) return 1; // trata 0 e 1
        return numero * fatorial(numero - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Informe um número: ");
        int num = input.nextInt();
        
        System.out.println("O fatorial de " + num + " é: " + fatorial(num));
        
        input.close();
    }
}