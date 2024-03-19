let frase = "Tudo o que um sonho precisa para ser realizado é alguém que acredite que ele possa ser realizado.";
let posicao = frase.indexOf("sonho");

console.log(posicao); // 14

// --------------------------------------

frase = "Acredite em si próprio e chegará um dia em que os outros não terão outra escolha senão acreditar com você.";
posicao = frase.indexOf("esperança");

console.log(posicao); // -1

// ------------------------------------

let expressao_proibida = "passaporte falso";

let comentario = "   venda de PASSAPORTE FALSO   ";

comentario = comentario.trim();
comentario = comentario.toLowerCase();

if ( comentario.indexOf(expressao_proibida) > -1 ){

    console.log("No seu comentário há palavras proibidas. Atualize seu comentário e envie novamente");

} else {

    console.log("Seu comentário foi aprovado");

}

console.log(comentario); // venda de passaporte falso