alert("cohorte 23");
console.log("Hola, buen dia");
alert("Dia del gatito");
console.log("Adios");

/* setTimeout(
    function(){
        console.log("Hola mundo, con retraso");
    },1000
)
console.log("Sorpresa"); */

const myCallBack = () => console.log("Hola mundo con retraso");
setTimeout(myCallBack,1000);
console.log("sorpresa");