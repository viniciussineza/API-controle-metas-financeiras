package br.com.apisonhosobmedida.controller;

import br.com.apisonhosobmedida.model.categoria.Categoria;
import br.com.apisonhosobmedida.model.categoria.DadosCadastroCategoria;
import br.com.apisonhosobmedida.model.categoria.DadosListagemCategoria;
import br.com.apisonhosobmedida.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarCategoria( @RequestBody DadosCadastroCategoria dados ) {
        repository.save( new Categoria( dados ) );
    }

    @GetMapping
    public Page<DadosListagemCategoria> listar( Pageable page ) {
        return repository.findAll( page ).map( DadosListagemCategoria::new );
    }


}
