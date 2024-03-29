import colecaoChuvasDeMeteoros from '../dados/dados.js'
import printChuvas from '../exibicao/impressao.js';
import { retornData, retornaMes } from '../funcoes/retorno.js';
import entradaDados from 'readline-sync';

export function menuPrincipal() {
    console.log("-------------------- chuva de Meteoros --------------------".toUpperCase());
    console.log("--------------------       Menu        --------------------");
    console.log("1 - Hoje");
    console.log("2 - Futuras | Data Personalizada");
    console.log("3 - X Meses");
    console.log("4 - Hoje | X Meses");
    console.log("5 - Data Personalizadas | X Meses");
    console.log("0 - Finalizar Programa");
    console.log("-----------------------------------------------------------\n");

    return entradaDados.question("Digite a opcao: ")
}

export function menuFinalizar() {
    console.log("\n\n-------------------- chuva de Meteoros --------------------".toUpperCase());
    console.log("------------------  PROGRAMA FINALIZADO  ------------------");
    console.log("ATÉ...");
    console.log("-----------------------------------------------------------");
}

export function menuHoje() {
    console.log("-------------------- chuva de Meteoros --------------------".toUpperCase());
    console.log("--------------------       Menu        --------------------");
    console.log("1 - Hoje");
    let hoje = new Date()
    console.log(`${hoje.toString()}`);
    console.log("-----------------------------------------------------------");

    printChuvas(retornData(colecaoChuvasDeMeteoros, hoje), 0, hoje)

    console.log("-----------------------------------------------------------");
    console.log("-----------------------------------------------------------");
    let continuar = entradaDados.question("0 - Finalizar\n1 - Menu\nOPCAO: ")
    if (continuar == "0") {
        return false;
    } else if (continuar == "1") {
        return true;
    }
}

export function menuData() {
    console.log("-------------------- chuva de Meteoros --------------------".toUpperCase());
    console.log("--------------------       Menu        --------------------");
    console.log("2 - Futuras");
    let date = new Date(entradaDados.question("Digite data = (MM/DD/AAAA): "))
    console.log(`${date.toString()}`);
    console.log("-----------------------------------------------------------");

    printChuvas(retornData(colecaoChuvasDeMeteoros, date), 0, date)

    console.log("-----------------------------------------------------------");
    console.log("-----------------------------------------------------------");

    let continuar = entradaDados.question("0 - Finalizar\n1 - Menu\nOPCAO: ")
    if (continuar == "0") {
        return false;
    } else if (continuar == "1") {
        return true;
    }
}

export function menuXMes() {
    console.log("-------------------- chuva de Meteoros --------------------".toUpperCase());
    console.log("--------------------       Menu        --------------------");
    console.log("3 - X Meses");
    let hoje = new Date()
    console.log(`${hoje.toString()}`);
    let meses = Number(entradaDados.question("No Periodo de quantos meses: "));
    console.log("-----------------------------------------------------------");

    printChuvas(retornaMes(colecaoChuvasDeMeteoros, hoje, meses), 1, hoje)

    console.log("-----------------------------------------------------------");
    console.log("-----------------------------------------------------------");
    let continuar = entradaDados.question("0 - Finalizar\n1 - Menu\nOPCAO: ")
    if (continuar == "0") {
        return false;
    } else if (continuar == "1") {
        return true;
    }
}

export function menuHoje_XMes() {
    console.log("-------------------- chuva de Meteoros --------------------".toUpperCase());
    console.log("--------------------       Menu        --------------------");
    console.log("4 - Hoje | X Meses");
    let hoje = new Date();
    console.log(`${hoje.toString()}`);
    let meses = Number(entradaDados.question("No Periodo de quantos meses: "));
    console.log("-----------------------------------------------------------");

    printChuvas(retornData(colecaoChuvasDeMeteoros, hoje), 0, hoje)

    console.log("-----------------------------------------------------------");

    printChuvas(retornaMes(colecaoChuvasDeMeteoros, hoje, meses), 1, hoje)

    console.log("-----------------------------------------------------------");
    console.log("-----------------------------------------------------------");

    let continuar = entradaDados.question("0 - Finalizar\n1 - Menu\nOPCAO: ")
    if (continuar == "0") {
        return false;
    } else if (continuar == "1") {
        return true;
    }
}

export function menuDate_XMes() {
    console.log("-------------------- chuva de Meteoros --------------------".toUpperCase());
    console.log("--------------------       Menu        --------------------");
    console.log("4 - Data Personalizadas | X Meses");
    let date = new Date(entradaDados.question("Digite data = (MM/DD/AAAA): "))
    console.log(`${date.toString()}`);
    let meses = Number(entradaDados.question("No Periodo de quantos meses: "));
    console.log("-----------------------------------------------------------");

    printChuvas(retornData(colecaoChuvasDeMeteoros, date), 0, date)

    console.log("-----------------------------------------------------------");

    printChuvas(retornaMes(colecaoChuvasDeMeteoros, date, meses), 1, date)
    
    console.log("-----------------------------------------------------------");
    console.log("-----------------------------------------------------------");

    let continuar = entradaDados.question("0 - Finalizar\n1 - Menu\nOPCAO: ")
    if (continuar == "0") {
        return false;
    } else if (continuar == "1") {
        return true;
    }
}