package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de atualiza\u00E7\u00E3o parcial TokenCartaoPartialUpdate
 **/

@ApiModel(description = "Objeto de atualiza\u00E7\u00E3o parcial TokenCartaoPartialUpdate")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TokenCartaoPartialUpdate   {
  
  private String token = null;
  private String requestorID = null;
  private String referenceID = null;
  private String panReferenceID = null;
  private String tipo = null;


  public enum StatusEnum {
    ATIVO("ATIVO"),
    INATIVO("INATIVO"),
    SUSPENSO("SUSPENSO"),
    EXCLUIDO("EXCLUIDO");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status = null;


  public enum UltimoStatusEnum {
    ATIVO("ATIVO"),
    INATIVO("INATIVO"),
    SUSPENSO("SUSPENSO"),
    EXCLUIDO("EXCLUIDO");

    private String value;

    UltimoStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private UltimoStatusEnum ultimoStatus = null;
  private String codigoAtivacao = null;
  private Integer tentativasAtivacao = null;
  private Integer qtdCodigosAtivacao = null;
  private Integer score = null;
  private String resultadoAprovisionamento = null;
  private String validade = null;
  private String dataAtualizacaoChaveDispositivo = null;

  
  /**
   * Token
   **/
  public TokenCartaoPartialUpdate token(String token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Token")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * Identificador requestorID
   **/
  public TokenCartaoPartialUpdate requestorID(String requestorID) {
    this.requestorID = requestorID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador requestorID")
  @JsonProperty("requestorID")
  public String getRequestorID() {
    return requestorID;
  }
  public void setRequestorID(String requestorID) {
    this.requestorID = requestorID;
  }

  
  /**
   * Identificador referenceID
   **/
  public TokenCartaoPartialUpdate referenceID(String referenceID) {
    this.referenceID = referenceID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador referenceID")
  @JsonProperty("referenceID")
  public String getReferenceID() {
    return referenceID;
  }
  public void setReferenceID(String referenceID) {
    this.referenceID = referenceID;
  }

  
  /**
   * Indentificador panReferenceID
   **/
  public TokenCartaoPartialUpdate panReferenceID(String panReferenceID) {
    this.panReferenceID = panReferenceID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indentificador panReferenceID")
  @JsonProperty("panReferenceID")
  public String getPanReferenceID() {
    return panReferenceID;
  }
  public void setPanReferenceID(String panReferenceID) {
    this.panReferenceID = panReferenceID;
  }

  
  /**
   * Tipo do token
   **/
  public TokenCartaoPartialUpdate tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo do token")
  @JsonProperty("tipo")
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  
  /**
   * Status do token
   **/
  public TokenCartaoPartialUpdate status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status do token")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Ultimo status do token
   **/
  public TokenCartaoPartialUpdate ultimoStatus(UltimoStatusEnum ultimoStatus) {
    this.ultimoStatus = ultimoStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Ultimo status do token")
  @JsonProperty("ultimoStatus")
  public UltimoStatusEnum getUltimoStatus() {
    return ultimoStatus;
  }
  public void setUltimoStatus(UltimoStatusEnum ultimoStatus) {
    this.ultimoStatus = ultimoStatus;
  }

  
  /**
   * C\u00F3digo de ativa\u00E7\u00E3o
   **/
  public TokenCartaoPartialUpdate codigoAtivacao(String codigoAtivacao) {
    this.codigoAtivacao = codigoAtivacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de ativa\u00E7\u00E3o")
  @JsonProperty("codigoAtivacao")
  public String getCodigoAtivacao() {
    return codigoAtivacao;
  }
  public void setCodigoAtivacao(String codigoAtivacao) {
    this.codigoAtivacao = codigoAtivacao;
  }

  
  /**
   * Tentativas de ativa\u00E7\u00E3o
   **/
  public TokenCartaoPartialUpdate tentativasAtivacao(Integer tentativasAtivacao) {
    this.tentativasAtivacao = tentativasAtivacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tentativas de ativa\u00E7\u00E3o")
  @JsonProperty("tentativasAtivacao")
  public Integer getTentativasAtivacao() {
    return tentativasAtivacao;
  }
  public void setTentativasAtivacao(Integer tentativasAtivacao) {
    this.tentativasAtivacao = tentativasAtivacao;
  }

  
  /**
   * Quantidade de c\u00F3digos de ativa\u00E7\u00E3o
   **/
  public TokenCartaoPartialUpdate qtdCodigosAtivacao(Integer qtdCodigosAtivacao) {
    this.qtdCodigosAtivacao = qtdCodigosAtivacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de c\u00F3digos de ativa\u00E7\u00E3o")
  @JsonProperty("qtdCodigosAtivacao")
  public Integer getQtdCodigosAtivacao() {
    return qtdCodigosAtivacao;
  }
  public void setQtdCodigosAtivacao(Integer qtdCodigosAtivacao) {
    this.qtdCodigosAtivacao = qtdCodigosAtivacao;
  }

  
  /**
   * Score
   **/
  public TokenCartaoPartialUpdate score(Integer score) {
    this.score = score;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Score")
  @JsonProperty("score")
  public Integer getScore() {
    return score;
  }
  public void setScore(Integer score) {
    this.score = score;
  }

  
  /**
   * Resultado do aprovisionamento
   **/
  public TokenCartaoPartialUpdate resultadoAprovisionamento(String resultadoAprovisionamento) {
    this.resultadoAprovisionamento = resultadoAprovisionamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Resultado do aprovisionamento")
  @JsonProperty("resultadoAprovisionamento")
  public String getResultadoAprovisionamento() {
    return resultadoAprovisionamento;
  }
  public void setResultadoAprovisionamento(String resultadoAprovisionamento) {
    this.resultadoAprovisionamento = resultadoAprovisionamento;
  }

  
  /**
   * Data de validade
   **/
  public TokenCartaoPartialUpdate validade(String validade) {
    this.validade = validade;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ", value = "Data de validade")
  @JsonProperty("validade")
  public String getValidade() {
    return validade;
  }
  public void setValidade(String validade) {
    this.validade = validade;
  }

  
  /**
   * Data de atualiza\u00E7\u00E3o da chave do dispositivo
   **/
  public TokenCartaoPartialUpdate dataAtualizacaoChaveDispositivo(String dataAtualizacaoChaveDispositivo) {
    this.dataAtualizacaoChaveDispositivo = dataAtualizacaoChaveDispositivo;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ", value = "Data de atualiza\u00E7\u00E3o da chave do dispositivo")
  @JsonProperty("dataAtualizacaoChaveDispositivo")
  public String getDataAtualizacaoChaveDispositivo() {
    return dataAtualizacaoChaveDispositivo;
  }
  public void setDataAtualizacaoChaveDispositivo(String dataAtualizacaoChaveDispositivo) {
    this.dataAtualizacaoChaveDispositivo = dataAtualizacaoChaveDispositivo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenCartaoPartialUpdate tokenCartaoPartialUpdate = (TokenCartaoPartialUpdate) o;
    return Objects.equals(this.token, tokenCartaoPartialUpdate.token) &&
        Objects.equals(this.requestorID, tokenCartaoPartialUpdate.requestorID) &&
        Objects.equals(this.referenceID, tokenCartaoPartialUpdate.referenceID) &&
        Objects.equals(this.panReferenceID, tokenCartaoPartialUpdate.panReferenceID) &&
        Objects.equals(this.tipo, tokenCartaoPartialUpdate.tipo) &&
        Objects.equals(this.status, tokenCartaoPartialUpdate.status) &&
        Objects.equals(this.ultimoStatus, tokenCartaoPartialUpdate.ultimoStatus) &&
        Objects.equals(this.codigoAtivacao, tokenCartaoPartialUpdate.codigoAtivacao) &&
        Objects.equals(this.tentativasAtivacao, tokenCartaoPartialUpdate.tentativasAtivacao) &&
        Objects.equals(this.qtdCodigosAtivacao, tokenCartaoPartialUpdate.qtdCodigosAtivacao) &&
        Objects.equals(this.score, tokenCartaoPartialUpdate.score) &&
        Objects.equals(this.resultadoAprovisionamento, tokenCartaoPartialUpdate.resultadoAprovisionamento) &&
        Objects.equals(this.validade, tokenCartaoPartialUpdate.validade) &&
        Objects.equals(this.dataAtualizacaoChaveDispositivo, tokenCartaoPartialUpdate.dataAtualizacaoChaveDispositivo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, requestorID, referenceID, panReferenceID, tipo, status, ultimoStatus, codigoAtivacao, tentativasAtivacao, qtdCodigosAtivacao, score, resultadoAprovisionamento, validade, dataAtualizacaoChaveDispositivo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenCartaoPartialUpdate {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    requestorID: ").append(toIndentedString(requestorID)).append("\n");
    sb.append("    referenceID: ").append(toIndentedString(referenceID)).append("\n");
    sb.append("    panReferenceID: ").append(toIndentedString(panReferenceID)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    ultimoStatus: ").append(toIndentedString(ultimoStatus)).append("\n");
    sb.append("    codigoAtivacao: ").append(toIndentedString(codigoAtivacao)).append("\n");
    sb.append("    tentativasAtivacao: ").append(toIndentedString(tentativasAtivacao)).append("\n");
    sb.append("    qtdCodigosAtivacao: ").append(toIndentedString(qtdCodigosAtivacao)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    resultadoAprovisionamento: ").append(toIndentedString(resultadoAprovisionamento)).append("\n");
    sb.append("    validade: ").append(toIndentedString(validade)).append("\n");
    sb.append("    dataAtualizacaoChaveDispositivo: ").append(toIndentedString(dataAtualizacaoChaveDispositivo)).append("\n");
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

