package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Representa\u00E7\u00E3o da resposta do recurso de anuidade
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso de anuidade")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AnuidadeResponse   {
  
  private Long id = null;
  private String descricao = null;
  private BigDecimal valor = null;
  private Boolean flagAnuidadeBonificada = null;

  
  /**
   * Identificador do Tipo de anuidade de b\u00F4nus de celular
   **/
  public AnuidadeResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do Tipo de anuidade de b\u00F4nus de celular")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00E7\u00E3o do tipo de anuidade de b\u00F4nus de celular
   **/
  public AnuidadeResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do tipo de anuidade de b\u00F4nus de celular")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Valor do tipo de anuidade de b\u00F4nus de celular
   **/
  public AnuidadeResponse valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do tipo de anuidade de b\u00F4nus de celular")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Se o tipo de anuidade de b\u00F4nus de celular \u00E9 bonificada
   **/
  public AnuidadeResponse flagAnuidadeBonificada(Boolean flagAnuidadeBonificada) {
    this.flagAnuidadeBonificada = flagAnuidadeBonificada;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Se o tipo de anuidade de b\u00F4nus de celular \u00E9 bonificada")
  @JsonProperty("flagAnuidadeBonificada")
  public Boolean getFlagAnuidadeBonificada() {
    return flagAnuidadeBonificada;
  }
  public void setFlagAnuidadeBonificada(Boolean flagAnuidadeBonificada) {
    this.flagAnuidadeBonificada = flagAnuidadeBonificada;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnuidadeResponse anuidadeResponse = (AnuidadeResponse) o;
    return Objects.equals(this.id, anuidadeResponse.id) &&
        Objects.equals(this.descricao, anuidadeResponse.descricao) &&
        Objects.equals(this.valor, anuidadeResponse.valor) &&
        Objects.equals(this.flagAnuidadeBonificada, anuidadeResponse.flagAnuidadeBonificada);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descricao, valor, flagAnuidadeBonificada);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnuidadeResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    flagAnuidadeBonificada: ").append(toIndentedString(flagAnuidadeBonificada)).append("\n");
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

