package br.com.springjonatas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springjonatas.model.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	

}
