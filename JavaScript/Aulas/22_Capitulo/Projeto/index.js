import { menuPrincipal, menuFinalizar, menuHoje, menuData, menuXMes, menuHoje_XMes, menuDate_XMes } from './menu/menu.js';

function iniciarApp() {
  let programaRunning = true;
  do {

    let opcao = Number(menuPrincipal());

    switch (opcao) {
      case 1:
        console.log("Opção 1");
        programaRunning = menuHoje();
        break;
      case 2:
        console.log("Opção 2");
        programaRunning = menuData();
        break;
      case 3:
        console.log("Opção 3");
        programaRunning = menuXMes();
        break;
      case 4:
        console.log("Opção 4");
        programaRunning = menuHoje_XMes();
        break;
      case 5:
        console.log("Opção 5");
        programaRunning = menuDate_XMes();
        break;
      case 0:
        console.log("Opção 0");
        console.log("Finalizar Programa");   
        programaRunning = false;     
        break;
      default:
        console.log("Opção Invalida\n");        
        break;
    }

    if (!programaRunning) {
      menuFinalizar();
    }

  } while (programaRunning);
}

iniciarApp();