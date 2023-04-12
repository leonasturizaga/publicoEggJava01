
package eggguiapoo;

import java.util.Scanner;


public class EggGuiaPOO {


public static void main(String[] args) {
	Scanner leerNum = new Scanner(System.in);
	Scanner leerText = new Scanner(System.in);

//ejercicio 01	
//	Libro obj= new Libro();
//	obj.pedirDatos();
//	System.out.println("");
//	obj.mostrarDatos();
//	
//	System.out.println("-----");
//	System.out.println("forma 2");
//	Libro obj2 = new Libro( leerText.nextLine(), leerText.nextLine(), leerText.nextLine(), leerNum.nextInt() );
//		System.out.println("");
//	obj2.mostrarDatos();


////ejercicio 02	
//	Circunferencia ci;
////a) Método constructor que inicialice el radio pasado como parámetro.
//	ci = new Circunferencia(10);
//	
////b) Métodos get y set para el atributo radio de la clase Circunferencia.
//	System.out.println(ci.getRadio());
//	ci.setRadio(100);
//	System.out.println(ci.getRadio());
////c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
//	ci.crearCircunferencia();
//	System.out.println(ci.getRadio());
////d) Método area(): para calcular el área de la circunferencia (Area= (π*radio)^2 ).
//ci.area();
////e) Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
//ci.perimetro();

////ejercicio 03
//
//Operacion op = new Operacion();
//
////d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
//op.crearOperacion();
//	System.out.println(op.getNumero1() +"\n"+ op.getNumero2());
//	System.out.println("");
//		
////e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//System.out.println("suma: " + op.sumar());
////f) Método restar(): calcular la resta de los números y devolver el resultado al main
//System.out.println("resta: " + op.restar());
////g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero,
////el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
//System.out.println("multi: " + op.multiplicar());
////h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero,
////el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve
////el resultado al main.
//System.out.println("division: " + op.dividir());
//
//System.out.println(op.toString());


//ejercicio 04
Rectangulo re = new Rectangulo();
//4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura.
//La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. También incluirá 
//un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
//tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán además
//definir los métodos getters, setters y constructores correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2

re.crearRectangulo();
	System.out.println("Base: " + re.getBase() + "\nAltura: " +re.getAltura());
	
re.superficieRectangulo();

re.perimetroRectangulo();

re.dibujarRectangulo();

}

}
