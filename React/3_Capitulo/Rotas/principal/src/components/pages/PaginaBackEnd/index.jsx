import React from "react";

import BotaoVoltar from '../../BotaoVoltar';
import Link from "next/link";

const PaginaBackEnd = () => (
  <div>
    <h1>Node.js</h1>

    <p>
      Node.js é uma tecnologia usada para executar código JavaScript fora do navegador. Com ele podemos construir aplicações web em geral, desde web sites até APIs e microsserviços.
    </p>

    <Link href="https://www.devmedia.com.br/node-js/"> Guia de Node.js</Link>

    <BotaoVoltar />
  </div>
);

export default PaginaBackEnd;