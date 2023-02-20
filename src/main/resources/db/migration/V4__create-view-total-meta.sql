CREATE VIEW ViewProdutosMetas AS (
	SELECT
		mf.descricao,
		SUM(p.valor) AS total_meta
	FROM metas_financeiras mf
		JOIN produtos p ON mf.cod_meta = p.cod_meta
	GROUP BY
		descricao
);