let contador = 0;

while ( contador < 5 ) {

            console.log(contador);
            contador++;

}

// 0
// 1
// 2
// 3
// 4

// -----------------------------------------------------

let numero = 3;
contador = 0;

console.log("Tabuada de multiplicação - Nº " + numero);

while ( contador <= 10 ) {

    let resultado = numero * contador;

    console.log( numero + " x " + contador + " = " + resultado );

    contador++;

}

// Tabuada de multiplicação - Nº 3
// 3 x 0 = 0
// 3 x 1 = 3
// 3 x 2 = 6
// 3 x 3 = 9
// 3 x 4 = 12
// 3 x 5 = 15
// 3 x 6 = 18
// 3 x 7 = 21
// 3 x 8 = 24
// 3 x 9 = 27
// 3 x 10 = 30

// ------------------------------------------------------------

let capital_emprestado = 3000;
let taxa_juros = 0.02; // 2%

contador = 1;
let parcelas_totais = 5;

while ( contador <= parcelas_totais ) {

    let numero_parcela = contador;

    let juros_emprestimo = capital_emprestado * taxa_juros * numero_parcela;

    console.log("A taxa de juros no período de " + numero_parcela + " mes(es) é de R$" + juros_emprestimo + ",00");

    contador++;

}

// A taxa de juros no período de 1 mes(es) é de R$60,00
// A taxa de juros no período de 2 mes(es) é de R$120,00
// A taxa de juros no período de 3 mes(es) é de R$180,00
// A taxa de juros no período de 4 mes(es) é de R$240,00
// A taxa de juros no período de 5 mes(es) é de R$300,00

// ---------------------------------------------------

contador = 10;

while ( contador > 0 ) {

    console.log( contador );
    contador--;

}

// 10
// 9
// 8
// 7
// 6
// 5
// 4
// 3
// 2
// 1

// ----------------------------------------------------

