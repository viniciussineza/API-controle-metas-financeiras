CREATE TABLE categorias (

    cod_categoria BIGINT NOT NULL IDENTITY(1,1),
    nome_categoria VARCHAR(50) NOT NULL,
    CONSTRAINT PK_cod_categoria PRIMARY KEY(cod_categoria)

);