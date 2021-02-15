# Conceito de Herança
- Uma classe pode ter várias filhas, mas pode ter apenas uma mãe, é a chamada herança simples do java.
- Reescrita de método
  
- **A anotação @Override**
``` Há como deixar explícito no seu código que determinado método é a reescrita de um método da sua classe mãe. Fazemos isso colocando @Override em cima do método. Isso é chamado anotação. Existem diversas anotações e cada uma vai ter um efeito diferente sobre seu código. ```
  

- Polimorfismo
 ``` Na herança, vimos que todo Gerente é um Funcionario, pois é uma extensão deste. Podemos nos referir a um Gerente como sendo um Funcionario. Se alguém precisa falar com um Funcionario do banco, pode falar com um Gerente! Porque? Pois Gerente é um Funcionario. Essa é a semântica da herança.```
```Polimorfismo é a capacidade de um objeto poder ser referenciado de várias formas. (cuidado, polimorfismo não quer dizer que o objeto fica se transformando, muito pelo contrário, um objeto nasce de um tipo e morre daquele tipo, o que pode mudar é a maneira como nos referimos a ele).```
  


# Outro Exemplo:
- conta, conta corrente, conta poupanca, conta salario

-atributos
agencia, número, saldo, titular

-operacoes
public void transfere(double valor, Conta conta)
public void saca(double valor)
public void deposita(double valor)

-Classe Relatorio de Contas