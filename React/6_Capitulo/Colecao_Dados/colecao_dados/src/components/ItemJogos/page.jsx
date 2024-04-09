import xboxLogo from "../../../public/assets/xbox.png";
import playstationLogo from "../../../public/assets/playstation.jpg";
import nintendoLogo from "../../../public/assets/nintendo.jpg";
import styles from "./ItemJogos.module.css";
import Image from 'next/image'

const ItemJogos = ({ nome, plataforma }) => {
  return (
    <div className={styles.card}>
      <div>
        <Image
          src={
            plataforma === "xbox"
              ? xboxLogo
              : plataforma === "playstation"
              ? playstationLogo
              : nintendoLogo
          }
          alt="logo"
        />
      </div>
      <div>
        <p>{nome}</p>
      </div>
    </div>
  );
};

export default ItemJogos;
