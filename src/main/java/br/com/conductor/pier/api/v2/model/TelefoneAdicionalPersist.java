package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{telefone_adicional_persist_description}}}
 **/

@ApiModel(description = "{{{telefone_adicional_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TelefoneAdicionalPersist   {
  
  private Long idTipoTelefone = null;
  private String ddd = null;
  private String telefone = null;
  private String ramal = null;

  
  /**
   * {{{telefone_adicional_persist_id_tipo_telefone_value}}}
   **/
  public TelefoneAdicionalPersist idTipoTelefone(Long idTipoTelefone) {
    this.idTipoTelefone = idTipoTelefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{telefone_adicional_persist_id_tipo_telefone_value}}}")
  @JsonProperty("idTipoTelefone")
  public Long getIdTipoTelefone() {
    return idTipoTelefone;
  }
  public void setIdTipoTelefone(Long idTipoTelefone) {
    this.idTipoTelefone = idTipoTelefone;
  }

  
  /**
   * {{{telefone_adicional_persist_ddd_value}}}
   **/
  public TelefoneAdicionalPersist ddd(String ddd) {
    this.ddd = ddd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{telefone_adicional_persist_ddd_value}}}")
  @JsonProperty("ddd")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * {{{telefone_adicional_persist_telefone_value}}}
   **/
  public TelefoneAdicionalPersist telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{telefone_adicional_persist_telefone_value}}}")
  @JsonProperty("telefone")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * {{{telefone_adicional_persist_ramal_value}}}
   **/
  public TelefoneAdicionalPersist ramal(String ramal) {
    this.ramal = ramal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{telefone_adicional_persist_ramal_value}}}")
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
    TelefoneAdicionalPersist telefoneAdicionalPersist = (TelefoneAdicionalPersist) o;
    return Objects.equals(this.idTipoTelefone, telefoneAdicionalPersist.idTipoTelefone) &&
        Objects.equals(this.ddd, telefoneAdicionalPersist.ddd) &&
        Objects.equals(this.telefone, telefoneAdicionalPersist.telefone) &&
        Objects.equals(this.ramal, telefoneAdicionalPersist.ramal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTipoTelefone, ddd, telefone, ramal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelefoneAdicionalPersist {\n");
    
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

