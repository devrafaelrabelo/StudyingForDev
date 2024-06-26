import Head from "next/head";
import Image from "next/image";
import styles from "@/styles/Home.module.css";
import PaginaInicial from "@/components/PaginaInicial";
import PaginaTeste from "@/components/PaginaTeste";


export default function Home() {
  return (
    <>
      <Head>
        <title>Gerador de cores</title>
        <meta name="description" content="Generated by create next app" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="icon" href="/favicon.ico" />
      </Head>
      <main>
        <div className={styles.App}>
          {/* <PaginaInicial /> */}
          <PaginaTeste />
        </div>
      </main>
    </>
  );
}
