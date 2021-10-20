package com.example.libreriaoperaciones;

public class Operacion {
	
	private String operacion;
	
	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	
	
	public Operacion (String operacion) {
		this.operacion = operacion;
	}
	

	public String operacionMatematica() {
		
		int a = (int)(Math.random()*10+1);
		int b = (int)(Math.random()*10+1);
		
		double resultado = 0;
		int mayor = 0;
		int menor = 0;

		
		if(a>b) {
			mayor = a;
			menor = b;
		}else {
			mayor = b;
			menor = a;
		}
		
		switch (operacion) {
		case "Multiplicacion":
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
		
		String c = "El resultado de la operación " + operacion + " (entre "+ mayor + " y " + menor + ") es:" + resultado;
		return c;
	}
	
	
}
