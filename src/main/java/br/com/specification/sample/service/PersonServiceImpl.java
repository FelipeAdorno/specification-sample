package br.com.specification.sample.service;

import br.com.specification.sample.domain.Person;
import br.com.specification.sample.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Map;

import static br.com.specification.sample.specification.PersonSpecification.filterWithOptions;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Page<Person> list(Map<String, String> filters, Pageable pageable) {
        return personRepository.findAll(filterWithOptions(filters), pageable);
    }
}
