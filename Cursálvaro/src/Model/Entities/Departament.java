// Define o pacote ao qual esta classe pertence
package Model.Entities;

/**
 * A classe `Departament` representa um departamento dentro de uma organização.
 * Ela contém apenas um atributo, o nome do departamento, e métodos
 * para acessar e modificar este atributo.
 */
public class Departament {
    
    // Atributo privado que armazena o nome do departamento
    private String name;

    /**
     * Construtor padrão (sem argumentos).
     * Cria uma instância da classe `Departament` sem inicializar o atributo `name`.
     */
    public Departament() {
    }

    /**
     * Construtor com argumento.
     * Cria uma instância da classe `Departament` com o nome do departamento inicializado.
     * 
     * @param name O nome do departamento.
     */
    public Departament(String name) {
        this.name = name;
    }

    /**
     * Método getter para o atributo `name`.
     * 
     * @return O nome do departamento.
     */
    public String getName() {
        return name;
    }

    /**
     * Método setter para o atributo `name`.
     * Permite modificar o nome do departamento.
     * 
     * @param name O novo nome do departamento.
     */
    public void setName(String name) {
        this.name = name;
    }
}