package sumardosnumeros;
import java.util.Scanner;
public class SumarDosNumeros {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		double primerNumero = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Introduce el segundo número: ");
		double segundoNumero = Double.parseDouble(scanner.nextLine());
		
		double resultado = primerNumero + segundoNumero;
		System.out.println("El resultado de la suma es: " + resultado);
		
		scanner.close();
	}
}


