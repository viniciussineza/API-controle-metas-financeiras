CREATE TABLE produtos (

    cod_produto BIGINT NOT NULL IDENTITY(1,1),
    nome_produto VARCHAR(50) NOT NULL,
    valor DECIMAL(8,2) NOT NULL,
    cod_meta BIGINT NOT NULL,
    cod_categoria BIGINT NOT NULL,
    CONSTRAINT PK_cod_produto PRIMARY KEY(cod_produto),
    CONSTRAINT FK_cod_meta FOREIGN KEY(cod_meta) REFERENCES metas_financeiras(cod_meta),
    CONSTRAINT FK_cod_categoria_produto FOREIGN KEY(cod_categoria) REFERENCES categorias(cod_categoria)

);;