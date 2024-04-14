var texto = "Hellor World!!";

function imprimirTexto(textoParaImprimir) {
    console.log(textoParaImprimir);
}

function imprimirTexto_1(textoParaImprimir) {
    return textoParaImprimir;
}

imprimirTexto("Teste 1 " + texto);

console.log("Teste 2 " + imprimirTexto_1(texto));

var texto_1 = imprimirTexto_1(texto);

console.log("Teste 3 " + texto_1);




