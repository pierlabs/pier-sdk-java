package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{codigo_seguranca_s_m_s_persist_description}}}
 **/

@ApiModel(description = "{{{codigo_seguranca_s_m_s_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CodigoSegurancaSMSPersist   {
  
  private String ddd = null;
  private String telefone = null;

  
  /**
   * {{{codigo_seguranca_s_m_s_persist_ddd_value}}}
   **/
  public CodigoSegurancaSMSPersist ddd(String ddd) {
    this.ddd = ddd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{codigo_seguranca_s_m_s_persist_ddd_value}}}")
  @JsonProperty("ddd")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * {{{codigo_seguranca_s_m_s_persist_telefone_value}}}
   **/
  public CodigoSegurancaSMSPersist telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{codigo_seguranca_s_m_s_persist_telefone_value}}}")
  @JsonProperty("telefone")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodigoSegurancaSMSPersist codigoSegurancaSMSPersist = (CodigoSegurancaSMSPersist) o;
    return Objects.equals(this.ddd, codigoSegurancaSMSPersist.ddd) &&
        Objects.equals(this.telefone, codigoSegurancaSMSPersist.telefone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ddd, telefone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodigoSegurancaSMSPersist {\n");
    
    sb.append("    ddd: ").append(toIndentedString(ddd)).append("\n");
    sb.append("    telefone: ").append(toIndentedString(telefone)).append("\n");
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



