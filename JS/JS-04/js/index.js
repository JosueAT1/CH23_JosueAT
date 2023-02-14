let miVariable = 5;
let miArray = [2, 3, 4, 5, 6, 7];

console.log(miArray[0]);

let miArray1 = [
    [1, 2, 4],
    [4, 5, 6],
    [7, 8, 9]
];

console.log("miArray1 " + miArray1[0][1]);
console.log("miArray1 " + miArray1[0][2]);
console.log("miArray1 " + miArray1[2][1]);
console.log("miArray1 " + miArray1[1][2]);
console.log("miArray1 " + miArray1[1][0]);

console.log("Todo el indice " + miArray1[0]);
console.log("Todo el indice " + miArray1[1]);
console.log("Todo el indice " + miArray1[2]);

/*********************** Ciclo for *********************/

for (let i = 0; i < 10; i++) {
    console.log("Imprimiendo i = " + i);
}

for (let i = 0; i <= 5; i++) {
    console.log("Imprimiendo mi arrary = " + miArray)
}


for (let i = 0; i < 3; i++) {
    for (let j = 0; j < 3; j++) {
        console.log("Este es mi matriz = " + miArray1[i][j]);
    }
}

let matrizR = [
    [], [], []
]

for (let i = 0; i < 3; i++) {
    for (let j = 0; j < 3; j++) {
        matrizR[i][j] = miArray1[i][j] * miArray1[i][j];
    }
}
console.log(matrizR)

/*********************** Ciclo while *********************/

/* 

let variable inicio

while(condicion){

}

*/

let contador = 0;
while(contador <10){
    console.log(contador);
    contador++;
}