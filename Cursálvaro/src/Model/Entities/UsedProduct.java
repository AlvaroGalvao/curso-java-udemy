package Model.Entities; // Define o pacote onde a classe está localizada

// Importação das classes necessárias
import java.util.Date;
import java.text.SimpleDateFormat;

// A classe UsedProduct herda da classe Product1
public class UsedProduct extends Product1 {
	
	// Formato de data para exibição da data de fabricação
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	// Atributo específico para a data de fabricação do produto usado
	private Date manufactureDate;
	
	// Construtor padrão (sem argumentos)
	public UsedProduct() {
		super(); // Chama o construtor da classe pai (Product1)
	}
	
	// Construtor com parâmetros para inicializar os atributos
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price); // Chama o construtor da classe pai
		this.manufactureDate = manufactureDate;
	}
	
	// Getter para obter a data de fabricação
	public Date getManufactureDate() {
		return manufactureDate;
	}
	
	// Setter para definir a data de fabricação
	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	// Sobrescreve o método priceTag para incluir a informação da data de fabricação
	@Override
	public String priceTag() {
		return getName()  // Obtém o nome do produto
				+ " (used) $" 
				+ String.format("%.2f", getPrice()) // Formata o preço com duas casas decimais
				+ " (Manufacture date: " 
				+ sdf.format(manufactureDate) // Formata a data de fabricação
				+ ")";
	}
}