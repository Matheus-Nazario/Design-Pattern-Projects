package br.com.designpatternsdemo.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 * *
 * *
 * *
 * @author Matheus Nazário
 */
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
