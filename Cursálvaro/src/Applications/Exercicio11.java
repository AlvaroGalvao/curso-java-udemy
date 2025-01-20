package Applications;
import java.util.Scanner;


public class Exercicio11 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro número:");
		a = scan.nextInt();
		System.out.println("Digite o segundo número:");
		b = scan.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("São multiplos!");
		}
		else {
			System.out.println("Não são multiplos!");
		}
		
		scan.close();
	}
}
