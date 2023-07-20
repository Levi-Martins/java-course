import java.text.DecimalFormat;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// comando de saida
		System.out.println("Testando o javinha");
		System.out.println("bom dia");
		
		// definir casa decimal
		double n = 1.1111111;
		int x = 10;
		DecimalFormat duasCasasDecimais = new DecimalFormat("0.00");
		DecimalFormat quatroCasasDecimais = new DecimalFormat("0.0000");
		System.out.println(duasCasasDecimais.format(n));
		System.out.println(quatroCasasDecimais.format(n));
		
		//casas decimais apartir daqui trocaram a , por .
		Locale.setDefault(Locale.US);
		
		// outra forma de definir casa decimal
		System.out.printf("%.2f\n", n);
		System.out.printf("%.4f\n", n);
		
		//concatenação
		System.out.println("Resultado = " + x);
		System.out.printf("Resultado = %.2f\n", n);
		System.out.printf("Resultado = %2d\n", x);
		System.out.printf("Resultado = %2d + %.2f\n", x, n);
		
		String nome = "Levi";
		int idade = 19;
		double salario = 0.00;
		System.out.printf("%s tem %d e recebe por mês %.2f reais ;-; \n\n", nome, idade, salario);
	}
}
