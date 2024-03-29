import colecaoChuvasDeMeteoros from './dados/dados.js'
import printChuvas from './exibicao/impressao.js';
import { filtrarChuvas, filtrarChuvas2 } from './funcoes/funcoes.js'

function iniciarApp() {
  console.log("-------------------- chuva de Meteoros --------------------".toUpperCase());
  let date = new Date();

  printChuvas(filtrarChuvas(colecaoChuvasDeMeteoros, date), 0);

  console.log();
  
  printChuvas(filtrarChuvas2(colecaoChuvasDeMeteoros, date), 1);

}

iniciarApp();


