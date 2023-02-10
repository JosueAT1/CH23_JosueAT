/*
Control de flujo

if (condicion){

    Bloque de codigo

}else

*/

let edad = parseInt(prompt("Escribe tu edad: "));

if(edad <= 17){

    document.write("<h2>Tas chiquitin</h2>");

}else if (edad === 18){

    document.write("<h2>Eres mayor de edad</h2>");

}else if (edad > 18){

    document.write("<h2>Tas ruco</h2>");

}else {
    document.write("<h2>Esto no es un numero valido</h2>");
}