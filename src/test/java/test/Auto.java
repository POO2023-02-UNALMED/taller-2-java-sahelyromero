package test;

public class Auto {
	
	String modelo;
	int precio;
	Asiento[] asientos = new Asiento[10];
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		return(asientos.length);
	}
}
