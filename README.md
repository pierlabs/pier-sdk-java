# pier-sdk-java

## Requerimentos

É necessário você empacotar o códido com o [Maven](https://maven.apache.org/) para que possa ser utilizado. 

## Instalação e utilização

Para instalar o pier-sdk-java em seu repositorio local do maven simplesmente execute:

```shell
mvn install
```

Para fazer deploy do artefato gerado em algum repositório maven configure o arquivo pom.xml com as informações do seu Artifactory ou Nexus e execute o comando abaixo. Caso não possua nenhum repositório para suas bibliotecas maven nós recomendamos a utilização do [Jitpack](https://jitpack.io/). Essa ferramenta simplifica muito a utilização de bibliotecas maven hospedadas no [Github](https://github.com).

```shell
mvn deploy
```

Depois da biblioteca Maven instalada você pode utilizar em seus projetos Java adicionando no seu arquivo pom.xml

### Maven

#### Repositórios
```xml
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```

#### Dependência
```xml
	<dependency>
	    <groupId>com.github.devconductor</groupId>
	    <artifactId>pier-sdk-java</artifactId>
	    <version>2.57.0</version>
	</dependency>
```

### Gradle

#### Repositórios
```groovy
	allprojects {
		repositories {
			maven { url "https://jitpack.io" }
		}
	}
```

#### Dependência
```groovy
	dependencies {
	 	compile 'com.github.devconductor:pier-sdk-java:2.57.0'
	}
```


## Criando um API Client

Antes de utilizar as APIs, é necessário a criaçao de um client com as configuraçoes de _base path_ e também as credenciais para acesso.

Abaixo segue o código de exemplo:

```java
ApiClient apiClient = new ApiClient();
apiClient.setBasePath("https://sandbox.conductor.com.br/pier/v1.1");

// Alterar a chave informada com o valor de client_id disponível para sua APP
((ApiKeyAuth)apiClient.getAuthentication("client_id")).setApiKey("CLIENT_ID");

// Alterar a chave informada com o valor de access_token disponível para sua APP
((ApiKeyAuth)apiClient.getAuthentication("access_token")).setApiKey("ACESS_TOKEN");
```

## Exemplo: Consultando um determinado cartão

No exemplo abaixo vamos consultar um determinado cartão de crédito de uma determinada conta. Para isso utilize o método `consultarCartaoUsingGET` da classe `CartaoApi`.
Todas as classes de recursos da API recebem no seu construtor o ApiClient gerando no método acima:

```java
ContaApi contaApi = new ContaApi(apiClient);
ContaDetalhe consultarUsingGET3 = contaApi.consultarUsingGET3(1L);
System.out.println(consultarUsingGET3);
```

## Author

pierlabs@conductor.com.br


