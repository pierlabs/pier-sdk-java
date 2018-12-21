package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Cellular recharge programmed answer
 **/

@ApiModel(description = "Cellular recharge programmed answer")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CelularRecargaProgramadaResponse   {
  
  private Long codigoOperadora = null;
  private Long codigoProduto = null;
  private Boolean flagGeraTarifa = null;
  private Long id = null;
  private Long idCartao = null;
  private Long idCelularRecarga = null;
  private Long idConta = null;
  private Long idDescricaoTipoRecargaProgramada = null;
  private Long idOrigemComercial = null;
  private Long idProposta = null;
  private Long idUsuarioRecarga = null;
  private Long idiPlataforma = null;
  private Long motivoCancelamento = null;
  private BigDecimal valor = null;

  
  /**
   * Operator code
   **/
  public CelularRecargaProgramadaResponse codigoOperadora(Long codigoOperadora) {
    this.codigoOperadora = codigoOperadora;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Operator code")
  @JsonProperty("codigoOperadora")
  public Long getCodigoOperadora() {
    return codigoOperadora;
  }
  public void setCodigoOperadora(Long codigoOperadora) {
    this.codigoOperadora = codigoOperadora;
  }

  
  /**
   * product code
   **/
  public CelularRecargaProgramadaResponse codigoProduto(Long codigoProduto) {
    this.codigoProduto = codigoProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "product code")
  @JsonProperty("codigoProduto")
  public Long getCodigoProduto() {
    return codigoProduto;
  }
  public void setCodigoProduto(Long codigoProduto) {
    this.codigoProduto = codigoProduto;
  }

  
  /**
   * Tariff signaling
   **/
  public CelularRecargaProgramadaResponse flagGeraTarifa(Boolean flagGeraTarifa) {
    this.flagGeraTarifa = flagGeraTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Tariff signaling")
  @JsonProperty("flagGeraTarifa")
  public Boolean getFlagGeraTarifa() {
    return flagGeraTarifa;
  }
  public void setFlagGeraTarifa(Boolean flagGeraTarifa) {
    this.flagGeraTarifa = flagGeraTarifa;
  }

  
  /**
   * Card ID
   **/
  public CelularRecargaProgramadaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Card ID")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Card ID
   **/
  public CelularRecargaProgramadaResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Card ID")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Cellphone number
   **/
  public CelularRecargaProgramadaResponse idCelularRecarga(Long idCelularRecarga) {
    this.idCelularRecarga = idCelularRecarga;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cellphone number")
  @JsonProperty("idCelularRecarga")
  public Long getIdCelularRecarga() {
    return idCelularRecarga;
  }
  public void setIdCelularRecarga(Long idCelularRecarga) {
    this.idCelularRecarga = idCelularRecarga;
  }

  
  /**
   * Account Identifier
   **/
  public CelularRecargaProgramadaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Account Identifier")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Scheduled recharge type identifier
   **/
  public CelularRecargaProgramadaResponse idDescricaoTipoRecargaProgramada(Long idDescricaoTipoRecargaProgramada) {
    this.idDescricaoTipoRecargaProgramada = idDescricaoTipoRecargaProgramada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Scheduled recharge type identifier")
  @JsonProperty("idDescricaoTipoRecargaProgramada")
  public Long getIdDescricaoTipoRecargaProgramada() {
    return idDescricaoTipoRecargaProgramada;
  }
  public void setIdDescricaoTipoRecargaProgramada(Long idDescricaoTipoRecargaProgramada) {
    this.idDescricaoTipoRecargaProgramada = idDescricaoTipoRecargaProgramada;
  }

  
  /**
   * Business Source Identifier
   **/
  public CelularRecargaProgramadaResponse idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Business Source Identifier")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Proposal identifier
   **/
  public CelularRecargaProgramadaResponse idProposta(Long idProposta) {
    this.idProposta = idProposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Proposal identifier")
  @JsonProperty("idProposta")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * User ID
   **/
  public CelularRecargaProgramadaResponse idUsuarioRecarga(Long idUsuarioRecarga) {
    this.idUsuarioRecarga = idUsuarioRecarga;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User ID")
  @JsonProperty("idUsuarioRecarga")
  public Long getIdUsuarioRecarga() {
    return idUsuarioRecarga;
  }
  public void setIdUsuarioRecarga(Long idUsuarioRecarga) {
    this.idUsuarioRecarga = idUsuarioRecarga;
  }

  
  /**
   * Proposal identifier
   **/
  public CelularRecargaProgramadaResponse idiPlataforma(Long idiPlataforma) {
    this.idiPlataforma = idiPlataforma;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Proposal identifier")
  @JsonProperty("idiPlataforma")
  public Long getIdiPlataforma() {
    return idiPlataforma;
  }
  public void setIdiPlataforma(Long idiPlataforma) {
    this.idiPlataforma = idiPlataforma;
  }

  
  /**
   * Reason for cancellation
   **/
  public CelularRecargaProgramadaResponse motivoCancelamento(Long motivoCancelamento) {
    this.motivoCancelamento = motivoCancelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reason for cancellation")
  @JsonProperty("motivoCancelamento")
  public Long getMotivoCancelamento() {
    return motivoCancelamento;
  }
  public void setMotivoCancelamento(Long motivoCancelamento) {
    this.motivoCancelamento = motivoCancelamento;
  }

  
  /**
   * Recharge value
   **/
  public CelularRecargaProgramadaResponse valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Recharge value")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CelularRecargaProgramadaResponse celularRecargaProgramadaResponse = (CelularRecargaProgramadaResponse) o;
    return Objects.equals(this.codigoOperadora, celularRecargaProgramadaResponse.codigoOperadora) &&
        Objects.equals(this.codigoProduto, celularRecargaProgramadaResponse.codigoProduto) &&
        Objects.equals(this.flagGeraTarifa, celularRecargaProgramadaResponse.flagGeraTarifa) &&
        Objects.equals(this.id, celularRecargaProgramadaResponse.id) &&
        Objects.equals(this.idCartao, celularRecargaProgramadaResponse.idCartao) &&
        Objects.equals(this.idCelularRecarga, celularRecargaProgramadaResponse.idCelularRecarga) &&
        Objects.equals(this.idConta, celularRecargaProgramadaResponse.idConta) &&
        Objects.equals(this.idDescricaoTipoRecargaProgramada, celularRecargaProgramadaResponse.idDescricaoTipoRecargaProgramada) &&
        Objects.equals(this.idOrigemComercial, celularRecargaProgramadaResponse.idOrigemComercial) &&
        Objects.equals(this.idProposta, celularRecargaProgramadaResponse.idProposta) &&
        Objects.equals(this.idUsuarioRecarga, celularRecargaProgramadaResponse.idUsuarioRecarga) &&
        Objects.equals(this.idiPlataforma, celularRecargaProgramadaResponse.idiPlataforma) &&
        Objects.equals(this.motivoCancelamento, celularRecargaProgramadaResponse.motivoCancelamento) &&
        Objects.equals(this.valor, celularRecargaProgramadaResponse.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigoOperadora, codigoProduto, flagGeraTarifa, id, idCartao, idCelularRecarga, idConta, idDescricaoTipoRecargaProgramada, idOrigemComercial, idProposta, idUsuarioRecarga, idiPlataforma, motivoCancelamento, valor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CelularRecargaProgramadaResponse {\n");
    
    sb.append("    codigoOperadora: ").append(toIndentedString(codigoOperadora)).append("\n");
    sb.append("    codigoProduto: ").append(toIndentedString(codigoProduto)).append("\n");
    sb.append("    flagGeraTarifa: ").append(toIndentedString(flagGeraTarifa)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    idCelularRecarga: ").append(toIndentedString(idCelularRecarga)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idDescricaoTipoRecargaProgramada: ").append(toIndentedString(idDescricaoTipoRecargaProgramada)).append("\n");
    sb.append("    idOrigemComercial: ").append(toIndentedString(idOrigemComercial)).append("\n");
    sb.append("    idProposta: ").append(toIndentedString(idProposta)).append("\n");
    sb.append("    idUsuarioRecarga: ").append(toIndentedString(idUsuarioRecarga)).append("\n");
    sb.append("    idiPlataforma: ").append(toIndentedString(idiPlataforma)).append("\n");
    sb.append("    motivoCancelamento: ").append(toIndentedString(motivoCancelamento)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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

