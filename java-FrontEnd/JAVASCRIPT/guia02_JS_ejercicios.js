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
//area = PI * radio2
//perimetro = 2 * PI * radio
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
//     console.log(menu());
//     //var ope = prompt(menu2() + "\nIngrese operacion a realizar" );
//     var ope = prompt("Ingrese operacion a realizar" );
//     ope = ope.toUpperCase();
//     if(ope != 0) {
//         console.log(operacion(var05a,var05b));
//     }
// }while(ope !=0);

// function menu2(){
//     var menu = "****************************\n"  +
//         "S) Suma\n" +
//         "R) Resta\n" +
//         "M) Multiplicacion\n" +
//         "D) Division\n" +
//         "0) Salir\n" +
//     "****************************";
//     return menu;
// }
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
//     suma07 += aux;
//     console.log("suma: " + suma07);
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
// var var10=prompt("escriba una palabra");
// var var10f="";
// var a = var10.split("").reverse();
// console.log(a);
// function invertir (a,var10f){
//     for(let i=0; i<a.length; i++){
//         var10f=var10f + a[i];
//         console.log(var10f);
//     }
//     return var10f;
// }
// console.log("resultado metodo funcion con array a: " + invertir(a,var10f));

// console.log("metodo flecha: " + var10f);
// let var10r = (b,var10f) => {for(let i=0; i<b.length; i++){ var10f=var10f + b[i];} return var10f;};
// console.log("resultado metodo flecha con array b: " + var10r(var10.split("").reverse(),var10f));

//OTRA FORMA MAS
// var var10=prompt("escriba una palabra");
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
// var var10f="";
// var invertir = (var10.split("").reverse());

// let resp = (invertir) => {for(let i=0; i< invertir.length; i++){ console.log(invertir[i]); var10f = var10f + var10.charAt(var10.length -1 - i);} return var10f;
// }
// console.log("con funcion resp: " + resp(invertir));

// 11. Escribir una función que reciba un String y devuelva la palabra más larga.
// String Ejemplo: “Guia de JavaScript”
// Resultado esperado : “JavaScript”

// function palabraMasLarga(){
//     var var11=prompt("escriba una frase");
//     var arrPalabras = var11.split(" ");
//     var posMasLarga=0;
// for (let dato in arrPalabras){
//     console.log(dato);
//         if(arrPalabras[dato].length > arrPalabras[posMasLarga].length){
//             posMasLarga=dato;
//             console.log(arrPalabras[posMasLarga]);
//         }
//     };
//     return arrPalabras[posMasLarga];
// }
// console.log("palabra mas larga: " + palabraMasLarga());

// OTRA FORMA de LUIS usando SORT y COMPARE
// var parrafo = "un parrafo cualquiera para contar";
// let arraystr = parrafo.split(' ');
// palabraMasLarga(arraystr);
// // console.log(palabra);
// console.log("La palabra es >>>>> " + arraystr[arraystr.length - 1])

// function palabraMasLarga(str){

//     //let arraystr = parrafo.split(' ');

//     str.sort(compare);
//     console.log("Las palabras son: ");
//     for (let palabra of str){
//     console.log(palabra, palabra.length);

//     }
//     //console.log("La palabra es >>>>> " + arraystr[arraystr.length - 1])
// }

// function compare(a,b) {

//     if (a.length > b.length) return 1; // si el primer valor es mayor que el segundo
//     if (a.length == b.length) return 0; // si ambos valores son iguales
//     if (a.length < b.length) return -1;

// }

// 12. Escribir una función flecha de JavaScript que reciba un argumento y retorne el tipo de
// dato.
// let tipoDato = (dato) => {return typeof dato};
// console.log("el tipo de dato es: " + tipoDato(45));
// console.log("el tipo de dato es: " + tipoDato("45"));
// console.log("el tipo de dato es: " + tipoDato(true));
// console.log("el tipo de dato es: " + tipoDato(45.24));

// 13. Crear un objeto persona, con las propiedades nombre, edad, sexo ('H' hombre, 'M' mujer,
// 'O' otro), peso y altura. A continuación, muestre las propiedades del objeto JavaScript.
// var Persona = {
//     nombre: "nom1",
//     edad: "ape1",
//     Sexo: "H",
//     peso: 80,
//     altura:175,
// };
// var Sexo = {
//     H: "hombre",
//     M: "mujer",
//     O: "otro",
// };
// console.log(Persona);
// console.log(Persona.Sexo);

