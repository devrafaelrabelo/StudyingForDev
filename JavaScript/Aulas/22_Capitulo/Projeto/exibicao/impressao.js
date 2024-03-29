import {fraseFormatada, painelFormatado } from './formatacao.js';

const printChuvas = (chuva, tipo, date) => {
    if (chuva.length > 0) {
        if (tipo == 0) {
            console.log(`CHUVAS QUE PODEM SER VISTAS ${date.toLocaleString().substr(0, 10)}`);
            painelFormatado();

            chuva.forEach(fraseFormatada);

        } else if (tipo == 1) {
            console.log(`CHUVAS QUE PODEM SER VISTAS NOS PRÓXIMOS 2 MESES APOS ${date.toLocaleString().substr(0, 10)}`);

            painelFormatado();

            chuva.forEach(fraseFormatada);
        }
    } else {
        console.log(`NENHUMA CHUVA PREVISTA`);
    }
}

export default printChuvas;