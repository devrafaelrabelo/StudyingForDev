package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		
		final double PI = 3.14159; //Constante sempre em LETRA MAISCULA		
		
		double raio = 3.4;
		double area = PI * raio * raio;		
		System.out.println("Area: " + PI * raio * raio);
		System.out.println("Area: " + area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Area: " + PI * raio * raio);
		System.out.println("Area: " + area);
		
	}
}