'use client'
import styles from "./ListaDeJogosExclusivos.module.css";
import Lupa from "../../../public/assets/lupa.png";
import Image from 'next/image'
import React, { useState } from "react";
import { filtrarJogo, buscarJogo, retornarJogos } from "@/service/index";
import ItemJogos from "../ItemJogos/page";

const ListaDeJogosExclusivos = () => {
  const [listaJogos, setListaJogos] = useState(retornarJogos());
  const [textoBusca, setTextoBusca] = useState("");

  const handleFiltrarJogoPlataforma = (plataforma) => {
    setListaJogos(filtrarJogo(plataforma));    
    setTextoBusca("");    
  };

  const handleLimparFiltro = () => {
    setListaJogos(retornarJogos());
    setTextoBusca("");
  };

  const handleBuscarJogo = (textoDigitado) => {
    setTextoBusca(textoDigitado);
    setListaJogos(buscarJogo(textoDigitado));
  };

  return (
    <div className={styles.container_principal}>
      <h2>Lista de Jogos Exclusivos</h2>
      <div className={styles.container_btns}>
        <button onClick={() => handleFiltrarJogoPlataforma("xbox")}>
          XBOX
        </button>
        <button onClick={() => handleFiltrarJogoPlataforma("playstation")}>
          PlayStation
        </button>
        <button onClick={() => handleFiltrarJogoPlataforma("nintendo")}>
          Nintendo
        </button>
        <button onClick={() => handleLimparFiltro()}>Limpar Filtro</button>
      </div>
      <div className={styles.container_input}>
        <Image src={Lupa} alt="ícone" />
        <input
          type="text"
          value={textoBusca}
          onChange={(event) => handleBuscarJogo(event.target.value)}
          placeholder="Pesquise um jogo ou plataforma"
        />
      </div>
      <div className={styles.container_jogos}>
        {listaJogos.map((jogo) => (
          <ItemJogos
            key={jogo.id}
            nome={jogo.nome}
            plataforma={jogo.plataforma}
          />
        ))}
      </div>
    </div>
  );
};

export default ListaDeJogosExclusivos;