package com.example.libreriaoperaciones.clases;


import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.libreriaoperaciones.Operacion;


@Configuration
@ConditionalOnClass(Operacion.class)
@EnableConfigurationProperties(OperacionProperties.class)

public class OperacionAutoconfigure {

	private final OperacionProperties properties;
	
	
	public OperacionAutoconfigure (OperacionProperties properties) {
		this.properties = properties;
	}
	
	@Bean
	public Operacion operacion() {
		return new Operacion(properties.getOperacion());
	}

}
