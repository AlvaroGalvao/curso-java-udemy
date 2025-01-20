package Applications;
import java.util.Scanner;


public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracao;
		
		System.out.println("Digite que horas o jogo começou:");
		horaInicial = scan.nextInt();
		System.out.println("Digite que horas o jogo terminou:");
		horaFinal = scan.nextInt();
		
		if (horaFinal > horaInicial) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)!%n", duracao);
		
		scan.close();
	}
}
