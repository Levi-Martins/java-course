package Desafio01;

import java.util.Locale;
import java.util.Scanner;

public class Desafio_Bar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Bill client = new Bill();
		
		System.out.println("Sexo :");
		client.gender = sc.next().charAt(0);
		System.out.println("Quantidade de cervejas:");
		client.beer = sc.nextInt();
		System.out.println("Quantidade de refrigerantes:");
		client.softDrink = sc.nextInt();
		System.out.println("Quantidade de espetinhos:");
		client.barbecue = sc.nextInt();
		System.out.println();
		
		System.out.println("Relatório: ");
		System.out.printf("Consumo = R$ %.2f \n", client.feeding());
		System.out.printf("Cover = R$ %.2f \n", client.cover());
		System.out.printf("Ingresso = R$ %.2f \n", client.ticket());
		System.out.println();
		
		System.out.printf("Valor a pagar = R$ %.2f",  client.total());
		
		sc.close();
	}

}
