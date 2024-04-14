import styles from "./CardAnimal.module.css";
import Image from 'next/image'

import ImagemCachorro from "../../../public/assets/cachorro.jpg";
import ImagemGato from "../../../public/assets/gato.jpg";

export default function CardAnimal({ tipoAnimal }) {
  return (
    <div id="card" className={styles.Card_Animal}>
      <Image src={tipoAnimal === "cachorro" ? ImagemCachorro : ImagemGato} alt="animal" />
    </div>
  );
}