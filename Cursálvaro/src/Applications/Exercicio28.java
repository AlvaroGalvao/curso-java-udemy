package Applications;

import java.util.Scanner;
import java.util.Locale;
import Entities.Empregado;


public class Exercicio28 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Empregado empregado = new Empregado();
		
		System.out.println("Digite o nome do empregado:");
		empregado.nome = scan.nextLine();
		System.out.println("Digite o salario bruto do empregado:");
		empregado.salarioBruto = scan.nextDouble();
		System.out.println("Digite o imposto aplicado sobre o empregado");
		empregado.imposto = scan.nextDouble();
		
		System.out.println("Empregado: " + empregado);
		
		System.out.println("Digite qual a porcentagem você deseja aumentar o salario do empregado:");
		empregado.aumentarSalario(scan.nextDouble());
		System.out.println("Dados atualizados: " + empregado);
		
		scan.close();
	}
}
