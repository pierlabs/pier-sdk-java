# pier-sdk-java

## Requerimentos

Ã‰ necessÃ¡rio vocÃª empacotar o cÃ³dido com o [Maven](https://maven.apache.org/) para que possa ser utilizado. 

## InstalaÃ§Ã£o e utilizaÃ§Ã£o

Para instalar o pier-sdk-java em seu repositorio local do maven simplesmente execute:

```shell
mvn install
```

Para fazer deploy do artefato gerado em algum repositÃ³rio maven configure o arquivo pom.xml com as informaÃ§Ãµes do seu Artifactory ou Nexus e execute o comando abaixo. Caso nÃ£o possua nenhum repositÃ³rio para suas bibliotecas maven nÃ³s recomendamos a utilizaÃ§Ã£o do [Jitpack](https://jitpack.io/). Essa ferramenta simplifica muito a utilizaÃ§Ã£o de bibliotecas maven hospedadas no [Github](https://github.com).

```shell
mvn deploy
```

Depois da biblioteca Maven instalada vocÃª pode utilizar em seus projetos Java adicionando no seu arquivo pom.xml

### Maven

#### RepositÃ³rios
```xml
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```

#### DependÃªncia
```xml
	<dependency>
	    <groupId>com.github.devconductor</groupId>
	    <artifactId>pier-sdk-java</artifactId>
	    <version>2.49.5</version>
	</dependency>
```

### Gradle

#### RepositÃ³rios
```groovy
	allprojects {
		repositories {
			maven { url "https://jitpack.io" }
		}
	}
```

#### DependÃªncia
```groovy
	dependencies {
	 	compile 'com.github.devconductor:pier-sdk-java:2.49.5'
	}
```


## Criando um API Client

Antes de utilizar as APIs, Ã© necessÃ¡rio a criaÃ§ao de um client com as configuraÃ§oes de _base path_ e tambÃ©m as credenciais para acesso.

Abaixo segue o cÃ³digo de exemplo:

```java
ApiClient apiClient = new ApiClient();
apiClient.setBasePath("https://sandbox.conductor.com.br/pier/v1.1");

// Alterar a chave informada com o valor de client_id disponÃ­vel para sua APP
((ApiKeyAuth)apiClient.getAuthentication("client_id")).setApiKey("CLIENT_ID");

// Alterar a chave informada com o valor de access_token disponÃ­vel para sua APP
((ApiKeyAuth)apiClient.getAuthentication("access_token")).setApiKey("ACESS_TOKEN");
```

## Exemplo: Consultando um determinado cartÃ£o

No exemplo abaixo vamos consultar um determinado cartÃ£o de crÃ©dito de uma determinada conta. Para isso utilize o mÃ©todo `consultarCartaoUsingGET` da classe `CartaoApi`.
Todas as classes de recursos da API recebem no seu construtor o ApiClient gerando no mÃ©todo acima:

```java
ContaApi contaApi = new ContaApi(apiClient);
ContaDetalhe consultarUsingGET3 = contaApi.consultarUsingGET3(1L);
System.out.println(consultarUsingGET3);
```

## Author

pierlabs@conductor.com.br


