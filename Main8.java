package by.htp.les04.main;

import java.util.Random;
import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		// 8. Составить программу, которая в массиве A[N] находит второе по величине
		// число
		// (вывести на печать число, которое меньше максимального элемента массива, но
		// больше
		// всех других элементов).
		int a;
		a = enterNum(" Укажите длину массива = ");
		int[] mas = masLength(a);
		randomMasElement(mas);
		// sorting (mas);
		printMas(mas);
		printLine();
		printBeforMaxNum(mas);
	}

	public static void printBeforMaxNum(int[] mas) {
		int volume = mas[mas.length - 2];
		//System.out.println(" Второе по величине число = ");
	}

	public static void sort(int[] mas) {
		int indexMinElement = 0;
		for (int i = 0; i < mas.length; i++) {
			indexMinElement = i;
			for (int j = i + 1; j < mas.length; j++) {
				if (mas[indexMinElement] > mas[j]) {
					indexMinElement = j;
				}
			}
			int temp = mas[indexMinElement];
			mas[indexMinElement] = mas[i];
			mas[i] = temp;
			printMas(mas);
		}
	}

	public static void randomMasElement(int[] mas) {

		Random random = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = random.nextInt(100);
		}
	}

	public static int enterNum(String mesage) {
		int value;
		@SuppressWarnings(" resource ")
		Scanner scan = new Scanner(System.in);
		System.out.println(mesage);
		while (!scan.hasNextInt()) {
			scan.nextInt();
			System.out.println(mesage);
		}
		value = scan.nextInt();
		return value;
	}

	public static int[] masLength(int a) {
		int[] mas = new int[a];
		return mas;
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			// System.out.println(" % 4d ", mas[i]);
		}
		System.out.println();
	}

	public static void printLine() {
		System.out.println(" ----- ");
	}
}
