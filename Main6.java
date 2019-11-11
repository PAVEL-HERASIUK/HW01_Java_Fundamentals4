package by.htp.les04.main;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		// 6. Вычислить площадь правильного шестиугольника со стороной а, используя
		// метод вычисления площади треугольника.
		
		double side, hexagon, tri;
		side = initSide(" Сторона шестиугольника = ");

		tri = triangleArea(side);
		print(" Площадь треугольника = ", tri);

		double hex = hexagonArea(tri);
		print(" Площадь шестиугольника = ", hex);
	}

	public static double hexagonArea(double a) {
		double hex;
		hex = a * 6;
		return hex;
	}

	public static double triangleArea(double a) {
		double tri;
		tri = Math.pow(a, 2) * Math.sqrt(3) / 4;
		return tri;
	}

	public static int initSide(String mesage) {
		int value;
		@SuppressWarnings("\r\n" + "resource ")
		Scanner scan = new Scanner(System.in);

		System.out.println(mesage);

		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.println(mesage);
		}
		value = scan.nextInt();
		return value;
	}

	public static void print(String mesage, double a) {
		System.out.println(mesage + a);
	}
}
