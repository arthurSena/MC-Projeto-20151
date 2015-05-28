# MC-Projeto-20151
Este projeto é uma Investigação de diferentes técnicas de implementação de algoritmos de busca por textos. Nosso objetivo é comparar três algoritmos de busca por textos e compará-los em termo de desempenho. Iremos utilizar algumas métricas, como tempo de execução, consumo de memória e número de operações realizadas.

Para rodar esse o programa execute o script em shell chamado "coletor_de_dados.sh" passando o nome da técnica, a palavra e texto onde ocorrerá a busca. 

Exemplo:

./coletor_de_dados.sh Knuth-Morris-Pratt palavra.txt texto.txt

./coletor_de_dados.sh Rabin–Karp palavra.txt texto.txt

./coletor_de_dados.sh forca-bruta palavra.txt texto.txt

Os comandos devem ser executados dentro do diretório onde o "tar.gz" foi extraído. Tais comandos estão supondo que a palavra e o texto estão no mesmo diretório.
