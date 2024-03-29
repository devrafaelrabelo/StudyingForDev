import {filtroData, filtroMes} from './filtro.js'

export function retornData(list, date) {

  let chuvasFiltradasDia = list.filter((chuva) => filtroData(chuva, date));

  return chuvasFiltradasDia;
}

export function retornaMes(list, date, mes) {

  let chuvasFiltradasMes = list.filter((chuva) => filtroMes(chuva, date, mes)) 

  return chuvasFiltradasMes;
}

