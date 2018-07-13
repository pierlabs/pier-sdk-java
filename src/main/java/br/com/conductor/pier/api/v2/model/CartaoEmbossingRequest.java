package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{cartao_embossing_request_description}}}
 **/

@ApiModel(description = "{{{cartao_embossing_request_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoEmbossingRequest   {
  
  private Long idPessoa = null;
  private Long idTipoPlastico = null;

  
  /**
   * {{{cartao_embossing_request_id_pessoa_value}}}
   **/
  public CartaoEmbossingRequest idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_embossing_request_id_pessoa_value}}}")
  @JsonProperty("id_pessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{cartao_embossing_request_id_tipo_plastico_value}}}
   **/
  public CartaoEmbossingRequest idTipoPlastico(Long idTipoPlastico) {
    this.idTipoPlastico = idTipoPlastico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_embossing_request_id_tipo_plastico_value}}}")
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



