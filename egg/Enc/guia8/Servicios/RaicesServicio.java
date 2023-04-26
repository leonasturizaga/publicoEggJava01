
package Servicios;
import Entidades.Raices;

public class RaicesServicio {
//a) Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente
// fórmula: (b^2)-4*a*c

public double getDiscriminante(Raices obj){
	double disc;
	disc = Math.pow(obj.b, 2) - 4*obj.a*obj.getC();
	return disc;
}
public double getDiscriminante2(double a, double b, double c){
	double disc;
	disc = Math.pow(b, 2) - 4*a*c;
	return disc;
}

//b) Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante
// debe ser mayor o igual que 0.
public boolean tieneRaices(Raices obj){
	boolean tieneRaiz = false;
	if ( (Math.pow(obj.b, 2) - 4*obj.a*obj.getC()) >= 0) {
		tieneRaiz = true;
	}
	return tieneRaiz;
}

public boolean tieneRaices2(double disc){
	boolean tieneRaiz = false;
	if ( disc >= 0) {
		tieneRaiz = true;
	}
	return tieneRaiz;
}

//c) Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante
//debe ser igual que 0.
public boolean tieneRaiz(Raices obj){
	boolean raizUnica=false;
	if ((Math.pow(obj.b, 2) - 4*obj.a*obj.getC()) == 0) {
		raizUnica = true;
	}
	return raizUnica;
}

public boolean tieneRaiz2(double disc){
	boolean raizUnica=false;
	if (disc == 0) {
		raizUnica = true;
	}
	return raizUnica;
}

//d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió true, imprime las 2 posibles soluciones.
public void obtenerRaices(Raices obj){
	boolean aux;
	aux = tieneRaices(obj);
	double disc;
	disc = getDiscriminante(obj);
	if (aux == true) {
		System.out.println("sol1: " + (-obj.b + Math.sqrt(disc))/(2*obj.a) );
		System.out.println("sol2: " + (-obj.b - Math.sqrt(disc))/(2*obj.a) );
	}
	
}
	

//e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga
//una única solución posible.
public void obtenerRaiz(Raices obj){
	boolean aux = tieneRaiz(obj);
	double disc = getDiscriminante(obj);
	if (aux==true) {
		System.out.println("sol unica: " + (-obj.b + Math.sqrt(disc))/(2*obj.a) );
	}
}

//f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones 
//que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos 
//y en caso de no existir solución, se mostrará un mensaje.
//Nota: Fórmula ecuación 2o grado: (-b±√((b^2)՞Մ4*a*c)))/(2*a) Solo varía el signo delante de -b
public void calcular(Raices obj){
	boolean aux1 = tieneRaiz(obj);
	boolean aux2 = tieneRaices(obj);
	
	if (aux1==true) {
		obtenerRaiz(obj);
	} else {
		if (aux2==true) {
			obtenerRaices(obj);
		} else {
			System.out.println("No tiene solucion Real");
		}
	}
	
}


}
