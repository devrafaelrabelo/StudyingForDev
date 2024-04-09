import Image from "next/image";
import styles from "./page.module.css";

import ListaDeJogosExclusivos from "@/components/ListaDeJogosExclusivos/page";

export default function Home() {
  return (
    <>
      <ListaDeJogosExclusivos />
    </>
  );
}
