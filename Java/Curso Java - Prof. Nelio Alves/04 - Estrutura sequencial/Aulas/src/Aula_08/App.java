package Aula_08;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int c = sc.nextInt();
        double d = sc.nextDouble();
        long e = sc.nextLong();
        char f = sc.next().charAt(0);

        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        sc.close();
    }
}
