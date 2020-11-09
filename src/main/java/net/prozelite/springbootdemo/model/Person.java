package net.prozelite.springbootdemo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="persons")
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="firstname")
    private String firstName;
    @Column(name="lastname")
    private String lastName;
}
