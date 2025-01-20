package Entities;

// Classe que representa a entidade Empregado1, que contém informações sobre o ID, nome e salário de um empregado.
public class Empregado1 {

    // Atributos da classe Empregado1: id (Integer), nome (String) e salario (Double).
    private Integer id;
    private String nome;
    private Double salario;

    // Construtor da classe Empregado1, utilizado para inicializar os atributos id, nome e salario.
    // Recebe três parâmetros: id (Integer), nome (String) e salario (Double).
    public Empregado1 (Integer id, String nome, Double salario) {
        this.id = id;           // Inicializa o atributo id com o valor passado.
        this.nome = nome;       // Inicializa o atributo nome com o valor passado.
        this.salario = salario; // Inicializa o atributo salario com o valor passado.
    }

    // Método getter para o atributo id.
    // Retorna o id do empregado.
    public Integer getId() {
        return id;
    }

    // Método getter para o atributo nome.
    // Retorna o nome do empregado.
    public String getNome() {
        return nome;
    }

    // Método setter para o atributo nome.
    // Permite alterar o nome do empregado.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para o atributo salario.
    // Retorna o valor do salário do empregado.
    public Double getSalario() {
        return salario;
    }

    // Método que aumenta o salário do empregado com base em um percentual de aumento.
    // O parâmetro aumento (Double) representa a porcentagem de aumento.
    public void aumSalario(Double aumento) {
        salario += salario * aumento / 100;  // Aumenta o salário com base no percentual de aumento.
    }

    // Método que reduz o salário do empregado com base em um percentual de redução.
    // O parâmetro reducao (Double) representa a porcentagem de redução.
    public void redSalario(Double reducao) {
        salario -= salario * reducao / 100;  // Diminui o salário com base no percentual de redução.
    }

    // Sobrescrita do método toString(), que retorna uma representação em formato de String dos dados do empregado.
    // Exibe o id, nome e salário formatado com 2 casas decimais.
    public String toString() {
        return id + ", " + nome + ", " + String.format("%.2f", salario);  // Retorna os dados formatados do empregado.
    }
}