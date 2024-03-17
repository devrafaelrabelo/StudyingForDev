var status = "";
var nota = 10;

if ( nota > 7 ) {
    status = "Aprovado";
}
else {
    status = "Reprovado";
}

console.log(status);

// -----------------------------------------

var status = "";
console.log(status);

var status = nota > 7 ? "Aprovado" : "Reprovado";
console.log(status);

var mes = 8;
var mensagem = (mes >= 9  && mes <= 12) ? "Promoção" : "Preço normal";
console.log(mensagem);

// -----------------------------------------

//Define a variavel com o dia da semana (0 = Domingo, 1 = Segunda...)
var dia_semana = 5;

//Verifica a condição e define o resultado na variável 'status_loja'
var status_loja = (dia_semana == 0 || dia_semana == 6) ? "Funcionamos apenas de Segunda à Sexta" : "Loja aberta";

//Imprime o resultado no console
console.log(status_loja);