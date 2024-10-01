package br.com.springjonatas.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.springjonatas.model.date.mapstruct.v1.PersonMapStruct;
import br.com.springjonatas.model.entity.PersonEntity;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    PersonMapStruct toPerson(PersonEntity person);

    PersonEntity toPersonMap(PersonMapStruct personMap);
    
    List<PersonMapStruct> toPersontList(List<PersonEntity> persons);
    
    List<PersonEntity> toPersonList(List<PersonEntity> persons);
}