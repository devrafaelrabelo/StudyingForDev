function filtrarChuvas(chuvas, date) {

  let date_1 = new Date(date);

  let chuvasFiltradas = chuvas.filter((chuva) => {

    let dateInicio = new Date(chuva.inicio + "/" + date_1.getFullYear());
    let dateFim = new Date(chuva.fim + "/" + date_1.getFullYear());

    if (dateInicio > dateFim) {
      dateFim.setFullYear(date_1.getFullYear() + 1);
    }

    if (date_1 >= dateInicio && date_1 <= dateFim) {
      return chuva;
    }
  });

  return chuvasFiltradas;
}

function filtrarChuvas2(chuvas, date) {



  let chuvasFiltradas = chuvas.filter((chuva) => {
    let dateLimite = new Date(date);

    let dateInicio = new Date(chuva.inicio + "/" + date.getFullYear());
    let dateFim = new Date(chuva.fim + "/" + date.getFullYear());

    if (dateInicio > dateFim) {
      dateFim.setFullYear(date.getFullYear() + 1);
    }

    if (date > dateInicio) {
      dateInicio.setFullYear(date.getFullYear() + 1);
    }

    dateLimite.setMonth(date.getMonth() + 2);

    if (date < dateInicio && dateInicio < dateLimite || date < dateFim && dateFim < dateLimite) {
      return chuva;
    }
  });

  return chuvasFiltradas;
}

export { filtrarChuvas, filtrarChuvas2 };