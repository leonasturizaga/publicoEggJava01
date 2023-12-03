
package guia13integrador;

import Entidades.ArmaduraService;


public class Guia13integrador {


public static void main(String[] args) {
ArmaduraService ars = new ArmaduraService();

ars.inicializarArmadura();
ars.mostrarValores();
	System.out.println(ars.armaduraCaminar(10));
	System.out.println(ars.armaduraCorrer(10));
	System.out.println(ars.armaduraPropulsar(10));
	System.out.println(ars.armaduraVolar(10));
	System.out.println(ars.guanteDisparar(10));
	System.out.println(ars.botaCaminarCorrer(10));
	System.out.println(ars.escribir(10));
	System.out.println(ars.hablar(10));
	System.out.println("Estado dispositivos:");
	ars.mostrarEstadoDisp();	

		
}

}
