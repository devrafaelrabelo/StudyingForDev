import React from 'react';
import styles from './ItemLista.module.css';

export default function ItemLista(props) {
  return (
    <div className = {styles.boxSigno}>
      <div className = {styles.nomeSigno}>
        { props.signo }
      </div>

      <img className = {styles.imagemSigno} src = { props.imagem } alt = { props.signo } />

      <div className={styles.periodoNascimento}>
        { props.dataInicio } - { props.dataFim }
      </div>
    </div>
  )
}