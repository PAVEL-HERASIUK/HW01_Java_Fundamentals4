package by.htp.les04.main;

public class Main20 {

	public static void main(String[] args) {
		// 20. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму
		// его цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль?
		// Для решения задачи использовать декомпозицию.

		int n = rand();
		int i = count(n);
		System.out.println("Количество повторений:" + i);
	}

	public static int rand() {
		int N = (int) (Math.random() * 100);
		return N;
	}

	public static int count(int n) {
		int i = 0;
		int m = n;
		int sum = 0;
		for (; n > 0; n = n - sum) {
			System.out.println("Исходное число:" + n);
			sum = 0;
			for (; m > 0; m = m / 10) {
				int a = m % 10;
				sum = sum + a;

			}
			i++;
		}
		return i;
	}
}
