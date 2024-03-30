import styles from './Card.module.css';

export default function Card() {
  return (
    <div className={styles.card}>
      <p>Hello World</p>
      <p>Esse é o nosso primeiro componente</p>
      <p>Componente criado com React.js</p>
    </div>
  );
}
