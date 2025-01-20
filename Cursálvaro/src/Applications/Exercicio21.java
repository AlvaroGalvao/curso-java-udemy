package Applications;
import java.util.Scanner;


public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("Digite a quantidade de números inteiros:");
		int qtdNumeros = scan.nextInt();
		//System.out.printf("Digite os %d números:%n", qtdNumeros);
		
		int in = 0;
		int out = 0;
		
		for (int i = 0; i < qtdNumeros; i++) {
			int x = scan.nextInt();
			if (x > 10 && x < 20) {
				in += 1;
			} 
			else {
				out += 1;
			}
		}
		
		System.out.printf("in: %d%nout: %d%n", in, out);
		
		scan.close();
	}
}
