import entradaDados from 'readline-sync';

console.log("Calculadora de soma entre x e y: \n")

let x = entradaDados.question("Informe o valor de x: ");
//let y = entradaDados.question("Informe o valor de y: ")

let y = "50";

let soma = Number(x) + Number(y);
let subtracao = x - y;
let multiplicacao = x * y;
let divisao = x / y;
let resto = x % y;

console.log(x+" + "+y+" = "+soma);
console.log(x+" - "+y+" = "+subtracao);
console.log(x+" * "+y+" = "+multiplicacao);
console.log(x+" / "+y+" = "+divisao);
console.log(x+" % "+y+" = "+resto);

