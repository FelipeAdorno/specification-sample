package br.com.specification.sample.service;

import br.com.specification.sample.domain.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PersonService {
    Page<Person> list(String name, Integer cpf, Integer phone, Pageable pageable);
}
