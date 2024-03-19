let multiplicador = 8;

console.log("Tabuada de multiplicação do Nº " + multiplicador);

for ( let contador = 0; contador <= 10; contador++ ) {

    let resultado = multiplicador * contador;

    console.log( multiplicador + " x " + contador + " = " + resultado );

}

// 8 x 0 = 0
// 8 x 1 = 8
// 8 x 2 = 16
// 8 x 3 = 24
// 8 x 4 = 32
// 8 x 5 = 40
// 8 x 6 = 48
// 8 x 7 = 56
// 8 x 8 = 64
// 8 x 9 = 72
// 8 x 10 = 80

// ------------------------------------------------

let meses = ["Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"];

for( let contador = 0; contador < meses.length; contador++ ) {

    console.log(meses[contador]);

}

// Janeiro
// Fevereiro
// Março
// Abril
// Maio
// Junho
// Julho
// Agosto
// Setembro
// Outubro
// Novembro
// Dezembro

// -------------------------------------

let funcionarios = [
    {id: 1, nome: "César", habilitado: false},
    {id: 2, nome: "Jéssica", habilitado: false},
    {id: 3, nome: "Renan", habilitado: true},
    {id: 4, nome: "Marlon", habilitado: false},
    {id: 5, nome: "Ana", habilitado: false},
];

let encontrouHabilitado = false;

for ( let contador = 0; contador < funcionarios.length; contador++ ) {

    let funcionario = funcionarios[contador];

    if( funcionario.habilitado == true ){
        console.log("Funcionário habilitado encontrado: " + funcionario.nome);
        encontrouHabilitado = true;
        break;
    }

}

if (!encontrouHabilitado) {
    console.log("Nenhum funcionário habilitado encontrado");
}

// Funcionário habilitado encontrado: Renan

// ------------------------------------------------

let alunos = [
    {id: 1, nome: "Bruna", media: 8},
    {id: 2, nome: "Laura", media: 7},
    {id: 3, nome: "José", media: 5},
    {id: 4, nome: "Guilherme", media: 4},
    {id: 5, nome: "Rafael", media: 10},
   ];
 
   for ( let contador = 0; contador < alunos.length; contador++ ) {
 
    let aluno = alunos[contador];
 
    if ( aluno.media < 6 ) {
    continue;
    }
 
    console.log("Id: " + aluno.id);
    console.log("Nome: " + aluno.nome);
    console.log("Média: " + aluno.media);
    console.log("\n");
 
   }
 
 
   // Id: 1
   // Nome: Bruna
   // Média: 8
 
 
   // Id: 2
   // Nome: Laura
   // Média: 7
 
 
   // Id: 5
   // Nome: Rafael
   // Média: 10

   // -------------------------------------

   let notas_trimestrais = [7, 8, 6, 5];

let soma_notas = 0;
const quantidade_notas = 4;

for ( let contador = 0; contador < quantidade_notas; contador++ ) {

    soma_notas = soma_notas + notas_trimestrais[contador];

}

let media = soma_notas / quantidade_notas;

if ( media >= 6 ) {
    console.log("Aprovado");
} else {
    console.log("Reprovado");
}

// Aprovado

