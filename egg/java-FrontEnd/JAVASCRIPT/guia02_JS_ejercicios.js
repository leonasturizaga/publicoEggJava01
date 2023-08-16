// ejercicio 01
// 1. Escribir un algoritmo en el cual se consulte al usuario que ingrese ¿cómo está el día de
// hoy? (soleado, nublado, lloviendo). A continuación, mostrar por pantalla un mensaje que
// indique “El día de hoy está ...”, completando el mensaje con el dato que ingresó el usuario.

// var num01 = prompt("¿cómo está el día de hoy? \n 1) soleado, 2) nublado, 3) lloviendo");
// let array01 = ["soleado", "nublado", "lloviendo"];
// console.log("El día de hoy está " + array01[num01-1]);
// console.log(`El día de hoy está ${array01[num01-1]}` ); //lo mismo con template

// ejercicio 02
// 2. Conocido el número en matemática PI π, pedir al usuario que ingrese el valor del radio
// de una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que
// para calcular el área y el perímetro se utilizan las siguientes fórmulas:
// area = PI * radio2
// perimetro = 2 * PI * radio
// const PI2 = 3.141592653589793;
// var num02 = prompt("Ingrese el radio de la circunferencia");
// console.log(`El area de la circunferencia es: ${PI2 * Math.pow(num02,2)}`);
// console.log("area con PI interno: " + Math.PI*Math.pow(num02,2));
// console.log(`El perimetro de la circunferencia es: ${2 * Math.PI * num02}`);

// 3. Escriba un programa en donde se pida la edad del usuario. Si el usuario es mayor de
// edad se debe mostrar un mensaje indicándolo.
// let num03=prompt("ingrese su edad");
// let mayor = 21;

// function compare(num03, mayor){
//     if(num03 < mayor) return console.log("No es mayor de edad")
// };
// console.log(compare(num03,mayor));
// if(num03 >= mayor) {
//     console.log("es mayor de edad");
// };

// 4. Realiza un programa que sólo permita introducir los caracteres ‘S’ y ‘N’. Si el usuario
// ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla
// que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”

// do{
//     var var04 = prompt("ingroduzca una letra");
//     var04 = var04.toUpperCase();
//     if(var04 != "0"){
//         if(var04=="N" || var04=="S"){
//             console.log("correcto: " + var04);
//         } else {
//             console.log("incorrecto: " + var04);
//         }
//     }

// }while(var04 != 0);

// 5. Construir un programa que simule un menú de opciones para realizar las cuatro
// operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
// numéricos enteros. El usuario, además, debe especificar la operación con el primer
// carácter de la operación que desea realizar: ‘S' o ‘s’ para la suma, ‘R’ o ‘r’ para la resta, ‘M’
// o ‘m’ para la multiplicación y ‘D’ o ‘d’ para la división.

// var var05a=parseInt(prompt("ingrese numero 1"));
// var var05b=parseInt(prompt("ingrese numero 2"));
// do{
//     var ope = prompt("ingrese operacion a realizar")
//     console.log(menu);
//     ope = ope.toUpperCase();
//     if(ope != 0) {
//         console.log(operacion(var05a,var05b));
//     }
// }while(ope !=0);

// function menu(){
//     console.log("****************************");
//         console.log("S) Suma");
//         console.log("R) Resta");
//         console.log("M) Multiplicacion");
//         console.log("D) Division");
//         console.log("0) Salir");
//     console.log("****************************");
// }
// function operacion(){
//     switch(ope){
//         case 'S':
//             console.log(`la suma es: ${(var05a + var05b)}`);
//             console.log("la suma es: " + (var05a+var05b));
//             break;
//         case 'R':
//             console.log(`la resta es: ${var05a - var05b}`);
//             break;
//         case 'M':
//             console.log(`la multiplicacion es: ${var05a * var05b}`);
//             break;
//         case 'D':
//             if(var05b == 0){
//                 console.log("el resultado es infinito, division por cero");
//             }else{
//                 console.log(`la division es: ${var05a / var05b}`);
//             }
//         break;
//         default:
//             console.log("ingrese una opcion valida");
//     }
// }

