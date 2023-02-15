EXEC SP_RENAME 'metas_financeiras.categoria', 'cod_categoria', 'COLUMN';

ALTER TABLE metas_financeiras
ALTER COLUMN cod_categoria BIGINT NOT NULL;

ALTER TABLE metas_financeiras
ADD CONSTRAINT FK_cod_categoria FOREIGN KEY (cod_categoria) REFERENCES categorias(cod_categoria);