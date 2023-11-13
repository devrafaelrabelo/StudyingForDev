package Exercicios;

import java.util.Scanner;

public class App_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//        Certamente! Vou criar uma lista de 15 exercícios para
//        praticar conceitos básicos de Java. Vamos lá:
// -----------------------------------------------------------------------------------
//        1. **Soma e Média:**
//        - Solicite ao usuário que insira três números.
//        - Calcule e exiba a soma e a média desses números.
        /*System.out.println("1 - Exercicio\n" +
                "Digite media de 3 notas");
        System.out.print("1º number: ");
        int a1 = entrada.nextInt();
        System.out.print("2º number: ");
        int a2 = entrada.nextInt();
        System.out.print("3º number: ");
        int a3 = entrada.nextInt();
        double media = (double) (a1 + a2 + a3) / 3;
        System.out.printf("Media das notas é %.2f\n", media);*/
// -----------------------------------------------------------------------------------
//        2. **Área do Triângulo:**
//        - Solicite ao usuário que insira a base e a altura de um triângulo.
//        - Calcule e exiba a área do triângulo.
        /*System.out.println("2 - Exercicio\n" +
                "Área do Triângulo");
        System.out.print("Digite BASE: ");
        double b1 = entrada.nextDouble();
        System.out.print("Digite ALTURA: ");
        double b2 = entrada.nextDouble();
        double area = b1 * b2 / 2;
        System.out.printf("A área do triangulo é: %.2f\n", area);*/
// -----------------------------------------------------------------------------------
//        3. **Conversor de Temperatura:**
//        - Solicite ao usuário que insira uma temperatura em Celsius.
//        - Converta a temperatura para Fahrenheit e exiba o resultado.
        /*System.out.println("3 - Exercicio\n" +
                "Conversão de Temperatura");
        System.out.print("Digite o Valor em Graus celsius: ");
        double c1 = entrada.nextInt();
        double cResultado = c1 * 1.8 + 32;
        System.out.printf("A temp é: %.2f\n", cResultado);*/
// -----------------------------------------------------------------------------------
//        4. **Calculadora de Salário:**
//        - Receba o valor da hora de trabalho e o número de horas trabalhadas
//        em um mês. Calcule o salário mensal.
        /*System.out.println("4 - Exercicio\n" +
                "Calculadora de Salário");
        System.out.print("Digite o valor da hora trabalhada: ");
        double d1 = entrada.nextDouble();
        System.out.print("Digite quantidade de hora trabalhada: ");
        double d2 = entrada.nextDouble();
        double dSalario = d1 * d2;
        System.out.printf("O salario é %.2f\n", dSalario);*/
// -----------------------------------------------------------------------------------
//        5. **Conversão de Moeda:**
//        - Converta um valor em dólares para reais, considerando uma taxa de câmbio fixa.
        /*System.out.println("5 - Exercicio\n" +
                "Conversão de Moeda");
        double eCambio = 5.0;
        System.out.print("Digite o valor: ");
        double eValor = entrada.nextDouble();
        double eResultado = eValor / eCambio;
        System.out.printf("O valor em Reais é %,2f\n", eResultado);*/
// -----------------------------------------------------------------------------------
//        6. **Equação de Segundo Grau:**
//        - Dados os coeficientes de uma equação de segundo grau (ax^2 + bx + c = 0),
//        calcule as raízes reais da equação.
        /*System.out.println("6 - Exercicio\n" +
                "Equação de Segundo Grau");
        double fA = 1;
        double fB = 2;
        double fC = -3;
        int delta = (int) ((fB*fB) - (4 * fA * fC));
        double raizQuadradaDelta = Math.sqrt(delta);
        double x1 = (-fB + raizQuadradaDelta) / (2*fA);
        double x2 = (-fB - raizQuadradaDelta) / (2*fA);

        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);*/
// -----------------------------------------------------------------------------------
//        7. **Contagem de Dígitos:**
//        - Receba um número inteiro e conte quantos dígitos ele possui.
        /*System.out.println("7 - Exercicio\n" +
                "Contagem de Dígitos");
        System.out.print("Digite um valor: ");
        int gInt = entrada.nextInt();
        String gString = Integer.toString(gInt);
        System.out.println("Quantidade de Digitos é: " + gString.length());*/
// -----------------------------------------------------------------------------------
//        8. **Volume da Esfera:**
//        - Dado o raio de uma esfera, calcule e exiba o volume.
//        A fórmula é V = (4/3) * π * r^3.
        /*System.out.println(" - Exercicio\n" +
                "Volume da Esfera");
        double hRaio = 5;
        double hResultado = (4 * Math.PI * Math.pow(hRaio, 3) / 3);
        System.out.printf("O volume da esfera é: %.2f", hResultado);*/
// -----------------------------------------------------------------------------------
//        9. **Verificação de Número Par ou Ímpar:**
//        - Receba um número e determine se ele é par ou ímpar.
        /*System.out.println("9 - Exercicio\n" +
                "Verificação de Número Par ou Ímpar");
        System.out.print("Digite o valor: ");
        double iValor = entrada.nextDouble();
        String iResultado = iValor % 2 == 0 ? "Par" : "Impar";
        System.out.printf("O resultado é: %s\n", iResultado);*/
// -----------------------------------------------------------------------------------
//        10. **Cálculo de Desconto:**
//        - Receba o valor de um produto e o percentual de desconto.
//        Calcule o valor do desconto e o preço final do produto.
        /*System.out.println("10 - Exercicio\n" +
                "Cálculo de Desconto");
        System.out.print("Digite o valor do Produto: ");
        double jValorProd = entrada.nextDouble();
        System.out.print("Digite o valor do Desconto: ");
        double jValorDesc = entrada.nextDouble();
        double jNovoValor = jValorProd - (jValorProd * (jValorDesc / 100));
        System.out.printf("O Valor com desconto é: %.2f", jNovoValor);*/
// -----------------------------------------------------------------------------------
//        Lembre-se de praticar a escrita de código, testar diferentes casos de
//        entrada e entender cada passo do algoritmo. Se precisar de mais informações
//        ou ajuda com algum desses exercícios, fique à vontade para perguntar!

        entrada.close();
    }
}
