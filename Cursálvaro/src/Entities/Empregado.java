package Entities;

// Classe que representa a entidade Empregado, que contém informações sobre o nome, salário bruto e imposto de um empregado.
public class Empregado {

    // Atributos da classe Empregado: nome (String), salarioBruto (double) e imposto (double).
    public String nome;
    public double salarioBruto;
    public double imposto;

    // Método que calcula o salário líquido do empregado.
    // Retorna o salário bruto subtraindo o valor do imposto.
    public double salario() {
        return salarioBruto - imposto;  // Retorna o valor do salário líquido.
    }

    // Método que aumenta o salário do empregado com base em uma porcentagem fornecida.
    // O parâmetro porcentagem (double) representa a porcentagem do aumento.
    public void aumentarSalario(double porcentagem) {
        salarioBruto += (porcentagem / 100) * salarioBruto;  // Aumenta o salário bruto com base na porcentagem.
    }

    // Sobrescrita do método toString(), que retorna uma representação em formato de String do nome e salário líquido do empregado.
    // Exibe o nome do empregado e o salário líquido formatado com 2 casas decimais.
    public String toString() {
        return nome + ", R$ " + String.format("%.2f", salario());  // Retorna o nome e o salário líquido formatado.
    }
}