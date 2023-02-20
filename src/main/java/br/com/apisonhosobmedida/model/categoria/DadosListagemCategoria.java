package br.com.apisonhosobmedida.model.categoria;

public record DadosListagemCategoria(
        Long cod_categoria,
        String nome_categoria
) {
    public DadosListagemCategoria(Categoria categoria) {
        this(categoria.getCod_categoria(), categoria.getNome_categoria());
    }
}
