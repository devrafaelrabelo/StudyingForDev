package fundamentos;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		var x = 34.56;
		double y  = 2.2;
		
		System.out.println("SOMA: " + (x + y));
		System.out.println("SUBTRAÇÃO: " + (x - y));
		System.out.println("MULTIPLICAÇÃO: " + x * y);
		System.out.println("DIVISÃO: " + x / y);
		
		System.out.println("MODULO (RESTO): " + x % y);
		
		
		System.out.println("\nINTEIROS");
		int a = 8;
		int b = 3;
		
		System.out.println("SOMA: " + (a + b));
		System.out.println("SUBTRAÇÃO: " + (a - b));
		System.out.println("MULTIPLICAÇÃO: " + a * b);
		System.out.println("DIVISÃO: " + a / b);
		System.out.println("DIVISÃO: " + a / (double)b);
		System.out.println("DIVISÃO: " + a / (float)b);
		
		System.out.println("MODULO (RESTO): " + a % b);
		
		
	}
}
