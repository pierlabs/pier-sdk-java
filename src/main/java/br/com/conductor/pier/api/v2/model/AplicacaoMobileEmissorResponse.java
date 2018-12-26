package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa a resposta de uma aplica\u00E7\u00E3o mobile
 **/

@ApiModel(description = "Representa a resposta de uma aplica\u00E7\u00E3o mobile")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AplicacaoMobileEmissorResponse   {
  
  private Long id = null;

  
  /**
   * Id da aplica\u00E7\u00E3o mobile
   **/
  public AplicacaoMobileEmissorResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id da aplica\u00E7\u00E3o mobile")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AplicacaoMobileEmissorResponse aplicacaoMobileEmissorResponse = (AplicacaoMobileEmissorResponse) o;
    return Objects.equals(this.id, aplicacaoMobileEmissorResponse.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AplicacaoMobileEmissorResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

