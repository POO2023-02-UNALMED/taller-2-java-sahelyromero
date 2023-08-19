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
	
	String verificarIntegridad() {
		
		int x = this.asientos[0].registro;
		
		boolean f = false;
		
		for (int i = 1; i < asientos.length; i++) {
			
			if (x == this.asientos[i].registro) {
				f = true;
			}
			
			else {
				f = false;
				break;
	        }
		}
		
		if (this.registro == this.motor.registro && this.registro == x && f == true){
			return("Auto original");
		}
		
		else {
			return("Las piezas no son originales");
		}
    } 
}