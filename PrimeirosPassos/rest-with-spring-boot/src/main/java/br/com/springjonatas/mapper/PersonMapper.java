package br.com.springjonatas.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.springjonatas.date.vo.v1.PersonMapStruct;
import br.com.springjonatas.model.entity.Person;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    PersonMapStruct toPerson(Person person);

    Person toPersonMap(PersonMapStruct personMap);
    
    List<PersonMapStruct> toPersonMapStructList(List<Person> persons);
}