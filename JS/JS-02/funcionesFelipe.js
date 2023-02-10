/*Por que son importantes las funciones?
    - Nos permite reutilizar codigo en lugar de escribirlo varias veces. Podemos llamar nuestra funcion en distintos lugares de nuestro programa, y así lo usamos cuando lo necesitamos sin necesidad de escribirlo de nuevo.
    - Nos permite modularizar nuestro codigo, esto es, dividir nuestra aplicacion en partes mas pequeñas e independientes. Así mejoramos el entendimiento y comprensión del código.
    - Mantienen su propio espacio, y las variable que se encuentran dentro de una funcion no se pueden acceder fuera de ella (scope).
    - Por que podemos probar pequeñas partes de nuestro programa de forma aislada. (Debugging)*/

/* Cosas importantes a tener  en cuenta para crear funciones
 
- Nombre que sea descriptivo y evoque al funcionamiento de ese bloque de codigo
- Datos de entrada (parametros)
- Procesos o intrucciones a ejecutar
- Salida (return)

*/

//Funcion directa
function agregarCarritoCompra() {
    //Lo qque hace mi funcion
}

//Invocar funcion
agregarCarritoCompra();

//Funcion anonima
let funcionAnonima = function () {
    let valor1 = 5;
    let valor2 = 7;
    let suma = valor1 + valor2;
    console.log("Esta funcion anonima: " + suma)
}

funcionAnonima();


//Funcion 

function division(parametro1, parametro2) {
    let resultado = parametro1 / parametro2;
    console.log(resultado);
}

division(14, 7);

//Hoisting
//console.log(edad);
//let edad = "30"


/* 
 
Tipos de funciones: 

-Funciones directas - nombre (comunes)
-Funciones anonimas - viven pegadas a una variable o constante
-Funciones como metodos(para esperecificar que hace mi objeto)
-Funciones como constructores (para construir o crear un objeto)

*/

//Funciones flecha

//Sintaxis de una funcion flecha

//funcion directa o normal
/*function suma(a, b) {
    let sum1 = a + b;
    console.log(sum1);
}*/

//Funcion flecha
//const suma = (a, b) => a + b;

//console.log(suma);


//Funcion flecha con mas lineas de codigo
const sumarYMultiplicar = (a, b) => {
    const sum = a + b;
    const result = sum * 2;
    console.log(result);
}


/*

Return

La sentencia return finaliza la ejecucion de la funcion, y especifica un valor para ser devuelto a quien llama a la funcion. O lo que es lo mismo, usamos return para finalizar y tambien para poder asignar el resultado a una variable.



*/

function areaCuadrado(){
    let lado = 5;
    let area = lado * lado;
    console.log("El area de mi cuadrado es " + area);
    return area;
}

areaCuadrado();

let resultadoDeMiFuncion = areaCuadrado();

console.log("El resultado de mi funcion cuadrado es: " + resultadoDeMiFuncion)