package Util;

// Classe utilitária Calculator, que fornece métodos para calcular a circunferência e o volume de uma esfera,
// ambos com base no raio e utilizando a constante PI.
public class Calculator {

    // Constante pública PI, com valor aproximado de 3.14159, que será utilizada nos cálculos.
    public static final double PI = 3.14159;

    // Método estático que calcula a circunferência de um círculo dado seu raio.
    // A fórmula utilizada é: 2 * PI * raio.
    public static double circunferencia(double raio) {
        return 2.0 * PI * raio;  // Retorna o valor da circunferência.
    }

    // Método estático que calcula o volume de uma esfera dado seu raio.
    // A fórmula utilizada é: (4 / 3) * PI * raio³.
    public static double volume(double raio) {
        return 4.0 * PI * raio * raio * raio / 3.0;  // Retorna o volume da esfera.
    }
}