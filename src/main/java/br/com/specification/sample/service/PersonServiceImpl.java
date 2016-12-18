package br.com.specification.sample.service;

import br.com.specification.sample.domain.Person;
import br.com.specification.sample.repository.PersonRepository;
import br.com.specification.sample.specification.PersonSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import static org.springframework.data.jpa.domain.Specifications.where;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Page<Person> list(String name, Integer cpf, Integer phone, Pageable pageable) {
        return personRepository.findAll(where(PersonSpecification.name(name))
                .or(PersonSpecification.cpf(cpf)).and(PersonSpecification.phone(phone)), pageable);
    }
}
