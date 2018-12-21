package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{celular_recarga_programada_persistencia_descricao}}}
 **/

@ApiModel(description = "{{{celular_recarga_programada_persistencia_descricao}}}")
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
   * {{{celular_recarga_programada_persistencia_id_cartao_descricao}}}
   **/
  public CelularRecargaProgramadaPersist idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{celular_recarga_programada_persistencia_id_cartao_descricao}}}")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{celular_recarga_programada_persistencia_id_usuario_recarga_descricao}}}
   **/
  public CelularRecargaProgramadaPersist idUsuarioRecarga(Long idUsuarioRecarga) {
    this.idUsuarioRecarga = idUsuarioRecarga;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{celular_recarga_programada_persistencia_id_usuario_recarga_descricao}}}")
  @JsonProperty("idUsuarioRecarga")
  public Long getIdUsuarioRecarga() {
    return idUsuarioRecarga;
  }
  public void setIdUsuarioRecarga(Long idUsuarioRecarga) {
    this.idUsuarioRecarga = idUsuarioRecarga;
  }

  
  /**
   * {{{celular_recarga_programada_persistencia_id_descricao_tipo_recarga_programada_descricao}}}
   **/
  public CelularRecargaProgramadaPersist idDescricaoTipoRecargaProgramada(Long idDescricaoTipoRecargaProgramada) {
    this.idDescricaoTipoRecargaProgramada = idDescricaoTipoRecargaProgramada;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{celular_recarga_programada_persistencia_id_descricao_tipo_recarga_programada_descricao}}}")
  @JsonProperty("idDescricaoTipoRecargaProgramada")
  public Long getIdDescricaoTipoRecargaProgramada() {
    return idDescricaoTipoRecargaProgramada;
  }
  public void setIdDescricaoTipoRecargaProgramada(Long idDescricaoTipoRecargaProgramada) {
    this.idDescricaoTipoRecargaProgramada = idDescricaoTipoRecargaProgramada;
  }

  
  /**
   * {{{celular_recarga_programada_persistencia_codigo_produto_descricao}}}
   **/
  public CelularRecargaProgramadaPersist codigoProduto(Long codigoProduto) {
    this.codigoProduto = codigoProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{celular_recarga_programada_persistencia_codigo_produto_descricao}}}")
  @JsonProperty("codigoProduto")
  public Long getCodigoProduto() {
    return codigoProduto;
  }
  public void setCodigoProduto(Long codigoProduto) {
    this.codigoProduto = codigoProduto;
  }

  
  /**
   * {{{celular_recarga_programada_persistencia_codigo_operadora_descricao}}}
   **/
  public CelularRecargaProgramadaPersist codigoOperadora(Long codigoOperadora) {
    this.codigoOperadora = codigoOperadora;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{celular_recarga_programada_persistencia_codigo_operadora_descricao}}}")
  @JsonProperty("codigoOperadora")
  public Long getCodigoOperadora() {
    return codigoOperadora;
  }
  public void setCodigoOperadora(Long codigoOperadora) {
    this.codigoOperadora = codigoOperadora;
  }

  
  /**
   * {{{celular_recarga_programada_persistencia_valor_descricao}}}
   **/
  public CelularRecargaProgramadaPersist valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{celular_recarga_programada_persistencia_valor_descricao}}}")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * {{{celular_recarga_programada_persistencia_id_plataforma_descricao}}}
   **/
  public CelularRecargaProgramadaPersist idPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{celular_recarga_programada_persistencia_id_plataforma_descricao}}}")
  @JsonProperty("idPlataforma")
  public Long getIdPlataforma() {
    return idPlataforma;
  }
  public void setIdPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
  }

  
  /**
   * {{{celular_recarga_programada_persistencia_flag_gera_tarifa_descricao}}}
   **/
  public CelularRecargaProgramadaPersist flagGeraTarifa(Boolean flagGeraTarifa) {
    this.flagGeraTarifa = flagGeraTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "false", required = true, value = "{{{celular_recarga_programada_persistencia_flag_gera_tarifa_descricao}}}")
  @JsonProperty("flagGeraTarifa")
  public Boolean getFlagGeraTarifa() {
    return flagGeraTarifa;
  }
  public void setFlagGeraTarifa(Boolean flagGeraTarifa) {
    this.flagGeraTarifa = flagGeraTarifa;
  }

  
  /**
   * {{{celular_recarga_programada_persistencia_id_proposta_descricao}}}
   **/
  public CelularRecargaProgramadaPersist idProposta(Long idProposta) {
    this.idProposta = idProposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{celular_recarga_programada_persistencia_id_proposta_descricao}}}")
  @JsonProperty("idProposta")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * {{{celular_recarga_programada_persistencia_id_origem_comercial_descricao}}}
   **/
  public CelularRecargaProgramadaPersist idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{celular_recarga_programada_persistencia_id_origem_comercial_descricao}}}")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * {{{celular_recarga_programada_persistencia_ddd_celular_recarga_descricao}}}
   **/
  public CelularRecargaProgramadaPersist dddCelularRecarga(String dddCelularRecarga) {
    this.dddCelularRecarga = dddCelularRecarga;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{celular_recarga_programada_persistencia_ddd_celular_recarga_descricao}}}")
  @JsonProperty("dddCelularRecarga")
  public String getDddCelularRecarga() {
    return dddCelularRecarga;
  }
  public void setDddCelularRecarga(String dddCelularRecarga) {
    this.dddCelularRecarga = dddCelularRecarga;
  }

  
  /**
   * {{{celular_recarga_programada_persistencia_numero_celular_recarga_descricao}}}
   **/
  public CelularRecargaProgramadaPersist numeroCelularRecarga(String numeroCelularRecarga) {
    this.numeroCelularRecarga = numeroCelularRecarga;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{celular_recarga_programada_persistencia_numero_celular_recarga_descricao}}}")
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

