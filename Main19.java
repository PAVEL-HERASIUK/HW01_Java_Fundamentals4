package by.htp.les04.main;

public class Main19 {

	public static long main(String[] args) {
		// 19. Написать программу, определяющую сумму n - значных чисел, содержащих
		// только
		// нечетные цифры. Определить также, сколько четных цифр в найденной сумме. Для
		// решения задачи использовать декомпозицию.
		int n = 0;
		int sumOdd = 0;
		int min = (int) (Math.pow(10, (n - 1)));
		int max = (int) (Math.pow(10, n) - 1);
		for (int i = min; i <= max; i++) {
			if (checkOdd(i)) {
				sumOdd = sumOdd + i;
			}
		}
		return sumOdd;
	}

	public static boolean checkOdd(int i) {
		boolean res = true;
		while (i > 0) {
			int ostatok = i % 10;
			if (ostatok % 2 == 0) {
				res = false;
			}
			i = i / 10;
		}
		return res;
	}

	public static int checkEven(int n) {
		int checkEven = 0;
		while (n > 0) {
			int ostatok = n % 10;
			if (ostatok % 2 == 0) {
				checkEven++;
			}
			n = n / 10;
		}
		return checkEven;
	}
}
