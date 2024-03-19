let frase = "Estou aprendendo JavaScript na DevMedia";

let resultado = frase.substr(17, 10);

console.log(resultado); // JavaScript

// ---------------------------------

frase = "Eu sou programador JavaScript";

resultado = frase.substring(7, 18);

console.log(resultado); // programador

// ------------------------------------

frase = "Ana é especialista em JavaScript";

let substring_1 = frase.substr(6, 12);

console.log(substring_1); // especialista

// ----------------------------------------

let conteudo = "Neste artigo de JavaScript veremos como utilizar o método substring() para extrair uma sequência de caracteres de uma string.";

let tamanho = conteudo.length;
let resumo = "";

if( tamanho > 100 ){

    resumo = conteudo.substring(0, 97);
    resumo += "...";

} else {

    resumo = conteudo;

}

console.log(resumo); // Neste artigo de JavaScript veremos como utilizar o método substring() para extrair uma sequência ...