let diasSemana = parseInt(prompt("Eligue un numero del 0 al 6: "));

if(diasSemana === 0){

    document.write("El dia es domingo");

}else if(diasSemana === 1){

    document.write("El dia es Lunes");

}else if(diasSemana === 2){

    document.write("El dia es Martes");

}else if(diasSemana === 3){

    document.write("El dia es Miercoles");

}else if(diasSemana === 4){

    document.write("El dia es Jueves");

}else if(diasSemana === 5){

    document.write("El dia es Viernes");

}else if(diasSemana === 6){

    document.write("El dia es Sabado");

}else {
    document.write("Numero de dia invalido");
}