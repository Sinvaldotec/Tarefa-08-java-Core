package exercicio12;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        
	        int maior = Integer.MIN_VALUE;
	        int menor = Integer.MAX_VALUE;
	        
	        System.out.println("Digite um valor positivo (ou um valor negativo para sair):");
	        int numero = scanner.nextInt();
	        
	        while (numero >= 0) {
	            if (numero > maior) {
	                maior = numero;
	            }
	            if (numero < menor) {
	                menor = numero;
	            }
	            
	            System.out.println("Digite outro valor positivo (ou um valor negativo para sair):");
	            numero = scanner.nextInt();
	        }
	        
	        if (maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
	            System.out.println("O maior valor digitado foi: " + maior);
	            System.out.println("O menor valor digitado foi: " + menor);
	        } else {
	            System.out.println("Nenhum valor positivo foi digitado.");
	        }
	        
	        scanner.close();
	    }
	}
