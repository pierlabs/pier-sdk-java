package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{cartao_multi_app_persist_description}}}
 **/

@ApiModel(description = "{{{cartao_multi_app_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoMultiAppPersistValue   {
  
  private Long idConta = null;
  private Long idPessoa = null;

  
  /**
   * {{{cartao_multi_app_persist_id_conta_value}}}
   **/
  public CartaoMultiAppPersistValue idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{cartao_multi_app_persist_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{cartao_multi_app_persist_id_pessoa_value}}}
   **/
  public CartaoMultiAppPersistValue idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{cartao_multi_app_persist_id_pessoa_value}}}")
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
    CartaoMultiAppPersistValue cartaoMultiAppPersistValue = (CartaoMultiAppPersistValue) o;
    return Objects.equals(this.idConta, cartaoMultiAppPersistValue.idConta) &&
        Objects.equals(this.idPessoa, cartaoMultiAppPersistValue.idPessoa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, idPessoa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoMultiAppPersistValue {\n");
    
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

