package Applications; // Declaração do pacote onde a classe Aula24 está localizada

import java.util.Locale;  // Importação para definir o formato numérico como US (ponto decimal)
import java.util.List;    // Importação da interface List
import java.util.ArrayList; // Importação da implementação ArrayList
import java.util.Scanner; // Importação para entrada de dados pelo console

import Entities.Enums.Color; // Importa a enumeração Color
import Entities.Rectangle;   // Importa a classe Rectangle
import Entities.Circle;      // Importa a classe Circle
import Entities.Shape;       // Importa a classe abstrata Shape

// Classe principal que contém o método main
public class Aula24 { 
	
	public static void main(String[] args) { 
		
		// Define o locale para os EUA, garantindo que números decimais usem ponto ao invés de vírgula
		Locale.setDefault(Locale.US); 
		
		// Cria um objeto Scanner para entrada de dados do usuário
		Scanner scan = new Scanner(System.in); 
		
		// Cria uma lista de formas geométricas (Shape) utilizando um ArrayList
		List<Shape> list = new ArrayList<>(); 
		
		// Solicita ao usuário o número de formas a serem cadastradas
		System.out.print("Enter the number of shapes: ");
		int n = scan.nextInt(); 
		
		// Loop para cadastrar múltiplas formas geométricas
		for (int i = 1; i <= n; i++) { 
			System.out.println("Shape #" + i + " data:");
			
			// Pergunta ao usuário se deseja cadastrar um retângulo ou um círculo
			System.out.print("Rectangle or circle (r/c)? ");
			char ch = scan.next().charAt(0); 
			
			// Solicita a cor da forma
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(scan.next()); 
			
			// Se for um retângulo, solicita largura e altura e adiciona à lista
			if (ch == 'r') { 
				System.out.print("Width: ");
				Double width = scan.nextDouble();
				System.out.print("Height: ");
				Double height = scan.nextDouble();
				list.add(new Rectangle(color, width, height)); // Adiciona o retângulo à lista
			} 
			// Se for um círculo, solicita o raio e adiciona à lista
			else { 
				System.out.print("Radius: ");
				Double radius = scan.nextDouble();
				list.add(new Circle(color, radius)); // Adiciona o círculo à lista
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:"); 
		
		// Percorre a lista de formas e imprime a área de cada uma
		for (Shape sh : list) { 
			System.out.println(String.format("%.2f", sh.area())); // Formata a saída para duas casas decimais
		}
		
		// Fecha o Scanner para evitar vazamento de recursos
		scan.close(); 
	}
}