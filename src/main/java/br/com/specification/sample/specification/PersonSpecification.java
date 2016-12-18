package br.com.specification.sample.specification;

import br.com.specification.sample.domain.Person;
import br.com.specification.sample.domain.Person_;
import org.springframework.data.jpa.domain.Specification;

public class PersonSpecification {

    public static Specification<Person> name(String name) {
        return (root, criteriaQuery, criteriaBuilder) ->
                criteriaBuilder.equal(root.get(Person_.name), name);
    }

    public static Specification<Person> phone(Integer phone) {
        return (root, criteriaQuery, criteriaBuilder) ->
                criteriaBuilder.equal(root.get(Person_.phone), phone);
    }

    public static Specification<Person> cpf(Integer cpf) {
        return (root, criteriaQuery, criteriaBuilder) ->
                criteriaBuilder.equal(root.get(Person_.cpf), cpf);
    }

}
