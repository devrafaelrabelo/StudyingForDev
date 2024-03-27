// Nos Códigos 1 a 3 você pode conferir os códigos utilizados nessa aula.
// Código 1. Arquivo index.js
// import {validaPeso, validaAltura} from './pesoAlturaValidacao.js';
// import {calculaIMC, retornaStatusIMC} from './calculadoraIMC.js';

// let peso = 78;
// let altura = 1.72;

// let verificaPesoValido = validaPeso(peso);
// let verificaAlturaValida = validaAltura(altura);

// if(verificaPesoValido && verificaAlturaValida)
// {
//     let resultado = calculaIMC(peso, altura);
//     let statusIMC = retornaStatusIMC(resultado);

//     console.log("Seu IMC é "+resultado+" e você está "+statusIMC);
// }
// else
// {
//     console.log("Peso e altura devem ser maiores que zero");
// }

// // --------------------------------------------------------------------
// Código 2. Arquivo calculadoraIMC.js

// function calculaIMC(peso, altura)
// {

//     let imc = peso / (altura * altura);
//     return imc;
// }

// function retornaStatusIMC(imc)
// {
//     let status;

//     if(imc < 18.5)
//     {
//         status = 'abaixo do peso';
//     }
//     else if(imc > 18.5 && imc < 24.9)
//     {
//         status = 'peso normal';
//     }
//     else if(imc > 24.9 && imc < 30)
//     {
//         status = 'acima do peso';
//     }
//     else
//     {
//         status = 'obeso';
//     }

//     return status;
// }

// export { calculaIMC, retornaStatusIMC }

// // --------------------------------------------------------------------
// Código 3. Arquivo pesoAlturaValidacao.js


// function validaPeso(peso)
// {
//     let pesoValido = false;

//     if(peso > 0)
//     {
//         pesoValido = true;
//     }

//     return pesoValido;
// }

// function validaAltura(altura)
// {
//     let alturaValida = false;

//     if(altura > 0)
//     {
//         alturaValida = true;
//     }

//     return alturaValida;
// }

// export { validaPeso , validaAltura }

// // --------------------------------------------------------------------
