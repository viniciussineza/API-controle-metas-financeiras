package br.com.apisonhosobmedida.model.produto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroProduto(

        @NotBlank
        String nome_produto,

        @NotNull
        Double valor

) {
}
