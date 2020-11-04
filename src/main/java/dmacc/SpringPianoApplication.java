package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.*;
import dmacc.controller.*;
import dmacc.repository.PianoRepository;

@SpringBootApplication
public class SpringPianoApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringPianoApplication.class, args);
		
				/*ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
								
				Piano p = appContext.getBean("piano",Piano.class);
								
				System.out.println(p.toString());*/
	}
	
	//@Autowired
	//PianoRepository repo;

	/*
	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Piano p = appContext.getBean("piano",Piano.class);
		repo.save(p);
		
		//create non spring managed bean
		Bench b = new Bench(3,48,"circle");
		Piano pi = new Piano("Yamaha",false,88,b);
		repo.save(pi);		

		List<Piano> allPianos = repo.findAll();
		for(Piano piano: allPianos) {
			System.out.println(piano.toString());
		}
		
		//closes the ApplicationContext resource leak - not imperative to add but nice to clean it up
		((AbstractApplicationContext) appContext).close();
	
	}*/


}
