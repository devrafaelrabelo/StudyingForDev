if ( limite >= valor ) {
    console.log("Compra aprovada");
}
else {
    console.log("Compra negada");
}

// ------------------------------------

if ( resposta != 3 ) {
    console.log("Resposta incorreta");
}
else {
    console.log("Resposta correta");
}

// ------------------------------------

if ( idade > 17 && idade < 25 ) {
    console.log("Entre 18-24 anos");
}
else {
    console.log("Fora da faixa etária");
}

// ------------------------------------

if ( resposta == 5 ) {
    console.log("Resposta correta");
}
else {
    console.log("Resposta incorreta");
}

// ------------------------------------

if ( mes == 11 || mes == 12) {
    console.log("Promoção!");
}
else {
    console.log("Preço normal");
}


//Define a variavel com o dia da semana (0 = Domingo, 1 = Segunda...)
var dia_semana = 5;

//Verifica se o dia da semana é sábado ou domingo
if(dia_semana == 0 || dia_semana == 6) {
    //Imprime uma mensagem informando o horário de funcionamento
    console.log("Funcionamos apenas de Segunda à Sexta");
}
else
{
    //Do contrário, informa que a loja está aberta
    console.log("Loja aberta");
}