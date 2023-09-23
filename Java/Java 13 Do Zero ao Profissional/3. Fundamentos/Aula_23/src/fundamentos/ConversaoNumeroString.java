package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
		 Integer num1 = 1000;
		 System.out.println(num1);
		 System.out.println(num1.toString().length());
		 
		 String fraseNum = num1.toString();
		 System.out.println(fraseNum);
		 
		 Integer num2 = 100023;
		 System.out.println(Integer.toString(num2).length());
		 
		 
	}
}
