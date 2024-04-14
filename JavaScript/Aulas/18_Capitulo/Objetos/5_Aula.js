var estados = ["Rio de Janeiro", "São Paulo", "Bahia"];

console.log(estados);

console.log(estados[0]);
console.log(estados[1]);
console.log(estados[2]);
console.log(estados[3]);

estados[3] = "Minas Gerais"

console.log(estados);

console.log(estados[0]);
console.log(estados[1]);
console.log(estados[2]);
console.log(estados[3]);

// ---------------------------------

var linguagens = ["JavaScript", "PHP", "JAVA", "C#"];

console.log(linguagens[0]); //resultado impresso: JavaScript
console.log(linguagens[3]); //resultado impresso: C#

console.log(linguagens);

var linguagem = "C";
linguagens[2] = linguagem;

console.log(linguagens);

// ---------------------------------

var titulo = "Programador";
var quantidadeDeVagas = 5;
var vagaAtiva = true;

var vaga = [titulo, quantidadeDeVagas, vagaAtiva]

console.log(vaga);

console.log(vaga.length);

// ---------------------------------

var telefones = [
    '(11) 98899 - 8787',
    '(22) 7777 - 8888',
    '(22) 5555 - 6666',
    '(22) 3333 - 4444',
    '(22) 1111 - 2222'
];

console.log(telefones);
console.log(telefones.length);