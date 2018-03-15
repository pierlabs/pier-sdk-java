package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Telefone
 **/

@ApiModel(description = "Objeto Telefone")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TelefoneAdicionalPersist   {
  
  private Long idTipoTelefone = null;
  private String ddd = null;
  private String telefone = null;
  private String ramal = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Telefone (id).
   **/
  public TelefoneAdicionalPersist idTipoTelefone(Long idTipoTelefone) {
    this.idTipoTelefone = idTipoTelefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Telefone (id).")
  @JsonProperty("idTipoTelefone")
  public Long getIdTipoTelefone() {
    return idTipoTelefone;
  }
  public void setIdTipoTelefone(Long idTipoTelefone) {
    this.idTipoTelefone = idTipoTelefone;
  }

  
  /**
   * C\u00F3digo DDD do telefone (id).
   **/
  public TelefoneAdicionalPersist ddd(String ddd) {
    this.ddd = ddd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo DDD do telefone (id).")
  @JsonProperty("ddd")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * N\u00FAmero do telefone.
   **/
  public TelefoneAdicionalPersist telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do telefone.")
  @JsonProperty("telefone")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * N\u00FAmero do ramal.
   **/
  public TelefoneAdicionalPersist ramal(String ramal) {
    this.ramal = ramal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do ramal.")
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

