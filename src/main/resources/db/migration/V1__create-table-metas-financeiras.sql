CREATE TABLE metas_financeiras(

    id BIGINT NOT NULL IDENTITY(1,1),
    descricao VARCHAR(255) NOT NULL,
    dataInicio DATE NOT NULL,
    dataFim DATE NOT NULL,

    CONSTRAINT PK_id_meta_financa PRIMARY KEY(id)

);