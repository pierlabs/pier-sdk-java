package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Telefone Pessoa Aprovada
 **/

@ApiModel(description = "Objeto Telefone Pessoa Aprovada")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TelefonePessoaAprovadaResponse   {
  
  private Long id = null;
  private Long idTipoTelefone = null;
  private String ddd = null;
  private String telefone = null;
  private String ramal = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Endere\u00E7o
   **/
  public TelefonePessoaAprovadaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Endere\u00E7o")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Telefone (id)
   **/
  public TelefonePessoaAprovadaResponse idTipoTelefone(Long idTipoTelefone) {
    this.idTipoTelefone = idTipoTelefone;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Telefone (id)")
  @JsonProperty("idTipoTelefone")
  public Long getIdTipoTelefone() {
    return idTipoTelefone;
  }
  public void setIdTipoTelefone(Long idTipoTelefone) {
    this.idTipoTelefone = idTipoTelefone;
  }

  
  /**
   * DDD
   **/
  public TelefonePessoaAprovadaResponse ddd(String ddd) {
    this.ddd = ddd;
    return this;
  }
  
  @ApiModelProperty(example = "083", value = "DDD")
  @JsonProperty("ddd")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * Telefone n\u00FAmero
   **/
  public TelefonePessoaAprovadaResponse telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }
  
  @ApiModelProperty(example = "999999999", value = "Telefone n\u00FAmero")
  @JsonProperty("telefone")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * N\u00FAmero de ramal
   **/
  public TelefonePessoaAprovadaResponse ramal(String ramal) {
    this.ramal = ramal;
    return this;
  }
  
  @ApiModelProperty(example = "9999", value = "N\u00FAmero de ramal")
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

