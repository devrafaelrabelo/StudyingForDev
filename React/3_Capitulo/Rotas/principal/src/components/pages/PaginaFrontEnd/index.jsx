import React from "react";
import Link from "next/link";

import BotaoVoltar from '../../BotaoVoltar';

const PaginaFrontEnd = () => (
  <div>
    <h1>React.js</h1>

    <p>
      React é uma biblioteca JavaScript para a criação de interfaces de usuário e, nesse contexto, uma das tecnologias mais utilizadas pelo mercado. No guia abaixo você aprenderá quais são os pré-requisitos para iniciar no React do jeito certo e como criar as suas primeiras SPAs com ela.
    </p>

    <Link href="https://www.devmedia.com.br/react/"> Guia de React</Link>

    <BotaoVoltar />
  </div>
);

export default PaginaFrontEnd;
