package Applications;
import java.util.Scanner;


public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite as coordenadas X e Y do plano:");
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0) {
				if (y > 0) {
					System.out.println("Primeiro quadrante!");
				} 
				else {
					System.out.println("Quarto quadrante!");
				}
			} 
			else {
				if (y > 0) {
					System.out.println("Segundo quadrante!");
				}
				else {
					System.out.println("Terceiro quadrante!");
				}
			}
			
			System.out.println("Digite as próximas coordenadas X e Y:");
			x = scan.nextInt();
			y = scan.nextInt();
		}
		
		scan.close();
	}
}
