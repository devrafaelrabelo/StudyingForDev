import entradaDados from 'readline-sync';

console.log("escolha uma das alternativas:".toUpperCase());

console.log(`1 - Listar os salários de 2010 à 2020
2 - Listar o índice IPCA (INFLAÇÃO) de 2010 à 2020
3 - Comparação entre o percentual de aumento salarial e a inflação (IPCA)`.toUpperCase());

let opcao;

let salario_array = [
    { salario: 510.00, ano: 2010 },
    { salario: 545.00, ano: 2011 },
    { salario: 622.00, ano: 2012 },
    { salario: 678.00, ano: 2013 },
    { salario: 724.00, ano: 2014 },
    { salario: 788.00, ano: 2015 },
    { salario: 880.00, ano: 2016 },
    { salario: 937.00, ano: 2017 },
    { salario: 954.00, ano: 2018 },
    { salario: 998.00, ano: 2019 },
    { salario: 1045.00, ano: 2020 }
]

let ipca_array = [
    {ipca: 5.91, ano: 2010},	
    {ipca: 6.50, ano: 2011},
    {ipca: 5.84, ano: 2012},
    {ipca: 5.91, ano: 2013},
    {ipca: 6.41, ano: 2014},
    {ipca: 10.67, ano: 2015},
    {ipca: 6.29, ano: 2016},
    {ipca: 2.95, ano: 2017},
    {ipca: 3.75, ano: 2018},
    {ipca: 4.31, ano: 2019},
    {ipca: 4.52, ano: 2020}  
]  


do {

    opcao = Number(entradaDados.question("Digite o numero da sua escolha: "));   

    switch (opcao) {
        case 1:
            for (let salario of salario_array) {
                console.log("Ano: ".padEnd(30, ".") + salario.ano);
                console.log("Salário mínimo: ".padEnd(30, ".") + "R$ " + salario.salario.toFixed(2).replace(".", ","));               
            }
            break;
        case 2:
            for (let ipca of ipca_array) {
                console.log("Ano: ".padEnd(30, ".") + ipca.ano);
                console.log("Inflação IPCA: ".padEnd(30, ".") + String(ipca.ipca).replace(".", ",") + "%");               
            }
            break;
        case 3:
            for (let contador = 0; contador < salario_array.length; contador++) {
                console.log("Ano: ".padEnd(30, ".") + salario_array[contador].ano);
                console.log("Salário mínimo: ".padEnd(30, ".") + "R$ " + String(salario_array[contador].salario.toFixed(2)).replace(".", ","));
                let crescimento;
                if ( contador == 0 ) {
                    crescimento = "-";
                } else {
                    crescimento = (((salario_array[contador].salario - salario_array[contador - 1].salario) / salario_array[contador - 1].salario) * 100).toFixed(2) + "%";
                }
                console.log("Crescimento Salarial: ".padEnd(30, ".") + crescimento);
                console.log("Inflação IPCA: ".padEnd(30, ".") + String(ipca_array[contador].ipca).replace(".", ",") + "%\n");
            }

            break;
        case 0:
            console.log("PROGRAMA ENCERRADO");
            break
        default:
            console.log("Opção invalidade!!");
            break
    }

} while (opcao !== 0);
