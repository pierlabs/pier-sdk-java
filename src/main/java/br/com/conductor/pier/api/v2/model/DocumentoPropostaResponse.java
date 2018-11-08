package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{documento_proposta_response_description}}}
 **/

@ApiModel(description = "{{{documento_proposta_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DocumentoPropostaResponse   {
  
  private Long id = null;
  private Long idProposta = null;
  private Long idDocumentosCredito = null;
  private Long idStatusDocumentosCredito = null;
  private Long idCondicoesDocumentosCredito = null;
  private Long idTipoDocumentoCredito = null;
  private Long idPessoaFisica = null;
  private Long idLogAtendimento = null;
  private String responsavel = null;
  private Integer flagDocumentoDigitalizado = null;
  private String documentoDigitalizado = null;
  private Long seqAnaliseCondicao = null;
  private String observacao = null;
  private String dataStatus = null;

  
  /**
   * {{{documento_proposta_response_id_value}}}
   **/
  public DocumentoPropostaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_proposta_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{documento_proposta_response_id_proposta_value}}}
   **/
  public DocumentoPropostaResponse idProposta(Long idProposta) {
    this.idProposta = idProposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_proposta_response_id_proposta_value}}}")
  @JsonProperty("idProposta")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * {{{documento_proposta_response_id_tipo_documento_value}}}
   **/
  public DocumentoPropostaResponse idDocumentosCredito(Long idDocumentosCredito) {
    this.idDocumentosCredito = idDocumentosCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_proposta_response_id_tipo_documento_value}}}")
  @JsonProperty("idDocumentosCredito")
  public Long getIdDocumentosCredito() {
    return idDocumentosCredito;
  }
  public void setIdDocumentosCredito(Long idDocumentosCredito) {
    this.idDocumentosCredito = idDocumentosCredito;
  }

  
  /**
   * {{{documento_proposta_response_id_status_documento_credito_value}}}
   **/
  public DocumentoPropostaResponse idStatusDocumentosCredito(Long idStatusDocumentosCredito) {
    this.idStatusDocumentosCredito = idStatusDocumentosCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_proposta_response_id_status_documento_credito_value}}}")
  @JsonProperty("idStatusDocumentosCredito")
  public Long getIdStatusDocumentosCredito() {
    return idStatusDocumentosCredito;
  }
  public void setIdStatusDocumentosCredito(Long idStatusDocumentosCredito) {
    this.idStatusDocumentosCredito = idStatusDocumentosCredito;
  }

  
  /**
   * {{{documento_proposta_response_id_condicao_documento_credito_value}}}
   **/
  public DocumentoPropostaResponse idCondicoesDocumentosCredito(Long idCondicoesDocumentosCredito) {
    this.idCondicoesDocumentosCredito = idCondicoesDocumentosCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_proposta_response_id_condicao_documento_credito_value}}}")
  @JsonProperty("idCondicoesDocumentosCredito")
  public Long getIdCondicoesDocumentosCredito() {
    return idCondicoesDocumentosCredito;
  }
  public void setIdCondicoesDocumentosCredito(Long idCondicoesDocumentosCredito) {
    this.idCondicoesDocumentosCredito = idCondicoesDocumentosCredito;
  }

  
  /**
   * {{{documento_proposta_response_id_tipo_documento_credito_value}}}
   **/
  public DocumentoPropostaResponse idTipoDocumentoCredito(Long idTipoDocumentoCredito) {
    this.idTipoDocumentoCredito = idTipoDocumentoCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_proposta_response_id_tipo_documento_credito_value}}}")
  @JsonProperty("idTipoDocumentoCredito")
  public Long getIdTipoDocumentoCredito() {
    return idTipoDocumentoCredito;
  }
  public void setIdTipoDocumentoCredito(Long idTipoDocumentoCredito) {
    this.idTipoDocumentoCredito = idTipoDocumentoCredito;
  }

  
  /**
   * {{{documento_proposta_response_id_pessoa_fisica_value}}}
   **/
  public DocumentoPropostaResponse idPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_proposta_response_id_pessoa_fisica_value}}}")
  @JsonProperty("idPessoaFisica")
  public Long getIdPessoaFisica() {
    return idPessoaFisica;
  }
  public void setIdPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
  }

  
  /**
   * {{{documento_proposta_response_id_log_atendimento_value}}}
   **/
  public DocumentoPropostaResponse idLogAtendimento(Long idLogAtendimento) {
    this.idLogAtendimento = idLogAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_proposta_response_id_log_atendimento_value}}}")
  @JsonProperty("idLogAtendimento")
  public Long getIdLogAtendimento() {
    return idLogAtendimento;
  }
  public void setIdLogAtendimento(Long idLogAtendimento) {
    this.idLogAtendimento = idLogAtendimento;
  }

  
  /**
   * {{{documento_proposta_response_responsavel_value}}}
   **/
  public DocumentoPropostaResponse responsavel(String responsavel) {
    this.responsavel = responsavel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_proposta_response_responsavel_value}}}")
  @JsonProperty("responsavel")
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  
  /**
   * {{{documento_proposta_response_flag_documento_digitalizado_value}}}
   **/
  public DocumentoPropostaResponse flagDocumentoDigitalizado(Integer flagDocumentoDigitalizado) {
    this.flagDocumentoDigitalizado = flagDocumentoDigitalizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_proposta_response_flag_documento_digitalizado_value}}}")
  @JsonProperty("flagDocumentoDigitalizado")
  public Integer getFlagDocumentoDigitalizado() {
    return flagDocumentoDigitalizado;
  }
  public void setFlagDocumentoDigitalizado(Integer flagDocumentoDigitalizado) {
    this.flagDocumentoDigitalizado = flagDocumentoDigitalizado;
  }

  
  /**
   * {{{documento_proposta_response_documento_digitalizado_value}}}
   **/
  public DocumentoPropostaResponse documentoDigitalizado(String documentoDigitalizado) {
    this.documentoDigitalizado = documentoDigitalizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_proposta_response_documento_digitalizado_value}}}")
  @JsonProperty("documentoDigitalizado")
  public String getDocumentoDigitalizado() {
    return documentoDigitalizado;
  }
  public void setDocumentoDigitalizado(String documentoDigitalizado) {
    this.documentoDigitalizado = documentoDigitalizado;
  }

  
  /**
   * {{{documento_proposta_response_seq_analise_condicao_value}}}
   **/
  public DocumentoPropostaResponse seqAnaliseCondicao(Long seqAnaliseCondicao) {
    this.seqAnaliseCondicao = seqAnaliseCondicao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_proposta_response_seq_analise_condicao_value}}}")
  @JsonProperty("seqAnaliseCondicao")
  public Long getSeqAnaliseCondicao() {
    return seqAnaliseCondicao;
  }
  public void setSeqAnaliseCondicao(Long seqAnaliseCondicao) {
    this.seqAnaliseCondicao = seqAnaliseCondicao;
  }

  
  /**
   * {{{documento_proposta_response_observacao_value}}}
   **/
  public DocumentoPropostaResponse observacao(String observacao) {
    this.observacao = observacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_proposta_response_observacao_value}}}")
  @JsonProperty("observacao")
  public String getObservacao() {
    return observacao;
  }
  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  
  /**
   * {{{documento_proposta_response_data_status_value}}}
   **/
  public DocumentoPropostaResponse dataStatus(String dataStatus) {
    this.dataStatus = dataStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_proposta_response_data_status_value}}}")
  @JsonProperty("dataStatus")
  public String getDataStatus() {
    return dataStatus;
  }
  public void setDataStatus(String dataStatus) {
    this.dataStatus = dataStatus;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentoPropostaResponse documentoPropostaResponse = (DocumentoPropostaResponse) o;
    return Objects.equals(this.id, documentoPropostaResponse.id) &&
        Objects.equals(this.idProposta, documentoPropostaResponse.idProposta) &&
        Objects.equals(this.idDocumentosCredito, documentoPropostaResponse.idDocumentosCredito) &&
        Objects.equals(this.idStatusDocumentosCredito, documentoPropostaResponse.idStatusDocumentosCredito) &&
        Objects.equals(this.idCondicoesDocumentosCredito, documentoPropostaResponse.idCondicoesDocumentosCredito) &&
        Objects.equals(this.idTipoDocumentoCredito, documentoPropostaResponse.idTipoDocumentoCredito) &&
        Objects.equals(this.idPessoaFisica, documentoPropostaResponse.idPessoaFisica) &&
        Objects.equals(this.idLogAtendimento, documentoPropostaResponse.idLogAtendimento) &&
        Objects.equals(this.responsavel, documentoPropostaResponse.responsavel) &&
        Objects.equals(this.flagDocumentoDigitalizado, documentoPropostaResponse.flagDocumentoDigitalizado) &&
        Objects.equals(this.documentoDigitalizado, documentoPropostaResponse.documentoDigitalizado) &&
        Objects.equals(this.seqAnaliseCondicao, documentoPropostaResponse.seqAnaliseCondicao) &&
        Objects.equals(this.observacao, documentoPropostaResponse.observacao) &&
        Objects.equals(this.dataStatus, documentoPropostaResponse.dataStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idProposta, idDocumentosCredito, idStatusDocumentosCredito, idCondicoesDocumentosCredito, idTipoDocumentoCredito, idPessoaFisica, idLogAtendimento, responsavel, flagDocumentoDigitalizado, documentoDigitalizado, seqAnaliseCondicao, observacao, dataStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoPropostaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idProposta: ").append(toIndentedString(idProposta)).append("\n");
    sb.append("    idDocumentosCredito: ").append(toIndentedString(idDocumentosCredito)).append("\n");
    sb.append("    idStatusDocumentosCredito: ").append(toIndentedString(idStatusDocumentosCredito)).append("\n");
    sb.append("    idCondicoesDocumentosCredito: ").append(toIndentedString(idCondicoesDocumentosCredito)).append("\n");
    sb.append("    idTipoDocumentoCredito: ").append(toIndentedString(idTipoDocumentoCredito)).append("\n");
    sb.append("    idPessoaFisica: ").append(toIndentedString(idPessoaFisica)).append("\n");
    sb.append("    idLogAtendimento: ").append(toIndentedString(idLogAtendimento)).append("\n");
    sb.append("    responsavel: ").append(toIndentedString(responsavel)).append("\n");
    sb.append("    flagDocumentoDigitalizado: ").append(toIndentedString(flagDocumentoDigitalizado)).append("\n");
    sb.append("    documentoDigitalizado: ").append(toIndentedString(documentoDigitalizado)).append("\n");
    sb.append("    seqAnaliseCondicao: ").append(toIndentedString(seqAnaliseCondicao)).append("\n");
    sb.append("    observacao: ").append(toIndentedString(observacao)).append("\n");
    sb.append("    dataStatus: ").append(toIndentedString(dataStatus)).append("\n");
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

