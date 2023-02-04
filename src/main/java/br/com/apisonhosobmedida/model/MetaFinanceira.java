package br.com.apisonhosobmedida.model;

import java.time.LocalDate;
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
    private LocalDate dataInicio;
    private LocalDate dataFim;
    
    public MetaFinanceira() {};   
    
    public MetaFinanceira(String descricao, Double valor, LocalDate dataInicio, LocalDate dataFim) {
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
    public boolean equals(Object obj) {
        if ( this == obj ) return true;
        if ( obj == null || getClass() != obj.getClass() ) return  false;
        MetaFinanceira meta = (MetaFinanceira) obj;
        return descricao.equals(meta.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao, valor, dataInicio, dataFim);
    }
}
