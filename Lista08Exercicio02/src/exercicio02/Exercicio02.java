package exercicio02;

public class Exercicio02 {

	public static void main(String[] args) {
		// Variáveis para armazenar a soma e o número atual
        int soma = 0;
        int numeroAtual = 1;

        // Laço de repetição enquanto o número atual for menor ou igual a 100
        while (numeroAtual <= 100) {
            // Adiciona o número atual à soma
            soma += numeroAtual;
            // Incrementa o número atual para passar para o próximo número
            numeroAtual++;
        }

        // Apresenta o total da soma
        System.out.println("A soma dos cem primeiros números inteiros é: " + soma);
    }
}
