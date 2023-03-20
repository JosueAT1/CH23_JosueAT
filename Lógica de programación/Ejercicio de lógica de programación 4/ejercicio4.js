let n = parseInt(prompt("Hasta que numero de la serie de fibonacci quiere:"));

while (isNaN(n)) {
    alert("Error: Debe ingresar un número.");
    n = parseFloat(prompt("Ingrese el numero para calcular factorial:"));
}

let num1 = 1;
let num2 = 0;
console.log(num2);
console.log(num1);
for (let i = 0; i <= n-3; i++) {
     let fb = num2 + num1;
     console.log(fb);
     num2 = num1;
     num1 = fb;   
}


