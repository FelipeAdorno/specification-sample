package br.com.specification.sample.service;

import br.com.specification.sample.domain.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Map;

public interface PersonService {
    Page<Person> list(Map<String, String> filters, Pageable pageable);
}
