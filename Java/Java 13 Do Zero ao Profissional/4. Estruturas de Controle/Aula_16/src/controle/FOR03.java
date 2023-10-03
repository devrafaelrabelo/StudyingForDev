package controle;

import java.util.Scanner;

public class FOR03 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		entrada.close();
	}
}
