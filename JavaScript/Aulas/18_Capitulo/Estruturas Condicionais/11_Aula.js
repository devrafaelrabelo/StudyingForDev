var produto = "Smartphone";

switch(produto)
{
    case "Smartphone":
        console.log("Produto: Smartphone");
        break;
    case "TV":
        console.log("Produto: TV");
        break;
    default:
        console.log("Produto inválido");
        break;
}

// ---------------------------------------

produto = "Celular";

switch(produto)
{
    case "Smartphone":
    case "Celular":
    case "Telefone":
        console.log("Produto: Smartphone");
        break;
    case "TV":
        console.log("Produto: TV");
        break;
    default:
        console.log("Produto inválido");
        break;
}

// ---------------------------------------

var data = new Date();

console.log(data);

var mes = data.getMonth();

console.log(mes);

switch(mes)
{
    case 1:
    case 2:
    case 3:
        console.log("Verão");
        break;
    case 4:
    case 5:
    case 6:
        console.log("Outono");
        break;
    case 7:
    case 8:
    case 9:
        console.log("Inverno");
        break;
    case 10:
    case 11:
    case 12:
        console.log("Primavera");
        break;
    default:
        console.log("Mês inválido");
        break;
}