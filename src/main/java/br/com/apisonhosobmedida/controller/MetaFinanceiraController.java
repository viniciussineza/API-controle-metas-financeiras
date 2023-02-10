package br.com.apisonhosobmedida.controller;

import br.com.apisonhosobmedida.model.DadosCadastroMeta;
import br.com.apisonhosobmedida.model.MetaFinanceira;
import br.com.apisonhosobmedida.repository.MetaFinanceiraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metafinanceira")
public class MetaFinanceiraController {

    @Autowired
    private MetaFinanceiraRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroMeta dados) {
        repository.save(new MetaFinanceira(dados));
    }


}
