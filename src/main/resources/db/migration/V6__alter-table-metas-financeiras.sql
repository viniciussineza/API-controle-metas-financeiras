ALTER TABLE metas_financeiras
ADD CONSTRAINT FK_cod_categoria FOREIGN KEY (cod_categoria) REFERENCES categorias(cod_categoria);;