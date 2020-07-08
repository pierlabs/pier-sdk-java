package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de cria\u00E7\u00E3o de um v\u00EDnculo entre uma conta e um parcelamento personalizado
 **/

@ApiModel(description = "Objeto de cria\u00E7\u00E3o de um v\u00EDnculo entre uma conta e um parcelamento personalizado")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class VinculoPersonalizacaoParcelamentoPersist   {
  
  private Long idConta = null;
  private Long idPersonalizacaoParcelamento = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta que ser\u00E1 vinculada ao parcelamento personalizado
   **/
  public VinculoPersonalizacaoParcelamentoPersist idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da conta que ser\u00E1 vinculada ao parcelamento personalizado")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da personaliza\u00E7\u00E3o de parcelamento que ser\u00E1 vinculada \u00E0 conta
   **/
  public VinculoPersonalizacaoParcelamentoPersist idPersonalizacaoParcelamento(Long idPersonalizacaoParcelamento) {
    this.idPersonalizacaoParcelamento = idPersonalizacaoParcelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da personaliza\u00E7\u00E3o de parcelamento que ser\u00E1 vinculada \u00E0 conta")
  @JsonProperty("idPersonalizacaoParcelamento")
  public Long getIdPersonalizacaoParcelamento() {
    return idPersonalizacaoParcelamento;
  }
  public void setIdPersonalizacaoParcelamento(Long idPersonalizacaoParcelamento) {
    this.idPersonalizacaoParcelamento = idPersonalizacaoParcelamento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VinculoPersonalizacaoParcelamentoPersist vinculoPersonalizacaoParcelamentoPersist = (VinculoPersonalizacaoParcelamentoPersist) o;
    return Objects.equals(this.idConta, vinculoPersonalizacaoParcelamentoPersist.idConta) &&
        Objects.equals(this.idPersonalizacaoParcelamento, vinculoPersonalizacaoParcelamentoPersist.idPersonalizacaoParcelamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, idPersonalizacaoParcelamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VinculoPersonalizacaoParcelamentoPersist {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idPersonalizacaoParcelamento: ").append(toIndentedString(idPersonalizacaoParcelamento)).append("\n");
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

