package Applications;

import java.util.Scanner; // Importação para leitura de entradas do usuário
import java.util.Locale; // Importação para configurar o padrão de localização
import Util.Calculator; // Importação da classe Calculator, que contém métodos e constantes para cálculos matemáticos

// Programa para calcular a circunferência e o volume de uma esfera utilizando uma classe utilitária (Calculator)
public class Aula06ComClasse {
	
	public static void main(String[] args) {
		
		// Define o padrão de localização para os Estados Unidos (para formatação de números decimais com ponto)
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		// Solicita ao usuário o valor do raio
		System.out.println("Digite o valor do raio:");
		double raio = scan.nextDouble(); // Lê o valor do raio fornecido
		
		// Calcula a circunferência utilizando o método estático da classe Calculator
		double c = Calculator.circunferencia(raio);
		
		// Calcula o volume da esfera utilizando o método estático da classe Calculator
		double v = Calculator.volume(raio);
		
		// Exibe os resultados da circunferência, volume e o valor de PI
		System.out.printf("Circunferencia: %.2f%nVolume: %.2f%nValor do PI: %.2f%n", c, v, Calculator.PI);
		
		// Fecha o Scanner para liberar recursos
		scan.close();
	}
}