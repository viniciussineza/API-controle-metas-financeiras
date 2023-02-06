package br.com.apisonhosobmedida.controller;

import br.com.apisonhosobmedida.model.DadosCadastroMeta;
import br.com.apisonhosobmedida.model.MetaFinanceira;
import br.com.apisonhosobmedida.repository.MetaFinanceiraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metafinanceira")
public class MetaFinanceiraController {

    @Autowired
    private MetaFinanceiraRepository repository;

    public void cadastrar(DadosCadastroMeta dados) {
        repository.save(new MetaFinanceira(dados));
    }
}
