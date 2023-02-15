EXEC SP_RENAME 'metas_financeiras.id', 'cod_meta', 'COLUMN';

ALTER TABLE metas_financeiras
ADD
    status INT,
    categoria VARCHAR(50);