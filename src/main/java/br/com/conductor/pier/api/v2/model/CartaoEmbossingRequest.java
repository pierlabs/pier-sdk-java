package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Parametros de requisi\u00C3\u00A7\u00C3\u00A3o da gera\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o embossing
 **/

@ApiModel(description = "Parametros de requisi\u00C3\u00A7\u00C3\u00A3o da gera\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o embossing")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoEmbossingRequest   {
  
  private Long idPessoa = null;
  private Long idTipoPlastico = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa a qual o cart\u00C3\u00A3o pertence (id)
   **/
  public CartaoEmbossingRequest idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa a qual o cart\u00C3\u00A3o pertence (id)")
  @JsonProperty("id_pessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do TipoPlastico (id).
   **/
  public CartaoEmbossingRequest idTipoPlastico(Long idTipoPlastico) {
    this.idTipoPlastico = idTipoPlastico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do TipoPlastico (id).")
  @JsonProperty("id_tipo_plastico")
  public Long getIdTipoPlastico() {
    return idTipoPlastico;
  }
  public void setIdTipoPlastico(Long idTipoPlastico) {
    this.idTipoPlastico = idTipoPlastico;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartaoEmbossingRequest cartaoEmbossingRequest = (CartaoEmbossingRequest) o;
    return Objects.equals(this.idPessoa, cartaoEmbossingRequest.idPessoa) &&
        Objects.equals(this.idTipoPlastico, cartaoEmbossingRequest.idTipoPlastico);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPessoa, idTipoPlastico);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoEmbossingRequest {\n");
    
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idTipoPlastico: ").append(toIndentedString(idTipoPlastico)).append("\n");
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

