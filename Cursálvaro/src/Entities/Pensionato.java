package Entities;

// Classe que representa a entidade Pensionato, que armazena informações sobre um residente de um pensionato.
public class Pensionato {

    // Atributos da classe Pensionato: nome (String) e email (String).
    private String nome;
    private String email;

    // Construtor da classe Pensionato, utilizado para inicializar os atributos nome e email.
    // Recebe dois parâmetros: nome (String) e email (String).
    public Pensionato(String nome, String email) {
        this.nome = nome;       // Inicializa o atributo nome com o valor passado.
        this.email = email;     // Inicializa o atributo email com o valor passado.
    }

    // Método getter para o atributo nome.
    // Retorna o nome do residente do pensionato.
    public String getNome() {
        return nome;
    }

    // Método setter para o atributo nome.
    // Permite alterar o nome do residente do pensionato.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para o atributo email.
    // Retorna o email do residente do pensionato.
    public String getEmail() {
        return email;
    }

    // Método setter para o atributo email.
    // Permite alterar o email do residente do pensionato.
    public void setEmail(String email) {
        this.email = email;
    }
}