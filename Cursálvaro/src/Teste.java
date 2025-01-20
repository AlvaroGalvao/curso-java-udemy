import java.util.Scanner;


public class Teste {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero1, numero2;
		System.out.println("Digite o primeiro número:");
		numero1 = scan.nextInt();
		System.out.println("Digite o segundo número:");
		numero2 = scan.nextInt();
		int soma = numero1 + numero2;
		System.out.printf("SOMA = %d", soma);
		
		scan.close();
	}

}
