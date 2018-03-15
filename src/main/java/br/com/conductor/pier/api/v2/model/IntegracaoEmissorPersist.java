package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa a requisi\u00E7\u00E3o do recurso de incluir integra\u00E7\u00E3o emissor
 **/

@ApiModel(description = "Representa a requisi\u00E7\u00E3o do recurso de incluir integra\u00E7\u00E3o emissor")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class IntegracaoEmissorPersist   {
  
  private String canalEntrada = null;

  
  /**
   * Canal de entrada onde deve ser informado o dispositivo usado na comunica\u00E7\u00E3o.
   **/
  public IntegracaoEmissorPersist canalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Canal de entrada onde deve ser informado o dispositivo usado na comunica\u00E7\u00E3o.")
  @JsonProperty("canalEntrada")
  public String getCanalEntrada() {
    return canalEntrada;
  }
  public void setCanalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegracaoEmissorPersist integracaoEmissorPersist = (IntegracaoEmissorPersist) o;
    return Objects.equals(this.canalEntrada, integracaoEmissorPersist.canalEntrada);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canalEntrada);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegracaoEmissorPersist {\n");
    
    sb.append("    canalEntrada: ").append(toIndentedString(canalEntrada)).append("\n");
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

