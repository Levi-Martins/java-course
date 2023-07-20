package exercicios;

import java.util.Scanner;

import entintes.ProductResolucao;

public class ProdutosResolucao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ProductResolucao cliente;
		cliente = new ProductResolucao();

		System.out.println("Enter product data:");
		System.out.println("Name: ");
		cliente.name = sc.next();
		System.out.println("Price: ");
		cliente.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		cliente.quantity = sc.nextInt();

		System.out.println(cliente);
		System.out.println();
		
		//quantidade de produtos adicionados no stock
		System.out.println("Enter the number of products to be added in stock:");
		int quantity = sc.nextInt();
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
