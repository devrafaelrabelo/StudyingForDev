import React, { useState } from 'react';
import styles from './PaginaInicial.module.css'

export default function PaginaInicial() {
  const [ numeroAleatorio, setNumeroAleatorio ] = useState(0);
 
  function gerarNumero() {
    const novoNumero = Math.floor(Math.random() * (100-1) + 1);
    setNumeroAleatorio(novoNumero);
  }

  return(
    <div className={styles.conteudo_centralizado}>
      <h3>Número aleatório:</h3>
      <h1>{numeroAleatorio}</h1>

      <div className={styles.area_botao}>
        <label>
          Click no botão abaixo para gerar um número aleatório:
        </label>

        <button className={styles.botao}onClick={gerarNumero}>
          Gerar número
        </button>
      </div>
    </div>
  );
}