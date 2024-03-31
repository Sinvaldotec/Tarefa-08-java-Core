package exercicio03;

public class Exercicio03 {

	public static void main(String[] args) {
		int numero = 1;
        int somaPares = 0;

        while (numero <= 500) {
            if (numero % 2 == 0) { // Verifica se o número é par
                somaPares += numero; // Adiciona o número par ao somatório
            }
            numero++; // Incrementa o número
        }

        System.out.println("O somatório dos números pares de 1 a 500 é: " + somaPares);
    }
}
