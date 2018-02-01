package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto VinculoEstabelecimentoPersist
 **/

@ApiModel(description = "Objeto VinculoEstabelecimentoPersist")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class VinculoEstabelecimentoAdquirentePersist   {
  
  private Long idEstabelecimento = null;
  private Long idAdquirente = null;
  private String codigoEstabelecimentoAdquirente = null;

  
  /**
   * Apresenta o id do estabelecimento.
   **/
  public VinculoEstabelecimentoAdquirentePersist idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o id do estabelecimento.")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * Apresenta o id do adquirente.
   **/
  public VinculoEstabelecimentoAdquirentePersist idAdquirente(Long idAdquirente) {
    this.idAdquirente = idAdquirente;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o id do adquirente.")
  @JsonProperty("idAdquirente")
  public Long getIdAdquirente() {
    return idAdquirente;
  }
  public void setIdAdquirente(Long idAdquirente) {
    this.idAdquirente = idAdquirente;
  }

  
  /**
   * Apresenta o c\u00C3\u00B3digo de v\u00C3\u00ADnculo entre o estabelecimento e o adquirente.
   **/
  public VinculoEstabelecimentoAdquirentePersist codigoEstabelecimentoAdquirente(String codigoEstabelecimentoAdquirente) {
    this.codigoEstabelecimentoAdquirente = codigoEstabelecimentoAdquirente;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o c\u00C3\u00B3digo de v\u00C3\u00ADnculo entre o estabelecimento e o adquirente.")
  @JsonProperty("codigoEstabelecimentoAdquirente")
  public String getCodigoEstabelecimentoAdquirente() {
    return codigoEstabelecimentoAdquirente;
  }
  public void setCodigoEstabelecimentoAdquirente(String codigoEstabelecimentoAdquirente) {
    this.codigoEstabelecimentoAdquirente = codigoEstabelecimentoAdquirente;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VinculoEstabelecimentoAdquirentePersist vinculoEstabelecimentoAdquirentePersist = (VinculoEstabelecimentoAdquirentePersist) o;
    return Objects.equals(this.idEstabelecimento, vinculoEstabelecimentoAdquirentePersist.idEstabelecimento) &&
        Objects.equals(this.idAdquirente, vinculoEstabelecimentoAdquirentePersist.idAdquirente) &&
        Objects.equals(this.codigoEstabelecimentoAdquirente, vinculoEstabelecimentoAdquirentePersist.codigoEstabelecimentoAdquirente);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idEstabelecimento, idAdquirente, codigoEstabelecimentoAdquirente);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VinculoEstabelecimentoAdquirentePersist {\n");
    
    sb.append("    idEstabelecimento: ").append(toIndentedString(idEstabelecimento)).append("\n");
    sb.append("    idAdquirente: ").append(toIndentedString(idAdquirente)).append("\n");
    sb.append("    codigoEstabelecimentoAdquirente: ").append(toIndentedString(codigoEstabelecimentoAdquirente)).append("\n");
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

