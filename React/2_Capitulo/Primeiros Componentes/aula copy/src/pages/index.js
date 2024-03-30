import Head from "next/head";
import Image from "next/image";
import Link from 'next/link';
import { Inter } from "next/font/google";
import styles from "@/styles/Home.module.css";

import Logo from '../../public/next.svg'
import Card from '@/components/card';
import Topo from '@/components/topo';
import Rodape from "@/components/rodape";

export default function Home() {
  return (
    <>
      <Head>
        <title>Create Next App</title>
        <meta name="description" content="Generated by create next app" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="icon" href="/favicon.ico" />
      </Head>
      <Topo />

      <section className={styles.container}>

        <Card />
        <Card />
        <Card />

        <div>
          <Image className={styles.img_logo}
            src={Logo} alt="logomarca" />
        </div>

        <div>

          <Link className={styles.link_gh}
            href="https://github.com/devrafaelrabelo" > Clique Aqui
          </Link>

        </div>

      </section>

      <Rodape />
    </>
  );
}
