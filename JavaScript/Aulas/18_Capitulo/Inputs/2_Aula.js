import entradaDados from 'readline-sync';
const nome = entradaDados.question('Digite seu nome: ');

console.log('Olá, '+nome);

const senha = entradaDados.questionNewPassword('Digite seu nome: ');

console.log(senha);