// 14. Crear un objeto libro que contenga las siguientes propiedades: ISBN, Título, Autor,
// Número de páginas. Crear un método para cargar un libro pidiendo los datos al usuario
// y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
// numero de páginas.

// function Libro(isbn, titulo, autor, numeroPaginas){
//     this.isbn = isbn;
//     this.titulo = titulo;
//     this.autor = autor;
//     this.numeroPaginas = numeroPaginas;
// }
// function crearLibro(){
//     var isbn = parseInt(Math.random()*99999);
//     var titulo = prompt("ingrese titulo");
//     var autor = prompt("ingrese autor");
//     var numeroPaginas = prompt("numero de paginas");
//     return new Libro(isbn, titulo, autor, numeroPaginas);
// }

// var libro1 = new Libro(125478, "titulo1", "autor1", 1000);
// var libro2 = new Libro(225478, "titulo2", "autor2", 2000);
// var libro3 = crearLibro();

// function mostrarLibro(libro){
//     console.log(libro);
// };
// mostrarLibro(libro1);
// mostrarLibro(libro2);
// mostrarLibro(libro3);

// 15. Escribe un programa JavaScript para calcular el área y el perímetro de un objeto Círculo
// con la propiedad radio. Nota: Cree dos métodos para calcular el área y el perímetro. El
// radio del círculo lo proporcionará el usuario.
// function areaCirculo(radio){
//     area = Math.PI*Math.pow(radio, 2);
//     return area;
// }
// function perimetroCirculo(radio){
//     perimetro = Math.PI*radio*2;
//     return perimetro;
// }
// var circulo = {
//     radio: prompt("ingrese el radio del circulo"),
// };
// console.log(circulo + "Area: " + areaCirculo(circulo.radio) + ", Perimetro: " + perimetroCirculo(circulo.radio) );

// 16. Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios
// y los muestre por pantalla.
// let vector1 = new Array();
// let vector2 = new Array();
// llenarVector();
// console.log(vector1);
// console.log(vector2);
// console.log(vector1.forEach(mostrarElementos));
// console.log(mostrarVector(vector2));
// function llenarVector(){
//     n=5;
//     for (let i = 0; i < n; i++) {
//         vector1[i] = parseInt(Math.random()*99);
//         vector2[i] = parseInt(Math.random()*99);
//     }
// }
// function mostrarVector(vector){
//     vector.forEach(element => {
//     console.log(element);
//     });
// }
// function mostrarElementos(elemento,indice,array){
//     console.log("array[" + indice + "]: " + elemento);
// }

// 17. Realizar un programa que elimine los dos últimos elementos de un array. Mostrar el
// resultado
// let var17 = new Array();
// var17 = llenarVector(10);
// console.log(var17);
// var17.splice(var17.length-2,2);
// console.log(var17);
// function llenarVector(n){
//     let vector = new Array();
//     for (let i = 0; i < n; i++) {
//         vector[i] = parseInt(Math.random()*99);
//     }
//     return vector;
// }
// // para reemplazar elementos se usa el mismo splice, eliminando 1 elemento y adicionando los elementos que se necesite en ese lugar.
// var17.splice(var17.length-1, 1, 7000, 8000, 9000);
// console.log(var17);

// 18. A partir del siguiente array: var valores = [true, 5, false, "hola", "adios", 2]:
// a) Determinar cual de los dos elementos de texto es mayor
// b) Utilizando exclusivamente los dos valores booleanos del array, determinar los
// operadores necesarios para obtener un resultado true y otro resultado false
// c) Determinar el resultado de las cinco operaciones matemáticas realizadas con los
// dos elementos numéricos
// var valores = [true, 5, false, "hola", "adios", 2];
// console.log("a) " + retornaMayor(valores[3],valores[4]));
// console.log("b) ");
// operadorTrueFalse(valores[0],valores[2]);
// operacionesMatematicas(valores[1], valores[5]);
// function retornaMayor(a,b){
//     if(a>b){
//         return a;
//     }else{
//         if(a<b){
//             return b;
//         }else{
//             console.log("ninguno es mayor");
//         }
//     }
// };
// function operadorTrueFalse(a,b){
//     let aux1 = a!=b;
//     let aux2 = a==b;
//     console.log("operador != para da: " + aux1);
//     console.log(a!=b);
//     console.log("operador == para da: " + aux2);
//     console.log(a==b);
// }
// function operacionesMatematicas(a,b){
//     console.log("suma: " + (a+b));
//     console.log("resta: " + (a-b));
//     console.log("multiplicacion: " + (a*b));
//     console.log("division: " + (a/b));
//     console.log("exponeciacion: " + (a**b));
//     console.log("modulo (resto): " + (a%b));
// }

