package br.com.conductor.pier.api.v1_1.model;

import java.util.Objects;
import br.com.conductor.pier.api.v1_1.model.OrigemComercial;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





/**
 * Lista de Origens Comerciais
 **/

@ApiModel(description = "Lista de Origens Comerciais")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ListaOrigensComerciais   {
  
  private List<OrigemComercial> origensComerciais = new ArrayList<OrigemComercial>();

  
  /**
   * Lista de origens comerciais
   **/
  public ListaOrigensComerciais origensComerciais(List<OrigemComercial> origensComerciais) {
    this.origensComerciais = origensComerciais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lista de origens comerciais")
  @JsonProperty("origensComerciais")
  public List<OrigemComercial> getOrigensComerciais() {
    return origensComerciais;
  }
  public void setOrigensComerciais(List<OrigemComercial> origensComerciais) {
    this.origensComerciais = origensComerciais;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListaOrigensComerciais listaOrigensComerciais = (ListaOrigensComerciais) o;
    return Objects.equals(this.origensComerciais, listaOrigensComerciais.origensComerciais);
  }

  @Override
  public int hashCode() {
    return Objects.hash(origensComerciais);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListaOrigensComerciais {\n");
    
    sb.append("    origensComerciais: ").append(toIndentedString(origensComerciais)).append("\n");
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



