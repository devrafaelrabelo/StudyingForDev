var disciplinas = [
    "Português",    // índice 0
    "Matemática",   // índice 1
    "História",     // índice 2
    "Geografia",    // índice 3
    "Química",      // índice 4
    "Física",       // índice 5
    "Inglês"        // índice 6
];

disciplinas[6] = "Francês";

console.log(disciplinas);

// ['Português', 'Matemática', 'História', 'Geografia', 'Química', 'Física', 'Francês']

// ------------------------------------------------------------------

var funcionarios = [
    "Bárbara",
    "Carlos",
    "Helena",
    "Maria",
    "Rogério"
];

console.log(funcionarios);

// [ 'Bárbara', 'Carlos', 'Helena', 'Maria', 'Rogério' ]

var novos_funcionarios = [
    "Guilherme",
    "Jéssica"
];

funcionarios[0] = novos_funcionarios[1];
funcionarios[4] = novos_funcionarios[0];

console.log(funcionarios);

// [ 'Jéssica', 'Carlos', 'Helena', 'Maria', 'Guilherme' ]