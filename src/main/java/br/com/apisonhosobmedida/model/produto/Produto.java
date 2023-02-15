package br.com.apisonhosobmedida.model.produto;

import br.com.apisonhosobmedida.model.metaFinanceira.MetaFinanceira;
import jakarta.persistence.*;

@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_produto;
    private String nome_produto;
    private Double valor;
    @ManyToOne(fetch = FetchType.EAGER)
    private MetaFinanceira meta;

    public Produto(DadosCadastroProduto dados) {
        this.nome_produto = dados.nome_produto();
        this.valor = dados.valor();
    }


}
