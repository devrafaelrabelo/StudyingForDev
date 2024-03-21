const chuvaDeMeteoros = [
    { nome: 'Alfa Centaurídeos', declinacao: -59 },
    { nome: 'Gama Normídeos', declinacao: -50 },
    { nome: 'Pi Pupídeos', declinacao: -45 },
    { nome: 'Líridas', declinacao: 34 },
    { nome: 'Eta Aquáridas', declinacao: -1 },
    { nome: 'Eta Líridas', declinacao: 44 },
    { nome: 'Bootídeos de Junho', declinacao: 48 },
    { nome: 'Alfa Capricornídeos', declinacao: -10 },
    { nome: 'Delta Aquáridas do Sul', declinacao: -16 },
    { nome: 'Piscis Austrinídeos', declinacao: -30 },
    { nome: 'Perseidas', declinacao: 58 },
];

const chuvasNoNorte = chuvaDeMeteoros.filter(
    (chuva) => chuva.declinacao >= 0
);

const chuvasNoSul = chuvaDeMeteoros.filter(
    (chuva) => chuva.declinacao < 0
);

const chuvasNoCentro = chuvaDeMeteoros.filter(
    (chuva) => chuva.declinacao <= 10 && chuva.declinacao >= -10
);

const imprimirChuva = function (chuva) {
    console.log(chuva);
};

console.log("\nChuvas no hemisfério Norte:");
chuvasNoNorte.forEach(imprimirChuva);

console.log("\nChuvas no hemisfério Sul:");
chuvasNoSul.forEach(imprimirChuva);

console.log("\nChuvas no hemisfério Centro:");
chuvasNoCentro.forEach(imprimirChuva);

function ordenaNumerosCres(a, b) {
    return a.declinacao - b.declinacao;
}

let chuvaDeMeteorosOrdenada = chuvaDeMeteoros.sort(ordenaNumerosCres);

const chuvasNoNorteC = chuvaDeMeteorosOrdenada.filter(
    (chuva) => chuva.declinacao >= 0
);

const chuvasNoSulC = chuvaDeMeteorosOrdenada.filter(
    (chuva) => chuva.declinacao < 0
);

const chuvasNoCentroC = chuvaDeMeteorosOrdenada.filter(
    (chuva) => chuva.declinacao <= 10 && chuva.declinacao >= -10
);

console.log("\nChuvas no hemisfério Norte Crescente:");
chuvasNoNorteC.forEach(imprimirChuva);

console.log("\nChuvas no hemisfério Sul Crescente:");
chuvasNoSulC.forEach(imprimirChuva);

console.log("\nChuvas no hemisfério Centro Crescente:");
chuvasNoCentroC.forEach(imprimirChuva);