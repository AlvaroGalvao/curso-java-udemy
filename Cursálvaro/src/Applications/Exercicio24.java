package Applications;
import java.util.Scanner;


public class Exercicio24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do fatorial:");
		int valor = scan.nextInt();
		int resultado = 1;
		 
		for (int i = 1; i <= valor; i++) {
			resultado = resultado * i;
		}
		
		System.out.printf("Resultado: %d%n", resultado);
		
		scan.close();
	}
}
