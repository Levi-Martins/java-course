package exercicios;

import java.util.Scanner;

import entintes.Product;

public class Produtos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Product cliente;
		cliente = new Product();

		System.out.println("Enter product data:");
		System.out.println("Name: ");
		cliente.name = sc.next();
		System.out.println("Price: ");
		cliente.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		cliente.quantity = sc.nextInt();

		System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f \n", cliente.name, cliente.price,
				cliente.quantity, cliente.totalValueStock());
		
		//quantidade de produtos adicionados no stock
		System.out.println("Enter the number of products to be added in stock:");
		cliente.add = sc.nextInt();
		System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f", cliente.name, cliente.price,
				cliente.quantity, cliente.addProduct());
		
		//quantidade de produtos removidos no stock
		System.out.println("Enter the number of products to be removed from stock: ");
		cliente.add = sc.nextInt();
		System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f", cliente.name, cliente.price,
				cliente.quantity, cliente.removeProduct());

		sc.close();
	}

}
