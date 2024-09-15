package br.com.matheusagx.api_tafefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.matheusagx.api_tafefas.entity.Todo;


public interface TodoRepository extends JpaRepository<Todo, Long>{

    
}
