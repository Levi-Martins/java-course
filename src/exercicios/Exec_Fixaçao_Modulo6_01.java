package exercicios;

import java.util.Scanner;

public class Exec_Fixaçao_Modulo6_01 {
	/*
	//Ex.01
	public double widthEx1;
	public double heightEx1;

	public double areaEx1() {
		return widthEx1 * heightEx1;
	}
	
	public double perimetroEx1() {
		return widthEx1 * 2 + heightEx1 * 2;
	}
	
	public double diagonalEx1() {
		return Math.sqrt(Math.pow(widthEx1, 2) + Math.pow(heightEx1, 2));
	}
	*/
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		percentage = percentage/100;
		grossSalary += grossSalary*percentage;
	}
	
	public String toString() {
		return "Funcionário: " + name + ", $ " + String.format("%.2f", netSalary());
	}

	public static void main(String[] args) {
		/*
		01.Fazer um programa para ler os valores da largura e altura de um 
		retângulo. Em seguida, mostrar na tela o valor de sua área, 
		perímetro e diagonal. Usar uma classe como mostrado no 
		projeto ao lado. 
		*/
		
		Scanner sc = new Scanner(System.in);
		/*
		Exec_Fixaçao_Modulo6_01 retangulo;
		retangulo = new Exec_Fixaçao_Modulo6_01();
		
		System.out.println("Entre com a largura e altura do retangulo: ");
		retangulo.widthEx1 = sc.nextDouble();
		retangulo.heightEx1 = sc.nextDouble();
		System.out.println("Area: " + retangulo.areaEx1());
		System.out.println("Perimetro: " + retangulo.perimetroEx1());
		System.out.println("Diagonal: " + retangulo.diagonalEx1());
		*/
		
		/*
		02.Fazer um programa para ler os dados de um 
		funcionário (nome, salário bruto e imposto). 
		Em seguida, mostrar os dados do funcionário 
		(nome e salário líquido). Em seguida, 
		aumentar o salário do funcionário com base 
		em uma porcentagem dada (somente o salário 
		bruto é afetado pela porcentagem) e mostrar 
		novamente os dados do funcionário. Use a 
		classe projetada ao lado.
		*/
		
		Exec_Fixaçao_Modulo6_01 funcionario;
		funcionario = new Exec_Fixaçao_Modulo6_01();
		
		System.out.println("Name: ");
		funcionario.name = sc.next();
		System.out.println("Salário Bruto: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.println("Imposto: ");
		funcionario.tax = sc.nextDouble();
		System.out.println(funcionario);
		System.out.println();
		
		System.out.println("Qual a porcentagem para aumentar o salário ?");
		double porcentage = sc.nextDouble();
		funcionario.increaseSalary(porcentage);
		System.out.println(funcionario);

		
		sc.close();
	}

}
