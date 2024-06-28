# MGS (Max Global Sports) 
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/devsuperior/sds1-wmazoni/blob/master/LICENSE) 

# Sobre o projeto

O código apresentado é uma implementação em Java de um sistema de gerenciamento de informações de empregados para a empresa MGS (Max Global Sports). Ele é dividido em duas classes principais: Empregado e GerenciadorDeEmpregados.

# Tecnologias utilizadas
## Back end
- Java

# Como executar o projeto

## Classe Empregado
Esta classe representa um empregado e contém os seguintes atributos privados:
- id: identificador único do empregado.
- nome: nome do empregado.
- alergias: informações sobre alergias do empregado.
- problemasMedicos: informações sobre problemas médicos do empregado.
- telefoneContato: número de telefone para contato.
- emailContato: endereço de email para contato.
  
A classe Empregado inclui um construtor para inicializar esses atributos e métodos "getter" para acessar cada um deles. Também possui um método toString que formata e retorna uma string contendo todas as informações do empregado de forma legível.

## Classe GerenciadorDeEmpregados
Esta classe gerencia uma coleção de empregados usando um HashMap, onde a chave é o ID do empregado e o valor é um objeto Empregado. Ela inclui:
- Um construtor que inicializa o HashMap.
- O método adicionarEmpregado, que adiciona um novo empregado ao mapa.
- O método buscarEmpregado, que busca um empregado no mapa usando o ID e retorna o objeto Empregado correspondente.
  
A classe também contém um método main, que serve como ponto de entrada do programa. Este método cria uma instância de GerenciadorDeEmpregados e usa um Scanner para interagir com o usuário via terminal. O usuário pode:

1.Adicionar um novo empregado: O programa solicita as informações do empregado, cria um novo objeto Empregado, e o adiciona ao HashMap.

2.Buscar um empregado: O programa solicita o ID do empregado e, se encontrado, exibe suas informações. Se o empregado não for encontrado, uma mensagem de erro é exibida.

3.Sair do programa.

## Resumo
Em resumo, este código cria um sistema simples de gerenciamento de empregados que permite adicionar e buscar informações de empregados via terminal, utilizando conceitos básicos de Programação Orientada a Objetos em Java.

# Autor

Edmar Fernando de Souza Santana 
