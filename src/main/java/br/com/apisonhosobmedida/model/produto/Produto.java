package br.com.apisonhosobmedida.model.produto;

import br.com.apisonhosobmedida.model.metaFinanceira.MetaFinanceira;
import jakarta.persistence.*;

@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "meta_categoria_cod_categoria" ,insertable = false, updatable = false, unique = true)
    private Long cod_produto;
    private String nome_produto;
    private Double valor;
    @OneToOne
    @MapsId
    private MetaFinanceira metaProduto;

    public Produto(DadosCadastroProduto dados) {
        this.nome_produto = dados.nome_produto();
        this.valor = dados.valor();
    }

    public void setMetaProduto(MetaFinanceira metaProduto) {
        this.metaProduto = metaProduto;
    }
}
