package by.htp.les04.main;

public class Main {

	public static void main(String[] args) {
		// 1. Треугольник задан координатами своих вершин. Написать метод для вычисления
		// его площади.
		double x1 = 8;
		double x2 = 2;
		double x3 = 3;
		double y1 = 4;
		double y2 = 5;
		double y3 = 6;
		double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double b = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		double c = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		double perimeter = a + b + c;
		double area = Math.sqrt(perimeter / 2 * (perimeter / 2 - a) * (perimeter / 2 - b) * (perimeter / 2 - c));
		System.out.println(" area = " + area);
	}

	public static double area(double a, double b, double c, double p) {
		double value;
		value = (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return value;
	}

	public static double perimeter(double a, double b, double c) {
		double value;
		value = a + b + c;
		return value;
	}

	public static double side(int x1, int y1, int x2, int y2) {
		double value;
		value = Math.sqrt(Math.pow(x2 - x1, 2)) + Math.pow(y2 - y1, 2);
		return value;
	}
}
