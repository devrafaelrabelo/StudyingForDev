const frutas = ["Manga", "Laranja","Tangerina","Banana"];

console.log("\nArray antes da ordenação:\n");
console.info(frutas);

frutas.sort();

console.log("\nArray depois da ordenação:\n");
console.info(frutas);
console.log("\n");

// ------------------------------

var numeros = [10,1,2];

console.log("\nArray antes da ordenação:\n");
console.info(numeros);

function ordenaNumerosCres(a, b){
    return a - b;
}

numeros.sort(ordenaNumerosCres);

console.log("\nArray depois da ordenação:\n");
console.info(numeros);
console.log("\n");

// ------------------------------

var numeros = [10,1,2];

console.log("\nArray antes da ordenação:\n");
console.info(numeros);  

function ordenaNumerosDec(a, b){
    return b - a;
}

numeros.sort(ordenaNumerosDec);

console.log("\nArray depois da ordenação:\n");
console.info(numeros);
console.log("\n");

// -----------------------------------------

let tabela = [
    {equipe: 'Time Azul', pontos: 25 },
    {equipe: 'Time Verde', pontos: 47 },
    {equipe: 'Time Amarelo', pontos: 39 },
    {equipe: 'Time Vermelho', pontos: 16 },
];

function ordenaMaisPontos(a, b){
    return a.pontos - b.pontos;
}

tabela.sort(ordenaMaisPontos);

console.log(tabela);

for(let i = 0; i < tabela.length; i++)
{
    let posicao = i+1;
    console.log(posicao+" | "+tabela[i].equipe+" - "+tabela[i].pontos+" pts");
}

for(let index in tabela)
{    
    console.log((Number(index) + 1) +" | "+tabela[index].equipe+" - "+tabela[index].pontos+" pts");
}