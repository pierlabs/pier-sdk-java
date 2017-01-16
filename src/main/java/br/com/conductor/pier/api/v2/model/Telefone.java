package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * ObjetoTelefone
 **/

@ApiModel(description = "ObjetoTelefone")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class Telefone   {
  
  private Long id = null;
  private Long idTipoTelefone = null;
  private Long idPessoa = null;
  private String ddd = null;
  private String telefone = null;
  private String ramal = null;
  private Integer status = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Telefone (id).
   **/
  public Telefone id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Telefone (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo do Telefone (id).
   **/
  public Telefone idTipoTelefone(Long idTipoTelefone) {
    this.idTipoTelefone = idTipoTelefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo do Telefone (id).")
  @JsonProperty("idTipoTelefone")
  public Long getIdTipoTelefone() {
    return idTipoTelefone;
  }
  public void setIdTipoTelefone(Long idTipoTelefone) {
    this.idTipoTelefone = idTipoTelefone;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa (id) a qual o telefone pertence.
   **/
  public Telefone idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa (id) a qual o telefone pertence.")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00C3\u00B3digo DDD do telefone (id).
   **/
  public Telefone ddd(String ddd) {
    this.ddd = ddd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo DDD do telefone (id).")
  @JsonProperty("ddd")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * N\u00C3\u00BAmero do telefone.
   **/
  public Telefone telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero do telefone.")
  @JsonProperty("telefone")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * N\u00C3\u00BAmero do ramal.
   **/
  public Telefone ramal(String ramal) {
    this.ramal = ramal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero do ramal.")
  @JsonProperty("ramal")
  public String getRamal() {
    return ramal;
  }
  public void setRamal(String ramal) {
    this.ramal = ramal;
  }

  
  /**
   * Apresenta o Status do Telefone, onde: '0': Inativo e '1': Ativo
   **/
  public Telefone status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o Status do Telefone, onde: '0': Inativo e '1': Ativo")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Telefone telefone = (Telefone) o;
    return Objects.equals(this.id, telefone.id) &&
        Objects.equals(this.idTipoTelefone, telefone.idTipoTelefone) &&
        Objects.equals(this.idPessoa, telefone.idPessoa) &&
        Objects.equals(this.ddd, telefone.ddd) &&
        Objects.equals(this.telefone, telefone.telefone) &&
        Objects.equals(this.ramal, telefone.ramal) &&
        Objects.equals(this.status, telefone.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idTipoTelefone, idPessoa, ddd, telefone, ramal, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Telefone {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idTipoTelefone: ").append(toIndentedString(idTipoTelefone)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    ddd: ").append(toIndentedString(ddd)).append("\n");
    sb.append("    telefone: ").append(toIndentedString(telefone)).append("\n");
    sb.append("    ramal: ").append(toIndentedString(ramal)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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



