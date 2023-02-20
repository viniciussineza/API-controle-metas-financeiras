package br.com.apisonhosobmedida.model.categoria;

import br.com.apisonhosobmedida.controller.CategoriaController;
import br.com.apisonhosobmedida.model.metaFinanceira.MetaFinanceira;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "categorias")
public class Categoria implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( insertable = false, updatable = false, unique = true)
    private Long cod_categoria;
    private String nome_categoria;

    @Autowired
    private CategoriaController controller;
    public Categoria ( ) {}

    public Categoria ( DadosCadastroCategoria dados ) {
        this.nome_categoria =  dados.nome_categoria();
    }

    public Long getCod_categoria() {
        return cod_categoria;
    }

    public String getNome_categoria() {
        return nome_categoria;
    }

    public Long getNomeCategoria( DadosCadastroCategoria dadoCategoria ) {
        List<Categoria> categorias = controller.listar();
        Long codigoCategoria = null;
        for ( Categoria categoria : categorias ) {
            if ( categoria.getNome_categoria().equals(dadoCategoria.nome_categoria()))
                codigoCategoria = categoria.getCod_categoria();
        }
        return codigoCategoria;
    }

    @Override
    public boolean equals(Object obj) {
        if ( this == obj ) return true;
        if ( obj == null || getClass() != obj.getClass() )  return false;
        Categoria categoria = (Categoria) obj;
        return nome_categoria.equals(categoria.nome_categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome_categoria);
    }
}
