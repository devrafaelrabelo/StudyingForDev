package Exercicios;

import java.util.Scanner;

public class App_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//        Certamente! Vou criar uma lista de 10 exercícios para
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
//        11. **Soma de Dois Números:**
//        Solicite dois números ao usuário e imprima a soma deles.
        /*System.out.println("11 - Exercicio\n" +
                "Soma de Dois Números");
        System.out.print("Digite o 1º Valor: ");
        double k1 = entrada.nextDouble();
        System.out.print("Digite o 2º Valor: ");
        double k2 = entrada.nextDouble();
        System.out.printf("A soma dos valores é: %.2f", k2 + k1);*/
// -----------------------------------------------------------------------------------
//        12. **Calculadora de Média:**
//        Solicite três notas ao usuário e calcule a média.
        /*System.out.println("12 - Exercicio\n" +
                "Calculadora de Media");
        System.out.print("Digite o 1º Valor: ");
        double l1 = entrada.nextDouble();
        System.out.print("Digite o 2º Valor: ");
        double l2 = entrada.nextDouble();
        System.out.print("Digite o 3º Valor: ");
        double l3 = entrada.nextDouble();
        System.out.printf("A media é: %.2f", l1 + l2 + l3 / 3);*/
// -----------------------------------------------------------------------------------
//        13. **Conversão de Temperatura:**
//        Solicite uma temperatura em Celsius e converta-a para Fahrenheit.
//        A fórmula é: `F = (C * 9/5) + 32`.
        /*System.out.println("13 - Exercicio\n" +
                "Conversão de Temperatura");
        System.out.print("Digite a temperatura: ");
        double m1 = entrada.nextDouble();
        double mResultado = (m1 * 9/5) + 32;
        System.out.printf("A temp é: %.2f", mResultado);*/
// -----------------------------------------------------------------------------------
//        14. **Área do Retângulo:**
//        Solicite a base e a altura de um retângulo e calcule a área.
        /*System.out.println("14 - Exercicio\n" +
                "Área do Retângulo");
        System.out.print("Digite o valor de x: ");
        double n1 = entrada.nextDouble();
        System.out.print("Digite o valor de y: ");
        double n2 = entrada.nextDouble();
        System.out.printf("a Area do retangulo é: %.2f", n1 * n2);*/
// -----------------------------------------------------------------------------------
//        15. **Calculadora de IMC (Índice de Massa Corporal):**
//        Solicite o peso (em kg) e a altura (em metros) de uma pessoa
//        e calcule o IMC. A fórmula é: `IMC = peso / (altura * altura)`.
        /*System.out.println("15 - Exercicio\n" +
                "Calculadora IMC");
        System.out.print("Digite o peso: ");
        double o1 = entrada.nextDouble();
        System.out.print("Digite o altura: ");
        double o2 = entrada.nextDouble();
        System.out.printf("O IMC é: %.2f", o1 / (o2 * o2));*/
// -----------------------------------------------------------------------------------
//        16. **Conversão de Segundos:**
//        Solicite um número de segundos e converta-o para horas, minutos e
//        segundos.
        /*System.out.println("16 - Exercicio\n" +
                "Conversão de Segundos");
        System.out.printf("Digite os segundos: ");
        int pSegundos = entrada.nextInt();
        int pHoras = (int) pSegundos / 3600;
        int pMinutos = (int) (pSegundos % 3600) / 60;
        pSegundos = pSegundos % 60;
        System.out.printf("A quantidade em horas: %02d:%02d:%02d",
                pHoras, pMinutos, pSegundos);*/
