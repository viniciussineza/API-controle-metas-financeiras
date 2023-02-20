package br.com.apisonhosobmedida.model.categoria;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroCategoria(
        @NotBlank
        String nome_categoria

) { }
