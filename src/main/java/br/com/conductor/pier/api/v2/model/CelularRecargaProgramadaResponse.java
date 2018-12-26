package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{celular_recarga_programada_resposta_descricao}}}
 **/

@ApiModel(description = "{{{celular_recarga_programada_resposta_descricao}}}")
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
   * {{{celular_recarga_programada_resposta_codigo_operadora_descricao}}}
   **/
  public CelularRecargaProgramadaResponse codigoOperadora(Long codigoOperadora) {
    this.codigoOperadora = codigoOperadora;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{celular_recarga_programada_resposta_codigo_operadora_descricao}}}")
  @JsonProperty("codigoOperadora")
  public Long getCodigoOperadora() {
    return codigoOperadora;
  }
  public void setCodigoOperadora(Long codigoOperadora) {
    this.codigoOperadora = codigoOperadora;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_codigo_produto_descricao}}}
   **/
  public CelularRecargaProgramadaResponse codigoProduto(Long codigoProduto) {
    this.codigoProduto = codigoProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{celular_recarga_programada_resposta_codigo_produto_descricao}}}")
  @JsonProperty("codigoProduto")
  public Long getCodigoProduto() {
    return codigoProduto;
  }
  public void setCodigoProduto(Long codigoProduto) {
    this.codigoProduto = codigoProduto;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_flag_gera_tarifa_descricao}}}
   **/
  public CelularRecargaProgramadaResponse flagGeraTarifa(Boolean flagGeraTarifa) {
    this.flagGeraTarifa = flagGeraTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{celular_recarga_programada_resposta_flag_gera_tarifa_descricao}}}")
  @JsonProperty("flagGeraTarifa")
  public Boolean getFlagGeraTarifa() {
    return flagGeraTarifa;
  }
  public void setFlagGeraTarifa(Boolean flagGeraTarifa) {
    this.flagGeraTarifa = flagGeraTarifa;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_id_recarga_programada_descricao}}}
   **/
  public CelularRecargaProgramadaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{celular_recarga_programada_resposta_id_recarga_programada_descricao}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_id_cartao_descricao}}}
   **/
  public CelularRecargaProgramadaResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{celular_recarga_programada_resposta_id_cartao_descricao}}}")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_id_celular_recarga_descricao}}}
   **/
  public CelularRecargaProgramadaResponse idCelularRecarga(Long idCelularRecarga) {
    this.idCelularRecarga = idCelularRecarga;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{celular_recarga_programada_resposta_id_celular_recarga_descricao}}}")
  @JsonProperty("idCelularRecarga")
  public Long getIdCelularRecarga() {
    return idCelularRecarga;
  }
  public void setIdCelularRecarga(Long idCelularRecarga) {
    this.idCelularRecarga = idCelularRecarga;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_id_conta_descricao}}}
   **/
  public CelularRecargaProgramadaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{celular_recarga_programada_resposta_id_conta_descricao}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_id_descricao_tipo_recarga_programada_descricao}}}
   **/
  public CelularRecargaProgramadaResponse idDescricaoTipoRecargaProgramada(Long idDescricaoTipoRecargaProgramada) {
    this.idDescricaoTipoRecargaProgramada = idDescricaoTipoRecargaProgramada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{celular_recarga_programada_resposta_id_descricao_tipo_recarga_programada_descricao}}}")
  @JsonProperty("idDescricaoTipoRecargaProgramada")
  public Long getIdDescricaoTipoRecargaProgramada() {
    return idDescricaoTipoRecargaProgramada;
  }
  public void setIdDescricaoTipoRecargaProgramada(Long idDescricaoTipoRecargaProgramada) {
    this.idDescricaoTipoRecargaProgramada = idDescricaoTipoRecargaProgramada;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_id_origem_comercial_descricao}}}
   **/
  public CelularRecargaProgramadaResponse idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{celular_recarga_programada_resposta_id_origem_comercial_descricao}}}")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_id_proposta_descricao}}}
   **/
  public CelularRecargaProgramadaResponse idProposta(Long idProposta) {
    this.idProposta = idProposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{celular_recarga_programada_resposta_id_proposta_descricao}}}")
  @JsonProperty("idProposta")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_id_usuario_recarga_descricao}}}
   **/
  public CelularRecargaProgramadaResponse idUsuarioRecarga(Long idUsuarioRecarga) {
    this.idUsuarioRecarga = idUsuarioRecarga;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{celular_recarga_programada_resposta_id_usuario_recarga_descricao}}}")
  @JsonProperty("idUsuarioRecarga")
  public Long getIdUsuarioRecarga() {
    return idUsuarioRecarga;
  }
  public void setIdUsuarioRecarga(Long idUsuarioRecarga) {
    this.idUsuarioRecarga = idUsuarioRecarga;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_id_plataforma_descricao}}}
   **/
  public CelularRecargaProgramadaResponse idiPlataforma(Long idiPlataforma) {
    this.idiPlataforma = idiPlataforma;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{celular_recarga_programada_resposta_id_plataforma_descricao}}}")
  @JsonProperty("idiPlataforma")
  public Long getIdiPlataforma() {
    return idiPlataforma;
  }
  public void setIdiPlataforma(Long idiPlataforma) {
    this.idiPlataforma = idiPlataforma;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_motivo_cancelamento_descricao}}}
   **/
  public CelularRecargaProgramadaResponse motivoCancelamento(Long motivoCancelamento) {
    this.motivoCancelamento = motivoCancelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{celular_recarga_programada_resposta_motivo_cancelamento_descricao}}}")
  @JsonProperty("motivoCancelamento")
  public Long getMotivoCancelamento() {
    return motivoCancelamento;
  }
  public void setMotivoCancelamento(Long motivoCancelamento) {
    this.motivoCancelamento = motivoCancelamento;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_valor_descricao}}}
   **/
  public CelularRecargaProgramadaResponse valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{celular_recarga_programada_resposta_valor_descricao}}}")
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

