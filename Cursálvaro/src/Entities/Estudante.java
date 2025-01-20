package Entities;

// Classe que representa a entidade Estudante, contendo informações sobre o nome e as notas de um estudante.
public class Estudante {

    // Atributos da classe Estudante: nome (String), nota1 (double), nota2 (double) e nota3 (double).
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    // Método que calcula a nota final do estudante.
    // Retorna a soma das três notas (nota1, nota2 e nota3).
    public double notaFinal() {
        return nota1 + nota2 + nota3;  // Retorna a soma das notas.
    }

    // Método que calcula os pontos faltantes para o estudante alcançar a média mínima de 60 pontos.
    // Se a nota final for menor que 60, retorna a diferença entre 60 e a nota final.
    // Caso contrário, retorna 0.0, indicando que o estudante não precisa de mais pontos.
    public double pontosFaltantes() {
        if (notaFinal() < 60.0) {
            return 60.0 - notaFinal();  // Calcula a quantidade de pontos faltantes para alcançar 60 pontos.
        }
        else {
            return 0.0;  // Se a nota final for igual ou maior que 60, não faltam pontos.
        }
    }
}