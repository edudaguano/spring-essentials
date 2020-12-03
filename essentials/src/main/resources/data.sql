INSERT INTO PAIS(CRIACAO,NOME,SIGLA) VALUES('1600-01-01','BRASIL','BR');

INSERT INTO ESTADO(CRIACAO,NOME,SIGLA,PAIS_ID) VALUES('2000-01-01','Sao Paulo','SP',1);
INSERT INTO ESTADO(CRIACAO,NOME,SIGLA,PAIS_ID) VALUES('2000-01-01','Rio de Janeiro','RJ',1);

INSERT INTO PAIS_ESTADOS(PAIS_ID,ESTADOS_ID) VALUES (1,1);
INSERT INTO PAIS_ESTADOS(PAIS_ID,ESTADOS_ID) VALUES (1,2);

INSERT INTO CIDADE(CRIACAO,NOME,SIGLA,ESTADO_ID) VALUES('2000-01-01','Assis','AS',1);
INSERT INTO CIDADE(CRIACAO,NOME,SIGLA,ESTADO_ID) VALUES('2000-02-01','Maracai','MA',1);

INSERT INTO ESTADO_CIDADES (ESTADO_ID,CIDADES_ID) VALUES (1,1);
INSERT INTO ESTADO_CIDADES (ESTADO_ID,CIDADES_ID) VALUES (1,2);

