const intensidade = (intensidade) => {
    let intensidadeFormatada = "1 (Fraca)";

    if (intensidade.toLowerCase().indexOf("média") == 0) {
        intensidadeFormatada = "2 (Média)"
    } else if (intensidade.toLowerCase().indexOf("forte") == 0) {
        intensidadeFormatada = "3 (Forte)"
    } else if (intensidade.toLowerCase().indexOf("irregular") == 0) {
        intensidadeFormatada = "(Irregular)"
    }

    return intensidadeFormatada;

}

const hemisferio = (hemisferio) => {
    let hemisferioFormatado;

    if (hemisferio >= 0) {
        hemisferioFormatado = `Norte`
    } else {
        hemisferioFormatado = `Sul`
    }

    return hemisferioFormatado;
}

const periodo = (data) => {
    let dataFormatada = data.split("/");

    return dataFormatada = dataFormatada[1] + "/" + dataFormatada[0];
}

export const painelFormatado = (element) => {
    console.log(`NOME DA CHUVA`.padEnd(27, " "), `- INTENSIDADE`.padEnd(20, " "),
        `- HEMISFÉRIO`.padEnd(15, " "), `- PERÍODO`.padEnd(20, " "))
}

export const fraseFormatada = (element) => {
    console.log(`${element.nome}`.padEnd(27, " "), `- ${intensidade(element.intensidade)}`.padEnd(20, " "),
        `- ${hemisferio(element.declinacao)}`.padEnd(15, " "), `- ${periodo(element.inicio)} à ${periodo(element.fim)}`.padEnd(20, " "))
}




