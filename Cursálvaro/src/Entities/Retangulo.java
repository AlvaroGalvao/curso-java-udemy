package Entities;

// Classe que representa a entidade Retangulo, que contém informações sobre a altura e a largura de um retângulo.
public class Retangulo {

    // Atributos públicos da classe Retangulo: altura (double) e largura (double).
    public double altura;
    public double largura;

    // Método que calcula a área do retângulo.
    // A área é dada pela multiplicação da altura pela largura.
    public double area() {
        return altura * largura;  // Retorna a área do retângulo.
    }

    // Método que calcula o perímetro do retângulo.
    // O perímetro é dado pela fórmula: 2 * (altura + largura).
    public double perimetro() {
        return 2 * (altura + largura);  // Retorna o perímetro do retângulo.
    }

    // Método que calcula a diagonal do retângulo.
    // A diagonal é calculada utilizando o Teorema de Pitágoras: sqrt(altura² + largura²).
    public double diagonal() {
        return Math.sqrt((altura * altura) + (largura * largura));  // Retorna o comprimento da diagonal.
    }
}