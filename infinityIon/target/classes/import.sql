-- Tabela Cliente
INSERT INTO Cliente (cpf, nome, regiao, email, telefone) VALUES ('12345678900', 'João da Silva', 'Sudeste', 'joao.silva@example.com', '11987654321');
INSERT INTO Cliente (cpf, nome, regiao, email, telefone) VALUES ('98765432100', 'Maria Oliveira', 'Nordeste', 'maria.oliveira@example.com', '81987654321');
INSERT INTO Cliente (cpf, nome, regiao, email, telefone) VALUES ('12312312345', 'Carlos Souza', 'Sul', 'carlos.souza@example.com', '41987654321');

-- Tabela Residencia
INSERT INTO Residencia (Residencia_ID, Cliente_ID, CEP, Consumo_Energia, Nivel_Consumo, Area, Fonte_Energia) VALUES (1, '12345678900', '12345678', 150.75, 'Médio', 'Urbana', 'Solar');
INSERT INTO Residencia (Residencia_ID, Cliente_ID, CEP, Consumo_Energia, Nivel_Consumo, Area, Fonte_Energia) VALUES (2, '98765432100', '87654321', 200.50, 'Alto', 'Interior', 'Hidrelétrica');
INSERT INTO Residencia (Residencia_ID, Cliente_ID, CEP, Consumo_Energia, Nivel_Consumo, Area, Fonte_Energia) VALUES (3, '12312312345', '11223344', 120.00, 'Baixo', 'Rural', 'Biomassa');


-- Tabela Solução
INSERT INTO Solucao (ID_solucao, Residencia_ID, Tipo, Valor, Classificacao, Durabilidade, Custo_Instalacao) VALUES (1, 1, 'Painel Solar', 5000.00, 'A', '20 anos', 1000.00);
INSERT INTO Solucao (ID_solucao, Residencia_ID, Tipo, Valor, Classificacao, Durabilidade, Custo_Instalacao) VALUES (2, 2, 'Bateria', 2000.00, 'B', '10 anos', 500.00);
INSERT INTO Solucao (ID_solucao, Residencia_ID, Tipo, Valor, Classificacao, Durabilidade, Custo_Instalacao) VALUES (3, 3, 'Inversor', 1500.00, 'A', '15 anos', 300.00);

-- Tabela Historico Consumo
INSERT INTO HistoricoConsumo (hist_consumo_ID, Residencia_ID, Data, Consumo_Energia) VALUES (1, 1, '2023-01-01', 160.75);
INSERT INTO HistoricoConsumo (hist_consumo_ID, Residencia_ID, Data, Consumo_Energia) VALUES (2, 2, '2023-01-02', 210.50);
INSERT INTO HistoricoConsumo (hist_consumo_ID, Residencia_ID, Data, Consumo_Energia) VALUES (3, 3, '2023-01-03', 140.25);


-- Tabela IA
INSERT INTO IA (ia_ID, Historico_Consumo_ID, Tipo, Data_Analise, Resultado_Analise) VALUES (1, 1, 'Previsão de Consumo', '2023-04-06', 'Consumo previsto para o próximo mês: 180 kWh');
INSERT INTO IA (ia_ID, Historico_Consumo_ID, Tipo, Data_Analise, Resultado_Analise) VALUES (2, 2, 'Análise de Padrões', '2023-04-06', 'Padrão de consumo anômalo detectado em março');
INSERT INTO IA (ia_ID, Historico_Consumo_ID, Tipo, Data_Analise, Resultado_Analise) VALUES (3, 3, 'Análise de Consumo', '2023-04-06', 'Consumo consistente com meses anteriores');
