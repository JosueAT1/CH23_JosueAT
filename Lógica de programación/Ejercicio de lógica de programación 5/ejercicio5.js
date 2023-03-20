let numeroSecreto=parseInt(prompt("Escoge un numero secreto: "));
let num1=parseInt(prompt("Adivina en que numero estoy pensando del 1 al 100: "));
let isNum=Number.isInteger(num1);
let i = 0;

while(isNum===false){
    if(isNum===false && Number.isInteger(num1)===false){
        alert("El valor introducido no es un numero, intenta otra vez");
    }
    num1=parseInt(prompt("Adivina en que numero estoy pensando del 1 al 100: "));
    isNum=Number.isInteger(num1);
    if(isNum===true){
        if(num1!=numeroSecreto){
            alert("Ups, el número secreto es incorrecto, vuelve a intentarlo.")
            i++;
            isNum=false;
        }
        else{
            alert("Felicidades, adivinaste el número secreto")
            isNum=true;
            }
    }
}
while(isNum===true){
    if(num1!=numeroSecreto){
        alert("Ups, el número secreto es incorrecto, vuelve a intentarlo.")
        num1=parseInt(prompt("Adivina en que numero estoy pensando del 1 al 100: "));
        i++;
        isNum=true;
    }
    else{
        alert("Felicidades, adivinaste el número secreto")
        isNum=false;
        }
}

let msj=document.getElementById("mensaje");
document.write("Este fue el numero secreto "+ numeroSecreto + " y el numero de intentos fue de: " + i);