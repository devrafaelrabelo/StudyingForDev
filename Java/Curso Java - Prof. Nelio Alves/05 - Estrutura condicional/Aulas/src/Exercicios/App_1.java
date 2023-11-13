package Exercicios;

import java.util.Scanner;

public class App_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//        Certamente! Aqui estão 20 exercícios de estrutura condicional
//        em Java para você praticar:
// ---------------------------------------------------------------------
//        1. **Verificar se um número é positivo, negativo ou zero:**
//        - Solicite um número do usuário e exiba se é positivo,
//        negativo ou zero.
        /*System.out.println("1 - Exercicio\n" +
                "Verificar se é positivo, negativo e zero");
        System.out.print("Digite o valor: ");
        double aValor = entrada.nextDouble();
        if (aValor < 0) {
            System.out.println("Valor Negativo");
        } else if (aValor > 0) {
            System.out.println("Valor Positivo");
        } else {
            System.out.println("ZERO");
        }*/
// ---------------------------------------------------------------------
//        2. **Verificar se um número é par ou ímpar:**
//        - Peça um número ao usuário e informe se é par ou ímpar.
        /*System.out.println("2 - Exercicio\n" +
                "Verificar se é par ou impar");
        System.out.print("Digite o valor: ");
        double bValor = entrada.nextDouble();
        if (bValor % 2 == 0) {
            System.out.println("Par!");
        } else {
            System.out.println("Impar!!");
        }*/
// ---------------------------------------------------------------------
//        3. **Calcular a média de três números:**
//        - Receba três números do usuário e calcule a média.
        /*System.out.println("3 - Exercicio\n" +
                "Calcular a media de tras Numeros");
        System.out.print("Digite o 1º Valor: ");
        double cValor1 = entrada.nextDouble();
        System.out.print("Digite o 2º Valor: ");
        double cValor2 = entrada.nextDouble();
        System.out.print("Digite o 3º Valor: ");
        double cValor3 = entrada.nextDouble();
        System.out.printf("A media é: %.2f", (cValor1 + cValor2 + cValor3) / 3);*/
// ---------------------------------------------------------------------
//        4. **Identificar o maior de dois números:**
//        - Solicite dois números e mostre qual é o maior.
        /*System.out.println("4 - Exercicio\n" +
                "Identificar o maior de dois numeros");
        System.out.print("Digite o 1º valor: ");
        double dValor1 = entrada.nextDouble();
        System.out.print("Digite o 2º valor: ");
        double dValor2 = entrada.nextDouble();
        System.out.printf("O valor maior é: %.2f", Math.max(dValor1,dValor2));*/
// ---------------------------------------------------------------------
//        5. **Verificar se um ano é bissexto:**
//        - Pergunte ao usuário um ano e diga se é bissexto ou não.
        /*System.out.println(" - Exercicio\n" +
                "Verificar se é um ano Bissxto");
        System.out.print("Digite o ano: ");
        int eAno = entrada.nextInt();
        if (eAno % 4 == 0) {
            if (eAno % 100 == 0) {
                if (eAno % 400 == 0) {
                    System.out.println("Bissexto");
                } else {
                    System.out.println("Não Bissexto");
                }
            } else {
                System.out.println("Bissexto");
            }
        } else {
            System.out.println("Não Bissexto");
        }*/
// ---------------------------------------------------------------------
//        6. **Identificar o maior de três números:**
//        - Receba três números do usuário e informe qual é o maior.
        /*System.out.println("6 - Exercicio\n" +
                "Identificador o maior de tres numeros");
        System.out.print("Digite o 1º valor: ");
        double fValor1 = entrada.nextDouble();
        System.out.print("Digite o 2º valor: ");
        double fValor2 = entrada.nextDouble();
        System.out.print("Digite o 3º valor: ");
        double fValor3 = entrada.nextDouble();
        double fMaiorValor;
        fMaiorValor = fValor1 > fValor2 ? fValor1 : fValor2;
        fMaiorValor = fValor2 > fValor3 ? fMaiorValor : fValor3;
        System.out.printf("O maior valor é: %.2f", fMaiorValor);*/
// ---------------------------------------------------------------------
//        7. **Determinar se três números podem formar um triângulo:**
//        - Peça três números e diga se podem formar um triângulo.
        /*System.out.println("7 - Exercicio\n" +
                "Determine se os tres numeros podem formar um tiangulo");
        System.out.print("Digite o 1º Valor: ");
        double g1 = entrada.nextDouble();
        System.out.print("Digite o 2º Valor: ");
        double g2 = entrada.nextDouble();
        System.out.print("Digite o 3º Valor: ");
        double g3 = entrada.nextDouble();
        if (Math.abs(g2 - g3) < g1 && g1 < g2 + g3) {
            if (Math.abs(g1 - g3) < g2 && g2 < g1 + g3) {
                if (Math.abs(g1 - g2) < g3 && g3 < g1 + g2) {
                    System.out.println("Triangulo");
                } else {
                    System.out.println("NÃO Triangulo");
                }
            } else {
                System.out.println("NÃO Triangulo");
            }
        } else {
            System.out.println("NÃO Triangulo");
        }*/
