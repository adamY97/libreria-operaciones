package com.example.libreriaoperaciones.clases;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("operaciones.resultado")
public class OperacionProperties {

	private String operacion = "Suma";
	
	public String getOperacion() {
		return operacion;
	}
	
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	
}
