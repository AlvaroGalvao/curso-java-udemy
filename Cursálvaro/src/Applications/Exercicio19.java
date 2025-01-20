package Applications;
import java.util.Scanner;


public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Por favor, nos informe com qual combstível você abasteceu hoje");
		System.out.printf("1 - Álcool%n2 - Gasolina%n3 - Diesel%n4 - Fim");
		int escolha = scan.nextInt();
		int qtdAlcool = 0;
		int qtdGasolina = 0;
		int qtdDiesel = 0;
		
		while (escolha != 4) {
			if (escolha == 1) {
				qtdAlcool += 1;
			}
			else if (escolha == 2) {
				qtdGasolina += 1;
			}
			else if (escolha == 3) {
				qtdDiesel += 1;
			}
			else {
				System.out.println("Opção invalida, tente novamente!");
			}
			
			escolha = scan.nextInt();
		}
		
		System.out.println("Muito obrigado!");
		System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d%n", qtdAlcool, qtdGasolina, qtdDiesel);
		
		scan.close();
	}
}
