/* 

Que encontramos en el arbol de DOM?

    - Node: Es la uniadad mas basica dentro del documento. Puede ser una etiqueta, un texto dentro de una etiqueta o un comentario, etc.

        <title> NODO
            Manipulacion DOM //es un nodo, pero es hijo del tittle
        </title>

    - Document: Tambien es un nodo, del tipo documento, es el nodo raiz a partir del cual se desarrollan o generan todos los demas nodos.
    
    - Element: son todos aquellos definidos por etiquetas <div>, <img>, <h1>, <p>

    - Atributes: Nodos que dan informacion asociada al tipo de elemento

    - Comentario: Comentarios y otros elementos que estan dentro del html, son considerados nodos.

*/

/* 

Como leer nodos de mi Document Object Model (DOM)

Metodos tradicionales (que se usan en versiones antiguas de JS)

    -document.getElementById (botonSuma)
    -document.getElementByTagName (<button>)
    -document.getElementByClassName (botones)

*/

var elementoID = document.getElementById("botonSuma");
console.log(elementoID);

var elementoEtiqueta = document.getElementsByTagName("button");
console.log(elementoEtiqueta);

console.log("Este es el primer elemento de mi coleccion de botones", elementoEtiqueta);

var elementoClassName = document.getElementsByClassName("botones");
console.log(elementoClassName);


/* 

Metodos recientes

    -document.querySelector(#botonSuma)
    -document.querySelector(.botones)

*/

//var unElemento = document.querySelector("#input");
//console.log(unElemento);

//var variosElementos = document.querySelector(".botones");
//console.log("variosElementos");


/* Construcccion de nuestra calculadora */
var input = document.getElementById("input1");
var input = document.getElementById("input2");

var botonSuma = document.getElementById("botonSuma");
var botonSuma = document.getElementById("botonResta");
var botonSuma = document.getElementById("botonMulti");
var botonSuma = document.getElementById("botonDiv");

var resultado = document.getElementById("resultado");

/* 

Creacion de nodos


    - document.createElement(tipoNodo)

*/

//Creacion de una etiqueta del tipo imagen
var imagenPerrito = document.createElement("img");

//Creanis atibutos a la etiqueta
imagenPerrito.src = "https://www.petdarling.com/wp-content/uploads/2021/01/cachorros.jpg"
imagenPerrito.atl = "Foto de perrito tierno"
imagenPerrito.style.width = "150px";
imagenPerrito.style.borderRadius = "100px"

//Poner elementos o nodos en el html
document.body.append(imagenPerrito);

/* 

Actualizar nodos

    Identidicar el nodo con un metodo para tomarlo (getElement o QuerySelector y modificarlo con innnerHTML)

*/

var resultadoQueCambia = document.getElementById("resultado");

resultadoQueCambia.innerHTML = "Saludos, cambie el texto juas juas"
