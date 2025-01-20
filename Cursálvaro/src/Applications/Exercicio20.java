package Applications;
import java.util.Scanner;


public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 1000:");
		int x = scan.nextInt();
		int i;
		
		scan.close();
		
		for (i = 1; i <= x; i += 2) {
			System.out.println(i);
		}
	}
}