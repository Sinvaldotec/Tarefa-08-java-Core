package exercicio05;

public class Exercicio05 {

	public static void main(String[] args) {
		int expoente = 0;
        int resultado = 1;
        
        System.out.println("Potências de 3:");

        while (expoente <= 15) {
            System.out.println("3^" + expoente + " = " + resultado);
            resultado *= 3;
            expoente++;
        }
    }
}
