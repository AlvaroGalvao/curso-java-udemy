// Define o pacote ao qual esta classe pertence
package Model.Entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Model.Enums.WorkerLevel;

/**
 * A classe `Worker` representa um trabalhador em uma organização.
 * Ela contém informações sobre o nome, nível do trabalhador, salário base, 
 * o departamento ao qual pertence, e uma lista de contratos por hora associados.
 */
public class Worker {

    // Nome do trabalhador
    private String name;

    // Nível do trabalhador (JUNIOR, MID_LEVEL ou SENIOR)
    private WorkerLevel level;

    // Salário base do trabalhador
    private Double baseSalary;

    // Departamento ao qual o trabalhador pertence
    private Departament departament;

    // Lista de contratos por hora associados ao trabalhador
    private List<HourContract> contracts = new ArrayList<>();

    /**
     * Construtor padrão (sem argumentos).
     * Cria uma instância da classe `Worker` sem inicializar os atributos.
     */
    public Worker() {
    }

    /**
     * Construtor com argumentos.
     * Cria uma instância da classe `Worker` com todos os atributos inicializados.
     * 
     * @param name O nome do trabalhador.
     * @param level O nível do trabalhador (enum `WorkerLevel`).
     * @param baseSalary O salário base do trabalhador.
     * @param departament O departamento ao qual o trabalhador pertence.
     */
    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    /**
     * Getter para o atributo `name`.
     * 
     * @return O nome do trabalhador.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter para o atributo `name`.
     * 
     * @param name O novo nome do trabalhador.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter para o atributo `level`.
     * 
     * @return O nível do trabalhador.
     */
    public WorkerLevel getLevel() {
        return level;
    }

    /**
     * Setter para o atributo `level`.
     * 
     * @param level O novo nível do trabalhador.
     */
    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    /**
     * Getter para o atributo `baseSalary`.
     * 
     * @return O salário base do trabalhador.
     */
    public Double getBaseSalary() {
        return baseSalary;
    }

    /**
     * Setter para o atributo `baseSalary`.
     * 
     * @param baseSalary O novo salário base do trabalhador.
     */
    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
     * Getter para o atributo `departament`.
     * 
     * @return O departamento do trabalhador.
     */
    public Departament getDepartament() {
        return departament;
    }

    /**
     * Setter para o atributo `departament`.
     * 
     * @param departament O novo departamento do trabalhador.
     */
    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    /**
     * Getter para a lista de contratos por hora.
     * 
     * @return A lista de contratos associados ao trabalhador.
     */
    public List<HourContract> getContracts() {
        return contracts;
    }

    /**
     * Adiciona um contrato por hora à lista de contratos do trabalhador.
     * 
     * @param contract O contrato a ser adicionado.
     */
    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    /**
     * Remove um contrato por hora da lista de contratos do trabalhador.
     * 
     * @param contract O contrato a ser removido.
     */
    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    /**
     * Calcula a renda total do trabalhador em um determinado ano e mês.
     * A renda é composta pelo salário base mais o valor dos contratos
     * realizados no período especificado.
     * 
     * @param year O ano para o cálculo.
     * @param month O mês para o cálculo.
     * @return A renda total do trabalhador no período especificado.
     */
    public Double income(int year, int month) {
        Double sum = baseSalary; // Começa com o salário base
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts) {
            // Obtém o ano e o mês do contrato
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH); // Janeiro é 0, então adicionamos 1

            // Verifica se o contrato pertence ao ano e mês especificados
            if (year == c_year && month == c_month) {
                sum += c.totalValue(); // Soma o valor do contrato
            }
        }
        return sum;
    }
}