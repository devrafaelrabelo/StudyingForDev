let programador_1 = "Flávia";
let programador_2 = "Rogério";

console.log(programador_1.toUpperCase()); // FLÁVIA

console.log(programador_2.toLowerCase()); // rogério

// -------------------------------------------

programador_1 = "Flávia";
programador_2 = "flávia";

if ( programador_1 == programador_2 ){
    console.log("iguais");
} else {
    console.log("diferentes");
}

// --------------------------------------

programador_1 = "Flávia";
programador_2 = "flávia";

if ( programador_1.toLowerCase() == programador_2.toLowerCase() ){
    console.log("iguais");
} else {
    console.log("diferentes");
}
