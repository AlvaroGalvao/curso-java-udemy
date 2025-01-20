package Applications;
import java.util.Scanner;


public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float x, y;
		
		System.out.println("Digite o valor de X:");
		x = scan.nextFloat();
		System.out.println("Digite o valor de Y:");
		y = scan.nextFloat();
		
		if (x > 0 && y > 0) {
			System.out.println("Quadrante 1");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Quadrante 4");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Quadrante 2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Quadrante 3");
		}
		else if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
		else if (x == 0) {
			System.out.println("Eixo X");
		}
		else if (y == 0) {
			System.out.println("Eixo Y");
		}
		else {
			System.out.println("Valores inválidos");
		}
		
		scan.close();
	}
}
