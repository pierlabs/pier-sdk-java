package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de cria\u00E7\u00E3o para um CVV din\u00E2mico
 **/

@ApiModel(description = "Objeto de cria\u00E7\u00E3o para um CVV din\u00E2mico")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CvvDinamicoPersist   {
  
  private String dataExpiracao = null;

  
  /**
   * cvv_dinamico_persist_data_expiracao_value
   **/
  public CvvDinamicoPersist dataExpiracao(String dataExpiracao) {
    this.dataExpiracao = dataExpiracao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ", required = true, value = "cvv_dinamico_persist_data_expiracao_value")
  @JsonProperty("dataExpiracao")
  public String getDataExpiracao() {
    return dataExpiracao;
  }
  public void setDataExpiracao(String dataExpiracao) {
    this.dataExpiracao = dataExpiracao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CvvDinamicoPersist cvvDinamicoPersist = (CvvDinamicoPersist) o;
    return Objects.equals(this.dataExpiracao, cvvDinamicoPersist.dataExpiracao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataExpiracao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CvvDinamicoPersist {\n");
    
    sb.append("    dataExpiracao: ").append(toIndentedString(dataExpiracao)).append("\n");
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

