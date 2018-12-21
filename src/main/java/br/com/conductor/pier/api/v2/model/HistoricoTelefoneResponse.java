package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Object response for the telephone historic
 **/

@ApiModel(description = "Object response for the telephone historic")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class HistoricoTelefoneResponse   {
  
  private Long id = null;
  private String telefone = null;
  private Long idTipoTelefone = null;
  private String tipoTelefone = null;
  private String dataModificacao = null;

  
  /**
   * Identification Code of the Telephone (id)
   **/
  public HistoricoTelefoneResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Telephone (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Show the telephone number
   **/
  public HistoricoTelefoneResponse telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the telephone number")
  @JsonProperty("telefone")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * Show the id type of the telephone
   **/
  public HistoricoTelefoneResponse idTipoTelefone(Long idTipoTelefone) {
    this.idTipoTelefone = idTipoTelefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the id type of the telephone")
  @JsonProperty("idTipoTelefone")
  public Long getIdTipoTelefone() {
    return idTipoTelefone;
  }
  public void setIdTipoTelefone(Long idTipoTelefone) {
    this.idTipoTelefone = idTipoTelefone;
  }

  
  /**
   * Show the description of the telephone type
   **/
  public HistoricoTelefoneResponse tipoTelefone(String tipoTelefone) {
    this.tipoTelefone = tipoTelefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the description of the telephone type")
  @JsonProperty("tipoTelefone")
  public String getTipoTelefone() {
    return tipoTelefone;
  }
  public void setTipoTelefone(String tipoTelefone) {
    this.tipoTelefone = tipoTelefone;
  }

  
  /**
   * Show the date which the telephone was updated
   **/
  public HistoricoTelefoneResponse dataModificacao(String dataModificacao) {
    this.dataModificacao = dataModificacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the date which the telephone was updated")
  @JsonProperty("dataModificacao")
  public String getDataModificacao() {
    return dataModificacao;
  }
  public void setDataModificacao(String dataModificacao) {
    this.dataModificacao = dataModificacao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricoTelefoneResponse historicoTelefoneResponse = (HistoricoTelefoneResponse) o;
    return Objects.equals(this.id, historicoTelefoneResponse.id) &&
        Objects.equals(this.telefone, historicoTelefoneResponse.telefone) &&
        Objects.equals(this.idTipoTelefone, historicoTelefoneResponse.idTipoTelefone) &&
        Objects.equals(this.tipoTelefone, historicoTelefoneResponse.tipoTelefone) &&
        Objects.equals(this.dataModificacao, historicoTelefoneResponse.dataModificacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, telefone, idTipoTelefone, tipoTelefone, dataModificacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricoTelefoneResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    telefone: ").append(toIndentedString(telefone)).append("\n");
    sb.append("    idTipoTelefone: ").append(toIndentedString(idTipoTelefone)).append("\n");
    sb.append("    tipoTelefone: ").append(toIndentedString(tipoTelefone)).append("\n");
    sb.append("    dataModificacao: ").append(toIndentedString(dataModificacao)).append("\n");
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