// -----------------------------------------------------------------------------------
//        17. **Calculadora de Juros Simples:**
//        Solicite o capital, a taxa de juros e o tempo (em anos) e
//        calcule o montante  usando a fórmula de juros simples: `
//        Montante = Capital * (1 + Taxa * Tempo)`.
        /*System.out.println("17 - Exercicio\n" +
                "Calculadora de Juros Simples");
        System.out.print("Digite o Capital: ");
        double qCapital = entrada.nextDouble();
        System.out.print("FORMATO (1,5 - 20,5 ...)\n"
                + "Digite o porcetagem de juros: ");
        double qTaxaJuros = entrada.nextDouble();
        System.out.print("Digite o valor em anos: ");
        double qAnos = entrada.nextDouble();
        double qResultado = qCapital + (qCapital * ((qTaxaJuros/100) * qAnos));
        System.out.printf("O valor é: %.2f", qResultado);*/
// -----------------------------------------------------------------------------------
//        18. **Troca de Valores:**
//        Solicite dois valores ao usuário e troque seus valores
//        sem usar uma variável temporária.
        /*System.out.println("18 - Exercicio\n" +
                "Troca de Valores");
        System.out.print("Digite o 1º valor: ");
        double rValor_1 = entrada.nextDouble();
        System.out.print("Digite o 2º valor: ");
        double rValor_2 = entrada.nextDouble();

        rValor_1 = rValor_1 + rValor_2;
        rValor_2 = rValor_1 - rValor_2;
        rValor_1 = rValor_1 - rValor_2;
        System.out.printf("1º Valor: %.2f\n" +
                "2º Valor: %.2f", rValor_1, rValor_2);*/
// -----------------------------------------------------------------------------------
//        19. **Calculadora de Desconto:**
//        Solicite o preço original de um produto e a porcentagem de desconto.
//        Calcule o preço com desconto.
        /*System.out.println("19 - Exercicio\n" +
                "Calculadora de Desconto");
        System.out.print("Digite o preço: ");
        double sPreco = entrada.nextDouble();
        System.out.print("FORMATO (1,5 - 20,5 ...)\n"
                + "Digite o porcetagem de juros: ");
        double rTaxaJuros = entrada.nextDouble();
        double rResultado = sPreco * ((rTaxaJuros/100));
        System.out.printf("O valor é: %.2f", rResultado);*/
// -----------------------------------------------------------------------------------
//        20. **Número Inteiro e Sua Décima Parte:**
//        Solicite um número inteiro e imprima esse número e a décima parte dele.
        /*System.out.println("20 - Exercicio\n" +
                "Número Inteiro e Sua Décima Parte");
        System.out.print("Digite o valor: ");
        double tValor = entrada.nextDouble();
        double tResultado = tValor / 10;
        System.out.printf("A decima parte é: %.2f", tResultado);*/
// -----------------------------------------------------------------------------------
//        21. **Conversão de Polegadas para Centímetros:**
//        Solicite um valor em polegadas e converta-o para centímetros.
//        Considere que 1 polegada é igual a 2,54 centímetros.
        /*System.out.println("21 - Exercicio\n" +
                "Polegadas para Centimetros");
        System.out.print("Digite o valor: ");
        double uValor = entrada.nextDouble();
        double uResultado = uValor * 2.54;
        System.out.printf("O valor é: %2f", uResultado);*/
// -----------------------------------------------------------------------------------
//        22. **Classificação de Idade:**
//        Solicite a idade de uma pessoa e classifique-a em "Criança" (0-12 anos),
//        "Adolescente" (13-17 anos), "Adulto" (18-59 anos) ou "Idoso"
//        (60 anos ou mais).
        /*System.out.println("22 - Exercicio\n" +
                "Classificação de Idade");
        System.out.print("Digite a IDADE: ");
        int vIdade = entrada.nextInt();
        String vClass = vClass = vIdade >= 60 ? "Idoso" : "IDADE INCORRETA";
        vClass = vIdade >= 18 && vIdade <= 59  ? "Adulto" : vClass;
        vClass = vIdade >= 13 && vIdade <= 17  ? "Adolescente" : vClass;
        vClass = vIdade >= 0 && vIdade <= 12 ? "Criança" : vClass;
        System.out.printf("Classificação: %s", vClass);*/
// -----------------------------------------------------------------------------------
        entrada.close();
    }
}
