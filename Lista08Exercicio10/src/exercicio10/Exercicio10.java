package exercicio10;

public class Exercicio10 {

	public static void main(String[] args) {
		 int inicio = 50;
	        int fim = 70;
	        int soma = 0;
	        int quantidade = 0;

	        int numero = inicio;
	        while (numero <= fim) {
	            if (numero % 2 == 0) { // Verifica se o número é par
	                soma += numero;
	                quantidade++;
	            }
	            numero++;
	        }

	        double media = (double) soma / quantidade;

	        System.out.println("Soma dos números pares: " + soma);
	        System.out.println("Média dos números pares: " + media);
	    }
	}