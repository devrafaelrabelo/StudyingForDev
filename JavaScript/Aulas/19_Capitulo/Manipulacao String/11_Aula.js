let paises_string = "Brasil Espanha Canadá Irlanda Suíça";

let paises_array = paises_string.split(" ");

console.log(paises_array); // (5) ["Brasil", "Espanha", "Canadá", "Irlanda", "Suíça"]

// -----------------------------------------

let cores_string = "vermelho,azul,branco,cinza,roxo";

let cores_array = cores_string.split(",");

console.log(cores_array); // (5) ["vermelho", "azul", "branco", "cinza", "roxo"]

// -----------------------------------------

let nome_completo = "Ana Mendes da Silva";

let array = nome_completo.split(" ");

let nome = array[0];

console.log("Olá " + nome + ", seja bem vindo(a)"); // Olá Ana, seja bem vindo(a)