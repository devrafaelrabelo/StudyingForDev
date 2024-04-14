import styles from './Topo.module.css'

export default function Topo({ tipoAnimal, setState }) {
  const alterarState = () => {
    tipoAnimal === "cachorro" ? setState("gato") : setState("cachorro");
  };

  return (
    <header className={styles.topo}>
      <h1>Projeto Props + useState</h1>
      <p>Clique no botão para mudar os componentes abaixo</p>
      <button onClick={alterarState}>Mudar Animal</button>
    </header>
  );
}