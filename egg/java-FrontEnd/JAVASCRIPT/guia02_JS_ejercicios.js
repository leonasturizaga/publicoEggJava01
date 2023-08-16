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
var var08;
var max08=0;
var min08=0;
var suma08=0;
var cont08=0;
do {
    let aux=parseInt(prompt("ingrese un numero"));
    var08=aux;
    if (max08==0 & min08==0) {
        max08=aux;
        min08=aux;
        suma08=suma08+aux;
        cont08++;        
    } else {
        if (aux!=0) {
            if(aux>max08){
                max08=aux;
            }
            if(aux<min08){
                min08=aux;
            }
            suma08=suma08+aux;
            cont08++;
        }
    }
} while (var08 != 0);
console.log(mostrarResultados(max08,min08,suma08,cont08));

function mostrarResultados(max08,min08,suma08,cont08){
    console.log("Maximo: " + max08);
    console.log("Minimo: " + min08);
    console.log("Promedio: " + suma08/cont08);
}

// 9. Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
// espacio entre cada letra. La frase se mostrara así: H o l a. Nota: recordar el
// funcionamiento de la función Substring().

// 10. Escribir una función flecha que reciba una palabra y la devuelva al revés.

// 11. Escribir una función que reciba un String y devuelva la palabra más larga.
// String Ejemplo: “Guia de JavaScript”
// Resultado esperado : “JavaScript”

// 12. Escribir una función flecha de JavaScript que reciba un argumento y retorne el tipo de
// dato.