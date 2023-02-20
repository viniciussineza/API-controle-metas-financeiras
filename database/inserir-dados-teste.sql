INSERT INTO categorias 
(
    nome_categoria
) VALUES
('Eletrônicos'),
('Viagem'),
('Imóvel'),
('Estudos');

INSERT INTO metas_financeiras 
(
    descricao,
    data_inicio,
    data_fim,
    status,
    cod_categoria
) VALUES 
(
    'Melhorar setup de trabalho e games',
    '2023-02-19',
    '2024-02-19',
    1,
    1
),
(
    'Viagem em família',
    '2024-02-20',
    '2026-02-20',
    1,
    2
),
(
    'Comprar apartamento',
    '2023-02-19',
    '2030-02-19',
    1,
    3
),
(
    'Pós graduação',
    '2023-06-15',
    '2025-01-15',
    1,
    4
);

INSERT INTO produtos
(
    nome_produto,
    valor,
    cod_meta
) VALUES 
( 
    'Monitor Gamer',
    2000.00,
    1
),
(
    'Placa de vídeo RGB',
    3000.00,
    1
),
(
    'Memória 32 mb',
    1000.00,
    1
),
(
    'Cabo de rede',
    10.00,
    1
),
(
    'Passagens Spaceland',
    300.00,
    2
),
(
    'Hospedagem',
    500.00,
    2
),
(
    'Transporte',
    200.00,
    2
),
(
    'Escritura',
    1000.00,
    3
),
(
    'Apartamento',
    300000.00,
    3
),
(
    'Livros técnicos',
    1000.00,
    4
),
(
    'Pós graduação',
    50000.00,
    4
);