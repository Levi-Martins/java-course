package exercicios;

import java.util.Scanner;

import entintes.Triangle;

public class AreaDoTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("Insira os lados a,b,c respectivamente do triangulo X");
		double xA = sc.nextDouble();
		double xB = sc.nextDouble();
		double xC = sc.nextDouble();
		System.out.println("Insira os lados a,b,c respectivamente do triangulo Y");
		double yA = sc.nextDouble();
		double yB = sc.nextDouble();
		double yC = sc.nextDouble();
		
		double pX = (xA + xB + xC)/2;
		double pY = (yA + yB + yC)/2;
		
		double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));
		double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));

		System.out.println("Triangulo X area: " + areaX);
		System.out.println("Triangulo y area: " + areaY);
		System.out.println("A maior area é : " + max(areaX, areaY));
	    */
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Insira os lados a,b,c respectivamente do triangulo X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Insira os lados a,b,c respectivamente do triangulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX =  x.area();
		double areaY =  y.area();

		System.out.println("Triangulo X area: " + areaX);
		System.out.println("Triangulo y area: " + areaY);
		System.out.println("A maior area é : " + max(areaX, areaY));
		
		sc.close();
	}
	
	public static char max( double x, double y) {
		return (x > y) ? 'x' :  'y';
	}

}