// 6. Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar.
// En caso de que el valor ingresado sea 0, se debe mostrar “el número no es par ni impar”.
// do{
//     var var06 = parseInt(prompt("ingrese un numero entero"));
//     if(var06 !=0){
//         let numeroEs = (var06%2 == 0) ? "numero par" : "numero impar";
//         console.log(numeroEs);
//     }else{
//         console.log("el número no es par ni impar");
//     }
// }while(var06!=0);

// 7. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
// solicite números al usuario hasta que la suma de los números introducidos supere el
// límite inicial.
// var var07 = parseInt(Math.random()*99);
// console.log("limite: " + var07);
// var suma07 = 0;
// do {
//     let aux=parseInt(prompt("ingrese un numero para sumar"));
//     suma07 = suma07 + aux;
//     console.log("suma: " + suma07)
// } while (var07>suma07);

// 8. Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
// programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
// todos ellos.
// var var08;
// var max08=0;
// var min08=0;
// var suma08=0;
// var cont08=0;
// do {
//     let aux=parseInt(prompt("ingrese un numero"));
//     var08=aux;
//     if (max08==0 & min08==0) {
//         max08=aux;
//         min08=aux;
//         suma08=suma08+aux;
//         cont08++;
//     } else {
//         if (aux!=0) {
//             if(aux>max08){
//                 max08=aux;
//             }
//             if(aux<min08){
//                 min08=aux;
//             }
//             suma08=suma08+aux;
//             cont08++;
//         }
//     }
// } while (var08 != 0);
// console.log(mostrarResultados(max08,min08,suma08,cont08));

// function mostrarResultados(max08,min08,suma08,cont08){
//     console.log("Maximo: " + max08);
//     console.log("Minimo: " + min08);
//     console.log("Promedio: " + suma08/cont08);
// }

// 9. Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
// espacio entre cada letra. La frase se mostrara así: H o l a. Nota: recordar el
// funcionamiento de la función Substring().
// var var09 = prompt("Ingrese una frase");
// var arrVar09 = var09.split("");
// console.log(JSON.stringify(arrVar09));

// var var09a = "";
// var var09b = "";
// var var09c = "";
// var aux2 = 0;
// for (let aux1 in var09) {
//   var09a = var09a + var09.substring(aux1, aux2 + 1) + " ";
//   //console.log(aux + ": " + var09.substring(aux, (aux2+1)) + " - " + var09.charAt(aux));
//   aux2++;
// }
// console.log("con substring(): " + var09a);

// aux2 = 0;
// for (let aux1 in var09) {
//   var09b = var09b + var09.charAt(aux1) + " ";
// }
// console.log("con charAt(): " + var09b);

// for (let dato of arrVar09) {
//   var09c = var09c + dato + " ";
// }
// console.log("con for of: " + var09c);

// 10. Escribir una función flecha que reciba una palabra y la devuelva al revés.
var var10=prompt("escriba una palabra");
var var10f="";
var a = var10.split("").reverse();
console.log(a);
function invertir (a,var10f){
    for(let i=0; i<a.length; i++){
        var10f=var10f + a[i];
        console.log(var10f);        
    }
    return var10f;
}
console.log("resultado metodo funcion con array a: " + invertir(a,var10f));

console.log("metodo flecha: " + var10f);
let var10r = (b,var10f) => {for(let i=0; i<b.length; i++){ var10f=var10f + b[i];} return var10f;};
console.log("resultado metodo flecha con array b: " + var10r(var10.split("").reverse(),var10f));


// var var10s = var10.split("");
// var var10r = var10s.reverse();
// console.log(var10r);
// var var10f="";
// rev(var10r);
// function rev(var10r){
//     for (let i in var10) {
//         var10f = var10f + var10.charAt(var10.length -1 - i);
//     }
//     console.log(var10f);
// } 
// var invertir = (var10.split("").reverse()) => ; // => var10r.length
// let resp = (invertir) => {for(let i=0; i< invertir.length; i++){ console.log(invertir[i]);} 

