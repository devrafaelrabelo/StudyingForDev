import styles from './Card.module.css';

export default function Card() {
  return (
    <div className={styles.card}>
      <p>Componentes</p>
      <p>Facilita em manter partes menores funcionando corretamente.</p>
      <p>Você pode reutilizá-lo, ou seja, menos código para se escrever.</p>
    </div>
  );
}
