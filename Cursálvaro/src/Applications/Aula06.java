package Applications;

import java.util.Scanner; // Importação para leitura de entradas do usuário
import java.util.Locale; // Importação para configurar o padrão de localização

// Programa para calcular a circunferência e o volume de uma esfera com base no valor do raio fornecido
public class Aula06 {

    // Declaração de uma constante para o valor de PI
    public static final double PI = 3.14159;
    
    public static void main(String[] args) {
        
        // Define o padrão de localização para os Estados Unidos (para formatação de números decimais com ponto)
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        
        // Solicita ao usuário o valor do raio
        System.out.println("Digite o valor do raio:");
        double raio = scan.nextDouble(); // Lê o valor do raio fornecido
        
        // Calcula a circunferência utilizando o método circunferencia
        double c = circunferencia(raio);
        
        // Calcula o volume da esfera utilizando o método volume
        double v = volume(raio);
        
        // Exibe os resultados da circunferência, volume e valor de PI
        System.out.printf("Circunferencia: %.2f%nVolume: %.2f%nValor do PI: %.2f%n", c, v, PI);
        
        // Fecha o Scanner para liberar recursos
        scan.close();
    }
    
    // Método para calcular a circunferência de um círculo dado o raio
    public static double circunferencia(double raio) {
        return 2.0 * PI * raio; // Fórmula: 2 * PI * raio
    }
    
    // Método para calcular o volume de uma esfera dado o raio
    public static double volume(double raio) {
        return 4.0 * PI * raio * raio * raio / 3.0; // Fórmula: (4/3) * PI * raio³
    }
}
