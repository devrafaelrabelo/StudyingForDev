import { jogosExclusivos } from "../data/dados";

jogosExclusivos.sort((a, b) => {
  const nameA = a.nome.toUpperCase();
  const nameB = b.nome.toUpperCase();
  if (nameA < nameB) {
    return -1;
  }
  if (nameA > nameB) {
    return 1;
  }

  return 0;
});

export const retornarJogos = () => { return jogosExclusivos };

export const buscarJogo = (textoDigitado) => {
  return jogosExclusivos.filter(
    (jogo) =>
      jogo.nome.toLowerCase().includes(textoDigitado.toLowerCase()) ||
      jogo.plataforma.toLowerCase().includes(textoDigitado.toLowerCase())
  );
};

export const filtrarJogo = (plataforma) => {
  return jogosExclusivos.filter((jogo) => jogo.plataforma === plataforma);
};
