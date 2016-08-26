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
  
  private String flagAlteraStatus = null;
  private String flagCadastroNovaSenha = null;
  private String flagCadastroSenha = null;
  private String flagCancelaCartao = null;
  private String flagCancelaConta = null;
  private String flagCobraTarifa = null;
  private String flagDesbloqueio = null;
  private String flagDestinoTransferencia = null;
  private String flagEmiteProvisorio = null;
  private String flagExcecaoBandeira = null;
  private String flagOrigemTransferencia = null;
  private String flagReemiteCartao = null;
  private String flagReversaoCancelamento = null;
  private String flagReversaoDesbloqueio = null;
  private Long id = null;
  private Long idStatusDestinoConta = null;
  private Long idStatusDestinoDesbloqueio = null;
  private String nome = null;

  
  /**
   * Quanto ativa, indica que Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo n\u00C3\u00A3o ter\u00C3\u00A3o seu idStatusCartao Alterado, fazendo com que o Cart\u00C3\u00A3o atual possa continuar sendo utilizado at\u00C3\u00A9 o desbloqueio de um novo cart\u00C3\u00A3o.
   **/
  public StatusCarto flagAlteraStatus(String flagAlteraStatus) {
    this.flagAlteraStatus = flagAlteraStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quanto ativa, indica que Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo n\u00C3\u00A3o ter\u00C3\u00A3o seu idStatusCartao Alterado, fazendo com que o Cart\u00C3\u00A3o atual possa continuar sendo utilizado at\u00C3\u00A9 o desbloqueio de um novo cart\u00C3\u00A3o.")
  @JsonProperty("flagAlteraStatus")
  public String getFlagAlteraStatus() {
    return flagAlteraStatus;
  }
  public void setFlagAlteraStatus(String flagAlteraStatus) {
    this.flagAlteraStatus = flagAlteraStatus;
  }

  
  /**
   * Quando ativa, indica que os Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo ter\u00C3\u00A3o a senha atual exclu\u00C3\u00ADda.
   **/
  public StatusCarto flagCadastroNovaSenha(String flagCadastroNovaSenha) {
    this.flagCadastroNovaSenha = flagCadastroNovaSenha;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica que os Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo ter\u00C3\u00A3o a senha atual exclu\u00C3\u00ADda.")
  @JsonProperty("flagCadastroNovaSenha")
  public String getFlagCadastroNovaSenha() {
    return flagCadastroNovaSenha;
  }
  public void setFlagCadastroNovaSenha(String flagCadastroNovaSenha) {
    this.flagCadastroNovaSenha = flagCadastroNovaSenha;
  }

  
  /**
   * Quando ativa, indica se poder\u00C3\u00A1 ser realizado o cadastro de uma senha para o Cart\u00C3\u00A3o.
   **/
  public StatusCarto flagCadastroSenha(String flagCadastroSenha) {
    this.flagCadastroSenha = flagCadastroSenha;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica se poder\u00C3\u00A1 ser realizado o cadastro de uma senha para o Cart\u00C3\u00A3o.")
  @JsonProperty("flagCadastroSenha")
  public String getFlagCadastroSenha() {
    return flagCadastroSenha;
  }
  public void setFlagCadastroSenha(String flagCadastroSenha) {
    this.flagCadastroSenha = flagCadastroSenha;
  }

  
  /**
   * Quando ativa, indica que Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo ter\u00C3\u00A3o o cart\u00C3\u00A3o Cancelado.
   **/
  public StatusCarto flagCancelaCartao(String flagCancelaCartao) {
    this.flagCancelaCartao = flagCancelaCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica que Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo ter\u00C3\u00A3o o cart\u00C3\u00A3o Cancelado.")
  @JsonProperty("flagCancelaCartao")
  public String getFlagCancelaCartao() {
    return flagCancelaCartao;
  }
  public void setFlagCancelaCartao(String flagCancelaCartao) {
    this.flagCancelaCartao = flagCancelaCartao;
  }

  
  /**
   * Quando ativa, indica que Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo ter\u00C3\u00A3o a conta Cancelada.
   **/
  public StatusCarto flagCancelaConta(String flagCancelaConta) {
    this.flagCancelaConta = flagCancelaConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica que Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo ter\u00C3\u00A3o a conta Cancelada.")
  @JsonProperty("flagCancelaConta")
  public String getFlagCancelaConta() {
    return flagCancelaConta;
  }
  public void setFlagCancelaConta(String flagCancelaConta) {
    this.flagCancelaConta = flagCancelaConta;
  }

  
  /**
   * Quando ativa, indica que Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo ter\u00C3\u00A3o a cobran\u00C3\u00A7a de tarifa lan\u00C3\u00A7ada junto a gera\u00C3\u00A7\u00C3\u00A3o do novo cart\u00C3\u00A3o, desde que o Produto ao qual o cart\u00C3\u00A3o pertence possua o respectivo par\u00C3\u00A2metro configurado.
   **/
  public StatusCarto flagCobraTarifa(String flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica que Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo ter\u00C3\u00A3o a cobran\u00C3\u00A7a de tarifa lan\u00C3\u00A7ada junto a gera\u00C3\u00A7\u00C3\u00A3o do novo cart\u00C3\u00A3o, desde que o Produto ao qual o cart\u00C3\u00A3o pertence possua o respectivo par\u00C3\u00A2metro configurado.")
  @JsonProperty("flagCobraTarifa")
  public String getFlagCobraTarifa() {
    return flagCobraTarifa;
  }
  public void setFlagCobraTarifa(String flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
  }

  
  /**
   * Quando ativa, indica que Cart\u00C3\u00B5es com este idStatusCartao poder\u00C3\u00A3o ser Desbloqueados.
   **/
  public StatusCarto flagDesbloqueio(String flagDesbloqueio) {
    this.flagDesbloqueio = flagDesbloqueio;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica que Cart\u00C3\u00B5es com este idStatusCartao poder\u00C3\u00A3o ser Desbloqueados.")
  @JsonProperty("flagDesbloqueio")
  public String getFlagDesbloqueio() {
    return flagDesbloqueio;
  }
  public void setFlagDesbloqueio(String flagDesbloqueio) {
    this.flagDesbloqueio = flagDesbloqueio;
  }

  
  /**
   * Quando ativa, indica que Cart\u00C3\u00B5es com este idStatusCartao podem receber transfer\u00C3\u00AAncias de cr\u00C3\u00A9ditos/d\u00C3\u00A9bitos oriundos de outros cart\u00C3\u00B5es.
   **/
  public StatusCarto flagDestinoTransferencia(String flagDestinoTransferencia) {
    this.flagDestinoTransferencia = flagDestinoTransferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica que Cart\u00C3\u00B5es com este idStatusCartao podem receber transfer\u00C3\u00AAncias de cr\u00C3\u00A9ditos/d\u00C3\u00A9bitos oriundos de outros cart\u00C3\u00B5es.")
  @JsonProperty("flagDestinoTransferencia")
  public String getFlagDestinoTransferencia() {
    return flagDestinoTransferencia;
  }
  public void setFlagDestinoTransferencia(String flagDestinoTransferencia) {
    this.flagDestinoTransferencia = flagDestinoTransferencia;
  }

  
  /**
   * Quando ativa, indica que os portadores que tiverem seus cart\u00C3\u00B5es associados a idStatusCartao com esta flag poder\u00C3\u00A3o solicitar a emiss\u00C3\u00A3o de um cart\u00C3\u00A3o provis\u00C3\u00B3rio at\u00C3\u00A9 que um novo cart\u00C3\u00A3o definitivo seja recebido. 
   **/
  public StatusCarto flagEmiteProvisorio(String flagEmiteProvisorio) {
    this.flagEmiteProvisorio = flagEmiteProvisorio;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica que os portadores que tiverem seus cart\u00C3\u00B5es associados a idStatusCartao com esta flag poder\u00C3\u00A3o solicitar a emiss\u00C3\u00A3o de um cart\u00C3\u00A3o provis\u00C3\u00B3rio at\u00C3\u00A9 que um novo cart\u00C3\u00A3o definitivo seja recebido. ")
  @JsonProperty("flagEmiteProvisorio")
  public String getFlagEmiteProvisorio() {
    return flagEmiteProvisorio;
  }
  public void setFlagEmiteProvisorio(String flagEmiteProvisorio) {
    this.flagEmiteProvisorio = flagEmiteProvisorio;
  }

  
  /**
   * Quando ativa, indica que os Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo dever\u00C3\u00A3o ter a respectiva informa\u00C3\u00A7\u00C3\u00A3o de mudan\u00C3\u00A7a de status inclu\u00C3\u00ADda no arquivo de exce\u00C3\u00A7\u00C3\u00A3o da Bandeira, a fim de manter atualizado o cadastro do cart\u00C3\u00A3o nela para nortear o que fazer com as transa\u00C3\u00A7\u00C3\u00B5es quando o autorizador estiver indispon\u00C3\u00ADvel.
   **/
  public StatusCarto flagExcecaoBandeira(String flagExcecaoBandeira) {
    this.flagExcecaoBandeira = flagExcecaoBandeira;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica que os Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo dever\u00C3\u00A3o ter a respectiva informa\u00C3\u00A7\u00C3\u00A3o de mudan\u00C3\u00A7a de status inclu\u00C3\u00ADda no arquivo de exce\u00C3\u00A7\u00C3\u00A3o da Bandeira, a fim de manter atualizado o cadastro do cart\u00C3\u00A3o nela para nortear o que fazer com as transa\u00C3\u00A7\u00C3\u00B5es quando o autorizador estiver indispon\u00C3\u00ADvel.")
  @JsonProperty("flagExcecaoBandeira")
  public String getFlagExcecaoBandeira() {
    return flagExcecaoBandeira;
  }
  public void setFlagExcecaoBandeira(String flagExcecaoBandeira) {
    this.flagExcecaoBandeira = flagExcecaoBandeira;
  }

  
  /**
   * Quando ativa, indica que Cart\u00C3\u00B5es com este idStatusCartao podem realizar a transfer\u00C3\u00AAncia de cr\u00C3\u00A9ditos/d\u00C3\u00A9bitos para outros cart\u00C3\u00B5es.
   **/
  public StatusCarto flagOrigemTransferencia(String flagOrigemTransferencia) {
    this.flagOrigemTransferencia = flagOrigemTransferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica que Cart\u00C3\u00B5es com este idStatusCartao podem realizar a transfer\u00C3\u00AAncia de cr\u00C3\u00A9ditos/d\u00C3\u00A9bitos para outros cart\u00C3\u00B5es.")
  @JsonProperty("flagOrigemTransferencia")
  public String getFlagOrigemTransferencia() {
    return flagOrigemTransferencia;
  }
  public void setFlagOrigemTransferencia(String flagOrigemTransferencia) {
    this.flagOrigemTransferencia = flagOrigemTransferencia;
  }

  
  /**
   * Quando ativa, indica que Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo ter\u00C3\u00A3o um novo cart\u00C3\u00A3o automaticamente gerado.
   **/
  public StatusCarto flagReemiteCartao(String flagReemiteCartao) {
    this.flagReemiteCartao = flagReemiteCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica que Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo ter\u00C3\u00A3o um novo cart\u00C3\u00A3o automaticamente gerado.")
  @JsonProperty("flagReemiteCartao")
  public String getFlagReemiteCartao() {
    return flagReemiteCartao;
  }
  public void setFlagReemiteCartao(String flagReemiteCartao) {
    this.flagReemiteCartao = flagReemiteCartao;
  }

  
  /**
   * Quando ativa, indica que o cart\u00C3\u00A3o, mesmo tendo sido cancelado, poder\u00C3\u00A1 ter o processo desfeito.
   **/
  public StatusCarto flagReversaoCancelamento(String flagReversaoCancelamento) {
    this.flagReversaoCancelamento = flagReversaoCancelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica que o cart\u00C3\u00A3o, mesmo tendo sido cancelado, poder\u00C3\u00A1 ter o processo desfeito.")
  @JsonProperty("flagReversaoCancelamento")
  public String getFlagReversaoCancelamento() {
    return flagReversaoCancelamento;
  }
  public void setFlagReversaoCancelamento(String flagReversaoCancelamento) {
    this.flagReversaoCancelamento = flagReversaoCancelamento;
  }

  
  /**
   * Quando ativa, indica que o cart\u00C3\u00A3o, mesmo tendo sido bloqueado, poder\u00C3\u00A1 ter o processo desfeito.
   **/
  public StatusCarto flagReversaoDesbloqueio(String flagReversaoDesbloqueio) {
    this.flagReversaoDesbloqueio = flagReversaoDesbloqueio;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica que o cart\u00C3\u00A3o, mesmo tendo sido bloqueado, poder\u00C3\u00A1 ter o processo desfeito.")
  @JsonProperty("flagReversaoDesbloqueio")
  public String getFlagReversaoDesbloqueio() {
    return flagReversaoDesbloqueio;
  }
  public void setFlagReversaoDesbloqueio(String flagReversaoDesbloqueio) {
    this.flagReversaoDesbloqueio = flagReversaoDesbloqueio;
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
   * Indica qual o idStatusConta que ser\u00C3\u00A1 atribu\u00C3\u00ADdo ao idConta que tiver o Cartao do titular da mesma cancelado por um idStatusCartao que recomenda o cancelamento da conta.
   **/
  public StatusCarto idStatusDestinoConta(Long idStatusDestinoConta) {
    this.idStatusDestinoConta = idStatusDestinoConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indica qual o idStatusConta que ser\u00C3\u00A1 atribu\u00C3\u00ADdo ao idConta que tiver o Cartao do titular da mesma cancelado por um idStatusCartao que recomenda o cancelamento da conta.")
  @JsonProperty("idStatusDestinoConta")
  public Long getIdStatusDestinoConta() {
    return idStatusDestinoConta;
  }
  public void setIdStatusDestinoConta(Long idStatusDestinoConta) {
    this.idStatusDestinoConta = idStatusDestinoConta;
  }

  
  /**
   * Indica qual o idStatusCartao que deve ser atribu\u00C3\u00ADdo a um idCartao quando ele for desbloqueado.
   **/
  public StatusCarto idStatusDestinoDesbloqueio(Long idStatusDestinoDesbloqueio) {
    this.idStatusDestinoDesbloqueio = idStatusDestinoDesbloqueio;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indica qual o idStatusCartao que deve ser atribu\u00C3\u00ADdo a um idCartao quando ele for desbloqueado.")
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
        Objects.equals(this.flagCadastroSenha, statusCarto.flagCadastroSenha) &&
        Objects.equals(this.flagCancelaCartao, statusCarto.flagCancelaCartao) &&
        Objects.equals(this.flagCancelaConta, statusCarto.flagCancelaConta) &&
        Objects.equals(this.flagCobraTarifa, statusCarto.flagCobraTarifa) &&
        Objects.equals(this.flagDesbloqueio, statusCarto.flagDesbloqueio) &&
        Objects.equals(this.flagDestinoTransferencia, statusCarto.flagDestinoTransferencia) &&
        Objects.equals(this.flagEmiteProvisorio, statusCarto.flagEmiteProvisorio) &&
        Objects.equals(this.flagExcecaoBandeira, statusCarto.flagExcecaoBandeira) &&
        Objects.equals(this.flagOrigemTransferencia, statusCarto.flagOrigemTransferencia) &&
        Objects.equals(this.flagReemiteCartao, statusCarto.flagReemiteCartao) &&
        Objects.equals(this.flagReversaoCancelamento, statusCarto.flagReversaoCancelamento) &&
        Objects.equals(this.flagReversaoDesbloqueio, statusCarto.flagReversaoDesbloqueio) &&
        Objects.equals(this.id, statusCarto.id) &&
        Objects.equals(this.idStatusDestinoConta, statusCarto.idStatusDestinoConta) &&
        Objects.equals(this.idStatusDestinoDesbloqueio, statusCarto.idStatusDestinoDesbloqueio) &&
        Objects.equals(this.nome, statusCarto.nome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flagAlteraStatus, flagCadastroNovaSenha, flagCadastroSenha, flagCancelaCartao, flagCancelaConta, flagCobraTarifa, flagDesbloqueio, flagDestinoTransferencia, flagEmiteProvisorio, flagExcecaoBandeira, flagOrigemTransferencia, flagReemiteCartao, flagReversaoCancelamento, flagReversaoDesbloqueio, id, idStatusDestinoConta, idStatusDestinoDesbloqueio, nome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCarto {\n");
    
    sb.append("    flagAlteraStatus: ").append(toIndentedString(flagAlteraStatus)).append("\n");
    sb.append("    flagCadastroNovaSenha: ").append(toIndentedString(flagCadastroNovaSenha)).append("\n");
    sb.append("    flagCadastroSenha: ").append(toIndentedString(flagCadastroSenha)).append("\n");
    sb.append("    flagCancelaCartao: ").append(toIndentedString(flagCancelaCartao)).append("\n");
    sb.append("    flagCancelaConta: ").append(toIndentedString(flagCancelaConta)).append("\n");
    sb.append("    flagCobraTarifa: ").append(toIndentedString(flagCobraTarifa)).append("\n");
    sb.append("    flagDesbloqueio: ").append(toIndentedString(flagDesbloqueio)).append("\n");
    sb.append("    flagDestinoTransferencia: ").append(toIndentedString(flagDestinoTransferencia)).append("\n");
    sb.append("    flagEmiteProvisorio: ").append(toIndentedString(flagEmiteProvisorio)).append("\n");
    sb.append("    flagExcecaoBandeira: ").append(toIndentedString(flagExcecaoBandeira)).append("\n");
    sb.append("    flagOrigemTransferencia: ").append(toIndentedString(flagOrigemTransferencia)).append("\n");
    sb.append("    flagReemiteCartao: ").append(toIndentedString(flagReemiteCartao)).append("\n");
    sb.append("    flagReversaoCancelamento: ").append(toIndentedString(flagReversaoCancelamento)).append("\n");
    sb.append("    flagReversaoDesbloqueio: ").append(toIndentedString(flagReversaoDesbloqueio)).append("\n");
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



