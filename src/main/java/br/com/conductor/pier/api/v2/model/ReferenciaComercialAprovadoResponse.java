package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{referencia_comercial_aprovado_response_description}}}
 **/

@ApiModel(description = "{{{referencia_comercial_aprovado_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ReferenciaComercialAprovadoResponse   {
  
  private String razaoSocial = null;
  private String nomeContrato = null;
  private String ddd = null;
  private String telefone = null;
  private String email = null;

  
  /**
   * {{{referencia_comercial_aprovado_response_razao_social_value}}}
   **/
  public ReferenciaComercialAprovadoResponse razaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{referencia_comercial_aprovado_response_razao_social_value}}}")
  @JsonProperty("razaoSocial")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * {{{referencia_comercial_aprovado_response_nome_contrato_value}}}
   **/
  public ReferenciaComercialAprovadoResponse nomeContrato(String nomeContrato) {
    this.nomeContrato = nomeContrato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{referencia_comercial_aprovado_response_nome_contrato_value}}}")
  @JsonProperty("nomeContrato")
  public String getNomeContrato() {
    return nomeContrato;
  }
  public void setNomeContrato(String nomeContrato) {
    this.nomeContrato = nomeContrato;
  }

  
  /**
   * {{{referencia_comercial_aprovado_response_ddd_value}}}
   **/
  public ReferenciaComercialAprovadoResponse ddd(String ddd) {
    this.ddd = ddd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{referencia_comercial_aprovado_response_ddd_value}}}")
  @JsonProperty("ddd")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * {{{referencia_comercial_aprovado_response_telefone_value}}}
   **/
  public ReferenciaComercialAprovadoResponse telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{referencia_comercial_aprovado_response_telefone_value}}}")
  @JsonProperty("telefone")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * {{{referencia_comercial_aprovado_response_email_value}}}
   **/
  public ReferenciaComercialAprovadoResponse email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{referencia_comercial_aprovado_response_email_value}}}")
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
    ReferenciaComercialAprovadoResponse referenciaComercialAprovadoResponse = (ReferenciaComercialAprovadoResponse) o;
    return Objects.equals(this.razaoSocial, referenciaComercialAprovadoResponse.razaoSocial) &&
        Objects.equals(this.nomeContrato, referenciaComercialAprovadoResponse.nomeContrato) &&
        Objects.equals(this.ddd, referenciaComercialAprovadoResponse.ddd) &&
        Objects.equals(this.telefone, referenciaComercialAprovadoResponse.telefone) &&
        Objects.equals(this.email, referenciaComercialAprovadoResponse.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(razaoSocial, nomeContrato, ddd, telefone, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenciaComercialAprovadoResponse {\n");
    
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

