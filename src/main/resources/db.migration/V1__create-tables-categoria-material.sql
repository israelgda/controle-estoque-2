-- Cria tabela de Categorias
CREATE TABLE categoria (
	id serial primary key,
	nome text not null,
	descricao text not null
);

-- Cria tabela de materiais
CREATE TABLE material (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    observacao VARCHAR(255),
    comprimento DOUBLE PRECISION NOT NULL,
    largura DOUBLE PRECISION NOT NULL,
    preco_por_unidade DOUBLE PRECISION NOT NULL,
    unidade_medida DOUBLE PRECISION NOT NULL
);