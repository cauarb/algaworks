CREATE TABLE pessoa (
                        codigo BIGINT PRIMARY KEY AUTO_INCREMENT,
                        nome VARCHAR(50) NOT NULL,
                        ativo BOOLEAN NOT NULL,
                        logradouro VARCHAR(100),
                        numero VARCHAR(10),
                        complemento VARCHAR(50),
                        bairro VARCHAR(50),
                        cep VARCHAR(9),
                        cidade VARCHAR(50),
                        estado VARCHAR(2)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
VALUES ('João Silva', true, 'Rua do Abacaxi', '10', null, 'Brasil', '38.400-12', 'Uberlândia', 'MG');

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
VALUES ('Maria Rita', true, 'Rua do Sabiá', '110', 'Apto 101', 'Colina', '11.400-12', 'Ribeirão Preto', 'SP');