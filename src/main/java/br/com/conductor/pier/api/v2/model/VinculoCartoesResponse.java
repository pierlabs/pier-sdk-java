package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto com response do v\u00EDnculo entre cart\u00F5es
 **/

@ApiModel(description = "Objeto com response do v\u00EDnculo entre cart\u00F5es")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class VinculoCartoesResponse   {
  
  private Long idCartaoPrincipal = null;
  private Long idCartaoVinculado = null;

  
  /**
   * C\u00F3digo identificador do cart\u00E3o principal gerado
   **/
  public VinculoCartoesResponse idCartaoPrincipal(Long idCartaoPrincipal) {
    this.idCartaoPrincipal = idCartaoPrincipal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do cart\u00E3o principal gerado")
  @JsonProperty("idCartaoPrincipal")
  public Long getIdCartaoPrincipal() {
    return idCartaoPrincipal;
  }
  public void setIdCartaoPrincipal(Long idCartaoPrincipal) {
    this.idCartaoPrincipal = idCartaoPrincipal;
  }

  
  /**
   * C\u00F3digo identificador do cart\u00E3o vinculado gerado
   **/
  public VinculoCartoesResponse idCartaoVinculado(Long idCartaoVinculado) {
    this.idCartaoVinculado = idCartaoVinculado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do cart\u00E3o vinculado gerado")
  @JsonProperty("idCartaoVinculado")
  public Long getIdCartaoVinculado() {
    return idCartaoVinculado;
  }
  public void setIdCartaoVinculado(Long idCartaoVinculado) {
    this.idCartaoVinculado = idCartaoVinculado;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VinculoCartoesResponse vinculoCartoesResponse = (VinculoCartoesResponse) o;
    return Objects.equals(this.idCartaoPrincipal, vinculoCartoesResponse.idCartaoPrincipal) &&
        Objects.equals(this.idCartaoVinculado, vinculoCartoesResponse.idCartaoVinculado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCartaoPrincipal, idCartaoVinculado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VinculoCartoesResponse {\n");
    
    sb.append("    idCartaoPrincipal: ").append(toIndentedString(idCartaoPrincipal)).append("\n");
    sb.append("    idCartaoVinculado: ").append(toIndentedString(idCartaoVinculado)).append("\n");
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

