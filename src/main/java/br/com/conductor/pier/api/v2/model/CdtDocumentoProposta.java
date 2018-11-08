package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CdtDocumentoProposta   {
  
  private String dataStatus = null;
  private String documentoDigitalizado = null;
  private Integer flagDocumentoDigitalizado = null;
  private Long id = null;
  private Long idCondicoesDocumentosCredito = null;
  private Long idDocumentosCredito = null;
  private Long idLogAtendimento = null;
  private Long idPessoaFisica = null;
  private Long idProposta = null;
  private Long idStatusDocumentosCredito = null;
  private Long idTipoDocumentoCredito = null;
  private String observacao = null;
  private String responsavel = null;
  private Integer seqAnaliseCondicao = null;

  
  /**
   **/
  public CdtDocumentoProposta dataStatus(String dataStatus) {
    this.dataStatus = dataStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataStatus")
  public String getDataStatus() {
    return dataStatus;
  }
  public void setDataStatus(String dataStatus) {
    this.dataStatus = dataStatus;
  }

  
  /**
   **/
  public CdtDocumentoProposta documentoDigitalizado(String documentoDigitalizado) {
    this.documentoDigitalizado = documentoDigitalizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("documentoDigitalizado")
  public String getDocumentoDigitalizado() {
    return documentoDigitalizado;
  }
  public void setDocumentoDigitalizado(String documentoDigitalizado) {
    this.documentoDigitalizado = documentoDigitalizado;
  }

  
  /**
   **/
  public CdtDocumentoProposta flagDocumentoDigitalizado(Integer flagDocumentoDigitalizado) {
    this.flagDocumentoDigitalizado = flagDocumentoDigitalizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagDocumentoDigitalizado")
  public Integer getFlagDocumentoDigitalizado() {
    return flagDocumentoDigitalizado;
  }
  public void setFlagDocumentoDigitalizado(Integer flagDocumentoDigitalizado) {
    this.flagDocumentoDigitalizado = flagDocumentoDigitalizado;
  }

  
  /**
   **/
  public CdtDocumentoProposta id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  public CdtDocumentoProposta idCondicoesDocumentosCredito(Long idCondicoesDocumentosCredito) {
    this.idCondicoesDocumentosCredito = idCondicoesDocumentosCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idCondicoesDocumentosCredito")
  public Long getIdCondicoesDocumentosCredito() {
    return idCondicoesDocumentosCredito;
  }
  public void setIdCondicoesDocumentosCredito(Long idCondicoesDocumentosCredito) {
    this.idCondicoesDocumentosCredito = idCondicoesDocumentosCredito;
  }

  
  /**
   **/
  public CdtDocumentoProposta idDocumentosCredito(Long idDocumentosCredito) {
    this.idDocumentosCredito = idDocumentosCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idDocumentosCredito")
  public Long getIdDocumentosCredito() {
    return idDocumentosCredito;
  }
  public void setIdDocumentosCredito(Long idDocumentosCredito) {
    this.idDocumentosCredito = idDocumentosCredito;
  }

  
  /**
   **/
  public CdtDocumentoProposta idLogAtendimento(Long idLogAtendimento) {
    this.idLogAtendimento = idLogAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idLogAtendimento")
  public Long getIdLogAtendimento() {
    return idLogAtendimento;
  }
  public void setIdLogAtendimento(Long idLogAtendimento) {
    this.idLogAtendimento = idLogAtendimento;
  }

  
  /**
   **/
  public CdtDocumentoProposta idPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idPessoaFisica")
  public Long getIdPessoaFisica() {
    return idPessoaFisica;
  }
  public void setIdPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
  }

  
  /**
   **/
  public CdtDocumentoProposta idProposta(Long idProposta) {
    this.idProposta = idProposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idProposta")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   **/
  public CdtDocumentoProposta idStatusDocumentosCredito(Long idStatusDocumentosCredito) {
    this.idStatusDocumentosCredito = idStatusDocumentosCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idStatusDocumentosCredito")
  public Long getIdStatusDocumentosCredito() {
    return idStatusDocumentosCredito;
  }
  public void setIdStatusDocumentosCredito(Long idStatusDocumentosCredito) {
    this.idStatusDocumentosCredito = idStatusDocumentosCredito;
  }

  
  /**
   **/
  public CdtDocumentoProposta idTipoDocumentoCredito(Long idTipoDocumentoCredito) {
    this.idTipoDocumentoCredito = idTipoDocumentoCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idTipoDocumentoCredito")
  public Long getIdTipoDocumentoCredito() {
    return idTipoDocumentoCredito;
  }
  public void setIdTipoDocumentoCredito(Long idTipoDocumentoCredito) {
    this.idTipoDocumentoCredito = idTipoDocumentoCredito;
  }

  
  /**
   **/
  public CdtDocumentoProposta observacao(String observacao) {
    this.observacao = observacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("observacao")
  public String getObservacao() {
    return observacao;
  }
  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  
  /**
   **/
  public CdtDocumentoProposta responsavel(String responsavel) {
    this.responsavel = responsavel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("responsavel")
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  
  /**
   **/
  public CdtDocumentoProposta seqAnaliseCondicao(Integer seqAnaliseCondicao) {
    this.seqAnaliseCondicao = seqAnaliseCondicao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("seqAnaliseCondicao")
  public Integer getSeqAnaliseCondicao() {
    return seqAnaliseCondicao;
  }
  public void setSeqAnaliseCondicao(Integer seqAnaliseCondicao) {
    this.seqAnaliseCondicao = seqAnaliseCondicao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CdtDocumentoProposta cdtDocumentoProposta = (CdtDocumentoProposta) o;
    return Objects.equals(this.dataStatus, cdtDocumentoProposta.dataStatus) &&
        Objects.equals(this.documentoDigitalizado, cdtDocumentoProposta.documentoDigitalizado) &&
        Objects.equals(this.flagDocumentoDigitalizado, cdtDocumentoProposta.flagDocumentoDigitalizado) &&
        Objects.equals(this.id, cdtDocumentoProposta.id) &&
        Objects.equals(this.idCondicoesDocumentosCredito, cdtDocumentoProposta.idCondicoesDocumentosCredito) &&
        Objects.equals(this.idDocumentosCredito, cdtDocumentoProposta.idDocumentosCredito) &&
        Objects.equals(this.idLogAtendimento, cdtDocumentoProposta.idLogAtendimento) &&
        Objects.equals(this.idPessoaFisica, cdtDocumentoProposta.idPessoaFisica) &&
        Objects.equals(this.idProposta, cdtDocumentoProposta.idProposta) &&
        Objects.equals(this.idStatusDocumentosCredito, cdtDocumentoProposta.idStatusDocumentosCredito) &&
        Objects.equals(this.idTipoDocumentoCredito, cdtDocumentoProposta.idTipoDocumentoCredito) &&
        Objects.equals(this.observacao, cdtDocumentoProposta.observacao) &&
        Objects.equals(this.responsavel, cdtDocumentoProposta.responsavel) &&
        Objects.equals(this.seqAnaliseCondicao, cdtDocumentoProposta.seqAnaliseCondicao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataStatus, documentoDigitalizado, flagDocumentoDigitalizado, id, idCondicoesDocumentosCredito, idDocumentosCredito, idLogAtendimento, idPessoaFisica, idProposta, idStatusDocumentosCredito, idTipoDocumentoCredito, observacao, responsavel, seqAnaliseCondicao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdtDocumentoProposta {\n");
    
    sb.append("    dataStatus: ").append(toIndentedString(dataStatus)).append("\n");
    sb.append("    documentoDigitalizado: ").append(toIndentedString(documentoDigitalizado)).append("\n");
    sb.append("    flagDocumentoDigitalizado: ").append(toIndentedString(flagDocumentoDigitalizado)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idCondicoesDocumentosCredito: ").append(toIndentedString(idCondicoesDocumentosCredito)).append("\n");
    sb.append("    idDocumentosCredito: ").append(toIndentedString(idDocumentosCredito)).append("\n");
    sb.append("    idLogAtendimento: ").append(toIndentedString(idLogAtendimento)).append("\n");
    sb.append("    idPessoaFisica: ").append(toIndentedString(idPessoaFisica)).append("\n");
    sb.append("    idProposta: ").append(toIndentedString(idProposta)).append("\n");
    sb.append("    idStatusDocumentosCredito: ").append(toIndentedString(idStatusDocumentosCredito)).append("\n");
    sb.append("    idTipoDocumentoCredito: ").append(toIndentedString(idTipoDocumentoCredito)).append("\n");
    sb.append("    observacao: ").append(toIndentedString(observacao)).append("\n");
    sb.append("    responsavel: ").append(toIndentedString(responsavel)).append("\n");
    sb.append("    seqAnaliseCondicao: ").append(toIndentedString(seqAnaliseCondicao)).append("\n");
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

