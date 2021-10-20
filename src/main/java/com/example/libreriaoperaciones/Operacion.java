package com.example.libreriaoperaciones;

public class Operacion {
	
	private String operacion;
	
	public Operacion (String operacion) {
		this.operacion = operacion;
	}
	
	public Operacion() {
		this.operacion = "";
	}
	
	
	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	
	public double operacionMatematica(int a, int b) {
		
		int mayor = 0;
		int menor = 0;
		double resultado = 0;
		
		if(a>b) {
			mayor = a;
			menor = b;
		}else {
			mayor = b;
			menor = a;
		}
		
		switch (this.operacion) {
		case "Multiplicación":
			resultado = mayor * menor;
			break;
			
		case "Division":
			resultado = mayor/menor;
			break;
			
		case "Resta":
			resultado = mayor - menor;
			break;
			
		case "Suma":
			resultado = mayor + menor;
			break;
			
		default:
			resultado = mayor + menor;
			break;
		}
		
		System.out.println("El resultado de la operación " + this.operacion + " (entre "+ mayor + " y " + menor + ") es:");
		return resultado;
	}
	
	
}
