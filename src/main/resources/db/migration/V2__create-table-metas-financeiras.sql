CREATE TABLE metas_financeiras (

    cod_meta BIGINT NOT NULL IDENTITY(1,1),
    descricao VARCHAR(255) NOT NULL,
    data_inicio DATE NOT NULL,
    data_fim DATE NOT NULL,
    status INT NOT NULL,
    cod_categoria BIGINT NOT NULL,
    CONSTRAINT PK_cod_meta PRIMARY KEY (cod_meta),
    CONSTRAINT FK_cod_categoria_meta FOREIGN KEY(cod_categoria) REFERENCES categorias(cod_categoria)

);