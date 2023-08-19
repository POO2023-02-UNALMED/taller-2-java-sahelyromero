package test;

public class Auto {
	
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		
		int contador = 0;
		
		for (int i = 0; i < asientos.length; i++) {
			
			if (this.asientos[i] instanceof Asiento) {
				
				contador = contador + 1;
			}
		}
		return contador;	
	}
	
	String verificarIntegridad() {
		
		int x = this.registro;
		boolean f = false;
		
		for (int i = 0; i < asientos.length; i++) {
			
			if (this.asientos[i] instanceof Asiento) {
				
				if (this.asientos[i].registro == x) {
					f = true;
				}
				
				else {
					f = false;
					break;
				}
			}
		}
		
		if (x == this.motor.registro && f == true) {
			return "Auto original";
		}
		
		else {
			return "Las piezas no son originales";
		}
    } 
}