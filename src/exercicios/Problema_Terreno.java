package exercicios;

import java.util.Scanner;

public class Problema_Terreno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double valorPorMetro = sc.nextDouble();
		
		double area = largura * comprimento;
		double valor = area * valorPorMetro;
		System.out.printf("Area do terreno =  %.2f\n",area);
		System.out.printf("Preço do terreno = %.2f\n", valor);
		*/
		
		/*
		System.out.println("Digite um número para saber sua tabuada");
		int n  = sc.nextInt();
		for(int i = 0; i < 10; i++) {
			System.out.println(n + " x " + i + " = " + (n*i));
		}
		*/
		
		/*
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = sc.nextDouble();
		System.out.println(1.8 * celsius + 32);
		System.out.println("Deseja repetir (s/n) ?");
		String resposta = sc.next();
		while(resposta.equals("s")) {
			System.out.println("Digite a temperatura em Celsius: ");
			celsius = sc.nextDouble();
			System.out.println(1.8 * celsius + 32);
			System.out.println("Deseja repetir (s/n) ?");
			resposta = sc.next();
		}
		*/
        for (String resposta = "s"; resposta.equals("s"); ) {
            System.out.println("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();
            System.out.println(1.8 * celsius + 32);
            System.out.println("Deseja repetir (s/n) ?");
            resposta = sc.next();
        }
		sc.close();
	}

}
