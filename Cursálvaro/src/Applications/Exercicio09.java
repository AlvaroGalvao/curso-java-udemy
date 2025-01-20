package Applications;
import java.util.Scanner;


public class Exercicio09 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número positivo ou negativo:");
		numero = scan.nextInt();
		
		if (numero < 0) {
			System.out.println("NEGATIVO!");
		}
		else {
			System.out.println("NÃO NEGATIVO!");
		}
		
		scan.close();
		
	}
	
}
