let nome = "   Diego     ";

let resultado = nome.trim();

console.log(resultado); // Diego

// -------------------------------------

let telefone_1 = "(99) 99999-9999";
let telefone_2 = "    (99) 99999-9999    ";

if ( telefone_1 == telefone_2 ){
    console.log("Os telefones são iguais");
} else {
    console.log("Os telefones são diferentes");
}

console.log(telefone_1); // (99) 99999-9999
console.log(telefone_2); //    (99) 99999-9999

// -------------------------------------

telefone_1 = "(99) 99999-9999";
telefone_2 = "    (99) 99999-9999    ";

if ( telefone_1.trim() == telefone_2.trim() ){
    console.log("Os telefones são iguais");
} else {
    console.log("Os telefones são diferentes");
}

console.log(telefone_1); // (99) 99999-9999
console.log(telefone_2); //    (99) 99999-9999