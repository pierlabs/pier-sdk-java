package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Persist\u00EAncia celular recarga programada
 **/

@ApiModel(description = "Persist\u00EAncia celular recarga programada")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CelularRecargaProgramadaPersist   {
  
  private Long idCartao = null;
  private Long idUsuarioRecarga = null;
  private Long idDescricaoTipoRecargaProgramada = null;
  private Long codigoProduto = null;
  private Long codigoOperadora = null;
  private BigDecimal valor = null;
  private Long idPlataforma = null;
  private Boolean flagGeraTarifa = null;
  private Long idProposta = null;
  private Long idOrigemComercial = null;
  private String dddCelularRecarga = null;
  private String numeroCelularRecarga = null;

  
  /**
   * Identificador do cart\u00E3o
   **/
  public CelularRecargaProgramadaPersist idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identificador do cart\u00E3o")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Identificador do usu\u00E1rio
   **/
  public CelularRecargaProgramadaPersist idUsuarioRecarga(Long idUsuarioRecarga) {
    this.idUsuarioRecarga = idUsuarioRecarga;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do usu\u00E1rio")
  @JsonProperty("idUsuarioRecarga")
  public Long getIdUsuarioRecarga() {
    return idUsuarioRecarga;
  }
  public void setIdUsuarioRecarga(Long idUsuarioRecarga) {
    this.idUsuarioRecarga = idUsuarioRecarga;
  }

  
  /**
   * Identificador do tipo da recarga programada
   **/
  public CelularRecargaProgramadaPersist idDescricaoTipoRecargaProgramada(Long idDescricaoTipoRecargaProgramada) {
    this.idDescricaoTipoRecargaProgramada = idDescricaoTipoRecargaProgramada;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identificador do tipo da recarga programada")
  @JsonProperty("idDescricaoTipoRecargaProgramada")
  public Long getIdDescricaoTipoRecargaProgramada() {
    return idDescricaoTipoRecargaProgramada;
  }
  public void setIdDescricaoTipoRecargaProgramada(Long idDescricaoTipoRecargaProgramada) {
    this.idDescricaoTipoRecargaProgramada = idDescricaoTipoRecargaProgramada;
  }

  
  /**
   * C\u00F3digo do produto
   **/
  public CelularRecargaProgramadaPersist codigoProduto(Long codigoProduto) {
    this.codigoProduto = codigoProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo do produto")
  @JsonProperty("codigoProduto")
  public Long getCodigoProduto() {
    return codigoProduto;
  }
  public void setCodigoProduto(Long codigoProduto) {
    this.codigoProduto = codigoProduto;
  }

  
  /**
   * C\u00F3digo da operadora
   **/
  public CelularRecargaProgramadaPersist codigoOperadora(Long codigoOperadora) {
    this.codigoOperadora = codigoOperadora;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo da operadora")
  @JsonProperty("codigoOperadora")
  public Long getCodigoOperadora() {
    return codigoOperadora;
  }
  public void setCodigoOperadora(Long codigoOperadora) {
    this.codigoOperadora = codigoOperadora;
  }

  
  /**
   * Valor da recarga
   **/
  public CelularRecargaProgramadaPersist valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor da recarga")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Identificador da platafora
   **/
  public CelularRecargaProgramadaPersist idPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da platafora")
  @JsonProperty("idPlataforma")
  public Long getIdPlataforma() {
    return idPlataforma;
  }
  public void setIdPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
  }

  
  /**
   * Sinaliza\u00E7\u00E3o da tarifa
   **/
  public CelularRecargaProgramadaPersist flagGeraTarifa(Boolean flagGeraTarifa) {
    this.flagGeraTarifa = flagGeraTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "false", required = true, value = "Sinaliza\u00E7\u00E3o da tarifa")
  @JsonProperty("flagGeraTarifa")
  public Boolean getFlagGeraTarifa() {
    return flagGeraTarifa;
  }
  public void setFlagGeraTarifa(Boolean flagGeraTarifa) {
    this.flagGeraTarifa = flagGeraTarifa;
  }

  
  /**
   * Identificador da proposta
   **/
  public CelularRecargaProgramadaPersist idProposta(Long idProposta) {
    this.idProposta = idProposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da proposta")
  @JsonProperty("idProposta")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * Identificador da origem comercial
   **/
  public CelularRecargaProgramadaPersist idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identificador da origem comercial")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Discagem direta a dist\u00E2ncia do celular
   **/
  public CelularRecargaProgramadaPersist dddCelularRecarga(String dddCelularRecarga) {
    this.dddCelularRecarga = dddCelularRecarga;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Discagem direta a dist\u00E2ncia do celular")
  @JsonProperty("dddCelularRecarga")
  public String getDddCelularRecarga() {
    return dddCelularRecarga;
  }
  public void setDddCelularRecarga(String dddCelularRecarga) {
    this.dddCelularRecarga = dddCelularRecarga;
  }

  
  /**
   * N\u00FAmero do celular
   **/
  public CelularRecargaProgramadaPersist numeroCelularRecarga(String numeroCelularRecarga) {
    this.numeroCelularRecarga = numeroCelularRecarga;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00FAmero do celular")
  @JsonProperty("numeroCelularRecarga")
  public String getNumeroCelularRecarga() {
    return numeroCelularRecarga;
  }
  public void setNumeroCelularRecarga(String numeroCelularRecarga) {
    this.numeroCelularRecarga = numeroCelularRecarga;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CelularRecargaProgramadaPersist celularRecargaProgramadaPersist = (CelularRecargaProgramadaPersist) o;
    return Objects.equals(this.idCartao, celularRecargaProgramadaPersist.idCartao) &&
        Objects.equals(this.idUsuarioRecarga, celularRecargaProgramadaPersist.idUsuarioRecarga) &&
        Objects.equals(this.idDescricaoTipoRecargaProgramada, celularRecargaProgramadaPersist.idDescricaoTipoRecargaProgramada) &&
        Objects.equals(this.codigoProduto, celularRecargaProgramadaPersist.codigoProduto) &&
        Objects.equals(this.codigoOperadora, celularRecargaProgramadaPersist.codigoOperadora) &&
        Objects.equals(this.valor, celularRecargaProgramadaPersist.valor) &&
        Objects.equals(this.idPlataforma, celularRecargaProgramadaPersist.idPlataforma) &&
        Objects.equals(this.flagGeraTarifa, celularRecargaProgramadaPersist.flagGeraTarifa) &&
        Objects.equals(this.idProposta, celularRecargaProgramadaPersist.idProposta) &&
        Objects.equals(this.idOrigemComercial, celularRecargaProgramadaPersist.idOrigemComercial) &&
        Objects.equals(this.dddCelularRecarga, celularRecargaProgramadaPersist.dddCelularRecarga) &&
        Objects.equals(this.numeroCelularRecarga, celularRecargaProgramadaPersist.numeroCelularRecarga);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCartao, idUsuarioRecarga, idDescricaoTipoRecargaProgramada, codigoProduto, codigoOperadora, valor, idPlataforma, flagGeraTarifa, idProposta, idOrigemComercial, dddCelularRecarga, numeroCelularRecarga);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CelularRecargaProgramadaPersist {\n");
    
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    idUsuarioRecarga: ").append(toIndentedString(idUsuarioRecarga)).append("\n");
    sb.append("    idDescricaoTipoRecargaProgramada: ").append(toIndentedString(idDescricaoTipoRecargaProgramada)).append("\n");
    sb.append("    codigoProduto: ").append(toIndentedString(codigoProduto)).append("\n");
    sb.append("    codigoOperadora: ").append(toIndentedString(codigoOperadora)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    idPlataforma: ").append(toIndentedString(idPlataforma)).append("\n");
    sb.append("    flagGeraTarifa: ").append(toIndentedString(flagGeraTarifa)).append("\n");
    sb.append("    idProposta: ").append(toIndentedString(idProposta)).append("\n");
    sb.append("    idOrigemComercial: ").append(toIndentedString(idOrigemComercial)).append("\n");
    sb.append("    dddCelularRecarga: ").append(toIndentedString(dddCelularRecarga)).append("\n");
    sb.append("    numeroCelularRecarga: ").append(toIndentedString(numeroCelularRecarga)).append("\n");
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

