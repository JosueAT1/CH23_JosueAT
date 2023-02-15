/*Ejercicio 1
Tienes una lista de nombres: var names = ["Maria", "Antony", "Joy", "Juan"]*/

var names = ["Maria", "Antony", "Joy", "Juan"];
console.log(names);

/*Parte 1
Escriba una función para insertar un nombre al final de la lista. Agregue su propio nombre al final de la lista.*/

names.push("Josue");
console.log(names);

/*Parte 2
Escribe una función que tome un nombre y verifique si la lista tiene ese nombre. Debería devolver un booleano - verdadero/falso.*/
var indice = names.indexOf("Josue");
if (indice !== -1) {
    console.log("Verdadero")
} else {
    console.log("Falso")
}
/*parte 3
Escribe una función que tome una lista de nombres. Esta función debería comparar la lista tomada en la nameslista que tiene actualmente. La función debe devolver una matriz con los nombres que están en ambas listas.*/
var names2 = ["Maria", "Leticia", "Joy", "Hugo"];
console.log(names2);
var iguales = 0;
for (let i = 0; i < names.length; i++) {
    for (let j = 0; j < names2.length; j++) {
        if (names[i] == names2[j]) {
            iguales++;
            console.log(names2[j]);
        }

    }
}

/*parte 4
Escriba una función que tome una lista de nombres y devuelva una lista de números enteros con la longitud de los nombres en el mismo orden en que se recibieron. Sugerencia para usar la función de empuje*/

for(let i = 0; i < names.length; i++){
    console.log(names[i].length);
}




/*Ejercicio 2
¿A qué se refieren las siguientes expresiones?*/

console.log(false || (true && false));
console.log (true || (11 + 12));
console.log((31 + 22) || true);
console.log(true && (1 + 7));
console.log(false && (3 + 4));
console.log((1 + 2) && true);
console.log((32 * 4) >= 129);
console.log(false !== !true);
console.log(true === 4);
console.log(false === (847 === '847'));
console.log(false === (887 == '887'));
console.log((!true || (!(100 / 5) === 20) || ((328 / 4) === 82)) || false);


