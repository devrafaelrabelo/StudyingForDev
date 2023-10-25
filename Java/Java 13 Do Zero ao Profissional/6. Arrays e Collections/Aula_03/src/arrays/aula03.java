package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class aula03 {
	public static void main(String[] args) {
		double[] notasAlunosA = new double[4];
		System.out.println(Arrays.toString(notasAlunosA));
		System.out.println();

		notasAlunosA[0] = 8;
		notasAlunosA[1] = 9;
		notasAlunosA[2] = 7;	
		notasAlunosA[2] = 6;	
		
		System.out.println(Arrays.toString(notasAlunosA));
		
		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunosA.length; i++  ) {
			totalAlunoA+= notasAlunosA[i];
		}		
		
		System.out.println("Total: " + totalAlunoA);
		System.out.println("Media: " + (totalAlunoA / notasAlunosA.length));
		
		//----------------------------------------------
		System.out.println();
		double[] notasAlunosB = { 5, 5, 10, 10};	
		System.out.println(Arrays.toString(notasAlunosB));
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunosB.length; i++  ) {
			totalAlunoB+= notasAlunosB[i];
		}
		
		System.out.println("Total: " + totalAlunoB);
		System.out.println("Media: " + (totalAlunoB / notasAlunosB.length));
	}
}
