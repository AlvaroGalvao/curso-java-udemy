package Entities;

// Classe que representa a entidade Triangulo, que contém os lados de um triângulo e fornece um método para calcular a área.
public class Triangulo {

    // Atributos públicos da classe Triangulo: a, b e c (os três lados do triângulo).
    public double a, b, c;

    // Método que calcula a área do triângulo utilizando a fórmula de Herão.
    // A fórmula de Herão é: sqrt(p * (p - a) * (p - b) * (p - c)), onde p é o semi-perímetro do triângulo.
    public double area() {

        // Calcula o semi-perímetro do triângulo.
        double p = (a + b + c) / 2.0;
        
        // Retorna a área do triângulo utilizando a fórmula de Herão.
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}