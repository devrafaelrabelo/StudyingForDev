import {fraseFormatada, painelFormatado } from './formatacao.js';

const printChuvas = (chuva, tipo) => {
    if (chuva.length > 0) {
        if (tipo == 0) {
            console.log(`CHUVAS QUE PODEM SER VISTAS HOJE`);
            painelFormatado();

            chuva.forEach(fraseFormatada);

        } else if (tipo == 1) {
            console.log(`CHUVAS QUE PODEM SER VISTAS NOS PRÓXIMOS 2 MESES`);

            painelFormatado();

            chuva.forEach(fraseFormatada);
        }
    } else {
        console.log(`NENHUMA CHUVA PREVISTA`);
    }
}

export default printChuvas;