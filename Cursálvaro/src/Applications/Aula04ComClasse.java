package Applications;

import java.util.Scanner; // Importação da classe Scanner para leitura de entrada do usuário
import Entities.Triangulo; // Importação da classe Triangulo para representar os triângulos

// Programa para calcular e comparar as áreas de dois triângulos utilizando orientação a objetos
public class Aula04ComClasse {

    public static void main(String[] args) {
        
        // Inicializa o Scanner para leitura de entradas do teclado
        Scanner scan = new Scanner(System.in);
        
        // Declaração de dois objetos da classe Triangulo
        Triangulo x, y;
        x = new Triangulo(); // Instancia o primeiro triângulo
        y = new Triangulo(); // Instancia o segundo triângulo
        
        // Solicita ao usuário os lados do primeiro triângulo
        System.out.println("Digite os valores dos lados do primeiro triângulo:");
        x.a = scan.nextDouble(); // Lado a do triângulo X
        x.b = scan.nextDouble(); // Lado b do triângulo X
        x.c = scan.nextDouble(); // Lado c do triângulo X
        
        // Solicita ao usuário os lados do segundo triângulo
        System.out.println("Agora digite os valores dos lados do segundo triângulo:");
        y.a = scan.nextDouble(); // Lado a do triângulo Y
        y.b = scan.nextDouble(); // Lado b do triângulo Y
        y.c = scan.nextDouble(); // Lado c do triângulo Y
    
        // Calcula a área do primeiro triângulo utilizando o método da classe Triangulo
        double areax = x.area();
        // Calcula a área do segundo triângulo utilizando o método da classe Triangulo
        double areay = y.area();
        
        // Exibe as áreas calculadas para ambos os triângulos
        System.out.printf("Área do primeiro triângulo: %.4f%n", areax);
        System.out.printf("Área do segundo triângulo: %.4f%n", areay);
        
        // Compara as áreas e determina qual triângulo tem a maior
        if (areax > areay) {
            System.out.println("Área maior: Primeiro triângulo");
        } else {
            System.out.println("Área maior: Segundo triângulo");
        }
        
        // Fecha o Scanner para liberar recursos
        scan.close();
    }
}