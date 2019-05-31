package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o para resposta de dados de Controle de cart\u00E3o por Grupo MCC.
 **/

@ApiModel(description = "Representa\u00E7\u00E3o para resposta de dados de Controle de cart\u00E3o por Grupo MCC.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ControleCartaoGrupoMCCResponse   {
  
  private Long id = null;
  private Long idCartao = null;
  private Long idGrupoMCC = null;

  
  /**
   * C\u00F3digo Identificador do controle do cart\u00E3o na base (id)
   **/
  public ControleCartaoGrupoMCCResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo Identificador do controle do cart\u00E3o na base (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo Identificador do cart\u00E3o na base.
   **/
  public ControleCartaoGrupoMCCResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo Identificador do cart\u00E3o na base.")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * C\u00F3digo Identificador do grupo mcc na base.
   **/
  public ControleCartaoGrupoMCCResponse idGrupoMCC(Long idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo Identificador do grupo mcc na base.")
  @JsonProperty("idGrupoMCC")
  public Long getIdGrupoMCC() {
    return idGrupoMCC;
  }
  public void setIdGrupoMCC(Long idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControleCartaoGrupoMCCResponse controleCartaoGrupoMCCResponse = (ControleCartaoGrupoMCCResponse) o;
    return Objects.equals(this.id, controleCartaoGrupoMCCResponse.id) &&
        Objects.equals(this.idCartao, controleCartaoGrupoMCCResponse.idCartao) &&
        Objects.equals(this.idGrupoMCC, controleCartaoGrupoMCCResponse.idGrupoMCC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idCartao, idGrupoMCC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControleCartaoGrupoMCCResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    idGrupoMCC: ").append(toIndentedString(idGrupoMCC)).append("\n");
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

