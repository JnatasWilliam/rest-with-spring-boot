package br.com.springjonatas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.springjonatas.model.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
	

}
