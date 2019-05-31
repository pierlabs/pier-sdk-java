package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Objeto para persist\u00EAncia de Controle de Cartao por mcc.
 **/

@ApiModel(description = "Objeto para persist\u00EAncia de Controle de Cartao por mcc.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ControleCartaoGrupoMCCPersist   {
  
  private List<Long> idsGruposMCC = new ArrayList<Long>();

  
  /**
   * idGrupoMCC
   **/
  public ControleCartaoGrupoMCCPersist idsGruposMCC(List<Long> idsGruposMCC) {
    this.idsGruposMCC = idsGruposMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "idGrupoMCC")
  @JsonProperty("idsGruposMCC")
  public List<Long> getIdsGruposMCC() {
    return idsGruposMCC;
  }
  public void setIdsGruposMCC(List<Long> idsGruposMCC) {
    this.idsGruposMCC = idsGruposMCC;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControleCartaoGrupoMCCPersist controleCartaoGrupoMCCPersist = (ControleCartaoGrupoMCCPersist) o;
    return Objects.equals(this.idsGruposMCC, controleCartaoGrupoMCCPersist.idsGruposMCC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idsGruposMCC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControleCartaoGrupoMCCPersist {\n");
    
    sb.append("    idsGruposMCC: ").append(toIndentedString(idsGruposMCC)).append("\n");
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

