package exercício01;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Solicita ao usuário o número para o qual ele deseja gerar a tabuada
	        System.out.print("Digite um número para gerar a tabuada: ");
	        int numero = scanner.nextInt();

	        // Verifica se o número está entre 1 e 10
	        if (numero < 1 || numero > 10) {
	            System.out.println("Por favor, digite um número entre 1 e 10.");
	            return;
	        }

	        System.out.println("Tabuada de multiplicação para " + numero + ":");

	        // Inicializa o contador para multiplicação
	        int contador = 1;

	        // Enquanto o contador for menor ou igual a 10, exibe a multiplicação e incrementa o contador
	        while (contador <= 10) {
	            int resultado = numero * contador;
	            System.out.println(numero + " x " + contador + " = " + resultado);
	            contador++;
	        }

	        scanner.close();
	    }
	}
