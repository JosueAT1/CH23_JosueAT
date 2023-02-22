var numeroAleatorio = Math.floor(Math.random()* 100)+1;

//bucle hasta que el usuario adivinen
numeroAdivinado = parseInt(numeroAdivinado); 

while(true){ 
      var numeroAdivinado = prompt("Adivina el núemro del 1 al 100"); 

if(numeroAdivinado== numeroAleatorio){ 
  alert("Has ganado");
  break;

}else if(numeroAdivinado == 0){
  break;
}
else if(numeroAdivinado > numeroAleatorio){
  alert("Ups, el número secreto es incorrecto, es menor al numero correcto, vuelve a intentarlo." );

}else if(numeroAdivinado < numeroAleatorio){
  
  alert("Ups, el número secreto es incorrecto, es mayor al numero correcto, vuelve a intentarlo.");
}
}