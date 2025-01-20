package Applications;

import java.util.Scanner;


public class Treino03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de linhas e a quantidade de colunas que a matriz terá: ");
		int qtdLinhas = scan.nextInt();
		int qtdColunas = scan.nextInt();
		int[][] cleiton = new int[qtdLinhas][qtdColunas];
		
		System.out.print("Digite os números que correspondem as coordenadas: ");
		for (int i = 0; i < qtdLinhas; i++) {
			for (int j = 0; j < qtdColunas; j++) {
				System.out.printf("Digite o valor da coordenada %dx%d: ", i, j);
				cleiton[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < qtdLinhas; i++) {
			System.out.println();
			for (int j = 0; j < qtdColunas; j++) {
				System.out.print(cleiton[i][j] + " ");
			}
		}
		
		System.out.println();
		System.out.println("Digite a coordenada que gostaria de destacar: ");
		System.out.print("x: ");
		int x = scan.nextInt();
		System.out.print("y: ");
		int y = scan.nextInt();
		System.out.println(cleiton[x][y]);
		
		
		scan.close();
	}
}
