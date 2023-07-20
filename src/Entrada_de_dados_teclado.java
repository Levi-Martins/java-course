import java.util.Locale;
import java.util.Scanner;

public class Entrada_de_dados_teclado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// objeto escaner associado ao teclado no modo console
		Scanner sc = new Scanner(System.in);
		
		//receber dados de string 
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		//receber dados de inteiros
		int y;
		y = sc.nextInt();
		System.out.println("Número digitado: " + y);
		
		//receber dados de float
		double z;
		z = sc.nextDouble();
		System.out.println("Número com ponto flutuante: " + z);
		
		char a;
		a = sc.next().charAt(0);
		System.out.println("Primeiro caracter: " + a);
		
		//função para desalocar o recurso da variável
		sc.close();
	}
}
				