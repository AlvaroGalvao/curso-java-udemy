// Pacote onde a classe está localizada
package Model.Exception;

// Definição da classe DomainException, que herda de RuntimeException
public class DomainException extends RuntimeException {
    
    // Identificador de versão da classe para garantir compatibilidade durante a serialização
    private static final long serialVersionUID = 1L;
    
    // Construtor que recebe uma mensagem de erro e a repassa para a superclasse (RuntimeException)
    public DomainException(String msg) {
        super(msg);
    }
}