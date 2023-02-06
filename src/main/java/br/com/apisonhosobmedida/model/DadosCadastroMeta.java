package br.com.apisonhosobmedida.model;

import java.time.LocalDate;
import jakarta.validation.constraints.*;

public record DadosCadastroMeta(

        @NotBlank
        String descricao,

        @NotNull
        @NotEmpty
        Double valor,

        @NotNull
        @NotEmpty
        LocalDate dataInicio,

        @NotNull
        @NotEmpty
        LocalDate dataFim

) { }
