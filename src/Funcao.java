import java.util.Scanner;

public class Funcao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		max(a, b, c);
		System.out.println("maior2: " + max2(a, b, c));
		mostrarResultado(max2(a, b, c));
		
		sc.close();
	}
	
	
	public static void max(int x, int y, int z) {
		if(x > y && x > z) {
			System.out.println("maior: " + x);
		}else if(y > z) {
			System.out.println("maior: " + y);
		}else {
			System.out.println("maior: " + z);
		}	
	}
	
	public static int max2(int x, int y, int z) {
		int aux;
		if(x > y && x > z) {
			aux = x;
		}else if(y > z) {
			aux = y;
		}else {
			aux = z;
		}	
		return aux;
	}
	
	public static void mostrarResultado(int value) {
		System.err.println("maior3:" + value);
	}
}

