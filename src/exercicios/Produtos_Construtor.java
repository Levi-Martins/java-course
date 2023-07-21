package exercicios;

import java.util.Scanner;

import entintes.Product_Construtor;

public class Produtos_Construtor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter product data:");
		System.out.println("Name: ");
		String name = sc.next();
		System.out.println("Price: ");
		Double price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		int quantity = sc.nextInt();
		Product_Construtor cliente = new Product_Construtor(name, price, quantity);

		System.out.println(cliente);
		System.out.println();
		
		//quantidade de produtos adicionados no stock
		System.out.println("Enter the number of products to be added in stock:");
		quantity = sc.nextInt();
		//System.out.println(cliente.quantity); teste
		cliente.addProduct(quantity);
		System.out.println(cliente);
		System.out.println();

		//quantidade de produtos removidos no stock
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		cliente.removeProduct(quantity);
		System.out.println(cliente);

		sc.close();

	}

}
