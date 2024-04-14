import React, { useState } from "react";
import styles from "./PaginaInicial.module.css";

export default function PaginaInicial() {
  const [novoTexto, setNovoTexto] = useState();

  const [corAleatoria, setNovaCor] = useState("#FFF");

  function alterarTexto() {
    setNovoTexto("Hello, World!!");
  }

  function zerarTexto() {
    setNovoTexto("");
  }

  function gerarAleatoria() {
    const corAleatoria = Math.floor(
      Math.random() * (16777215 - 1) + 1
    ).toString(16);
    setNovaCor("#" + corAleatoria);
  }

  function zerarCor() {
    setNovaCor("#FFF");
  }

  return (
    <div className={styles.conteudo_centralizado}>
      <h3>Frase:</h3>

      <div style={{ backgroundColor: `${corAleatoria}` }}>
        <h1>{novoTexto}</h1>
      </div>

      <div className={styles.area_botao}>
        <label>Click no botão abaixo para gerar um número aleatório:</label>

        <div>
          <button className={styles.botao} onClick={alterarTexto}>
            Alterar Texto
          </button>

          <button className={styles.botao} onClick={zerarTexto}>
            Zerar Texto
          </button>
        </div>

        <div>
          <button className={styles.botao} onClick={gerarAleatoria}>
            Cor Aleatoria
          </button>

          <button className={styles.botao} onClick={zerarCor}>
            Cor Padrao
          </button>
        </div>
      </div>
    </div>
  );
}
