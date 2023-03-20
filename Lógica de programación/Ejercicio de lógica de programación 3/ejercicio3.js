let n = parseInt(prompt("Ingrese el numero para calcular factorial:"));

while (isNaN(n)) {
    alert("Error: Debe ingresar un número.");
    n = parseFloat(prompt("Ingrese el numero para calcular factorial:"));
}


let fac = 1;
for (let i = 1; i <= n; i++) {
     fac = fac * i;
}

console.log("El factorial es: " + fac);