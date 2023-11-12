package Aula_09;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        int x = sc.nextInt();
        sc.nextLine();
        String s4 = sc.nextLine();
        String s5 = sc.nextLine();
        String s6 = sc.nextLine();

        System.out.println(x);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);


        sc.close();
    }
}
