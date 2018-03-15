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
public class TelefoneEstabelecimentoUpdate   {
  
  private String ddd = null;
  private String telefone = null;
  private String ramal = null;

  
  /**
   * C\u00F3digo DDD do telefone.
   **/
  public TelefoneEstabelecimentoUpdate ddd(String ddd) {
    this.ddd = ddd;
    return this;
  }
  
  @ApiModelProperty(example = "83", required = true, value = "C\u00F3digo DDD do telefone.")
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
  public TelefoneEstabelecimentoUpdate telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }
  
  @ApiModelProperty(example = "987654321", required = true, value = "N\u00FAmero do telefone.")
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
  public TelefoneEstabelecimentoUpdate ramal(String ramal) {
    this.ramal = ramal;
    return this;
  }
  
  @ApiModelProperty(example = "1234", value = "N\u00FAmero do ramal.")
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
    TelefoneEstabelecimentoUpdate telefoneEstabelecimentoUpdate = (TelefoneEstabelecimentoUpdate) o;
    return Objects.equals(this.ddd, telefoneEstabelecimentoUpdate.ddd) &&
        Objects.equals(this.telefone, telefoneEstabelecimentoUpdate.telefone) &&
        Objects.equals(this.ramal, telefoneEstabelecimentoUpdate.ramal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ddd, telefone, ramal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelefoneEstabelecimentoUpdate {\n");
    
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

