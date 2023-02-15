/* Ejercicio 1 */
let GPAacumulativo =3;
let Unidadestotales = 100;

if(GPAacumulativo > 2 && Unidadestotales>=120){
    console.log("Puede graduarse");
}else{
    console.log("No puede graduarse");
}

/* Ejercicio 2 */

let cspCalificacion = 75;
let proCalificacion = 70;

if(cspCalificacion >= 75 || proCalificacion >= 75){
    console.log("Eres elegible para graducacion")
}

/* Ejercicio 3 */

let texto = "Hola Mundo"
let msj = "";
let antes = "";

for (let i = 0; i < texto.length; i++) {
    if (msj != "") {
        antes = texto [i-1];
        if (antes != " " && texto [i]!=" "){
            msj += ".";
        }
    }  
    msj += texto[i];
}
console.log(msj);
