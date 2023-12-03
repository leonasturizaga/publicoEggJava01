
package Entidades;

import Interfaces.calculosFormas;


public class Formas implements calculosFormas {



	@Override
	public void areaCirculo(int radio) {
		System.out.println("Área circulo: PI * radio ^ 2: " +Math.PI*Math.pow(radio, 2));
	}

	@Override
	public void perimetroCirculo(int radio) {
		System.out.println("Perímetro circulo: PI * diámetro: " + Math.PI*radio*2);
	}

	@Override
	public void areaRectangulo(int base, int altura) {
		System.out.println("Área rectángulo: base * altura: " + base*altura);
	}

	@Override
	public void perimetroRectangulo(int base, int altura) {
		System.out.println("Perímetro rectángulo: (base + altura) * 2: " + (base + altura)*2);
	}
	
}
