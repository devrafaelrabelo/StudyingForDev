function validaCampo(campo, maxCaracteres) {
    const campoValido = campo.length <= maxCaracteres && true;
    return campoValido;
}

const retornaMaisculo = function (texto) {
    const textoMaiusculo = texto.toUpperCase();
    return textoMaiusculo;
}

let somarValores = (valor_1, valor_2) => valor_1 + valor_2;

// --------------------------------------------------------------

const carrinho = [
    { nome: 'The Legend of Zelda', qnt: 1, valor: 250 },
    { nome: 'Super Mario Kart', qnt: 1, valor: 300 },
    { nome: 'New Super Mario Bros', qnt: 1, valor: 250 }
]

carrinho.forEach(function (produto, index) {
    let texto = index + ' - ';
    texto += produto.qnt + ' UN - ';
    texto += produto.nome + ' - ';
    texto += 'R$ ' + produto.valor + ' - ';
    texto += 'R$ ' + produto.qnt * produto.valor;

    console.log(texto);
});

// --------------------------------------------------------------

const meses = [
    "Janeiro", "Fevereiro", "Março", "Abril",
    "Maio", "Junho", "Julho", "Agosto",
    "Setembro", "Outubro", "Novembro", "Dezembro"
];

const abreviar = (mes) => mes.substr(0,3);

const mesesAbrivados = meses.map(abreviar);

console.log(mesesAbrivados);

// -------------------------------------------------

const carros = [
    { marca: 'Fiat', modelo: 'Uno', anoFabricacao: 2015 },
    { marca: 'GM', modelo: 'Onix', anoFabricacao: 2018 },
    { marca: 'Ford', modelo: 'KA+', anoFabricacao: 2018 },
    { marca: 'Fiat', modelo: 'Cronos', anoFabricacao: 2020 }
]

const carroFiat = carros.filter( (carro) => carroFiat.marca == 'Fiat' );

console.log(carroFiat);

// ----------------------------------------------------

const somarValores_1 = function ( total, itemCarrinho) {
    const valorTotal = itemCarrinho.qnt * itemCarrinho.valor;

    return total + valorTotal
}

const valorAPagar = itensCarrinho.reduce(somarValores_1, 0);

console.log(valorAPagar);

// ----------------------------------------------------


