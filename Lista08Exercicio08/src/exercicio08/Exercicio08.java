package exercicio08;

public class Exercicio08 {

	public static void main(String[] args) {
		int celsius = 10;

        System.out.println("Celsius\tFahrenheit");

        while (celsius <= 100) {
            double fahrenheit = (9 * celsius + 160) / 5.0;
            System.out.println(celsius + "\t" + fahrenheit);
            celsius += 10;
        }
    }
}
