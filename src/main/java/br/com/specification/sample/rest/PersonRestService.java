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
    public Page<Person> list(@RequestParam(required = false) String name,
                             @RequestParam(required = false) Integer cpf,
                             @RequestParam(required = false) Integer phone,
                             @RequestParam(defaultValue = "0") Integer page,
                             @RequestParam(defaultValue = "10") Integer size) {
        return personService.list(name, cpf, phone, new PageRequest(page, size));
    }

}
