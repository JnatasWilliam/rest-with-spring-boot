package br.com.springjonatas.services;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.springjonatas.model.Person;

@Service
public class PersonServices {
	
	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	//Criando um mock para encontrar pessoas
	public Person findById(String id) {
		
		logger.info("Finding one person");
		
		Person person =  new Person();

		person.setID(counter.incrementAndGet());
		person.setFirstName("Jonatas");
		person.setLastName("Santos");
		person.setAddress("Alameda dos Guatás");
		person.setGender("Male");
		
		return person;
	}
	
}
