package exercicio07;

public class Exercicio07 {

	public static void main(String[] args) {
		int n = 15; // Número de termos que deseja gerar
        int primeiroTermo = 1;
        int segundoTermo = 1;
        int contador = 2; // Começamos com 2 termos já conhecidos
        
        // Imprimindo os dois primeiros termos
        System.out.print(primeiroTermo + " " + segundoTermo + " ");
        
        // Calculando e imprimindo os próximos termos até o n-ésimo termo
        while (contador < n) {
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(proximoTermo + " ");
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
            contador++;
        }
    }
}
