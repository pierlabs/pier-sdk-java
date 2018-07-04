package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{telefone_pessoa_aprovada_response_description}}}
 **/

@ApiModel(description = "{{{telefone_pessoa_aprovada_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TelefonePessoaAprovadaResponse   {
  
  private Long id = null;
  private Long idTipoTelefone = null;
  private String ddd = null;
  private String telefone = null;
  private String ramal = null;

  
  /**
   * {{{telefone_pessoa_aprovada_response_id_value}}}
   **/
  public TelefonePessoaAprovadaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{telefone_pessoa_aprovada_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{telefone_pessoa_aprovada_response_id_tipo_telefone_value}}}
   **/
  public TelefonePessoaAprovadaResponse idTipoTelefone(Long idTipoTelefone) {
    this.idTipoTelefone = idTipoTelefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{telefone_pessoa_aprovada_response_id_tipo_telefone_value}}}")
  @JsonProperty("idTipoTelefone")
  public Long getIdTipoTelefone() {
    return idTipoTelefone;
  }
  public void setIdTipoTelefone(Long idTipoTelefone) {
    this.idTipoTelefone = idTipoTelefone;
  }

  
  /**
   * {{{telefone_pessoa_aprovada_response_ddd_value}}}
   **/
  public TelefonePessoaAprovadaResponse ddd(String ddd) {
    this.ddd = ddd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{telefone_pessoa_aprovada_response_ddd_value}}}")
  @JsonProperty("ddd")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * {{{telefone_pessoa_aprovada_response_telefone_value}}}
   **/
  public TelefonePessoaAprovadaResponse telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{telefone_pessoa_aprovada_response_telefone_value}}}")
  @JsonProperty("telefone")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * {{{telefone_pessoa_aprovada_response_ramal_value}}}
   **/
  public TelefonePessoaAprovadaResponse ramal(String ramal) {
    this.ramal = ramal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{telefone_pessoa_aprovada_response_ramal_value}}}")
  @JsonProperty("ramal")
  public String getRamal() {
    return ramal;
  }
  public void setRamal(String ramal) {
    this.ramal = ramal;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelefonePessoaAprovadaResponse telefonePessoaAprovadaResponse = (TelefonePessoaAprovadaResponse) o;
    return Objects.equals(this.id, telefonePessoaAprovadaResponse.id) &&
        Objects.equals(this.idTipoTelefone, telefonePessoaAprovadaResponse.idTipoTelefone) &&
        Objects.equals(this.ddd, telefonePessoaAprovadaResponse.ddd) &&
        Objects.equals(this.telefone, telefonePessoaAprovadaResponse.telefone) &&
        Objects.equals(this.ramal, telefonePessoaAprovadaResponse.ramal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idTipoTelefone, ddd, telefone, ramal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelefonePessoaAprovadaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idTipoTelefone: ").append(toIndentedString(idTipoTelefone)).append("\n");
    sb.append("    ddd: ").append(toIndentedString(ddd)).append("\n");
    sb.append("    telefone: ").append(toIndentedString(telefone)).append("\n");
    sb.append("    ramal: ").append(toIndentedString(ramal)).append("\n");
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