// ---------------------------------------------------------------------
//        8. **Calcular o imposto de renda:**
//        - Solicite o salário de uma pessoa e calcule o imposto de
//        renda de acordo com uma tabela fictícia.
        /*System.out.println("8 - Exercicio\n" +
                "Calcular o imposto de renda");
        System.out.print("Digite o valor: ");
        double hSalario = entrada.nextDouble();
        if (hSalario <= 1000) {
            System.out.printf("O Imposto é: %.2f", hSalario * 0.05);
        } else if (hSalario <= 3000) {
            System.out.printf("O Imposto é: %.2f", hSalario * 0.10);
        } else if (hSalario <= 5000) {
            System.out.printf("O Imposto é: %.2f", hSalario * 0.15);
        } else {
            System.out.printf("O Imposto é: %.2f", hSalario * 0.20);
        }*/
// ---------------------------------------------------------------------
//        9. **Verificar se um caractere é vogal ou consoante:**
//        - Peça ao usuário um caractere e informe se é vogal ou consoante.
        /*System.out.println("9 - Exercicio\n" +
                "Verificar se um caractere é vogal ou consoante");
        System.out.print("Digite o Caractere: ");
        char iLetraAntes = entrada.next().charAt(0);
        String iLetra =  String.valueOf(iLetraAntes);
        if (iLetra.equalsIgnoreCase("a") || iLetra.equalsIgnoreCase("e")
                || iLetra.equalsIgnoreCase("i") || iLetra.equalsIgnoreCase("o")
                || iLetra.equalsIgnoreCase("u")) {
            System.out.println("VOGAL");
        } else {
            System.out.println("CONSOANTE");
        }*/
// ---------------------------------------------------------------------
//        10. **Calculadora simples:**
//        - Crie uma calculadora que realiza operações básicas (adição,
//        subtração, multiplicação, divisão) com dois números.
        /*System.out.println(" - Exercicio\n" +
                "Calculadora simples");
        System.out.print("1º Numero");
        double jN1 = entrada.nextDouble();
        System.out.print("2º Numero");
        double jN2 = entrada.nextDouble();
        System.out.print("Digite o tipo de OPERAÇÃO\n" +
                "1 - SOMA\n" +
                "2 - SUBTRAÇÃO\n" +
                "3 - MULTIPLiCAÇÃO\n" +
                "4 - DIVISÃO\n" +
                ":");
        String jConta = entrada.next();
        if (jConta.equalsIgnoreCase("1")) {
            System.out.printf("SOMA\nResultado: %.2f", jN1 + jN2);
        } else if (jConta.equalsIgnoreCase("2")) {
            System.out.printf("SUBTRAÇÃO\nResultado: %.2f", jN1 - jN2);
        } else if (jConta.equalsIgnoreCase("3")) {
            System.out.printf("MULTIPLiCAÇÃO\nResultado: %.2f", jN1 * jN2);
        } else if (jConta.equalsIgnoreCase("4")) {
            System.out.printf("DIVISÃO\nResultado: %.2f", jN1 / jN2);
        }else {
            System.out.println("Operado Invalido");
        }*/
// ---------------------------------------------------------------------
//        11. **Conversor de temperatura:**
//        - Faça um programa que converta uma temperatura de Celsius para
//        Fahrenheit ou vice-versa, dependendo da escolha do usuário.
        /*System.out.println("11 - Exercicio\n" +
                "Conversor de Temperatura");
        System.out.print("Digite\n" +
                "1 - F -> C\n" +
                "2 - C -> F\n" +
                ":");
        int kEscolha = entrada.nextInt();
        System.out.print("Digite a temperatura: ");
        double kTemp = entrada.nextDouble();
        if (kEscolha == 1) {
            System.out.printf("%.2f ºF", (kTemp - 32) / 1.8);
        } else if (kEscolha == 2) {
            System.out.printf("%.2f ºC", (kTemp * 1.8) + 32);
        } else {
            System.out.println("Valor Incorreto");
        }*/
// ---------------------------------------------------------------------
//        12. **Verificar se um número é primo:**
//        - Pergunte ao usuário um número e informe se é primo ou não.
        /*System.out.println(" - Exercicio\n" +
                "Verificar se um número é primo");
        System.out.print("Digite o numero: ");
        int lNum = entrada.nextInt();
        if (lNum <= 1) {
            System.out.println(lNum + " não é um número primo.");
        } else {
            boolean ehPrimo = true;

            for (int i = 2; i <= Math.sqrt(lNum); i++) {
                if (lNum % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                System.out.println(lNum + " é um número primo.");
            } else {
                System.out.println(lNum + " não é um número primo.");
            }
        }*/
// ---------------------------------------------------------------------
//        13. **Calcular o fatorial de um número:**
//        - Peça um número e calcule o seu fatorial.
        /*System.out.println("13 - Exercicio\n" +
                "Calcular o fatorial de um número");
        System.out.print("Digite o Valor: ");
        int mValor = entrada.nextInt();
        int mValorFinal = mValor;
        for (int i = (mValor - 1); i > 0 ;i--) {
            mValorFinal = mValorFinal * (i);
        }
        System.out.printf("O Valor Final é: %d\n", mValorFinal);*/

    entrada.close();
    }
}