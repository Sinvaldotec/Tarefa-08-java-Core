package exercicio04;

public class Exercicio04 {

	public static void main(String[] args) {
		int numero = 0;
        
        while(numero <= 20) {
            if(numero % 2 != 0) { // Verifica se o número é ímpar
                System.out.println(numero); // Se for ímpar, mostra o número
            }
            numero++; // Passa para o próximo número
        }
    }
}
