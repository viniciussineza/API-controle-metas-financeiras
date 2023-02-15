package br.com.apisonhosobmedida.repository;

import br.com.apisonhosobmedida.model.categoria.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

//    @Query("SELECT c.cod_categoria FROM categorias c WHERE c.nome_categoria =  ?1")
//    Long findByNomeCategoria(String nomeCategoria);

}
