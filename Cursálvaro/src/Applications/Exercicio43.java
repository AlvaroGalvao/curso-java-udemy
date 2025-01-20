package Applications;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;
import Entities.Empregado1;


public class Exercicio43 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Empregado1> list = new ArrayList<>();
		
		System.out.println("Quantos empregados serão registrados ?");
		int qtd = scan.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			System.out.println();
			System.out.printf("Empregado #%d%n", i + 1);
			System.out.print("Id: ");
			Integer id = scan.nextInt();
			scan.nextLine();
			System.out.print("Nome: ");
			String nome = scan.nextLine();
			System.out.print("Salário: ");
			Double salario = scan.nextDouble();
			
			Empregado1 emp = new Empregado1(id, nome, salario);
			list.add(emp);
		}
		
		System.out.println();
		System.out.println("Digite o id do empregado que terá o salário aumentado: ");
		int idSalario = scan.nextInt();
		Integer pos = position(list, idSalario);
		if (pos == null) {
			System.out.println("Esse ID não existe!");
		}
		else {
			System.out.println("Informa a porcentagem: ");
			double aumento = scan.nextDouble();
			list.get(pos).aumSalario(aumento);
		}
		
		System.out.println();
		System.out.println("Lista de empregados: ");
		for (Empregado1 emp : list) {
			System.out.println(emp);
		}
		
		scan.close();
		
	}
	
	public static Integer position(List<Empregado1> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		
		return null;
	}
}
