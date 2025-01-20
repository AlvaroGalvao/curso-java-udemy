package Applications;

import java.util.Scanner;
import java.util.Locale;
import Entities.Retangulo;


public class Exercicio27 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Retangulo calculo = new Retangulo();
		
		System.out.println("Digite a altura do retângulo:");
		calculo.altura = scan.nextDouble();
		System.out.println("Digite a largura do retângulo:");
		calculo.largura = scan.nextDouble();
		
		System.out.printf("AREA = %.2f%nPERIMETRO = %.2f%nDIAGONAL = %.2f%n", calculo.area(), calculo.perimetro(), calculo.diagonal());
		
		scan.close();
	}
}
