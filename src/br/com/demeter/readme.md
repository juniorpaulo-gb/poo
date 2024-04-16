1 - Suponha a existência de um método divida() na classe Locatario, que retorna um Double representando o valor da dívida de um locatário qualquer. A partir disso, podemos implementar um método ehBomPagador(), que retorna true quando a dívida do locatário é de até R$ 100) como exemplo do primeiro princípio da Lei de Demeter.
2 - Suponha a existência de um método pagar(Locacao $locacao) na classe Locatario, que seta o atributo paga da classe Locacao para true caso a locação em questão realmente pertença ao locatário e ela realmente ainda não foi paga. O método tem tipo de retorno void.
3 - Suponha a existência de um método locacoesEmAberto() na classe Locatario, que retorna um ArrayList com todos as locações que ainda não foram pagas de um locatário qualquer
4 - Suponha a existência de um método categoria() na classe Locatario que retorne uma String, de acordo com o volume de locações que um locatário possui:
    – OURO: caso o locatário possua 100 ou mais locações;
    – PRATA: caso o locatário possua entre 50 e 99 locações
    – BRONZE: abaixo de 50 locações
5 - Implemente o método divida() da classe Locatario respeitando todos os princípios da Lei de Demeter e considerando os seguintes pontos:
    (1) O valor padrão de uma locação é quantidade de dias que um veículo foi locado (que será no mínimo de1 dia) multiplicada pelo valor da diária desse veículo
    (2) Caso o locatário tenha percorrido mais de 200 km por dia durante a locação, a quilometragem excedente deve ser multiplicada pelo valor do quilômetro adicional do carro locado
    (3) O valor total do aluguel é a soma de (1) e (2)