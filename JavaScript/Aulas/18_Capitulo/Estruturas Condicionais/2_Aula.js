// var produto = {
//     id: 9,
//     nome: "Cafeteira Elétrica",
//     valor: 99.00
// };

// console.log(produto.id); // 9
// console.log(produto.nome); // Cafeteira Elétrica
// console.log(produto.valor); // 99.00

// console.log(produto.);

var aluno_academia = {
    id: 10,
    nome: "Gerson Silva Campos",
    altura: 1.80,
    peso: 63
};

var nome_aluno = aluno_academia.nome;
var peso_aluno = aluno_academia.peso;
var altura_aluno = aluno_academia.altura;

var imc_aluno = (peso_aluno / (altura_aluno * altura_aluno)).toFixed(2);

console.log("O IMC do aluno é de: " + imc_aluno);

if ( imc_aluno < 18.5 ) {
    console.log("O aluno " + nome_aluno + " está abaixo do peso");
} else if( imc_aluno >= 18.5 && imc_aluno <= 24.99) {
    console.log("O aluno " + nome_aluno + " está com o peso normal");
} else {
    console.log("O aluno " + nome_aluno + " está acima do peso");
}

// O IMC do aluno é de: 22.53
// O aluno Gerson Silva Campos está com o peso normal