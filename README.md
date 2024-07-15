<h1>Dianome API REST</h1>

<h2>🔖 Sobre</h2>
<p>
  Este projeto foi construido para controlar os entregadores, usei o sgbd MySql e fiz a integração com o eclipse, esse sistema Rest faz um cadastro dos entregadores e é basicamente um CRUD então temos uma oção
  para deletar(DELETE) outra para inserir(POST) outro para puxar os dados(GET) outro para alterar(PUT) para vc acessar basta vc iniciar o servidor spring do Java aplication e logo depois colar o url em seu navagador http://localhost:8080/entregadores outro ponto a se falar é uma implemenação GetMapping que eu fiz para puxar os Id, para realizar isso basta coloca localhost:8080/entregadores/Id que vc quer consultar Básicamente fiz 4 chamadas Rest, os pacotes e as classes foram separados.

<h3>Descrição do Projeto</h3>
A Dianome, uma empresa de entregas, está buscando um software simples para gerenciar algumas de suas operações. O projeto propõe resolver um dos três principais problemas da empresa, sendo eles: controle de entregadores, controle de pacotes ou controle de reclamações. Eu optei por resolver o problema de Controle de Entregadores.

<h4>
Instruções de Operação - Dianome</h4>

<h5>Requisitos Prévios</h5>
Antes de começar, certifique-se de ter os seguintes requisitos instalados em sua máquina:

Java Development Kit (JDK) 8 ou superior
Apache Maven
MySQL ou PostgreSQL (Você pode escolher qualquer um dos dois no meu caso eu optei pelo MySQL)

Logo após Crie um banco de dados vazio no MySQL ou PostgreSQL com o nome dianome_delivery ou dianome.

Configuração do Projeto
Clone o repositório do GitHub Usando o seguinte código:git clone [link_para_o_repositorio]
Logo após isso cole o seguinte código:cd dianome-delivery-management-system
Compile o projeto usando o Maven:mvn clean install
mvn clean install
Execute o projeto usando o Maven:mvn spring-boot:run 
(ou se quiser Baixe o projeto zip abra no eclipse e execute no eclipse no botão de Run Java project)

O projeto será iniciado e estará disponível em http://localhost:8080 Vc poderá usar um Rest Client, ou o Postman


<h6>Uso da API</h6>
A API fornece os seguintes endpoints:

Cadastro de Entregadores: POST http://localhost:8080/entregadores
Listagem de Entregadores: GET http://localhost:8080/entregadores
Detalhes de um Entregador: GET http://localhost:8080/entregadores/número do id
Atualização de Entregador: PUT http://localhost:8080/entregadores/número do id
Remoção de Entregador: DELETE http://localhost:8080/entregadores/número do id

OBS: Certifique-se de substituir id pelo identificador real do entregador.


</p>

## 🚀 Tecnologias Usadas
<div>
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"
  
  </div>

# Criador do Projeto

 <p>João Paulo Resende Costa e Silva no Centro Universitário de Brasíla CEUB</p> 
