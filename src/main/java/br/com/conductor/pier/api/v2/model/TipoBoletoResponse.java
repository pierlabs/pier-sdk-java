package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Fatura
 **/

@ApiModel(description = "Fatura")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoBoletoResponse   {
  
  private Long id = null;
  private String descricao = null;
  private Long banco = null;
  private Integer faixaNossoNumero = null;
  private BigDecimal minNossoNumero = null;
  private BigDecimal maxNossoNumero = null;
  private Integer tamNossoNumero = null;
  private BigDecimal ultimoNossoNumero = null;

  
  /**
   * C\u00F3digo identificador do tipo de boleto.
   **/
  public TipoBoletoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do tipo de boleto.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00E7\u00E3o do tipo de boleto.
   **/
  public TipoBoletoResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do tipo de boleto.")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * C\u00F3digo identificador do banco.
   **/
  public TipoBoletoResponse banco(Long banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do banco.")
  @JsonProperty("banco")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * Faixa permitida para cria\u00E7\u00E3o do nosso n\u00FAmero.
   **/
  public TipoBoletoResponse faixaNossoNumero(Integer faixaNossoNumero) {
    this.faixaNossoNumero = faixaNossoNumero;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Faixa permitida para cria\u00E7\u00E3o do nosso n\u00FAmero.")
  @JsonProperty("faixaNossoNumero")
  public Integer getFaixaNossoNumero() {
    return faixaNossoNumero;
  }
  public void setFaixaNossoNumero(Integer faixaNossoNumero) {
    this.faixaNossoNumero = faixaNossoNumero;
  }

  
  /**
   * N\u00FAmero minimo para o nosso n\u00FAmero.
   **/
  public TipoBoletoResponse minNossoNumero(BigDecimal minNossoNumero) {
    this.minNossoNumero = minNossoNumero;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero minimo para o nosso n\u00FAmero.")
  @JsonProperty("minNossoNumero")
  public BigDecimal getMinNossoNumero() {
    return minNossoNumero;
  }
  public void setMinNossoNumero(BigDecimal minNossoNumero) {
    this.minNossoNumero = minNossoNumero;
  }

  
  /**
   * N\u00FAmero m\u00E1ximo para o nosso n\u00FAmero.
   **/
  public TipoBoletoResponse maxNossoNumero(BigDecimal maxNossoNumero) {
    this.maxNossoNumero = maxNossoNumero;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero m\u00E1ximo para o nosso n\u00FAmero.")
  @JsonProperty("maxNossoNumero")
  public BigDecimal getMaxNossoNumero() {
    return maxNossoNumero;
  }
  public void setMaxNossoNumero(BigDecimal maxNossoNumero) {
    this.maxNossoNumero = maxNossoNumero;
  }

  
  /**
   * Tamanho do nosso n\u00FAmero.
   **/
  public TipoBoletoResponse tamNossoNumero(Integer tamNossoNumero) {
    this.tamNossoNumero = tamNossoNumero;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tamanho do nosso n\u00FAmero.")
  @JsonProperty("tamNossoNumero")
  public Integer getTamNossoNumero() {
    return tamNossoNumero;
  }
  public void setTamNossoNumero(Integer tamNossoNumero) {
    this.tamNossoNumero = tamNossoNumero;
  }

  
  /**
   * \u00DAltimo nosso n\u00FAmero utilizado.
   **/
  public TipoBoletoResponse ultimoNossoNumero(BigDecimal ultimoNossoNumero) {
    this.ultimoNossoNumero = ultimoNossoNumero;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u00DAltimo nosso n\u00FAmero utilizado.")
  @JsonProperty("ultimoNossoNumero")
  public BigDecimal getUltimoNossoNumero() {
    return ultimoNossoNumero;
  }
  public void setUltimoNossoNumero(BigDecimal ultimoNossoNumero) {
    this.ultimoNossoNumero = ultimoNossoNumero;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoBoletoResponse tipoBoletoResponse = (TipoBoletoResponse) o;
    return Objects.equals(this.id, tipoBoletoResponse.id) &&
        Objects.equals(this.descricao, tipoBoletoResponse.descricao) &&
        Objects.equals(this.banco, tipoBoletoResponse.banco) &&
        Objects.equals(this.faixaNossoNumero, tipoBoletoResponse.faixaNossoNumero) &&
        Objects.equals(this.minNossoNumero, tipoBoletoResponse.minNossoNumero) &&
        Objects.equals(this.maxNossoNumero, tipoBoletoResponse.maxNossoNumero) &&
        Objects.equals(this.tamNossoNumero, tipoBoletoResponse.tamNossoNumero) &&
        Objects.equals(this.ultimoNossoNumero, tipoBoletoResponse.ultimoNossoNumero);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descricao, banco, faixaNossoNumero, minNossoNumero, maxNossoNumero, tamNossoNumero, ultimoNossoNumero);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoBoletoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    banco: ").append(toIndentedString(banco)).append("\n");
    sb.append("    faixaNossoNumero: ").append(toIndentedString(faixaNossoNumero)).append("\n");
    sb.append("    minNossoNumero: ").append(toIndentedString(minNossoNumero)).append("\n");
    sb.append("    maxNossoNumero: ").append(toIndentedString(maxNossoNumero)).append("\n");
    sb.append("    tamNossoNumero: ").append(toIndentedString(tamNossoNumero)).append("\n");
    sb.append("    ultimoNossoNumero: ").append(toIndentedString(ultimoNossoNumero)).append("\n");
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

