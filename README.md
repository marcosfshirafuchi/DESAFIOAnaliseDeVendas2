# DESAFIO: Análise de vendas 2
<a href="https://imgbb.com/"><img src="https://i.ibb.co/7p6ZMG9/image-2024-03-29-T20-22-02-505-Z.png" alt="image-2024-03-29-T20-22-02-505-Z" border="0" align="right"></a>
Você deve ler um arquivo .csv contendo uma base de dados de registros
de venda, e instanciar na memória uma lista de objetos do tipo Sale,
conforme projeto ao lado (Atenção: não use tipos primitivos int e double
nos atributos e métodos! Use os tipos wrapper Integer e Double,
conforme mostrado no projeto).<br><br>
Favor baixar a base de dados .csv daqui:<br>
https://gist.github.com/acenelio/e4e169691ee5aef2c56c87bc22a54379<br><br>
Depois de ler os dados, seu programa deverá mostrar o total vendido por cada vendedor conforme exemplo
(a ordem em que os vendedores são mostrados não importa).<br><br>
Atenção: seu programa é que deve varrer toda a lista para encontrar os nomes dos vendedores.<br><br>
Atenção: caso ocorra alguma falha na leitura do arquivo, a exceção deve ser tratada, e mostrada uma
mensagem conforme exemplo.<br><br>
Dicas:<br><br>
1) Para resolver este problema, você deve primeiro varrer toda a lista gerando os nomes únicos de cada
vendedor. Para fazer isso de forma eficiente, use a coleção Set ou Map, pois estas não admitem repetição.<br><br>
2) Uma vez que você tenha uma coleção com os nomes únicos de cada vendedor, use métodos Stream +
lambda para extrair o total vendido por cada um.<br><br>

# EXEMPLO 1 (CONSIDERANDO A BASE DE DADOS ACIMA):<br>
Entre o caminho do arquivo: c:\temp\in.csv<br><br>
Total de vendas por vendedor:<br>
Logan - R$ 220443.05<br>
Rachel Roth - R$ 502478.67<br>
Padme Amidala - R$ 473104.63<br>
Victor Von Doom - R$ 478657.40<br>
Barry Allen - R$ 499946.28<br>
Anakin - R$ 477153.54<br>
Kal-El - R$ 444881.58<br>
Wanda Maximoff - R$ 470741.34<br><br>

# EXEMPLO 2:<br>
Entre o caminho do arquivo: c:\temp\in<br>
Erro: c:\temp\in (O sistema não pode encontrar o arquivo especificado)<br><br>

# CRITÉRIOS DE AVALIAÇÃO (TODOS DEVEM ESTAR CORRETOS):<br>
1) Leitura correta do arquivo.<br>
2) Uso das coleções Set e/ou Map de forma coerente.<br>
3) Uso das funções Stream + lambda de maneira coerente.<br>
4) Tratamento de exceção correto.<br>
5) Resultados com valores corretos.<br>
