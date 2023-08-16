console.log("texto de prueba desde script en archivo js")
var edad = prompt("texto para el mensaje. Edad?", 26)
console.log("tu edad es: ", edad)
var numero = prompt("numero?")
console.log("el tipo de dato de numero es:" + typeof numero)

console.log("uso de templateString, \n con salto de linea")

var x = `template ${numero}`
console.log("texto templateString", x)

console.log("VIDEO 03");
var persona = {
    apellido: "ape01",
    nombre: "nomApe01",
    dni: 123456,
    mascota: {
        apodo: "mascota interna 1",
        numeroId: 10101010,
        nacimiento: new Date("2006-10-21")       
    }
};
var mascota1 = {
apodo: "mascota01",
numeroId: 111111,
nacimiento: new Date("2006-12-25")
};
var mascota2 = {
    apodo: "mascota02",
    numeroId: 222222,
    nacimiento: new Date("2002-01-02")
}

console.log(mascota1);
console.log(persona);


var persona2 = {
    apellido: "ape02",
    nombre: "nomApe02",
    dni: 1234567,
    mascotas: [
        {
            apodo: "mascota interna 3",
            numeroId: 10101010,
            nacimiento: new Date("2006-10-21")       
        }, {
            apodo: "mascota interna 4",
            numeroId: 20202020,
            nacimiento: new Date("2002-01-03")
        }
    ]
};
console.log("objeto persona2", persona2);
console.log("extraer datos de objeto persona2", persona2.mascotas[0].apodo, persona2.mascotas[1].apodo)

"video 04"
var persona = {
    nombre: "nom01",
    apellido: "ape01",
    dni: 123456,
    nacieminento: new Date("2001-05-24"),
    mascota: {
        nombre: "masc01",
        codigo: 123,
        nacimiento: "2020-12-01", 
    }
}
console.log(personal);