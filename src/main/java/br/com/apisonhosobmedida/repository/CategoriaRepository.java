package br.com.apisonhosobmedida.repository;

import br.com.apisonhosobmedida.model.categoria.Categoria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    Page<Categoria> findAll(Pageable page);

}
