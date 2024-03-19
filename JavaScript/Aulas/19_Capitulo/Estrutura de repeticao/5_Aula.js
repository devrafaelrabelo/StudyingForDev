let contador = 0;

do {

    console.log(contador);
    contador++;

} while ( contador < 5 );

// 0
// 1
// 2
// 3
// 4

// -------------------------------------

contador = 0;

do {

    console.log(contador);
    contador++;

} while ( contador < 0 );

// 0

// -----------------------------------------------

contador = 0;

let meses = ["Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"];

do {

    console.log(meses[contador]);
    contador++;

} while ( contador < meses.length );

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

// ----------------------------------------

let funcionarios = [
    {id: 1, nome: "César", habilitado: false},
    {id: 2, nome: "Jéssica", habilitado: false},
    {id: 3, nome: "Renan", habilitado: false},
    {id: 4, nome: "Marlon", habilitado: false},
    {id: 5, nome: "Ana", habilitado: false},
];

contador = 0;
let encontrouHabilitado = false;

do {

    let funcionario = funcionarios[contador];

    if( funcionario.habilitado == true ){
        console.log("Funcionário habilitado encontrado: " + funcionario.nome);
        encontrouHabilitado = true;
        break;
    }

    contador++;
} while ( contador < funcionarios.length );

if (!encontrouHabilitado) {
    console.log("Nenhum funcionário habilitado encontrado");
}

// Funcionário habilitado encontrado: Renan

// -----------------------------------------------------

let alunos = [
    {id: 1, nome: "Bruna", media: 8},
    {id: 2, nome: "Laura", media: 7},
    {id: 3, nome: "José", media: 5},
    {id: 4, nome: "Guilherme", media: 4},
    {id: 5, nome: "Rafael", media: 10},
];

contador = 0;

do {

    let aluno = alunos[contador];

    contador++;

    if ( aluno.media < 6 ) {
        continue;
    }

    console.log("Id: " + aluno.id);
    console.log("Nome: " + aluno.nome);
    console.log("Média: " + aluno.media);
    console.log("\n");

} while ( contador < alunos.length );


// Id: 1
// Nome: Bruna
// Média: 8


// Id: 2
// Nome: Laura
// Média: 7


// Id: 5
// Nome: Rafael
// Média: 10

// -----------------------------------------------------

let valor_mensalidade = 100;
let taxa_multa = 0.02; // 2%
let total_dias = 10;
contador = 1;

do {

    let dias_atraso = contador;

    let valor_multa = valor_mensalidade * taxa_multa * dias_atraso;

    let novo_valor_mensalidade = valor_mensalidade + valor_multa;

    console.log("Dia(s) de atraso: " + dias_atraso + " - mensalidade atualizada: R$" + novo_valor_mensalidade + ",00");

    contador++;

} while( contador < total_dias );

// Dia(s) de atraso: 1 - mensalidade atualizada: R$102,00
// Dia(s) de atraso: 2 - mensalidade atualizada: R$104,00
// Dia(s) de atraso: 3 - mensalidade atualizada: R$106,00
// Dia(s) de atraso: 4 - mensalidade atualizada: R$108,00
// Dia(s) de atraso: 5 - mensalidade atualizada: R$110,00
// Dia(s) de atraso: 6 - mensalidade atualizada: R$112,00
// Dia(s) de atraso: 7 - mensalidade atualizada: R$114,00
// Dia(s) de atraso: 8 - mensalidade atualizada: R$116,00
// Dia(s) de atraso: 9 - mensalidade atualizada: R$118,00