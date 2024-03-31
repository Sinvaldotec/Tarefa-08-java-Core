package exercicio06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        // Solicita que o usuário insira a base e o expoente
        System.out.print("Digite a base (B): ");
        double base = scanner.nextDouble();
        System.out.print("Digite o expoente (E): ");
        int expoente = scanner.nextInt();
        
        // Variável para armazenar o resultado da potência
        double resultado = 1;
        
        // Variável auxiliar para controlar o loop
        int contador = 1;
        
        // Calcula a potência utilizando o laço enquanto
        while (contador <= expoente) {
            resultado *= base;
            contador++;
        }
        
        // Exibe o resultado da potência
        System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);
        
        // Fecha o scanner
        scanner.close();
    }
}