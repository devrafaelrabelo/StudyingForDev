export const filtroData = ((list, date) => {
    let date_1 = new Date(date);

    let dateInicio = new Date(list.inicio + "/" + date_1.getFullYear());
    let dateFim = new Date(list.fim + "/" + date_1.getFullYear());

    if (dateInicio > dateFim) {
        dateFim.setFullYear(date_1.getFullYear() + 1);
    }
    
    return date_1 >= dateInicio && date_1 <= dateFim;

});

export const filtroMes = ((list, date, mes) => {

    let dateLimite = new Date(date);

    let dateInicio = new Date(list.inicio + "/" + date.getFullYear());
    let dateFim = new Date(list.fim + "/" + date.getFullYear());

    if (dateInicio > dateFim) {
        dateFim.setFullYear(date.getFullYear() + 1);
    }

    if (date > dateInicio) {
        dateInicio.setFullYear(date.getFullYear() + 1);
    }

    dateLimite.setMonth(date.getMonth() + mes);

    return date < dateInicio && dateInicio < dateLimite || date < dateFim && dateFim < dateLimite;

});