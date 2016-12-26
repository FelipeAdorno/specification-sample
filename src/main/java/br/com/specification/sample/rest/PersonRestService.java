package br.com.specification.sample.rest;

import br.com.specification.sample.domain.Person;
import br.com.specification.sample.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * PersonRestService
 *
 * @author Felipe Adorno felipeadsc@gmail.com
 */
@RestController
@RequestMapping("/persons")
public class PersonRestService {

    @Autowired
    private PersonService personService;

    @GetMapping
    public Page<Person> list(@RequestParam(required = false) Map<String, String> filters,
                             @RequestParam(defaultValue = "0") Integer page,
                             @RequestParam(defaultValue = "10") Integer size) {
        return personService.list(filters, new PageRequest(page, size));
    }

}
