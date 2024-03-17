//Os operadores de comparação são: ==, !=, <, >, <=, >=, === e !==.


console.log( 21 == 21 ); // vai imprimir true
console.log( 120 == 100); // vai imprimir false

console.log( 11 != 21 ); // vai imprimir true
console.log( 100 != 100); // vai imprimir false

console.log(  "20" == 20  ); // true
console.log(  true == 1 ) ; // true


//Operadores de igualdade e desigualdade estrita
//  (===) 
console.log( "21" === 21 ); // o resultado será false
console.log( 1 === true ); // o resultado será false

console.log( "21" !== 21 ); // o resultado será true
console.log( 1 !== true ); // o resultado será true

null == undefined // o resultado será true
null != undefined // o resultado será false

true == 1 // o resultado será true
true != 1 // o resultado será false
false == 0 // o resultado será true
false != 0 // o resultado será false

// ==, !=, <, >, <=, >=, ===, !== comparam dois dados e retorna um valor booleano true ou false.