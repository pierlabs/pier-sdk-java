package br.com.conductor.pier.api.v1_1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso Status Cart\u00C3\u00A3o
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso Status Cart\u00C3\u00A3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class StatusCarto   {
  
  private Integer flagAlteraStatus = null;
  private Integer flagCadastroNovaSenha = null;
  private Integer flagCancelaConta = null;
  private Integer flagCancelaNoDesbloqueio = null;
  private Integer flagCobraTarifa = null;
  private Integer flagDestinoTransferencia = null;
  private Integer flagEmiteProvisorio = null;
  private Integer flagExcecaoBandeira = null;
  private Integer flagOrigemTransferencia = null;
  private Integer flagReemiteCartao = null;
  private Long id = null;
  private Long idStatusDestinoConta = null;
  private Long idStatusDestinoDesbloqueio = null;
  private String nome = null;

  
  /**
   * Quando ativa, indica que ao ser atribu\u00C3\u00ADdo um idStatusCartao com essa caracter\u00C3\u00ADstica, o cart\u00C3\u00A3o ter\u00C3\u00A1 o seu idStatusCartao alterado para o que fora escolhido. Caso contr\u00C3\u00A1rio, o idStatusCartao s\u00C3\u00B3 ser\u00C3\u00A1 alterado ap\u00C3\u00B3s o desbloqueio de um novo cart\u00C3\u00A3o do mesmo Portador e Conta.
   **/
  public StatusCarto flagAlteraStatus(Integer flagAlteraStatus) {
    this.flagAlteraStatus = flagAlteraStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica que ao ser atribu\u00C3\u00ADdo um idStatusCartao com essa caracter\u00C3\u00ADstica, o cart\u00C3\u00A3o ter\u00C3\u00A1 o seu idStatusCartao alterado para o que fora escolhido. Caso contr\u00C3\u00A1rio, o idStatusCartao s\u00C3\u00B3 ser\u00C3\u00A1 alterado ap\u00C3\u00B3s o desbloqueio de um novo cart\u00C3\u00A3o do mesmo Portador e Conta.")
  @JsonProperty("flagAlteraStatus")
  public Integer getFlagAlteraStatus() {
    return flagAlteraStatus;
  }
  public void setFlagAlteraStatus(Integer flagAlteraStatus) {
    this.flagAlteraStatus = flagAlteraStatus;
  }

  
  /**
   * Quando ativa, indica que a senha cadastrada ser\u00C3\u00A1 exclu\u00C3\u00ADda no momento do Bloqueio do cart\u00C3\u00A3o com um idStatusCartao que possua essa caracter\u00C3\u00ADstica, sendo ent\u00C3\u00A3o necess\u00C3\u00A1rio o cadastro de uma nova senha.
   **/
  public StatusCarto flagCadastroNovaSenha(Integer flagCadastroNovaSenha) {
    this.flagCadastroNovaSenha = flagCadastroNovaSenha;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica que a senha cadastrada ser\u00C3\u00A1 exclu\u00C3\u00ADda no momento do Bloqueio do cart\u00C3\u00A3o com um idStatusCartao que possua essa caracter\u00C3\u00ADstica, sendo ent\u00C3\u00A3o necess\u00C3\u00A1rio o cadastro de uma nova senha.")
  @JsonProperty("flagCadastroNovaSenha")
  public Integer getFlagCadastroNovaSenha() {
    return flagCadastroNovaSenha;
  }
  public void setFlagCadastroNovaSenha(Integer flagCadastroNovaSenha) {
    this.flagCadastroNovaSenha = flagCadastroNovaSenha;
  }

  
  /**
   * Quando ativa, indica que cart\u00C3\u00B5es que tiverem um idStatusCartao atribu\u00C3\u00ADdo com essa caracter\u00C3\u00ADstica, e tal cart\u00C3\u00A3o seja de um titular (portador = 1), ter\u00C3\u00A3o a conta a qual o cart\u00C3\u00A3o pertence cancelada.
   **/
  public StatusCarto flagCancelaConta(Integer flagCancelaConta) {
    this.flagCancelaConta = flagCancelaConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica que cart\u00C3\u00B5es que tiverem um idStatusCartao atribu\u00C3\u00ADdo com essa caracter\u00C3\u00ADstica, e tal cart\u00C3\u00A3o seja de um titular (portador = 1), ter\u00C3\u00A3o a conta a qual o cart\u00C3\u00A3o pertence cancelada.")
  @JsonProperty("flagCancelaConta")
  public Integer getFlagCancelaConta() {
    return flagCancelaConta;
  }
  public void setFlagCancelaConta(Integer flagCancelaConta) {
    this.flagCancelaConta = flagCancelaConta;
  }

  
  /**
   * Quando ativa, indica que o cart\u00C3\u00A3o ativo que o portador possuir na mesma conta do cart\u00C3\u00A3o a ser desbloqueado, e que o status dele possua essa caracter\u00C3\u00ADstica, dever\u00C3\u00A1 ser cancelado quando um novo cart\u00C3\u00A3o for desbloqueado.
   **/
  public StatusCarto flagCancelaNoDesbloqueio(Integer flagCancelaNoDesbloqueio) {
    this.flagCancelaNoDesbloqueio = flagCancelaNoDesbloqueio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quando ativa, indica que o cart\u00C3\u00A3o ativo que o portador possuir na mesma conta do cart\u00C3\u00A3o a ser desbloqueado, e que o status dele possua essa caracter\u00C3\u00ADstica, dever\u00C3\u00A1 ser cancelado quando um novo cart\u00C3\u00A3o for desbloqueado.")
  @JsonProperty("flagCancelaNoDesbloqueio")
  public Integer getFlagCancelaNoDesbloqueio() {
    return flagCancelaNoDesbloqueio;
  }
  public void setFlagCancelaNoDesbloqueio(Integer flagCancelaNoDesbloqueio) {
    this.flagCancelaNoDesbloqueio = flagCancelaNoDesbloqueio;
  }

  
  /**
   * Quando ativa, indica que cart\u00C3\u00B5es que tiverem um idStatusCartao atribu\u00C3\u00ADdo com essa caracter\u00C3\u00ADstica, incluir\u00C3\u00A3o a cobran\u00C3\u00A7a de uma tarifa para a conta de acordo com os valores definidos nos par\u00C3\u00A2metros do emissor.
   **/
  public StatusCarto flagCobraTarifa(Integer flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica que cart\u00C3\u00B5es que tiverem um idStatusCartao atribu\u00C3\u00ADdo com essa caracter\u00C3\u00ADstica, incluir\u00C3\u00A3o a cobran\u00C3\u00A7a de uma tarifa para a conta de acordo com os valores definidos nos par\u00C3\u00A2metros do emissor.")
  @JsonProperty("flagCobraTarifa")
  public Integer getFlagCobraTarifa() {
    return flagCobraTarifa;
  }
  public void setFlagCobraTarifa(Integer flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
  }

  
  /**
   * Quando ativa, indica que Cart\u00C3\u00B5es com este idStatusCartao podem receber transfer\u00C3\u00AAncias de cr\u00C3\u00A9ditos/d\u00C3\u00A9bitos oriundos de outros cart\u00C3\u00B5es.
   **/
  public StatusCarto flagDestinoTransferencia(Integer flagDestinoTransferencia) {
    this.flagDestinoTransferencia = flagDestinoTransferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica que Cart\u00C3\u00B5es com este idStatusCartao podem receber transfer\u00C3\u00AAncias de cr\u00C3\u00A9ditos/d\u00C3\u00A9bitos oriundos de outros cart\u00C3\u00B5es.")
  @JsonProperty("flagDestinoTransferencia")
  public Integer getFlagDestinoTransferencia() {
    return flagDestinoTransferencia;
  }
  public void setFlagDestinoTransferencia(Integer flagDestinoTransferencia) {
    this.flagDestinoTransferencia = flagDestinoTransferencia;
  }

  
  /**
   * Quando ativa, indica que poder\u00C3\u00A1 ser criado um novo cart\u00C3\u00A3o provis\u00C3\u00B3rio para o portador.
   **/
  public StatusCarto flagEmiteProvisorio(Integer flagEmiteProvisorio) {
    this.flagEmiteProvisorio = flagEmiteProvisorio;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica que poder\u00C3\u00A1 ser criado um novo cart\u00C3\u00A3o provis\u00C3\u00B3rio para o portador.")
  @JsonProperty("flagEmiteProvisorio")
  public Integer getFlagEmiteProvisorio() {
    return flagEmiteProvisorio;
  }
  public void setFlagEmiteProvisorio(Integer flagEmiteProvisorio) {
    this.flagEmiteProvisorio = flagEmiteProvisorio;
  }

  
  /**
   * Quando ativa, indica que os Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo dever\u00C3\u00A3o ter a respectiva informa\u00C3\u00A7\u00C3\u00A3o de mudan\u00C3\u00A7a de status inclu\u00C3\u00ADda no arquivo de exce\u00C3\u00A7\u00C3\u00A3o da Bandeira, a fim de manter atualizado o cadastro do cart\u00C3\u00A3o nela para nortear o que fazer com as transa\u00C3\u00A7\u00C3\u00B5es quando o autorizador estiver indispon\u00C3\u00ADvel.
   **/
  public StatusCarto flagExcecaoBandeira(Integer flagExcecaoBandeira) {
    this.flagExcecaoBandeira = flagExcecaoBandeira;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica que os Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo dever\u00C3\u00A3o ter a respectiva informa\u00C3\u00A7\u00C3\u00A3o de mudan\u00C3\u00A7a de status inclu\u00C3\u00ADda no arquivo de exce\u00C3\u00A7\u00C3\u00A3o da Bandeira, a fim de manter atualizado o cadastro do cart\u00C3\u00A3o nela para nortear o que fazer com as transa\u00C3\u00A7\u00C3\u00B5es quando o autorizador estiver indispon\u00C3\u00ADvel.")
  @JsonProperty("flagExcecaoBandeira")
  public Integer getFlagExcecaoBandeira() {
    return flagExcecaoBandeira;
  }
  public void setFlagExcecaoBandeira(Integer flagExcecaoBandeira) {
    this.flagExcecaoBandeira = flagExcecaoBandeira;
  }

  
  /**
   * Quando ativa, indica que Cart\u00C3\u00B5es com este idStatusCartao podem realizar a transfer\u00C3\u00AAncia de cr\u00C3\u00A9ditos/d\u00C3\u00A9bitos para outros cart\u00C3\u00B5es.
   **/
  public StatusCarto flagOrigemTransferencia(Integer flagOrigemTransferencia) {
    this.flagOrigemTransferencia = flagOrigemTransferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica que Cart\u00C3\u00B5es com este idStatusCartao podem realizar a transfer\u00C3\u00AAncia de cr\u00C3\u00A9ditos/d\u00C3\u00A9bitos para outros cart\u00C3\u00B5es.")
  @JsonProperty("flagOrigemTransferencia")
  public Integer getFlagOrigemTransferencia() {
    return flagOrigemTransferencia;
  }
  public void setFlagOrigemTransferencia(Integer flagOrigemTransferencia) {
    this.flagOrigemTransferencia = flagOrigemTransferencia;
  }

  
  /**
   * Quando ativa, indica que cart\u00C3\u00B5es que tiverem este status atribu\u00C3\u00ADdo ter\u00C3\u00A3o um novo cart\u00C3\u00A3o gerado para o portador, para a mesma conta, automaticamente.
   **/
  public StatusCarto flagReemiteCartao(Integer flagReemiteCartao) {
    this.flagReemiteCartao = flagReemiteCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica que cart\u00C3\u00B5es que tiverem este status atribu\u00C3\u00ADdo ter\u00C3\u00A3o um novo cart\u00C3\u00A3o gerado para o portador, para a mesma conta, automaticamente.")
  @JsonProperty("flagReemiteCartao")
  public Integer getFlagReemiteCartao() {
    return flagReemiteCartao;
  }
  public void setFlagReemiteCartao(Integer flagReemiteCartao) {
    this.flagReemiteCartao = flagReemiteCartao;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o (id) 
   **/
  public StatusCarto id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o (id) ")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Indica qual o idStatusCartao que ser\u00C3\u00A1 atribu\u00C3\u00ADdo a conta, caso ela seja cancelada devido ao bloqueio de um cart\u00C3\u00A3o quando for utilizado um idStatusCartao no processo de Bloqueio que possua essa caracter\u00C3\u00ADstica.
   **/
  public StatusCarto idStatusDestinoConta(Long idStatusDestinoConta) {
    this.idStatusDestinoConta = idStatusDestinoConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indica qual o idStatusCartao que ser\u00C3\u00A1 atribu\u00C3\u00ADdo a conta, caso ela seja cancelada devido ao bloqueio de um cart\u00C3\u00A3o quando for utilizado um idStatusCartao no processo de Bloqueio que possua essa caracter\u00C3\u00ADstica.")
  @JsonProperty("idStatusDestinoConta")
  public Long getIdStatusDestinoConta() {
    return idStatusDestinoConta;
  }
  public void setIdStatusDestinoConta(Long idStatusDestinoConta) {
    this.idStatusDestinoConta = idStatusDestinoConta;
  }

  
  /**
   * Indica qual o idStatusCartao que que ser\u00C3\u00A1 atribu\u00C3\u00ADdo aos cart\u00C3\u00B5es que forem cancelados devido ao desbloqueio de um novo cart\u00C3\u00A3o.
   **/
  public StatusCarto idStatusDestinoDesbloqueio(Long idStatusDestinoDesbloqueio) {
    this.idStatusDestinoDesbloqueio = idStatusDestinoDesbloqueio;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indica qual o idStatusCartao que que ser\u00C3\u00A1 atribu\u00C3\u00ADdo aos cart\u00C3\u00B5es que forem cancelados devido ao desbloqueio de um novo cart\u00C3\u00A3o.")
  @JsonProperty("idStatusDestinoDesbloqueio")
  public Long getIdStatusDestinoDesbloqueio() {
    return idStatusDestinoDesbloqueio;
  }
  public void setIdStatusDestinoDesbloqueio(Long idStatusDestinoDesbloqueio) {
    this.idStatusDestinoDesbloqueio = idStatusDestinoDesbloqueio;
  }

  
  /**
   * Nome atribu\u00C3\u00ADdo ao Status de Entrega do Cart\u00C3\u00A3o.
   **/
  public StatusCarto nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Nome atribu\u00C3\u00ADdo ao Status de Entrega do Cart\u00C3\u00A3o.")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusCarto statusCarto = (StatusCarto) o;
    return Objects.equals(this.flagAlteraStatus, statusCarto.flagAlteraStatus) &&
        Objects.equals(this.flagCadastroNovaSenha, statusCarto.flagCadastroNovaSenha) &&
        Objects.equals(this.flagCancelaConta, statusCarto.flagCancelaConta) &&
        Objects.equals(this.flagCancelaNoDesbloqueio, statusCarto.flagCancelaNoDesbloqueio) &&
        Objects.equals(this.flagCobraTarifa, statusCarto.flagCobraTarifa) &&
        Objects.equals(this.flagDestinoTransferencia, statusCarto.flagDestinoTransferencia) &&
        Objects.equals(this.flagEmiteProvisorio, statusCarto.flagEmiteProvisorio) &&
        Objects.equals(this.flagExcecaoBandeira, statusCarto.flagExcecaoBandeira) &&
        Objects.equals(this.flagOrigemTransferencia, statusCarto.flagOrigemTransferencia) &&
        Objects.equals(this.flagReemiteCartao, statusCarto.flagReemiteCartao) &&
        Objects.equals(this.id, statusCarto.id) &&
        Objects.equals(this.idStatusDestinoConta, statusCarto.idStatusDestinoConta) &&
        Objects.equals(this.idStatusDestinoDesbloqueio, statusCarto.idStatusDestinoDesbloqueio) &&
        Objects.equals(this.nome, statusCarto.nome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flagAlteraStatus, flagCadastroNovaSenha, flagCancelaConta, flagCancelaNoDesbloqueio, flagCobraTarifa, flagDestinoTransferencia, flagEmiteProvisorio, flagExcecaoBandeira, flagOrigemTransferencia, flagReemiteCartao, id, idStatusDestinoConta, idStatusDestinoDesbloqueio, nome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCarto {\n");
    
    sb.append("    flagAlteraStatus: ").append(toIndentedString(flagAlteraStatus)).append("\n");
    sb.append("    flagCadastroNovaSenha: ").append(toIndentedString(flagCadastroNovaSenha)).append("\n");
    sb.append("    flagCancelaConta: ").append(toIndentedString(flagCancelaConta)).append("\n");
    sb.append("    flagCancelaNoDesbloqueio: ").append(toIndentedString(flagCancelaNoDesbloqueio)).append("\n");
    sb.append("    flagCobraTarifa: ").append(toIndentedString(flagCobraTarifa)).append("\n");
    sb.append("    flagDestinoTransferencia: ").append(toIndentedString(flagDestinoTransferencia)).append("\n");
    sb.append("    flagEmiteProvisorio: ").append(toIndentedString(flagEmiteProvisorio)).append("\n");
    sb.append("    flagExcecaoBandeira: ").append(toIndentedString(flagExcecaoBandeira)).append("\n");
    sb.append("    flagOrigemTransferencia: ").append(toIndentedString(flagOrigemTransferencia)).append("\n");
    sb.append("    flagReemiteCartao: ").append(toIndentedString(flagReemiteCartao)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idStatusDestinoConta: ").append(toIndentedString(idStatusDestinoConta)).append("\n");
    sb.append("    idStatusDestinoDesbloqueio: ").append(toIndentedString(idStatusDestinoDesbloqueio)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}



