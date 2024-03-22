// const escolherFruta = (colecao_fruta) => {
//     return colecao_fruta[Math.floor(Math.random() * colecao_fruta.length)].toLowerCase();
// }

// const mutarFruta = (fruta) => {
//     let frutaMutada = "_".repeat(fruta.length);
//     return frutaMutada.toLowerCase();
// }

// const app = (frutaMutada, fruta, letra) => {
//     let certo = 0;
//     for (let index in fruta) {
//         if (fruta[index] == letra) {
//             frutaMutada[index] = letra;                     
//             certo += 1;
//         } 
//     }
//     return certo;
// }

// function validarLetraDigitada(letraDigitada){
//     if(letraDigitada.length === 1 && letraDigitada.match(/[a-z]/)){
//       return true
//     } else {
//       return false
//     }
//   }

// export  {escolherFruta, app, mutarFruta, validarLetraDigitada};


// ----------------------------------------------------------- CODIGO PROFESSOR

// Função que atualiza a palavra oculta
function atualizarPalavraOculta(palavraOculta, letraDigitada, palavraEscolhida) {
  let palavraOcultaArray = palavraOculta.split('') // converte a palavra oculta em um array de caracteres

  for (let i = 0; i < palavraEscolhida.length; i++) { // loop que continua até o tamanho final da palavra escolhida
    if (palavraEscolhida[i] === letraDigitada) { // Verifica se cada letra da palavra escolhida e igual a letra digitada
      palavraOcultaArray[i] = letraDigitada // substitui a letra na posição i
    }
  }

  return palavraOcultaArray.join('') // Retorna o array de caracteres convertido em uma string
}

// Função verifica se a letra digitada é um caractere único e alfabético
function validarLetraDigitada(letraDigitada){
  if(letraDigitada.length === 1 && letraDigitada.match(/[a-z]/)){
    return true
  } else {
    return false
  }
}

function verificarJogoGanho(palavraOculta, palavraEscolhida) {
  if(palavraOculta === palavraEscolhida) {
    return true
  } else {
    return false
  }
}


// Função verifica se a letra digitada encontra-se na palavra escolhida
function verificarLetraPresenteNaPalavra(palavraEscolhida, letraDigitada){
  if(palavraEscolhida.includes(letraDigitada)){
    return true
  } else {
    return false
  }
}


function jogadasRestantes(erros) {
  return 4 - erros
}

// Função verifica se o status do jogo e imprime uma mensagem informando se o jogo terminou em vitoria ou derrota
function exibirMensagemFimDeJogo(statusJogo) {
  if (statusJogo === 'venceu') {
    console.log("\n--------------VOCÊ VENCEU!!-------------");
  } else {
    console.log("\n--------------VOCÊ PERDEU!!-------------");
  }
}

export {
  validarLetraDigitada,
  verificarJogoGanho,
  verificarLetraPresenteNaPalavra,
  jogadasRestantes,
  atualizarPalavraOculta,
  exibirMensagemFimDeJogo
};