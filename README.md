# JogoDaVidaThread

Software para simular a vida util de um grupo de bactérias representadas por um txt contendo 0's e 1's.

a entrada é (.txt + quantidade de geracoes como argumento).

as validações são.
                
              - Se a celula estiver viva e tem menos de 2 ou mais de 3 vizinhos vivos ela MORRE.
              - uma celula viva, adjacente a 2 ou 3 celulas vivas permanece viva.
              - uma celula morta, adjacente a 3 celulas vivas ela "revive".
              - Se a celula esta morta e tem menos ou mais de 3 vizinhos vivos ela continua morta.
               
o programa gera uma saida com o resultado final de bactérias vivas e mortas atravez de gerações. (tente algo como 5000 gerações rs ) (:

____________________________________________________________

Software to simulate the useful life of a group of bacteria represented by a txt containing 0's and 1's.

the input is (.txt + amount of generations as argument).

as validations are.

- If the cell is alive and has less than 2 or more than 3 living neighbors, it DIES.
- a live cell adjacent to 2 or 3 live cells remains alive.
- a dead cell, adjacent to 3 living cells it "revives".
- If the cell is dead and has fewer than 3 living neighbors, it is still dead.

the program generates an output with the final result of live and dead bacteria across generations. (try something like 5000 generations)
