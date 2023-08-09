
package Servicios;
import Entidades.NIF;
import java.util.Scanner;

public class NIFService {
Scanner leer = new Scanner(System.in).useDelimiter("\n");
//En NIFService se dispondrá de los siguientes métodos:

//a) Métodos getters y setters para el número de DNI y la letra.
NIF obj = new NIF();
public long getDni(){
	return obj.dni;
}
public char getLetra(){
	return obj.letra;
}
public void setDni(int dni){
	obj.dni = dni;
}
public void setLetra(char letra){
	obj.letra = letra;
}

//b) Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. Una vez 
//calculado, le asigna la letra que le corresponde según
public void crearNif(){
	char[] nif= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	int aux;
	System.out.println("ingrese numero de DNI");
	setDni(leer.nextInt());
	aux = (int)(obj.dni%23);
	setLetra(nif[aux]);
}

//c) Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 
//00395469-F).
//La letra correspondiente al dígito verificador se calculará a traves de un método que funciona de la siguiente 
//manera: Para calcular la letra se toma el resto de dividir el número de DNI por 23 (el resultado debe ser
//un número entre 0 y 22Յ. El método debe buscar en un array (vector) de caracteres la posición que corresponda al
//resto de la división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:
//POSICIÓN    0 1  2 3  4 5  6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
//LETRA          T R W A G M Y F P D  X  B  N   J  Z  S  Q  V   H  L  C   K  E	
public void mostrar(){
	System.out.println(obj.dni + "-" + obj.letra);
}


}
