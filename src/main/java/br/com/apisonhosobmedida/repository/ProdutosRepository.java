package br.com.apisonhosobmedida.repository;

import br.com.apisonhosobmedida.model.produto.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produto, Long> { }
