package fundamentos;

public class Wrappers {

	public static void main(String[] args) {

		// Geralmento sao inicializado com Letra MAIUSCULA
		// Numericos INT, SHORT, INT, LONG
		System.out.println("BYTE");
		Byte b = 127;
		System.out.println("VALOR: " + b);
		System.out.println("BYTE VALOR: " + b.byteValue());
		System.out.println(b / 3);

		System.out.println("\nSHORT");
		Short sh = 10000;
		System.out.println("VALOR: " + sh);
		System.out.println("BYTE VALOR: " + sh.byteValue());
		System.out.println(sh / 3);

		System.out.println("\nINTEGER");
		Integer i = 1000000000; // Int
		System.out.println("VALOR: " + i);
		System.out.println("BYTE VALOR: " + i.byteValue());
		System.out.println(i / 3);

		i = Integer.parseInt("5000");
		System.out.println("VALOR: " + i);
		System.out.println("BYTE VALOR: " + i.byteValue());
		System.out.println(i / 3);

		System.out.println("\nLONG");
		Long l = 100000000000000000L;
		System.out.println("VALOR: " + l);
		System.out.println("BYTE VALOR: " + l.byteValue());
		System.out.println(l / 3);		
		System.out.println();
		
		// Float
		System.out.println("FLOAT");
		float f = 15.25f;
		System.out.println("VALOR: " + f);
		//System.out.println("BYTE VALOR: " + f.byteValue());
		System.out.println(f / 3);
		
		Float fl = 15.25f;
		System.out.println("VALOR: " + fl);
		System.out.println("BYTE VALOR: " + fl.byteValue());
		System.out.println(fl / 3);
		
		System.out.println();
		// Double
		System.out.println("DOUBLE");
		double d = 15.25;
		System.out.println("VALOR: " + d);
		//System.out.println("BYTE VALOR: " + f.byteValue());
		System.out.println(d / 3);
		
		Double dl = 15.25;
		System.out.println("VALOR: " + dl);
		System.out.println("BYTE VALOR: " + dl.byteValue());
		System.out.println(dl / 3);
		System.out.println();
		
		// boolean - Boolean
		System.out.println("BOOLEAN");
		boolean bo = Boolean.parseBoolean("TRUE");
		System.out.println(bo);
		// System.out.println(bo.toString.toUpperCase());

		Boolean boo = Boolean.parseBoolean("TRUE");
		System.out.println(boo);
		System.out.println(boo.toString().toUpperCase());
		System.out.println();
		
		// Char
		System.out.println("CHAR");
		char c = 'a';
		System.out.println(c);
		//System.out.println(c.toString.toUpperCase());

		Character ch = 'a';
		System.out.println(ch);
		System.out.println(ch.toString().toUpperCase());
		System.out.println();
	}
}
