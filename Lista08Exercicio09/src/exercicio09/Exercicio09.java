package exercicio09;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int contador = 1;
        double soma = 0;

        while (contador <= 10) {
            System.out.print("Digite o " + contador + "º valor: ");
            double valor = scanner.nextDouble();
            soma += valor;
            contador++;
        }

        double media = soma / 10;

        System.out.println("Total do somatório: " + soma);
        System.out.println("Média aritmética: " + media);

        scanner.close();
    }
}
