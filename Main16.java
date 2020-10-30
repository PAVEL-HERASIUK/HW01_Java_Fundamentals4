package by.htp.les04.main;

public class Main16 {                   //есть ошибка в коде
	
	public static void main(String[] args) {
		// 16. Два простых числа называются «близнецами», если они отличаются друг от
		// друга на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка
		// [n,2n], где n - заданное натуральное число больше 2. Для решения задачи использовать
		// декомпозицию.
		
		int n = randomValue();
		int m = 2 * n;
		int[][] mas = array(n, m);

		System.out.println("[" + n + " , " + m + " ] ");
		printMas(mas);
	}

	public static int randomValue() {

		return 0;
	}

	public static int rand() {
		int N = (int) (Math.random() * 100 + 2);
		return N;
	}

	public static int[][] array(int n, int m) {
		int l = m - n - 1;
		int[][] mas = new int[l][2];
		int j = 0;
		for (int i = n; i <= m - 2; i++) {
			mas[j][0] = i;
			mas[j][1] = i + 2;
			j++;
		}
		return mas;
	}

	public static void printMas(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.println(" { ");
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ; ");
			}
			System.out.println(" } ");
		}
	}
}
