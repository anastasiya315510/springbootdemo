package net.prozelite.springbootdemo.repository;

import net.prozelite.springbootdemo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PersonRepository extends JpaRepository<Person, Long> {

}