// 19. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
// de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
// programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
// Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
// ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
// 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado
// de 20.
// var arrayA = new Array();
// var arrayAux = new Array();
// var arrayB = new Array();
// arrayA=llenarVector(50);
// arrayA.sort(compare);  //sort solo ordena como string, para numerico se necesita la funcion no definida
// console.log(arrayA);
// arrayB=arrayA.splice(0, 10);   //cortar/extraer valores se puede asignar a un nuevo array
// console.log(arrayB);
// arrayAux=arrayB.splice(10, 0, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5); //adicionar/substituir NO se puede asiganar a otro array, los valores quendan en el mismo arrayB
// console.log("arrayB: " + arrayB);
// console.log("arrayAux: " + arrayAux);

// function llenarVector(n){
//     let array = new Array();
//     for (
//         let i = 0; i < n; i++) {
//         const element = array[i]=parseInt(Math.random()*99);
//     }
//     return array;
// };
// function compare(a,b){
//     if(a>b){return 1};
//     if(a==b){return 0};  // con == compara como numeros, con = NO compara bien
//     if(a<b){return -1};
// }

// 20. Realizar un programa que obtenga la siguiente matriz [[3], [6], [9], [12], [15]] y devuelve y
// muestre el siguiente array [6, 9, 12, 15, 18].
// var var20 = [[3], [6], [9], [12], [15]];
// console.log(var20);
// var array20 = var20.flat();
// console.log(array20);

// var array20f = array20.map(function(e){e = (e+3);});  //no funciona
// console.log(array20);
// console.log(array20f);

// array20final = arrayOperacion(array20);
// console.log(array20final);

// function arrayOperacion(array){
//     let k=3
//     for (let i = 0; i < array.length; i++) {
//         array[i] = array[i]+k;
//     }
//     return array;
// }

// 21. Escribir un programa para obtener un array de las propiedades de un objeto Persona.
// Las propiedades son nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura.
// var persona1 = new Persona("nom1", 10, "H", 100, 1000);
// function Persona(nombre, edad, sexo, peso, altura) {
// this.nombre = nombre;
// this.edad = edad;
// this.sexo = sexo;
// this.peso = peso;
// this.altura = altura;
// }
// console.log(persona1);
// var arrayPersona1 = JSON.stringify(persona1);
// console.log(arrayPersona1);

// 22. Escribir un programa de JavaScript que al clickear un botón muestre un mensaje a
// elección.
// let titulos = document.getElementsByName("titulo");
// let pes = document.getElementsByTagName("p");
// let p01Ej22 = document.getElementById("p01Ej22");

// let inputEj22 = document.getElementById("p01Ej22");
// let botonEj22 = document.getElementById("btnEj22");

// let ul = document.getElementById("listaApi");
// let botonDatosApi = document.getElementById("btnDatosApi");

// document.getElementById("btnEj22").onclick=mensajeOnClick;
// document.getElementById("btnDatosApi").onclick = traerDatosApi;

// function mensajeOnClick(){
//     p01Ej22.innerHTML = "se muestra un mensaje cualquiera on click";

//     titulos.forEach(e => {
//         e.style.color = "blue";
//         e.hidden = !e.hidden;
//     });

//     console.log("se muestra un mensaje cualquiera on click");

// }
// function colorTitulo(){  //no funciona
//     titulos.forEach(e => {
//         e.hidden = !e.hidden;
//         e.style.color = "red";
//     });
// }
// async function getAllCharacters(){
//     let results = [{name: "rick", edad: 15}, {name: "summer", edad: 16}, {name: "other", edad: 18}];
//     console.log(results);
//     return results;
// }
// async function getAllCharacters2(){
//     let response = await fetch("character.json");
//     let {results} = await response.json();
//     return results;
// }
// async function getAllCharacters3(){
//     let results = [{name: "rick"}, {name: "summer"}, {name: "other"}];
//     console.log(results);
//     return results;
// }
// async function traerDatosApi(){
//     let results = await getAllCharacters();
//     console.log(results);
//     results.forEach(e => {
//         agregar(e.name + ", " + e.edad);
//     });
// }
// function agregar(nombre){
//     let li = document.createElement("li");
//     li.innerHTML = nombre;
//     ul.append(li);
// }

