package by.htp.les04.main;

public class Main13 {

	public static void main(String[] args) {
		// 13. Дано натуральное число N. Написать метод(методы) для формирования
		// массива, элементами которого являются цифры числа N.
		
		int num = 9876543;
		int i = numLength(num);
		int[] arr = new int[i];
		arr = fillArray(arr, num);
		System.out.print(num + ": ");
		printArr(arr);
	}

	public static int numLength(int a) {
		int i = 0;
		while (a > 0) {
			a = a / 10;
			i++;
		}
		return i;
	}

	public static int[] fillArray(int[] arr, int n) {
		int i = arr.length - 1;
		while (i >= 0) {
			arr[i] = n % 10;
			i--;
			n = n / 10;
		}
		return arr;
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == (arr.length - 1)) {
				System.out.print(arr[i] + "\n");
				break;
			}
			System.out.print(arr[i] + ", ");
		}
	}
}
