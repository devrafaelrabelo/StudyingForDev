package Aula_06;

import java.util.Locale;

public class app {
    public static void main(String[] args) {
        System.out.println("Olá, Mundo!!!!");

        System.out.print("Ola, Mundo!!!!");

        int y = 32;
        System.out.println(y);

        double x = 32.456789;
        System.out.println(x);
        System.out.printf("%.2f\n", x);
        System.out.printf("%.4f\n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f\n", x);

        System.out.println("Resultado: " + (x + y));

        System.out.printf("Resultado é %.2f metros\n", x);

        String nome = "Maria";
        int idade = 28;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
    }
}
