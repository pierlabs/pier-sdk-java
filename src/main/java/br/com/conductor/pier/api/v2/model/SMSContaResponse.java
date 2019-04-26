package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Response de SMSConta
 **/

@ApiModel(description = "Objeto Response de SMSConta")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class SMSContaResponse   {
  
  private Long id = null;
  private Long idConta = null;
  private Boolean flagAtivo = null;
  private String dataAtivacao = null;
  private String dataCancelamento = null;
  private String origem = null;
  private Long idSMSTipoServico = null;
  private Long idLoginAtivacao = null;
  private Long idLoginCancelamento = null;
  private Long idPlataformaAtivacao = null;
  private Long idPlataformaCancelamento = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do SMSConta
   **/
  public SMSContaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do SMSConta")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Codigo de identifica\u00E7\u00E3o da conta
   **/
  public SMSContaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Codigo de identifica\u00E7\u00E3o da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Flag de habilitar ou desabilitar SMSConta
   **/
  public SMSContaResponse flagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag de habilitar ou desabilitar SMSConta")
  @JsonProperty("flagAtivo")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * Data de Ativa\u00E7\u00E3o
   **/
  public SMSContaResponse dataAtivacao(String dataAtivacao) {
    this.dataAtivacao = dataAtivacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de Ativa\u00E7\u00E3o")
  @JsonProperty("dataAtivacao")
  public String getDataAtivacao() {
    return dataAtivacao;
  }
  public void setDataAtivacao(String dataAtivacao) {
    this.dataAtivacao = dataAtivacao;
  }

  
  /**
   * Data de Cancelamento
   **/
  public SMSContaResponse dataCancelamento(String dataCancelamento) {
    this.dataCancelamento = dataCancelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de Cancelamento")
  @JsonProperty("dataCancelamento")
  public String getDataCancelamento() {
    return dataCancelamento;
  }
  public void setDataCancelamento(String dataCancelamento) {
    this.dataCancelamento = dataCancelamento;
  }

  
  /**
   * Origem da Solicita\u00E7\u00E3o
   **/
  public SMSContaResponse origem(String origem) {
    this.origem = origem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Origem da Solicita\u00E7\u00E3o")
  @JsonProperty("origem")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  
  /**
   * Codigo de identifica\u00E7\u00E3o do Tipo Servi\u00E7o SMS
   **/
  public SMSContaResponse idSMSTipoServico(Long idSMSTipoServico) {
    this.idSMSTipoServico = idSMSTipoServico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Codigo de identifica\u00E7\u00E3o do Tipo Servi\u00E7o SMS")
  @JsonProperty("idSMSTipoServico")
  public Long getIdSMSTipoServico() {
    return idSMSTipoServico;
  }
  public void setIdSMSTipoServico(Long idSMSTipoServico) {
    this.idSMSTipoServico = idSMSTipoServico;
  }

  
  /**
   * Codigo de identifica\u00E7\u00E3o do login que realizou a ativa\u00E7\u00E3o
   **/
  public SMSContaResponse idLoginAtivacao(Long idLoginAtivacao) {
    this.idLoginAtivacao = idLoginAtivacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Codigo de identifica\u00E7\u00E3o do login que realizou a ativa\u00E7\u00E3o")
  @JsonProperty("idLoginAtivacao")
  public Long getIdLoginAtivacao() {
    return idLoginAtivacao;
  }
  public void setIdLoginAtivacao(Long idLoginAtivacao) {
    this.idLoginAtivacao = idLoginAtivacao;
  }

  
  /**
   * Codigo de identifica\u00E7\u00E3o do login que realizou o cancelamento
   **/
  public SMSContaResponse idLoginCancelamento(Long idLoginCancelamento) {
    this.idLoginCancelamento = idLoginCancelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Codigo de identifica\u00E7\u00E3o do login que realizou o cancelamento")
  @JsonProperty("idLoginCancelamento")
  public Long getIdLoginCancelamento() {
    return idLoginCancelamento;
  }
  public void setIdLoginCancelamento(Long idLoginCancelamento) {
    this.idLoginCancelamento = idLoginCancelamento;
  }

  
  /**
   * Codigo de identifica\u00E7\u00E3o da plataforma que realizou a ativa\u00E7\u00E3o
   **/
  public SMSContaResponse idPlataformaAtivacao(Long idPlataformaAtivacao) {
    this.idPlataformaAtivacao = idPlataformaAtivacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Codigo de identifica\u00E7\u00E3o da plataforma que realizou a ativa\u00E7\u00E3o")
  @JsonProperty("idPlataformaAtivacao")
  public Long getIdPlataformaAtivacao() {
    return idPlataformaAtivacao;
  }
  public void setIdPlataformaAtivacao(Long idPlataformaAtivacao) {
    this.idPlataformaAtivacao = idPlataformaAtivacao;
  }

  
  /**
   * Codigo de identifica\u00E7\u00E3o da plataforma que realizou o cancelamento
   **/
  public SMSContaResponse idPlataformaCancelamento(Long idPlataformaCancelamento) {
    this.idPlataformaCancelamento = idPlataformaCancelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Codigo de identifica\u00E7\u00E3o da plataforma que realizou o cancelamento")
  @JsonProperty("idPlataformaCancelamento")
  public Long getIdPlataformaCancelamento() {
    return idPlataformaCancelamento;
  }
  public void setIdPlataformaCancelamento(Long idPlataformaCancelamento) {
    this.idPlataformaCancelamento = idPlataformaCancelamento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SMSContaResponse sMSContaResponse = (SMSContaResponse) o;
    return Objects.equals(this.id, sMSContaResponse.id) &&
        Objects.equals(this.idConta, sMSContaResponse.idConta) &&
        Objects.equals(this.flagAtivo, sMSContaResponse.flagAtivo) &&
        Objects.equals(this.dataAtivacao, sMSContaResponse.dataAtivacao) &&
        Objects.equals(this.dataCancelamento, sMSContaResponse.dataCancelamento) &&
        Objects.equals(this.origem, sMSContaResponse.origem) &&
        Objects.equals(this.idSMSTipoServico, sMSContaResponse.idSMSTipoServico) &&
        Objects.equals(this.idLoginAtivacao, sMSContaResponse.idLoginAtivacao) &&
        Objects.equals(this.idLoginCancelamento, sMSContaResponse.idLoginCancelamento) &&
        Objects.equals(this.idPlataformaAtivacao, sMSContaResponse.idPlataformaAtivacao) &&
        Objects.equals(this.idPlataformaCancelamento, sMSContaResponse.idPlataformaCancelamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConta, flagAtivo, dataAtivacao, dataCancelamento, origem, idSMSTipoServico, idLoginAtivacao, idLoginCancelamento, idPlataformaAtivacao, idPlataformaCancelamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SMSContaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    flagAtivo: ").append(toIndentedString(flagAtivo)).append("\n");
    sb.append("    dataAtivacao: ").append(toIndentedString(dataAtivacao)).append("\n");
    sb.append("    dataCancelamento: ").append(toIndentedString(dataCancelamento)).append("\n");
    sb.append("    origem: ").append(toIndentedString(origem)).append("\n");
    sb.append("    idSMSTipoServico: ").append(toIndentedString(idSMSTipoServico)).append("\n");
    sb.append("    idLoginAtivacao: ").append(toIndentedString(idLoginAtivacao)).append("\n");
    sb.append("    idLoginCancelamento: ").append(toIndentedString(idLoginCancelamento)).append("\n");
    sb.append("    idPlataformaAtivacao: ").append(toIndentedString(idPlataformaAtivacao)).append("\n");
    sb.append("    idPlataformaCancelamento: ").append(toIndentedString(idPlataformaCancelamento)).append("\n");
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

