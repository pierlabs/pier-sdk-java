package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Representa\u00E7\u00E3o da resposta do recurso de Tipo Debito Recorrente
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso de Tipo Debito Recorrente")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoDebitoRecorrenteResponse   {
  
  private Long id = null;
  private String descricao = null;
  private BigDecimal valor = null;
  private Boolean flagAtivo = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo de d\u00E9bito recorrente (id).
   **/
  public TipoDebitoRecorrenteResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo de d\u00E9bito recorrente (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00E7\u00E3o do tipo de d\u00E9bito recorrente.
   **/
  public TipoDebitoRecorrenteResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do tipo de d\u00E9bito recorrente.")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Valor do tipo de d\u00E9bito recorrente.
   **/
  public TipoDebitoRecorrenteResponse valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do tipo de d\u00E9bito recorrente.")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Flag que identifica se o tipo d\u00E9bito recorrente est\u00E1 ativo.
   **/
  public TipoDebitoRecorrenteResponse flagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que identifica se o tipo d\u00E9bito recorrente est\u00E1 ativo.")
  @JsonProperty("flagAtivo")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoDebitoRecorrenteResponse tipoDebitoRecorrenteResponse = (TipoDebitoRecorrenteResponse) o;
    return Objects.equals(this.id, tipoDebitoRecorrenteResponse.id) &&
        Objects.equals(this.descricao, tipoDebitoRecorrenteResponse.descricao) &&
        Objects.equals(this.valor, tipoDebitoRecorrenteResponse.valor) &&
        Objects.equals(this.flagAtivo, tipoDebitoRecorrenteResponse.flagAtivo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descricao, valor, flagAtivo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoDebitoRecorrenteResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    flagAtivo: ").append(toIndentedString(flagAtivo)).append("\n");
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

