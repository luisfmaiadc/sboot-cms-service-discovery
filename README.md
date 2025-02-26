<h1 align="center">sboot-cms-service-discovery</h1>

<p align="center" style="margin-bottom: 20;">
    <img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
    <img src="https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white" alt="Springboot" />
    <img src="https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white" alt="Apache Maven" />
</p>

<p align="center">O <b>sboot-cms-service-discovery</b> é o <b>Eureka Server</b> do <b>Sistema de Gerenciamento de Cursos</b>, responsável pelo registro e descoberta de microsserviços. Ele permite que os serviços se localizem dinamicamente dentro da arquitetura, facilitando a comunicação entre eles.</p>

<h2>📌 Visão Geral</h2>
<p align="justify">Em uma arquitetura baseada em microsserviços, é fundamental que os serviços saibam como se conectar uns aos outros sem depender de URLs fixas. O Eureka Service Discovery resolve essa questão ao atuar como um registro central onde os microsserviços se registram e descobrem dinamicamente suas localizações.</p>

<h4>🔹 Principais funcionalidades</h4>

- Atua como Eureka Server, permitindo o registro e a descoberta de serviços.
- Remove a necessidade de configurar manualmente endereços de IP ou hostnames fixos.
- Atualiza automaticamente a lista de serviços disponíveis.

<h2>🚀 Tecnologias Utilizadas</h2>

- <b>Java 21 + Spring Boot 3.4.2</b>
- <b>Spring Cloud Netflix Eureka Server</b>

<h2>🏗️ Estrutura do Projeto</h2>

```bash
sboot-cms-service-discovery
│-- src/main/java/com/portfolio/luisfmdc/sboot_cms_service_discovery
│   ├── SbootServiceDiscoveryApplication.java  # Classe principal
│-- src/main/resources
│   ├── application.properties  # Configuração do Eureka Server
│-- pom.xml  # Dependências do projeto
```

<h3>📜 Configuração (<code>application.properties</code>)</h3>

```properties
spring.application.name=sboot-cms-service-discovery

eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false
eureka.client.serviceUrl.defaultZone=http://localhost:8082/eureka

server.port=8082
```
<p> Como Eureka Server, este serviço não precisa se registrar em outro servidor, por isso as configurações register-with-eureka e fetch-registry estão definidas como false.</p>

<h2>🛠️ Configuração e Execução</h2>

<h3>📌 Pré-requisitos</h3>
<p>Antes de iniciar o serviço, é necessário:</p>

1. Ter <b>Java 21</b> e <b>Maven</b> instalados.

<h3>🚀 Executando o Serviço</h3>

1. Clone o repositório e navegue até o diretório <code>sboot-cms-service-discovery</code>:

```sh
git clone https://github.com/luisfmaiadc/sboot-cms-service-discovery.git
cd sboot-cms-service-discovery
```

2. Compile e execute o projeto com:

```sh
mvn clean install
mvn spring-boot:run
```

3. O serviço estará disponível na porta 8082 conforme configurada em <code>application.properties</code>.

<h2>🔗 Comunicação com Outros Microsserviços</h2>

Todos os microsserviços do sistema devem se registrar no Service Discovery adicionando a seguinte configuração em seus arquivos <code>application.properties</code>:

```properties
eureka.client.serviceUrl.defaultZone=http://localhost:8082/eureka
```

<p>Isso permite que os serviços descubram uns aos outros sem necessidade de configurar URLs fixas, tornando o sistema dinâmico e escalável.</p>

<h2>📚 Mais Informações</h2>
<p>Para uma visão completa do sistema, incluindo a arquitetura, os demais microsserviços e detalhes sobre o desenvolvimento, acesse o README principal do projeto:</p>


➡️ [Visão Geral do Sistema](https://github.com/luisfmaiadc/pom-base-course-management-system) 