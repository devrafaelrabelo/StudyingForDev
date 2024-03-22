// import entradaDados from 'readline-sync'
// import listaDeFrutas from './dados/dados.js'
// import { escolherFruta, app, mutarFruta, validarLetraDigitada } from './funcoes/funcoes.js'

// function iniciarApp() {

//     const fruta = escolherFruta(listaDeFrutas);
//     let frutaMutada = mutarFruta(fruta).split("");

//     console.log("-------- JOGO DA FORCA --------");
//     console.log("Adivinhe o nome da fruta com " + "fruta.length" + " letras");

//     let vidas = 3;
//     let acertos = 0;

//     do {

//         console.log("Fruta: " + frutaMutada.join(""));
//         console.log("Vida: " + vidas);
//         let letra = entradaDados.question("Digite uma letra: ")

//         if (!validarLetraDigitada(letra)) {
//             console.log("Por favor, digite uma letra válida.");
//             continue;
//         }

//         if (!app(frutaMutada, fruta, letra, acertos)) {
//             vidas--;
//             console.log("-1 vida");
//         }

//         if (frutaMutada.join("") == fruta) {
//             console.log("Acertou todas as letras");
//             break;
//         } else if (vidas < 0) {
//             console.log("Vidas Acabaram");
//             break;
//         }

//     } while (true);


// }

// iniciarApp();

// ----------------------------------------------------------- CODIGO PROFESSOR

import entradaDados from "readline-sync";
import listaDeFrutas from "./dados/dados.js";
import {
  validarLetraDigitada,
  verificarJogoGanho,
  verificarLetraPresenteNaPalavra,
  jogadasRestantes,
  atualizarPalavraOculta,
  exibirMensagemFimDeJogo,
} from "./funcoes/funcoes.js";

function jogarForca() { // Função principal do jogo

  // Escolhe aleatoriamente uma palavra da lista
  const palavraEscolhida = listaDeFrutas[Math.floor(Math.random() * listaDeFrutas.length)];

  // Oculta a palavra escolhida com 'underlines' deixando visivel somente a letra inicial
  let primeiraLetra = palavraEscolhida[0]
  let underline = "_".repeat(palavraEscolhida.length - 1)
  let palavraOculta = primeiraLetra + underline

  let erros = 0;
  let statusJogo = 'andamento' // Jogo inicia com o status 'andamento'

  console.log(`------------JOGO DA FORCA------------`);
  console.log(`\nNome da fruta com ${palavraEscolhida.length} letras:`);

  while (statusJogo === 'andamento') { // Loop continua enquanto o status do jogo estiver em 'andamento'

    console.log(`\nFruta: ${palavraOculta}`);

    // Recebe a letra digitada pelo usuário aceitando tanto maiuscula quanto minuscula
    const letraDigitada = entradaDados.question("Digite uma letra: ").toLowerCase();

    if (validarLetraDigitada(letraDigitada)) {
      if (verificarLetraPresenteNaPalavra(palavraEscolhida, letraDigitada)) {
        palavraOculta = atualizarPalavraOculta(palavraOculta, letraDigitada, palavraEscolhida);
        if (verificarJogoGanho(palavraOculta, palavraEscolhida)) {
          statusJogo = 'venceu'
        }
      } else {
        erros++

        const chances = jogadasRestantes(erros)

        if(chances > 0) { //
          console.log(`OPÇÃO ERRADA! Você ainda tem ${chances} chance(s)!`);
        } else {
          statusJogo = 'perdeu' // Atualiza o status do jogo para 'perdeu' em caso de erros igual a 4
        }
      }
    } else {
      console.log("\nPor favor, digite uma letra válida.");
    }
  }
  // Consumindo função que exibe uma mensagem de vitoria ou derrota
  exibirMensagemFimDeJogo(statusJogo);

}

jogarForca(); // Inicia o jogo