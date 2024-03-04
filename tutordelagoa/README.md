## Simulador de funcionamento do jogo Tutordepassaros(pond game)

Esse trabalho visa mostrar elementos do jogo pond game onde esta separado os elementos da tela do jogo e os elementos dos modelos dos personagens do jogo os tópicos necessarios para o trabalho 

## pacote modelo

Dentro do pacote modelo contem os personagens do jogo sendo a classe pai `Modelo` contendo os elementos que as classes filhos devem ter, no caso `Modeloalv`e `Modeloat`sendo (modelo do alvo e modelo do atirador). Em modelo a interface simples de `InterdeDesenho` foi implementada só para informar que a classe `Modelo`deve conter o contrutor `Desenho`, este contrutor serve para que seja feito um desenho na classe `Tela` com o modelo de cada personagem como exemplo ` g.fillOval(this.getPosicaox(), this.getPosicaoy(), this.getSize(), this.getSize());`, serve para informar a tela que o desenho do personagem é um circulo com as posições indicadas e o tamanho determinado.

## pacote tela
No pacote tela temos as seguintes classes `NumericFilter` e `Tela`. A classe `Tela` contem apenas as definições do que tem que conter na tela como cor do Background (`this.setBackground(Color.white);`), e cria os elementos indicados nas classes de `Modeloalv`e `Modeloat`, definindo seu tamanho `size`, e sua posição na tela `posicaox`e `posicaoy`. Ja no `NumericFilter` serve para que dentro das caixas de dialogos da tela filtre apenas números e não letras ou outros caracteres. 
## Main
A `Main` é onde a maior parte do funcionamento esta como a definição do titulo da tela, o tamanho, e todos elementos das outras pastas, dentro da `Main`também é adicionado as duas caixas de dialogos informados como `angulo` e `distancia`, porém com o decorrer do código as duas variaveis foram apenas chamadas de `X` e `Y`, que é equivalente a `posicaox` e a `posicaoy` da tela, e um botão com a função atirar que ao apertar dispara um comando para que o programa busque analizar se o jogador atirou nas posições indicadas, ou seja o jogador tem que digitar os valores de x e y para que apareça uma mensagem de que o jogados ganhou ou perdeu e caso o usuario não informar os valores uma exception é disparada `NumberFormatException`informando que a caixa de dialogo não pode estar vazia 

