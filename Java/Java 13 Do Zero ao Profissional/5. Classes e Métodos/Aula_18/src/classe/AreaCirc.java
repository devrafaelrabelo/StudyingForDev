package classe;

public class AreaCirc {

		double raio;
		static final double PI = 3.14;
		
		AreaCirc(double raio) {
			this.raio = raio;
			//this.pi = 3.14;
		}
		
		double area() {
			//return raio * raio * pi;
			return PI * Math.pow(raio, 2);
		}
		
		static double area(double raio) {
			//return raio * raio * pi;
			return PI * Math.pow(raio, 2);
		}
}
