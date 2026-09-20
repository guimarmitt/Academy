# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/4.1.1/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/4.1.1/maven-plugin/build-image.html)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

1 - Crie um novo projeto com Spring Boot, usando o site start.spring.io. Esse projeto será o contador, e funcionará na linha de comando. Você deve pedir para um usuário digitar um número e depois imprimir na tela uma contagem de 1 até o número digitado pelo usuário. Por exemplo, se o usuário digitar 5, deve aparecer no terminal 1 2 3 4 5 .

Criado no https://start.spring.io/ e depois testei o código sugerido na run()

2 - Suponha que decidimos mudar de ideia e utilizar novamente a biblioteca Gson no nosso projeto ScreenMatch. Agora que estamos trabalhando com o Maven, os passos para adicionar a biblioteca são diferentes do que já foi feito antes. Explique quais passos você iria realizar nesse caso.

Pesquisei as bibliotecas no https://mvnrepository.com/ e adicionei no pom.xml. Depois rodei o atualizador dele pra fazer o Download das libs

3 - Agora iremos trabalhar com serialização e desserialização. Para isso, você pode reaproveitar seu projeto do exercício 1. Adicione a dependência do Jackson ao seu pom.xml, pois iremos utilizá-la bastante nos próximos exercícios. Também crie uma classe Tarefa, com os seguintes atributos:
Copiar

public class Tarefa {
private String descricao;
private boolean concluida;
private String pessoaResponsavel;

    // Construtores, getters e toString
}

Para que o Jackson funcione corretamente, é importante que sua classe tenha todos os getters e um construtor padrão. Também é legal criar um método toString().

Copiei a Classe sugerida no projeto, tive que ajustar o pom.xml em função das bibliotecas mais modernas que temos

4 - Lembre-se: serializar um objeto é conseguir representá-lo de alguma forma em um arquivo. Aqui, você deve instanciar um objeto do tipo Tarefa e fazer com que o conteúdo do objeto vá para o arquivo tarefa.json. Para isso, utilize o Jackson para te auxiliar na tarefa. Observação: para criar novos arquivos, podemos utilizar new File("tarefa.json").

Testada serialização na run() com o código sugerido

5 - Agora, você fará o oposto da atividade anterior: a desserialização de um arquivo, que é ler os valores de um arquivo específico e transformar em um objeto. Leia o conteúdo do arquivo tarefa.json, produzido no exercício anterior, e o transforme em um objeto do tipo Tarefa. Exiba o conteúdo do objeto na tela.

Testada desearialização na run() com o código sugerido

6 - Vamos criar objetos genéricos. Imagine que você trabalha em um site que oferece várias coisas: venda de produtos, serviços de instalação desses produtos e assinatura de alguns itens. Todas essas coisas têm algo em comum: podem ser avaliadas pelos consumidores. Crie uma classe genérica de Avaliação, de modo que possamos ter, por exemplo: Avaliacao<Servico>, Avaliacao<Produto> e Avaliacao<Assinatura>. Essa classe deve ter o item genérico de avaliação, a nota e um comentário sobre a nota.

Testada utilização da classe sugerida