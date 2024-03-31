package exercicio11;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String continuar = "SIM";
        double areaTotal = 0.0;

        while (continuar.equalsIgnoreCase("SIM")) {
            System.out.print("Digite o nome do cômodo: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a largura do cômodo em metros: ");
            double largura = scanner.nextDouble();

            System.out.print("Digite o comprimento do cômodo em metros: ");
            double comprimento = scanner.nextDouble();

            double area = calcularArea(largura, comprimento);
            areaTotal += area;

            System.out.println("A área do cômodo " + nome + " é: " + area + " metros quadrados.");

            scanner.nextLine(); // Limpar o buffer do scanner

            System.out.print("Deseja continuar calculando outros cômodos? (SIM/NAO): ");
            continuar = scanner.nextLine();
        }

        System.out.println("A área total da residência é: " + areaTotal + " metros quadrados.");

        scanner.close();
    }

    public static double calcularArea(double largura, double comprimento) {
        return largura * comprimento;
    }
}