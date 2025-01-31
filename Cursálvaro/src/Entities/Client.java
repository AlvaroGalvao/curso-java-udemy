package Entities; // Declaração do pacote ao qual esta classe pertence.

import java.util.Date; // Importa a classe Date para manipulação de datas.
import java.text.SimpleDateFormat; // Importa SimpleDateFormat para formatação de datas.

public class Client { // Declaração da classe Client.
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
	// Formato padrão para exibição de datas. Definido como 'static final' para ser compartilhado entre todas as instâncias da classe.

	private String name; // Nome do cliente.
	private String email; // E-mail do cliente.
	private Date birthDate; // Data de nascimento do cliente.

	public Client() {
		// Construtor padrão sem parâmetros, permite a criação de um objeto vazio.
	}
	
	public Client(String name, String email, Date birthDate) {
		// Construtor que recebe nome, e-mail e data de nascimento como parâmetros.
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}
	
	// Métodos de acesso (getters e setters)
	
	public String getName() {
		return name; // Retorna o nome do cliente.
	}
	
	public void setName(String name) {
		this.name = name; // Define um novo valor para o nome do cliente.
	}
	
	public String getEmail() {
		return email; // Retorna o e-mail do cliente.
	}
	
	public void setEmail(String email) {
		this.email = email; // Define um novo valor para o e-mail do cliente.
	}
	
	public Date getBirthDate() {
		return birthDate; // Retorna a data de nascimento do cliente.
	}
	
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate; // Define um novo valor para a data de nascimento do cliente.
	}
	
	@Override
	public String toString() {
		// Sobrescreve o método toString para retornar uma representação textual do objeto Client.
		// Exibe o nome, a data de nascimento formatada e o e-mail.
		return name + " (" + sdf.format(birthDate) + ") - " + email;
	}
}