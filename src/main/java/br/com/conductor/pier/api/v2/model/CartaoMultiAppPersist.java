package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto para persist\u00EAncia de cart\u00F5es MultiApp
 **/

@ApiModel(description = "Objeto para persist\u00EAncia de cart\u00F5es MultiApp")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoMultiAppPersist   {
  
  private Long idConta = null;
  private Long idPessoa = null;

  
  /**
   * C\u00F3digo identificador da conta na base
   **/
  public CartaoMultiAppPersist idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo identificador da conta na base")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da Pessoa que ser\u00E1 a portadora do Cart\u00E3o
   **/
  public CartaoMultiAppPersist idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo de identifica\u00E7\u00E3o da Pessoa que ser\u00E1 a portadora do Cart\u00E3o")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartaoMultiAppPersist cartaoMultiAppPersist = (CartaoMultiAppPersist) o;
    return Objects.equals(this.idConta, cartaoMultiAppPersist.idConta) &&
        Objects.equals(this.idPessoa, cartaoMultiAppPersist.idPessoa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, idPessoa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoMultiAppPersist {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
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

