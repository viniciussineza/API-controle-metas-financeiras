package br.com.apisonhosobmedida.repository;

import br.com.apisonhosobmedida.model.metaFinanceira.MetaFinanceira;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetaFinanceiraRepository extends JpaRepository<MetaFinanceira, Long> {

}
