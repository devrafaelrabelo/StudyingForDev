'use client'
import React, { useState } from "react";
import Image from "next/image";
import styles from "./page.module.css";

import CardAnimal from "@/components/CardAnimal/page";
import CardInformacoes from "@/components/CardInformacoes/page";
import Topo from "@/components/Topo/page";

export default function Home() {
  const [tipoDoComponenteCard, setTipoDoComponenteCard] = useState("cachorro");

  return (
    <div className={styles.App}>
      <Topo tipoAnimal={tipoDoComponenteCard} setState={setTipoDoComponenteCard} />
      <CardAnimal tipoAnimal={tipoDoComponenteCard} />
      <CardInformacoes tipoAnimal={tipoDoComponenteCard} />
    </div>

  );
}