// 23. Resalte todas las palabras de más de 8 caracteres en el texto del párrafo (con un fondo
// amarillo, por ejemplo)
// let texto23 = "En relación con la seguridad, la cookie se guarda en el cliente, el usuario puede ver el archivo de la cookie y puede realizar operaciones similares de modificación y eliminación en el archivo de la cookie. La seguridad de los datos de la cookie es difícil de garantizar, mientras que los datos de la sesión se almacenan en el lado del servidor, tiene mejor seguridad. Si se usa junto con la base de datos, puede mantener los datos de la sesión durante mucho tiempo y obtener una buena seguridad. Por lo tanto, se puede decir que las sesiones son más seguras que las cookies.";
// let p02Ej23 = document.getElementById("p02Ej23");
// p01Ej23.innerHTML = texto23;

// console.log(resaltar());
// p02Ej23.innerHTML =resaltar(4);
// //document.getElementById("p01Ej23")=resaltar(5);
// function resaltar(n){
//     let aux = texto23.split(" ");
//     let aux2="";
//     console.log(aux);

//     aux.forEach(e => {
//         if (e.length>n) {
//            console.log(e + e.length);
//            aux2 = aux2 +" "+ `<span style="background-color: yellow;"> ${e}</span>`;
//            //e.styles.backgroundColor = "blue";  //no funciona

//         } else {
//             aux2 = aux2 +" "+ e;
//         }
//     });
//     return aux2;
// }
// // NO SE USO STYLES
// //console custom
// // const spacing = '10px';
// // const styles = `padding: ${spacing}; background-color: black; color:
// // yellow; font-style:
// // italic; border: 1px solid black; font-size: 2em;`;
// // p01Ej23.innerHTML= ('%cEGG', styles);
// // console.log('%cEGG', styles);
// // EJEMPLO de Gerardo ok!
// // nuevoTexto23 += `<span style="background-color: rgb(255, 251, 35);">${arrayTexto23[i]}</span> `;

// 24. Escribir un programa de JavaScript que a través de un formulario calcule el radio de un
// circulo y lo muestre en el HTML.
// let p01Ej24 = document.getElementById("p01Ej24");
// let p02Ej24 = document.getElementById("p02Ej24");
// let area = document.getElementById("areaCirculo");
// let perimetro = document.getElementById("perimetroCirculo");

// area.onkeyup = keyupArea;
// console.log(area);
// function keyupArea(e){
//     let aux = e.target.value;
//     p01Ej24.innerHTML=`El radio es: ${radioArea(aux)}`;
// return aux;
// }
// function radioArea(area){
//     let r = Math.pow((area/Math.PI), 0.5);
//     return r;
// }

// //creates a listener for when you press a key
// perimetro.onkeyup = keyupPerimetro;
// function keyupPerimetro(e) {
//   //setting your input text to the global Javascript Variable for every key press
//    p02Ej24.innerHTML=`El radio es: ${radioPerimetro(e.target.value)}`;
//     return e.target.value;
// }
// function radioPerimetro(perimetro){
//     let r = (perimetro/(2*Math.PI));
//     return r;
// }

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
let nombre = document.getElementsByName("nombre")[0];
let apellido = document.getElementsByName("apellido")[0];
let nombreSubmit;
let apellidoSubmit;

function getFormValores() {
  nombreSubmit = document.getElementsByName("nombre")[0].getAttribute("value");
  apellidoSubmit = document.getElementsByName("apellido")[0].getAttribute("value");
  
  for (let i = 0; i < 10; i++) {
    console.log("submit:" + nombreSubmit + " - " + apellidoSubmit);
    console.log(nombre + " - " + apellido);
    if(i==9){alert("ok")}
  }
}

nombre.onkeyup = keyupNombre;
apellido.onkeyup = keyupApellido;
function keyupNombre(e) {

  nombre = e.target.value;
  console.log(nombre + " - " + apellido);
}
function keyupApellido(e) {
  apellido = e.target.value;
  console.log(nombre + " - " + apellido);
}

