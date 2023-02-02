package br.com.apisonhosobmedida.model;

import java.util.*;
import jakarta.persistence.*;

@Entity
@Table(name = "metas-finaneciras")
public class MetaFinanceira {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private Double valor;
    private Date dataInicio;
    private Date dataFim;
    
    public MetaFinanceira() {};   
    
    public MetaFinanceira(String descricao, Double valor, Date dataInicio, Date dataFim) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public String getDescricao() { return descricao; }

    public Double getValor() { return valor; }

    public Date getDataInicio() { return dataInicio; }

    public Date getDataFim() { return dataFim; }

    @Override
    public boolean equals(Object meta) {
        if ( )
        return super.equals(meta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao, valor, dataInicio, dataFim);
    }
}
