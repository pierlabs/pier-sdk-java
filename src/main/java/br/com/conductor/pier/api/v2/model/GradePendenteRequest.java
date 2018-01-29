package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GradePendenteRequest   {
  
  private Long idConta = null;
  private String dataBase = null;

  
  /**
   * C\u00C3\u00B3digo identificador da conta.
   **/
  public GradePendenteRequest idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador da conta.")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Data do ajuste no formato yyyy-MM-dd.
   **/
  public GradePendenteRequest dataBase(String dataBase) {
    this.dataBase = dataBase;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "Data do ajuste no formato yyyy-MM-dd.")
  @JsonProperty("dataBase")
  public String getDataBase() {
    return dataBase;
  }
  public void setDataBase(String dataBase) {
    this.dataBase = dataBase;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GradePendenteRequest gradePendenteRequest = (GradePendenteRequest) o;
    return Objects.equals(this.idConta, gradePendenteRequest.idConta) &&
        Objects.equals(this.dataBase, gradePendenteRequest.dataBase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, dataBase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GradePendenteRequest {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    dataBase: ").append(toIndentedString(dataBase)).append("\n");
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

