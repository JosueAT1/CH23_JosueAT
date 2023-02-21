let persona = {
    nombre : 'Juan',
    apeliido : 'Perez',
    nombreCompleto: function(){
        return 'el nombres es ' + this.nombre + ' ' + this.apeliido
    }
}
console.log(persona);
console.log(persona.nombre);
console.log(persona.nombreCompleto());