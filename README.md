# Sonho sob medida

---
# Sobre
Objetivo: API com as funcionalidades CRUD e conexão da aplicação com o banco de dados para persistência.
Aplicação 

---
# Tecnologias

![java sdk 17](https://img.icons8.com/color/96/null/java-coffee-cup-logo--v1.png)
![sql server](https://img.icons8.com/color/96/null/microsoft-sql-server.png)
![docker](https://img.icons8.com/color/96/null/docker.png)
![ubuntu](https://img.icons8.com/color/96/null/ubuntu--v1.png)

# Faça Comigo

## Pré requisitos

- Java
- Maven
- IDE
- Docker
- Imagem SQL Server 2022

## Instalação

### Utilização

---

### Banco de Dados + Dados de teste

1. Configuração Docker
```bash
docker pull mcr.microsoft.com/mssql/server:2022-latest
docker run -e "ACCEPT_EULA=Y" -e "MSSQL_SA_PASSWORD=definirSenha" -p 1433:1433 -d mcr.microsoft.com/mssql/server:2022-latest
```
*Usuário default **SA***

2. Acessar o [diretório](https://github.com/viniciussineza/API-controle-metas-financeiras/tree/main/database) com scripts de inicialização do banco de dados<br>
**Ordem de execução**
    1. create-database.sql
    2. criar-tabelas.sql
    3. inserir-dados-teste.sql
    4. relatorio.sql

---

## Aplicação

**Sobre a configuração da conexão com o banco de dados no *arquivo.properties*.**

- Preecher os campos **url**, **username**, **password** e caso esteja utilizando outro banco, alterar o driver.

>**Simulação DNS**
>- No campo **url**, caso queira simular a conexão por uma url ao invés de IP:
>- abra o arquivo hosts (C:/windows/system32/drivers/etc/hosts) e adicione um nome para o ip do seu banco
>  **127.0.0.1 caso seja local** ou o **Ip da sua máquina virtual** caso esteja usando **Docker** ou **banco na nuvem**
>- passe o nome no arquivo properties seguido da porta para a conexão.

*Exemplo arquivo.properties*
```
#Cors config

#Database config
spring.datasource.url=jdbc:sqlserver://database-server.com.br:1433;databaseName=[database-name];encrypt=true;trustServerCertificate=true;hostNameInCertificate=*;
spring.datasource.username=${application-user}
spring.datasource.password=${application-passoword}
spring.datasource.driver-class-name=com.microsoft.sqlserver.jdbc.SQLServerDriver

#SQL log
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.hibernate.dialect=org.hibernate.dialect.SQLServerDialect

```

**Para não haver risco de commitar usuário e senha do banco no git, recomenda-se utilizar variáveis de ambiente.<br> No IntelliJ, no menu Run/DeBug configurations informar as variáveis**


## To do
- [ ] Validação entrada de dados
- [ ] Alterar a entrada das datas do JSON, re pensar a regra de negócio sobre os calculos das metas

## Contato
Vinicius Sineza [linkedin](https://www.linkedin.com/in/vinícius-sineza-1bba3b28/)