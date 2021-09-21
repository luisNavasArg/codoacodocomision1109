alert("Hola Mundo!")/*Ventana emergente*/
console.log("Estamos en la consola")

let nombre = "Luis Navas";/*tipo string*/
var numero = 10;/*Numerica*/
const PI = 3.1416;
let hayClases=true;
console.log((numero+25)+" "+nombre)/*+ concatenar y sumar*/
console.log(hayClases)
console.log(5 > 3)
let esFeriado=false;
/*Condicionales*/
if(8 >= 8){/*si es verdadera se ejecuta*/
    console.log("es correcto!")
}else{/*se es falso*/
    console.log('No es correcto!')
}
console.log((5 > 3) ? "Es correcto 5 > 3": "No es correcto");/*Ternario*/
if((hayClases == true) && esFeriado != true){/*para que sea true se tienen que cumplir ambas condiciones*/
    console.log('Me conecto a la videollamada!')
}else{
    console.log('No me conecto a la videollamada!')
}
if(25 < 32 || 12 > 20){/*se cumple una de las dos condiciones*/
    console.log('Se cumplió la condición')
}
let saludo = "Hola, cómo estás? "
let saludar = saludo + nombre;

let elemento = document.getElementById("principal");
// console.log(elemento)
elemento.innerHTML="<h1 class='text-center bg-info'>"+ saludar + "</h1>";
document.write("<div class='container'><div class='row' id='principal'><h1 class='text-center bg-info'>"+ saludar + "</h1></div></div>");