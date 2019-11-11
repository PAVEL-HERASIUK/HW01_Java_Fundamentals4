package by.htp.les04.main;

import java.util.Scanner;

public class Main14 {

	public static void main(String[] args) {
		// 14. Написать метод(методы), определяющий, в каком из данных двух чисел больше
		// цифр.
		int a;
		int b;

		a = entreNum("Введите первое число:");
		b = entreNum("Введите второе число:");

		int firstNum;
		int secondNum;

		firstNum = counterMasLenght(a);
		secondNum = counterMasLenght(b);

		camporeNum(firstNum, secondNum);
	}

	public static void camporeNum(int a, int b) {
		if (a > b)
			System.out.println("В первом числе больше цифр.");
		else if (a < b)
			System.out.println("Во втором числе больше цифр.");
		else
			System.out.println("В обоих числах одинаковое количество цифр.");
	}

	public static int counterMasLenght(int x) {
		int count = 0;
		do {
			x = x / 10;
			count++;
		} while (x % 10 != 0);
		return count;
	}

	public static int entreNum(String mesage) {
		int value;

		@SuppressWarnings("resource ")
		Scanner sc = new Scanner(System.in);
		System.out.println(mesage);

		while (!sc.hasNextInt()) {
			sc.nextInt();
			System.out.println(mesage);
		}
		value = sc.nextInt();
		return value;
	}
}
