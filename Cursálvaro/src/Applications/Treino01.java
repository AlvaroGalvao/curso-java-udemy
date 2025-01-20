package Applications;
import java.util.Scanner;


public class Treino01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x = 1;
		
		System.out.println("Bem vindo a calculadora simples!");
		
		while (x != 0) {
			System.out.println("Selecione a operação que gostaria de realizar:");
			System.out.println("1 - Adição");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("Digite 0 para finalizar e ver o resultado!");
			int operacao = scan.nextInt();
			
			switch (operacao) {
			case 1:
				System.out.println("Digite os números que serão adicionados:");
				int resultadoAdicao = scan.nextInt();
				int a = scan.nextInt();
				while (a != 0) {
					resultadoAdicao += a;
					a = scan.nextInt();
				}
				System.out.printf("Resultado = %d%n", resultadoAdicao);
				break;
			case 2:
				System.out.println("Digite os números que serão subtraidos:");
				int resultadoSub = scan.nextInt();
				int s = scan.nextInt();
				while (s != 0) {
					resultadoSub -= s;
					s = scan.nextInt();
				}
				System.out.printf("Resultado = %d%n", resultadoSub);
				break;
			case 3:
				System.out.println("Digite os números que serão multiplicados:");
				int resultadoMult = scan.nextInt();
				int m = scan.nextInt();
				while (m != 0) {
					resultadoMult *= m;
					m = scan.nextInt();
				}
				System.out.printf("Resultado = %d%n", resultadoMult);
				break;
			case 4:
				System.out.println("Digite os números que serão divididos:");
				Double resultadoDiv = scan.nextDouble();
				int d = scan.nextInt();
				while (d != 0) {
					resultadoDiv /= d;
					d = scan.nextInt();
				}
				System.out.printf("Resultado = %.2f%n", resultadoDiv);
				break;
			}
			
			System.out.printf("Deseja realizar outra operação?%n1 - Sim%n2 - Não%n");
			
			x = scan.nextInt();
		}
		
		System.out.println("Muito obrigado, volte sempre!");
		
		scan.close();
	}
}
