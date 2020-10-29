package by.htp.les04.main;

import java.util.Random;
import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		// 11. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] +
		// D[4] + D[5]; D[4] +D[5] +D[6].
		// Пояснение. Составить метод(методы) для вычисления суммы трех последовательно
		// расположенных элементов массива с номерами от k до m.
		//int a; не используется
		//a = entreNum(" Укажите длинну массива ");  длина массива известна по условию --->6(если вводишь другое число то ошибка)
		int[] mas = lengthMas(6);
		randomMasElement(mas);
		printMas(mas);

		int sum02 = masSumKM(mas, 0, 2);
		print("Сумма элементов массива в диопозоне от 0 до 2 = ", sum02);

		int sum24 = masSumKM(mas, 2, 4);
		print("Сумма элементов массива в диопозоне от 2 до 4 = ", sum24);

		int sum35 = masSumKM(mas, 3, 5);
		print("Сумма элементов массива в диопозоне от 3 до 5 = ", sum35);
	}

	public static int masSumKM(int[] mas, int k, int m) {
		int sum;
		sum = 0;
		for (int i = k; i <= m; i++) {
			sum = sum + mas[i];
		}
		return sum;
	}
	/*public static int entreNum(String mesage) {    // не используется блок кода
		int value;
		@SuppressWarnings(" resource ")
		Scanner sc = new Scanner(System.in);
		System.out.println(mesage);
		while (!sc.hasNextInt()) {
			sc.nextInt();
			System.out.println(mesage);
		}
		value = sc.nextInt();
		return value;
	}
        */
	public static int[] lengthMas(int a) {
		
		return  new int[a];
	}

	public static void randomMasElement(int[] mas) {
		Random random = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = random.nextInt(100);
		}
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.printf(" % 4d ", mas[i]);
		}
		System.out.println();
		System.out.println(" ------------ ");
	}

	public static void print(String mesage, int a) {
		System.out.println(mesage + a);
	}
}
