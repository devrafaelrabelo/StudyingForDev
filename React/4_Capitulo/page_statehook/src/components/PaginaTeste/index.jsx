import React, { useState } from "react";
import styles from "./PaginaTeste.module.css";

export default function PaginaTeste() {

  function alertarUsuario () {
    const mensagem = 'Atenção!!!';
    alert(mensagem);
  }

  return (
    <div className={styles.conteudo_centralizado}>

      <div className={styles.area_botao}>
        <label>Click no botão abaixo para gerar um número aleatório:</label>

        <button className={styles.botao} onClick={alertarUsuario}>
        Alertar
        </button>
      </div>
    </div>
  );
}
