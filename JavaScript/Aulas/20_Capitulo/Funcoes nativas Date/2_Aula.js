// Sem parâmetro: Data atual
const hoje= new Date();
console.log(hoje);

// Com parâmetro: String com a data
const exemplo1 = new Date(  "2024-03-18"  );
console.log(exemplo1);
const exemplo2 = new Date(  "2024-03-18 10:35:00"  );
console.log(exemplo2);

//  Com parâmetro: Um número para ano, mês, dia, hora, minuto, segundo e milissegundo
const exemplo3 = new Date(  1995, 2, 29, 5, 50, 0, 0  );
console.log(exemplo3);