'use client'
import React from "react";
import styles from "./page.module.css";

import Rotas from "@/Rotas";
import PaginaBackEnd from "@/components/pages/PaginaBackEnd";

export default function Home() {
  return (
    <>
      <div className={styles.App}>            

        <Rotas />
        
      </div>

    </>
  );
}
