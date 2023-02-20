CREATE TABLE categorias (

    cod_categoria BIGINT NOT NULL IDENTITY(1,1),
    nome_categoria VARCHAR(50) NOT NULL,
    CONSTRAINT PK_cod_categoria PRIMARY KEY(cod_categoria)

);

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

CREATE TABLE produtos (

    cod_produto BIGINT NOT NULL IDENTITY(1,1),
    nome_produto VARCHAR(50) NOT NULL,
    valor DECIMAL(8,2) NOT NULL,
    cod_meta BIGINT NOT NULL,
    cod_categoria BIGINT NOT NULL,
    CONSTRAINT PK_cod_produto PRIMARY KEY(cod_produto),
    CONSTRAINT FK_cod_meta FOREIGN KEY(cod_meta) REFERENCES metas_financeiras(cod_meta),
    CONSTRAINT FK_cod_categoria_produto FOREIGN KEY(cod_categoria) REFERENCES categorias(cod_categoria)

);