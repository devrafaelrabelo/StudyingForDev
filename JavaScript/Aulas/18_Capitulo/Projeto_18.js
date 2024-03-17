import entradaDados from 'readline-sync';

console.log("Aplicação de Juros:");

let valor = entradaDados.question("Informe o valor devido: R$ ");
let dias = entradaDados.question("Informe quantos dias se passaram desde o vencimento do boleto: ");

let juros = (dias > 15) ? 10 : 5;

let jurosValor = valor * (juros / 100);

let valorFinal = Number(valor) + jurosValor;

console.log("Valor original da dívida: R$ " + valor);
console.log("Dias atrasados: " + dias);
console.log("Taxa de Juros: " + juros + "%");
console.log("Juros: R$" + jurosValor);
console.log("Valor Final: R$ " + valorFinal);