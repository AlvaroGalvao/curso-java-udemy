package Model.Entities; // Declaração do pacote onde a classe está localizada

// Classe que representa um veículo genérico
public class Vehicle {
    
    private String model; // Atributo que armazena o modelo do veículo
    
    // Construtor padrão sem argumentos
    public Vehicle() {
    }
    
    // Construtor que recebe o modelo do veículo como argumento
    public Vehicle(String model) {
        this.model = model;
    }
    
    // Método getter para obter o modelo do veículo
    public String getModel() {
        return model;
    }
    
    // Método setter para definir um novo modelo para o veículo
    public void setModel(String model) {
        this.model = model;
    }
}