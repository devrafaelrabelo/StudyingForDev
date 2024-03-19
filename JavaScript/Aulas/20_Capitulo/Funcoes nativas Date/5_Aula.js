const dataAtual = new Date();

console.log(dataAtual.toDateString());
console.log(dataAtual.toTimeString());
console.log(dataAtual.toString());
console.log(dataAtual.toISOString());

console.log(dataAtual.toLocaleDateString());
console.log(dataAtual.toLocaleTimeString());
console.log(dataAtual.toLocaleString());

const options = {
    weekday: 'long',
    year: 'numeric',
    month: 'long',
    day: 'numeric',
    hour: '2-digit',
    minute: '2-digit',
    second: '2-digit'
}


console.log(dataAtual.toLocaleDateString('en-US', options));

console.log(dataAtual.toLocaleDateString('es', options));

console.log(dataAtual.toLocaleDateString('pt-BR', options));

console.log(dataAtual.toLocaleDateString('pt-PT', options));

// -------------------------------

console.log(dataAtual.toLocaleString('en-US', options));

console.log(dataAtual.toLocaleString('es', options));

console.log(dataAtual.toLocaleString('pt-BR', options));

console.log(dataAtual.toLocaleString('pt-PT', options));

// -------------------------------

console.log(dataAtual.toLocaleTimeString('en-US', ));

console.log(dataAtual.toLocaleTimeString('es', options));

console.log(dataAtual.toLocaleTimeString('pt-BR', options));

console.log(dataAtual.toLocaleTimeString('pt-PT', options));

// ---------------------------------------

console.log(" ---------------------- Segunda Parte ---------------------\n")

var personalizandoData =  {
    weekday: 'long', // segunda-feira
    weekday: 'short', // seg.
    weekday: 'narrow', // S

    month: "numeric", // 2
    month: "2-digit", // 02
    month: "long", // Março
    month: "short", // Mar
    month: "narrow", // M

    year: 'numeric', // 2020
    year: '2-digit', // 20

    day: 'numeric', // 1
    day: '2-digit', // 01
  };
  console.log(dataAtual.toLocaleDateString('pt-BR', personalizandoData));

  var personalizandoTempo = {
    hour: 'numeric', // 1
    hour: '2-digit', // 01,

    minute: 'numeric', // 1
    minute: '2-digit', // 01,

    second: 'numeric', // 1
    second: '2-digit', // 01,
  }
  console.log( dataAtual.toLocaleTimeString('pt-BR', personalizandoTempo) );

  var personalizandoDataTempo = {
    dateStyle: "full", // segunda-feira, 9 de novembro de 2020
    dateStyle: "long", // 9 de novembro de 2020
    dateStyle: "medium", // 9 de nov. de 2020
    dateStyle: "short", // 09/11/2020

    timeStyle: "full", // 01:05:09 Horário Padrão de Brasília
    timeStyle: "long", // 01:05:09 BRT
    timeStyle: "medium", // 01:05:09
    timeStyle: "short", // 01:05
  }
  console.log( dataAtual.toLocaleString('pt-BR', personalizandoDataTempo) );

  
// ---------------------------------------

console.log(" ---------------------- Segunda Parte ---------------------\n")


var personalizandoData =  {
    weekday: 'long', // segunda-feira
    month: "2-digit", // 02
    year: '2-digit', // 20
    day: '2-digit', // 01
  };
  console.log(dataAtual.toLocaleDateString('pt-BR', personalizandoData));
  // segunda-feira, 09/11/20

  var personalizandoTempo = {
    hour: 'numeric', // 01
    minute: 'numeric', // 05
    second: 'numeric', // 09
  }
  console.log( dataAtual.toLocaleTimeString('pt-BR', personalizandoTempo) );
  // 01:05:09

  var personalizandoDataTempo = {
    dateStyle: "medium", // 9 de nov. de 2020
    timeStyle: "short", // 01:05
  }
  console.log( dataAtual.toLocaleString('pt-BR', personalizandoDataTempo) );
  // 9 de nov. de 2020 01:05

  var MesAno = {
      month: "numeric",
      year: 'numeric',
  }
  console.log( dataAtual.toLocaleString('pt-BR', MesAno) );
  //  11/2020

  var SemanaHora = {
    weekday: "long",
    hour: 'numeric',
    minute: 'numeric',
  }
  console.log( dataAtual.toLocaleString('pt-BR', SemanaHora) );
  // Wednesday 2:45 PM