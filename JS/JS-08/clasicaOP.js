class OperacionesAritmeticas{
    numero0 = 5;
    numero1 = 0;

    constructor(valor0, valor1){
        this.numero0 = valor0;
        this.numero1 = valor1;
    }

    sumar(){
        return this.numero0 + this.numero1;
    }
}

let obj4 = new OperacionesAritmeticas(8, 6);
console.log(obj4.sumar());


let obj3 = new OperacionesAritmeticas();
obj3.numero0 = 8;
obj3.numero1 = 5;
console.log(obj3.sumar(obj3.numero0, obj3.numero1));



let obj2 = new OperacionesAritmeticas();
console.log(obj2.sumar(5, 6));

/* Instancia
    - Declaracion del objeto
    - Reservar espacio de memoria
    - Invocacion 
*/
let obj1;
obt1 = new OperacionesAritmeticas();
console.log(obt1.numero0)