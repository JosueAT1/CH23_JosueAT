let celsius = parseFloat(prompt("Ingrese la temperatura en grados Celsius:"));

while (isNaN(celsius)) {
    alert("Error: Debe ingresar un número.");
    celsius = parseFloat(prompt("Ingrese la temperatura en grados Celsius:"));
}

let fahrenheit = (celsius * 9 / 5) + 32;
let kelvin = (celsius + 273.15);

console.log(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit y " + kelvin + " grados Kelvin.");