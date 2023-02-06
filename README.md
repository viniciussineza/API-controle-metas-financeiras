# Sonho sob medida

# Sobre

# Tecnologias

![java sdk 17](https://img.icons8.com/color/96/null/java-coffee-cup-logo--v1.png)
![mysql](https://img.icons8.com/color/96/null/mysql-logo.png)
![docker](https://img.icons8.com/color/96/null/docker.png)
![ubuntu](https://img.icons8.com/color/96/null/ubuntu--v1.png)

# Faça Comigo

## Pré requisitos

- Java
- Maven
- IDE
- Docker
- Imagem SQL Server 2022

### Instalação

### Utilização

**Sobre a configuração da conexão com o banco de dados no *arquivo.properties*.**

- Preecher os campos **url**, **username**, **password** e caso esteja utilizando outro banco, alterar o driver.

#### Simulação DNS
- No campo **url**, caso queira simular a conexão por uma url ao invés de IP:
- abra o arquivo hosts (C:/windows/system32/drivers/etc/hosts) e adicione um nome para o ip do seu banco
  **127.0.0.1 caso seja local** ou o **Ip da sua máquina virtual** caso esteja usando **Docker** ou **banco na nuvem**
- passe o nome no arquivo properties seguido da porta para a conexão.
```
jdbl:mysql://database-server.com.br:3306/nome-da-base-de-dados
```

**Não esquecer de não commitar o application.properties com as informações de login do b

## To do

## Contato
Vinicius Sineza [linkedin](https://www.linkedin.com/in/vinícius-sineza-1bba3b28/)