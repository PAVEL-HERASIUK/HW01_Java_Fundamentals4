package by.htp.les04.main;

import java.util.Scanner;

public class Main15 {

	public static void main(String[] args) {
		// 15. Даны натуральные числа К и N. Написать метод(методы) формирования массива
		// А, элементами которого являются числа, сумма цифр которых равна К и которые не
		// большее N.

		String message = " Введите число K   от 1 до 18  ";           // (9+9=18),  9+8=17
		int k = readIntFromConsole(message);                          //  K - можно задать фиксировано, без консольного ввода
		int n = 99;   		                                      //  N - влияет на длину массива
		int length = countNumbers(k, n);
		int[] arr = new int[length];
		arr = fillArray(arr, k, n);
		displayArray(arr);
	}

	public static int readIntFromConsole(String message) {
		int value;
		@SuppressWarnings(" resource ")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		value = sc.nextInt();
		return value;
	}

	private static int countNumbers(int k, int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (sumNumbers(i) == k) {
				count++;
			}
		}
		return count;
	}

	private static int sumNumbers(int i) {
		int sum = 0;
		while (i != 0) {
			int x = i % 10;
			sum = sum + x;
			i = i / 10;
		}
		return sum;
	}

	private static int[] fillArray(int[] arr, int k, int n) {
		int j = 0;
		for (int i = 0; i < arr.length;) {
			while (j < n) {
				if (sumNumbers(j) == k) {
					arr[i] = j;
					i++;
				}
				j++;
			}
		}
		return arr;
	}

	public static void displayArray(int[] arr) {
		for (int n = 0; n < arr.length; n++) {
			System.out.println(" [ " + n + " ] " + " = " + arr[n]);
		}
	}
}
