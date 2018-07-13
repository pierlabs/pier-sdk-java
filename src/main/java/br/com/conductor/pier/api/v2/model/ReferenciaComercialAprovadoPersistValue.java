package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{referencia_comercial_aprovado_persist_description}}}
 **/

@ApiModel(description = "{{{referencia_comercial_aprovado_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ReferenciaComercialAprovadoPersistValue   {
  
  private String razaoSocial = null;
  private String nomeContrato = null;
  private String ddd = null;
  private String telefone = null;
  private String email = null;

  
  /**
   * {{{referencia_comercial_aprovado_persist_razao_social_value}}}
   **/
  public ReferenciaComercialAprovadoPersistValue razaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{referencia_comercial_aprovado_persist_razao_social_value}}}")
  @JsonProperty("razaoSocial")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * {{{referencia_comercial_aprovado_persist_nome_contrato_value}}}
   **/
  public ReferenciaComercialAprovadoPersistValue nomeContrato(String nomeContrato) {
    this.nomeContrato = nomeContrato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{referencia_comercial_aprovado_persist_nome_contrato_value}}}")
  @JsonProperty("nomeContrato")
  public String getNomeContrato() {
    return nomeContrato;
  }
  public void setNomeContrato(String nomeContrato) {
    this.nomeContrato = nomeContrato;
  }

  
  /**
   * {{{referencia_comercial_aprovado_persist_ddd_value}}}
   **/
  public ReferenciaComercialAprovadoPersistValue ddd(String ddd) {
    this.ddd = ddd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{referencia_comercial_aprovado_persist_ddd_value}}}")
  @JsonProperty("ddd")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * {{{referencia_comercial_aprovado_persist_telefone_value}}}
   **/
  public ReferenciaComercialAprovadoPersistValue telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{referencia_comercial_aprovado_persist_telefone_value}}}")
  @JsonProperty("telefone")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * {{{referencia_comercial_aprovado_persist_email_value}}}
   **/
  public ReferenciaComercialAprovadoPersistValue email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{referencia_comercial_aprovado_persist_email_value}}}")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferenciaComercialAprovadoPersistValue referenciaComercialAprovadoPersistValue = (ReferenciaComercialAprovadoPersistValue) o;
    return Objects.equals(this.razaoSocial, referenciaComercialAprovadoPersistValue.razaoSocial) &&
        Objects.equals(this.nomeContrato, referenciaComercialAprovadoPersistValue.nomeContrato) &&
        Objects.equals(this.ddd, referenciaComercialAprovadoPersistValue.ddd) &&
        Objects.equals(this.telefone, referenciaComercialAprovadoPersistValue.telefone) &&
        Objects.equals(this.email, referenciaComercialAprovadoPersistValue.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(razaoSocial, nomeContrato, ddd, telefone, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenciaComercialAprovadoPersistValue {\n");
    
    sb.append("    razaoSocial: ").append(toIndentedString(razaoSocial)).append("\n");
    sb.append("    nomeContrato: ").append(toIndentedString(nomeContrato)).append("\n");
    sb.append("    ddd: ").append(toIndentedString(ddd)).append("\n");
    sb.append("    telefone: ").append(toIndentedString(telefone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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



