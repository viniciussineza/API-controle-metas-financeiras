package br.com.apisonhosobmedida.model.metaFinanceira;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import br.com.apisonhosobmedida.model.categoria.Categoria;
import br.com.apisonhosobmedida.model.produto.Produto;
import jakarta.persistence.*;

@Entity
@Table(name = "metas_financeiras")
public class MetaFinanceira implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_meta;
    @Column(name = "descricao", unique = true)
    private String descricao;
    @OneToOne
    @MapsId
    private Categoria categoria;
    @Column(insertable = false, updatable = false)
    private Double valorTotal;
    @Column(name = "data_inicio")
    private LocalDate dataInicio;
    @Column(name = "data_fim")
    private LocalDate dataFim;
    private Boolean status;

    //Implementar relação entre meta e produto e cadastrar todos de uma vez
    @OneToMany(mappedBy = "meta", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Produto> produtos = new HashSet<>();

    public void addProduto( Produto produto ) {
        produtos.add( produto );
        produto.
    }
    
    public MetaFinanceira() {};   

    // IF dataInicio is blank, then get now()
    // IF Meta não tem produtos
    public MetaFinanceira(DadosCadastroMeta dados) {
        this.status = true;
        this.descricao = dados.descricao();
        this.categoria = new Categoria( dados.categoria() );
        this.dataInicio = LocalDate.parse(dados.dataInicio(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.dataFim = LocalDate.parse(dados.dataFim(), DateTimeFormatter.ofPattern("dd/MM/yyyy" ));
    }


    public void desativarMeta() {
        this.status = false;
    }

    public String getDescricao() { return descricao; }

    public Double getValorTotal() { return valorTotal; }

    public LocalDate getDataInicio() { return dataInicio; }

    public LocalDate getDataFim() { return dataFim; }

    @Override
    public boolean equals(Object obj) {
        if ( this == obj ) return true;
        if ( obj == null || getClass() != obj.getClass() ) return  false;
        MetaFinanceira meta = (MetaFinanceira) obj;
        return descricao.equals(meta.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao, valorTotal, dataInicio, dataFim);
    }
}
