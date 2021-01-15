<h2>API De Cadastro de Usuários novos Para um Banco: Desenvolvendo o método POST em um sistema de gerenciamento de pessoas em API REST com Spring Boot</h2>

Neste projeto, será elaborado um pequeno sistema para o cadastro de pessoas de um banco fictício através de uma API REST, criada com o Spring Boot. Este projeto é parte da segunda etapa do Processo Seletivo da ZUP Innovation.

Durante o projeto, serão desenvolvidos e abordados os seguintes tópicos:

* Criação da operação Create (CRUD) em RESTSPRING;
* Elaborar a solução através de uma arquitetura de fácil manutenção e aplicação de testes;
* Utilizar frameworks modernos que podem ajudar muito na legibilidade do nosso código;
* Fazer a validação dos dados através de validadores das bibliotecas SPRING e também construindo nosso pró prio @Constraint para garantir que o e-mail cadastrado e o CPF são únicos
em nossa base de dados;
* Persistir os dados em um banco de dados, no nosso exemplo, vamos utilizar um PostgreSQL rodando em um Docker container;
* Fazer o tratamento de mensagens de erro e de sucesso.


Para executar o projeto no terminal, digite o seguinte comando:


```shell script
mvn spring-boot:run 
```


Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:


```
http://localhost:3080/api/v1/users
```


São necessários os seguintes pré-requisitos para a execução do projeto desenvolvido durante a aula:

* Java 11 ou versões superiores.
* Maven 3.6.3 ou versões superiores.
* Intellj IDEA Community Edition ou sua IDE favorita.
* Controle de versão GIT instalado na sua máquina.
* Docker rodando um container de uma imagem padrão do PostgreSQL;
* Insomnia ou Postman, para verificação de endpoints;
* Ferramenta para verificação de bancos de dados, no nosso caso: DBeaver;
* Muita vontade de aprender e compartilhar conhecimento :)

Abaixo, seguem links com conteúdos que deram bastante suporte ao desenvolvimento:

* [SDKMan! para gerenciamento e instalação do Java e Maven](https://sdkman.io/)
* [Referência do Intellij IDEA Community, para download](https://www.jetbrains.com/idea/download)
* [Palheta de atalhos de comandos do Intellij](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)
* [Site oficial do Spring](https://spring.io/)
* [Site oficial do Spring Initialzr, para setup do projeto](https://start.spring.io/)
* [Site oficial do Heroku](https://www.heroku.com/)
* [Site oficial do GIT](https://git-scm.com/)
* [Site oficial do GitHub](http://github.com/)
* [Documentação oficial do Lombok](https://projectlombok.org/)
* [Documentação oficial do Map Struct](https://mapstruct.org/)
* [Referência para o padrão arquitetural REST](https://restfulapi.net/)
