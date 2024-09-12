package br.com.matheusagx.api_tafefas.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import br.com.matheusagx.api_tafefas.entity.Todo;

public class TodoRepository extends JpaRepositoriesAutoConfiguration{



    public List<Todo> findAll(Sort sort) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    public void save(Todo todo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }
    
}
