
package Servicios;

import Entidades.ParDeNumeros;


public class ParDeNumerosService {
//Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
//a) Método mostrarValores que muestra cuáles son los dos números guardados.
public void mostrarValores(ParDeNumeros obj){
	System.out.println("num1: " +obj.getNum1() );
	System.out.println("num2: " +obj.getNum2() );
}

//b) Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
public double devolverMayor(ParDeNumeros obj){
	if (obj.getNum1()>obj.getNum2()){
		return obj.getNum1();
	} else {
		return obj.getNum2();
	}
}

//c) Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se 
//deben redondear ambos valores.
public double calcularPotencia(ParDeNumeros obj){
	if (obj.getNum1()>obj.getNum2()){
		return Math.pow( obj.getNum1(),Math.round(obj.getNum2()) );
	} else {
		return Math.pow( obj.getNum2(),Math.round(obj.getNum1()) );
	}
}

//d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se 
//debe obtener el valor absoluto del número.
public double calculaRaiz(ParDeNumeros obj){
	double aux;
	if (obj.getNum1()>obj.getNum2()){
		aux = Math.abs(obj.getNum2());
	} else {
		aux = Math.abs(obj.getNum1());
	}
	return Math.sqrt(aux);	
}
	
}
