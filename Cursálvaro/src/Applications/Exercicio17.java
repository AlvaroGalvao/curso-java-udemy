package Applications;
import java.util.Scanner;


public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua senha de 4 dígitos:");
		int senha = scan.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Invalida. Tente novamente!");
			senha = scan.nextInt();
		}
		
		System.out.println("Acesso permitido!");
		
		scan.close();
	}
}
