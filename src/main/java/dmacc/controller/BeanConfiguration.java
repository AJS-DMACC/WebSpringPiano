package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Bench;
import dmacc.beans.Piano;

@Configuration
public class BeanConfiguration {

	@Bean
	public Piano piano() {
		Piano bean = new Piano();
		bean.setElectric(true);
		bean.setBrand("Casio");
		bean.setNumKeys(44);
		bean.setSerialNum(514583487);
		Bench bench = new Bench(4,32,"rectangle");
		bean.setBench(bench);
		return bean;
	}
	
	@Bean 
	public Bench bench() {
		Bench bean = new Bench();
		bean.setHeight(-1);
		bean.setLegs(-1);
		bean.setShape("default");
		return bean;
	}
}
