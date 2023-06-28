create schema aluno;

use aluno;

CREATE TABLE alunos (
    idAluno INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(60),
    matricula VARCHAR(60),
    turma VARCHAR(60),
    projeto VARCHAR(60)
);

CREATE TABLE projetos (
    idProjeto INT PRIMARY KEY AUTO_INCREMENT,
    EixoTec VARCHAR(8) NOT NULL UNIQUE,
    DataInicio date,
    DataFim date,
    nIntegrantes INT(4),
    FOREIGN KEY (idProjeto) REFERENCES alunos(idAluno)
);