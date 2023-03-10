package br.com.apisonhosobmedida.model.metaFinanceira;

import br.com.apisonhosobmedida.model.categoria.DadosCadastroCategoria;
import br.com.apisonhosobmedida.model.produto.DadosCadastroProduto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

public record DadosCadastroMeta(

        @NotBlank
        String descricao,

        @NotBlank
        @Valid
        DadosCadastroCategoria categoria,

        @NotNull
        @NotEmpty
        String dataInicio,

        @NotNull
        @NotEmpty
        String dataFim

) { }
