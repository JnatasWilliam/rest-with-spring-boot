package br.com.springjonatas.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.springjonatas.date.vo.v1.PersonMapStruct;
import br.com.springjonatas.exception.ResourceNotFoundException;
import br.com.springjonatas.mapper.PersonMapper;
import br.com.springjonatas.repositories.PersonRepository;

@Service
public class PersonServices {

	private Logger logger = Logger.getLogger(PersonServices.class.getName());

	private final PersonRepository repository;
	private final PersonMapper personMapper;
	
	public PersonServices(PersonRepository repository, PersonMapper personMapper ) {
        this.repository = repository;
        this.personMapper = personMapper;
    }

	public List<PersonMapStruct> findAll() {

		logger.info("Finding all PersonVO");

		return personMapper.toPersonMapStructList(repository.findAll());
	}

	public PersonMapStruct findById(Long id) {

		logger.info("Finding one PersonVO");

		var entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));

		return personMapper.toPerson(entity);
	}

	public PersonMapStruct create(PersonMapStruct personMap) {

		logger.info("Creating one PersonVO");

		var entity = personMapper.toPersonMap(personMap);
		var vo = personMapper.toPerson(repository.save(entity));

		return vo;
	}

	public PersonMapStruct update(PersonMapStruct personMap) {

		logger.info("Updating one PersonVO");

		var entity = repository.findById(personMap.getId())
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));

		entity.setFirstName(personMap.getFirstName());
		entity.setLastName(personMap.getLastName());
		entity.setAddress(personMap.getAddress());
		entity.setGender(personMap.getGender());

		var vo = personMapper.toPerson(repository.save(entity));

		return vo;
	}

	public void delete(Long id) {

		logger.info("Deleting one PersonVO");

		var entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
		repository.delete(entity);
	}
}