// }
// console.log("con funcion flecha: " + invertir);
// console.log("con funcion resp: " + resp());

// let rev = (var10s) => var10s.forEach(element => {
//     console.log(var10.charAt(var10.length))
// });

// let frutas = ["Manzana", "Naranja", "Uva"];
// for (let i = 0; i < frutas.length; i++) {
//   console.log(frutas[i]);
// }
// //array.forEach(function (valorActual, indice, frutas) {}, thisValor);
// let valorActual;
// let indice;
// frutas.forEach(mostrarElementosArray);
// function mostrarElementosArray(elemento, indice, array) {
//   console.log("a[" + indice + "] = " + elemento);
// }

// for (let fruta of frutas) {
//   console.log(fruta); // ["Manzana", "Naranja", "Uva"];
// }
// var empleado1 ={
//     nom: "nom1",
//     ape: "ape1",
// }
// var empleado2 ={
//     nom: "nom2",
//     ape: "ape2",
// }
// var empleados = [empleado1,empleado2];
// for (let empleado of empleados) {
//   for (let dato in empleado) {
//     console.log(empleado[dato]);
//   }
// }

// 11. Escribir una función que reciba un String y devuelva la palabra más larga.
// String Ejemplo: “Guia de JavaScript”
// Resultado esperado : “JavaScript”

// 12. Escribir una función flecha de JavaScript que reciba un argumento y retorne el tipo de
// dato.

// 13. Crear un objeto persona, con las propiedades nombre, edad, sexo ('H' hombre, 'M' mujer,
// 'O' otro), peso y altura. A continuación, muestre las propiedades del objeto JavaScript.
// 14. Crear un objeto libro que contenga las siguientes propiedades: ISBN, Título, Autor,
// Número de páginas. Crear un método para cargar un libro pidiendo los datos al usuario
// y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
// numero de páginas.
// 15. Escribe un programa JavaScript para calcular el área y el perímetro de un objeto Círculo
// con la propiedad radio. Nota: Cree dos métodos para calcular el área y el perímetro. El
// radio del círculo lo proporcionará el usuario.
// 16. Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios
// y los muestre por pantalla.
// 17. Realizar un programa que elimine los dos últimos elementos de un array. Mostrar el
// resultado
// 18. A partir del siguiente array: var valores = [true, 5, false, "hola", "adios", 2]:
// a) Determinar cual de los dos elementos de texto es mayor
// b) Utilizando exclusivamente los dos valores booleanos del array, determinar los
// operadores necesarios para obtener un resultado true y otro resultado false
// c) Determinar el resultado de las cinco operaciones matemáticas realizadas con los
// dos elementos numéricos
// 19. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
// de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
// programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
// Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
// ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
// 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado
// de 20.
// 20. Realizar un programa que obtenga la siguiente matriz [[3], [6], [9], [12], [15]] y devuelve y
// muestre el siguiente array [6, 9, 12, 15, 18].
// 21. Escribir un programa para obtener un array de las propiedades de un objeto Persona.
// Las propiedades son nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura.
// 22. Escribir un programa de JavaScript que al clickear un botón muestre un mensaje a
// elección.
// 23. Resalte todas las palabras de más de 8 caracteres en el texto del párrafo (con un fondo
// amarillo, por ejemplo)
// 24. Escribir un programa de JavaScript que a través de un formulario calcule el radio de un
// circulo y lo muestre en el HTML.
// 25. Escriba una función de JavaScript para obtener los valores de Nombre y Apellido del
// siguiente formulario.
// <!DOCTYPE html>
// <html><head>
// <meta charset=utf-8 />
// <title>Obtener nombre y apellido de form </title>
// </head><body>
// <form id="form1" onsubmit="getFormValores()">
// Nombre: <input type="text" name="nombre" value="David"><br>
// Apellido: <input type="text" name="apellido" value="Beckham"><br>
// <input type="submit" value="Submit">
// </form>
// </body>
// </html>
