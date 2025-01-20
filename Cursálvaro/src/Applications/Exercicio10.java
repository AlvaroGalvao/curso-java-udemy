package Applications;
import java.util.Scanner;


public class Exercicio10 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número par ou impar:");
		numero = scan.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("PAR!");
		}
		else {
			System.out.println("IMPAR!");
		}
		
		scan.close();
	}
}
