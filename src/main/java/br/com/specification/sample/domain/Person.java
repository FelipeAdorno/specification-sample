package br.com.specification.sample.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Table
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer cpf, phone;
}
