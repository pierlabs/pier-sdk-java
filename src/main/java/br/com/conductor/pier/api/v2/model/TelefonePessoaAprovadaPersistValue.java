package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{telefone_pessoa_aprovada_persist_description}}}
 **/

@ApiModel(description = "{{{telefone_pessoa_aprovada_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TelefonePessoaAprovadaPersistValue   {
  
  private Long idTipoTelefone = null;
  private String ddd = null;
  private String telefone = null;
  private String ramal = null;

  
  /**
   * {{{telefone_pessoa_aprovada_persist_id_tipo_telefone_value}}}
   **/
  public TelefonePessoaAprovadaPersistValue idTipoTelefone(Long idTipoTelefone) {
    this.idTipoTelefone = idTipoTelefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{telefone_pessoa_aprovada_persist_id_tipo_telefone_value}}}")
  @JsonProperty("idTipoTelefone")
  public Long getIdTipoTelefone() {
    return idTipoTelefone;
  }
  public void setIdTipoTelefone(Long idTipoTelefone) {
    this.idTipoTelefone = idTipoTelefone;
  }

  
  /**
   * {{{telefone_pessoa_aprovada_persist_ddd_value}}}
   **/
  public TelefonePessoaAprovadaPersistValue ddd(String ddd) {
    this.ddd = ddd;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{telefone_pessoa_aprovada_persist_ddd_value}}}")
  @JsonProperty("ddd")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * {{{telefone_pessoa_aprovada_persist_telefone_value}}}
   **/
  public TelefonePessoaAprovadaPersistValue telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{telefone_pessoa_aprovada_persist_telefone_value}}}")
  @JsonProperty("telefone")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * {{{telefone_pessoa_aprovada_persist_ramal_value}}}
   **/
  public TelefonePessoaAprovadaPersistValue ramal(String ramal) {
    this.ramal = ramal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{telefone_pessoa_aprovada_persist_ramal_value}}}")
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
    TelefonePessoaAprovadaPersistValue telefonePessoaAprovadaPersistValue = (TelefonePessoaAprovadaPersistValue) o;
    return Objects.equals(this.idTipoTelefone, telefonePessoaAprovadaPersistValue.idTipoTelefone) &&
        Objects.equals(this.ddd, telefonePessoaAprovadaPersistValue.ddd) &&
        Objects.equals(this.telefone, telefonePessoaAprovadaPersistValue.telefone) &&
        Objects.equals(this.ramal, telefonePessoaAprovadaPersistValue.ramal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTipoTelefone, ddd, telefone, ramal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelefonePessoaAprovadaPersistValue {\n");
    
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

