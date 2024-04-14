import React from "react";
import { Link } from 'react-router-dom';

import styles from './PaginaInicial.module.css';

const PaginaInicial = () => (
  <div>
    <h1>Escolha seu caminho em JavaScript</h1>

    <div className={styles.conteudo_opcoes}>
      <Link className={styles.opcao_front_end} to="/front-end">Front-end</Link>
      <Link className={styles.opcao_back_end} to="/back-end">Back-end</Link>
    </div>

  </div>
);

export default PaginaInicial;