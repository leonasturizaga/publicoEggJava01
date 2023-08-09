package Entidades;

public class ArmaduraService {

Armadura obj = new Armadura();

public void inicializarArmadura() {
	//obj.generador = (float) ((2 - Math.pow(2, -23)) * Math.pow(2, 127));
		obj.generador = (float)2147483647;
	obj.nivelSalud = 100;
	obj.resistencia = 100;    //dureza Rockwell=n,  donde n [HR(A)] con A= prueba para materiales muy duros punta diamante 120º y carga de 60kg. 
	obj.setBateria((int) obj.generador);
	String[] dispositivo = {"exoesqueleto", "consola", "sintetizador", "botaDer", "botaIzq", "guanteDer", "guanteIzq"};
	int[] dispConsumo = {100, 20, 10, 40, 40, 30, 30};
	int[] dispEstado = {1, 1, 1, 1, 1, 1, 1};
	int[] reporDispEstado = {1, 1, 1, 1, 0, 1, 1};
	int[] dispDestruido = {1, 1, 1, 1, 1, 1, 1};
	obj.setDispositivo(dispositivo);
	obj.setDispConsumo(dispConsumo);
	obj.setDispEstado(dispEstado);
	obj.setReporDispEstado(reporDispEstado);
	obj.setDispDestruido(dispDestruido);
}

public void mostrarValores() {
	System.out.println("generador" + obj.generador);
	System.out.println("nivelSalud" + obj.nivelSalud);
	System.out.println("resistencia" + obj.resistencia);
	System.out.println("bateria" + obj.getBateria());
	for (int i = 0; i < obj.getDispositivo().length ; i++) {
		System.out.println(obj.getDispositivo()[i] + ", consumo: " + obj.getDispConsumo()[i] + ", estado: " + obj.getDispEstado()[i] + ", destruido: " +obj.getDispDestruido()[i] );
	}
}

public int estado(int x) {
int est= 0;
	for (int i = 0; i < obj.getDispositivo().length; i++) {
		if (i == x && obj.getReporDispEstado()[x] !=0 && obj.getDispDestruido()[x] != 0) {
			est = obj.getDispEstado()[x];
		}
	}
	return est;
}

public int armaduraCaminar(int tiempo) {   //dispositivo = {"exoesqueleto", "consola", "sintetizador", "botaDer", "botaIzq", "guanteDer", "guanteIzq"} dispConsumo = {100, 20, 10, 40, 40, 30, 30};
	int d3, d4;
	d3=estado(3)*(obj.getDispConsumo()[3]*tiempo);
	d4=estado(4)*(obj.getDispConsumo()[4]*tiempo);
	return d3 + d4;
}

public int armaduraCorrer(int tiempo) {
	int d3, d4;
	d3=estado(3)*(obj.getDispConsumo()[3]*tiempo)*2;
	d4=estado(4)*(obj.getDispConsumo()[4]*tiempo)*2;
	return d3 + d4;
}

public int armaduraPropulsar(int tiempo) {
	int d3, d4;
	d3=estado(3)*(obj.getDispConsumo()[3]*tiempo)*3;
	d4=estado(4)*(obj.getDispConsumo()[4]*tiempo)*3;
	return d3 + d4;
}

public int armaduraVolar(int tiempo) {
	int d3, d4, d5, d6;
	d3=estado(3)*(obj.getDispConsumo()[3]*tiempo)*3;
	d4=estado(4)*(obj.getDispConsumo()[4]*tiempo)*3;
	d5=estado(5)*(obj.getDispConsumo()[5]*tiempo)*2;
	d6=estado(6)*(obj.getDispConsumo()[6]*tiempo)*2;
	return d3 + d4 + d5 + d6;
}

public int guanteDisparar(int tiempo) {
	int d5, d6;
	d5=estado(5)*(obj.getDispConsumo()[5]*tiempo)*3;
	d6=estado(6)*(obj.getDispConsumo()[6]*tiempo)*3;
	return d5 + d6;
}

public int botaCaminarCorrer(int tiempo) {
	int d3, d4;
	d3=estado(3)*(obj.getDispConsumo()[3]*tiempo)*2;
	d4=estado(4)*(obj.getDispConsumo()[4]*tiempo)*2;
	return d3 + d4;
}

public int escribir(int tiempo) {
	int d1;
	d1=estado(1)*(obj.getDispConsumo()[1]*tiempo);
	return d1;
}

public int hablar(int tiempo) {
	int d2;
	d2=estado(2)*(obj.getDispConsumo()[2]*tiempo);
	return d2;
}

public void mostrarEstadoDisp() {
	System.out.println("Armadura resistencia: " + obj.resistencia + ", Salud: " + obj.nivelSalud + ", Bateria: " + estadoBat()+"%");
	for (int i = 0; i < obj.getDispositivo().length; i++) {
		if (estado(i) == 1) {
			System.out.println(obj.getDispositivo()[i] + ": OK, ");
		} else {
			System.out.println(obj.getDispositivo()[i] + ": xx, ");
		}
	}
}

public int estadoBat() {
	return Math.round((obj.getBateria()/obj.generador)*100);
}

public void estadoReactor() {
}

public int estDispDanUso() {
	throw new UnsupportedOperationException("Not supported yet.");
}

public int repDispDan() {
	throw new UnsupportedOperationException("Not supported yet.");
}

public void revisarDisp() {
}
}
