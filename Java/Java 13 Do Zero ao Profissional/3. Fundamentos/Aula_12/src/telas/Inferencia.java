package telas;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a + " " + ((Object)a).getClass().getSimpleName());
		
		var b = 4.5;
		System.out.println(b + " " + ((Object)b).getClass().getSimpleName());
		
		var c = "4.5";
		System.out.println(c + " " + ((Object)c).getClass().getSimpleName());
	}
}
