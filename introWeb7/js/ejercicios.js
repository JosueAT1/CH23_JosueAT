// Ejercicio 1
let numHoras = parseInt(prompt("Cuantas horas trabajo el empleado: "));
let costeHora = parseInt(prompt("Costo por hora: "))
let pagaTotal = numHoras * costeHora
alert("La paga total del empleado es: " + pagaTotal)

//Ejercicio 2
alert("El resultado de la operacion (3+2)/2*5 es: " + ((3 + 2) / (2 * 5)));

//Ejercicio 3
let pesoLibra = parseFloat(prompt("Digita tu peso en libras: "));
let estCm = parseInt(prompt("Digita tu estatura en centimetros: "));
let pesoKg = pesoLibra * 0.453592;
let estMetro = estCm / 100;

let imc = (pesoKg / (estMetro ** 2));

alert("El imc es: " + imc);

if (imc < 16) {
    alert("Criterio de ingreso")
}
else if (imc >= 16 && imc <= 16.9) {
    alert("Infrapeso")
}
else if (imc > 16.9 && imc <= 18.4) {
    alert("Bajo peso")
}
else if (imc > 18.4 && imc <= 24.9) {
    alert("Peso Normal")
}
else if (imc > 24.9 && imc <= 29.9) {
    alert("Sobrepeso")
}
else if (imc > 29.9 && imc <= 34.9) {
    alert("Obesidad Premorbida")
}
else if (imc > 34.9 && imc <= 45) {
    alert("Obesidad Morbida")
}
else if (imc > 45) {
    alert("Obesidad Hipermorbida!")
}