package fundamentos;

public class Desafio {
	public static void main(String[] args) {
		
		int a = 3 * 4 - 10;
		int b = (int)Math.pow(a, 3);
		System.out.println("Math Pow em INT: " + b);
		
		double c = Math.pow(a, 3);
		System.out.println("Math Pow em DOUBLE: " + c);
		
		
		double part1 = (6 * (3 + 2));
		double part11 = Math.pow(part1, 2);
		double part1Final = part11 / (3 * 2);
		
		double part2 = (1 - 5) * (2 - 7);
		double part21 = part2 / 2;
		double part2Final = Math.pow(part21, 2);
		
		double part3 = part1Final - part2Final;
		double resulFinal = Math.pow((part3 / 10), 3);
		System.out.println(resulFinal);
		
	}
}
