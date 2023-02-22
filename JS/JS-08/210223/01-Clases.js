class Persona{
    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    set nombre(nombre){
        this._nombre = nombre; 
    }
    get nombre(){
        return this._nombre;
    }
    set apellido(apellido){
        this._apellido = apellido; 
    }
    get apellido(){
        return this._apellido;
    }
    nombreCompleto(){
        return this._nombre + ' '+ this._apellido;
    }
    /* Sobre escribir el metodo de la clase Padre Object */
    toString(){
        return this.nombreCompleto();
    }
}

class Empleado extends Persona{
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);
        this.departamento = departamento;
    }
    set departamento(departamento){
        this._departamento = departamento; 
    }
    get departamento(){
        return this._departamento;
    }
    /* Sobre Escritura */
    nombreCompleto(){
        return super.nombreCompleto()+ ' , '+this._departamento;
    }
}

let persona1 = new Persona('Arturo', 'Chavez')
console.log(persona1.toString());

let empleado1 = new Empleado('Maria', 'Jimenez', 'Sistemas');
console.log(empleado1)
console.log(empleado1.nombreCompleto());

/* Sobre escritura llamado */
console.log(empleado1.toString());

/* let persona3 = new Persona('Jhonny', 'Deep');
persona3.nombre = 'Juan'
console.log(persona3.nombre)

persona3.apellido = 'Jimenez'
console.log(persona3.apellido);


let persona1 = new Persona('Juan', 'Perez');
console.log(persona1.nombre);
console.log(persona1.apellido);
let persona2 = new Persona('Maria', 'Jimenez');
console.log(persona2); */