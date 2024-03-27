function converteCelsiusParaFahrenheit(celsius)
{
    let fahrenheit;

    fahrenheit = (celsius * 1.8) + 32;

    return fahrenheit;
}

function retornaStatusTemperaturaFahrenheit(fahrenheit)
{
    let status;

    if(fahrenheit >= 99)
    {
        status = 'Temperatura alta';
    }
    else
    {
        status = 'Temperatura normal';
    }

    return status;
}

let celsius = 25;

let resultado = converteCelsiusParaFahrenheit(celsius);
let statusResultado = retornaStatusTemperaturaFahrenheit(resultado);

console.log(resultado+'ºF');
console.log(statusResultado);

// -------------------------------------------------
/***
Nos Códigos 2 a 4 você pode conferir nosso código dividido em três arquivos.

import converteCelsiusParaFahrenheit from './converteTemperatura.js';
import retornaStatusTemperaturaFahrenheit from './statusTemperatura.js';

let celsius = 25;

let resultado = converteCelsiusParaFahrenheit(celsius);
let statusResultado = retornaStatusTemperaturaFahrenheit(resultado);

console.log(resultado+'ºF');
console.log(statusResultado);

Código 2. Código do arquivo index.js
function converteCelsiusParaFahrenheit(celsius)
{
    let fahrenheit;

    fahrenheit = (celsius * 1.8) + 32;

    return fahrenheit;
}

export default converteCelsiusParaFahrenheit;

Código 3. Código do arquivo converteTemperatura.js
function retornaStatusTemperaturaFahrenheit(fahrenheit)
{
    let status;

    if(fahrenheit >= 99)
    {
        status = 'Temperatura alta';
    }
    else
    {
        status = 'Temperatura normal';
    }

    return status;
}

export default retornaStatusTemperaturaFahrenheit; 
 */
