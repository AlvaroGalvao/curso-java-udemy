package Applications;

import java.util.Scanner;

// Programa para calcular e comparar as áreas de dois triângulos com base nos lados fornecidos.
public class Aula04 {

    public static void main(String[] args) {
        
        // Inicializa o scanner para leitura de dados do teclado
        Scanner scan = new Scanner(System.in);
        
        // Solicita ao usuário os lados do primeiro triângulo
        System.out.println("Digite os valores dos lados do primeiro triângulo:");
        double ladox1 = scan.nextDouble(); // Lado 1 do triângulo X
        double ladox2 = scan.nextDouble(); // Lado 2 do triângulo X
        double ladox3 = scan.nextDouble(); // Lado 3 do triângulo X
        
        // Solicita ao usuário os lados do segundo triângulo
        System.out.println("Agora digite os valores dos lados do segundo triângulo:");
        double ladoy1 = scan.nextDouble(); // Lado 1 do triângulo Y
        double ladoy2 = scan.nextDouble(); // Lado 2 do triângulo Y
        double ladoy3 = scan.nextDouble(); // Lado 3 do triângulo Y
        
        // Calcula o semi-perímetro do primeiro triângulo
        double px = (ladox1 + ladox2 + ladox3) / 2;
        // Calcula o semi-perímetro do segundo triângulo
        double py = (ladoy1 + ladoy2 + ladoy3) / 2;
        
        // Calcula a área do primeiro triângulo usando a fórmula de Heron
        double areax = Math.sqrt(px * (px - ladox1) * (px - ladox2) * (px - ladox3));
        // Calcula a área do segundo triângulo usando a fórmula de Heron
        double areay = Math.sqrt(py * (py - ladoy1) * (py - ladoy2) * (py - ladoy3));
        
        // Exibe as áreas calculadas dos dois triângulos
        System.out.printf("Área do primeiro triângulo: %.4f%n", areax);
        System.out.printf("Área do segundo triângulo: %.4f%n", areay);
        
        // Compara as áreas e determina qual triângulo possui a maior área
        if (areax > areay) {
            System.out.println("Área maior: Primeiro triângulo");
        } else {
            System.out.println("Área maior: Segundo triângulo");
        }
        
        // Fecha o scanner para liberar recursos
        scan.close();
    }
}