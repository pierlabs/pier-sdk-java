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
public class IntegracaoEmissorPropostaPersist   {
  
  private String observacao = null;
  private Long idProposta = null;

  
  /**
   * Observa\u00E7\u00E3o do registro
   **/
  public IntegracaoEmissorPropostaPersist observacao(String observacao) {
    this.observacao = observacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Observa\u00E7\u00E3o do registro")
  @JsonProperty("observacao")
  public String getObservacao() {
    return observacao;
  }
  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  
  /**
   * Identification code of the external proposal
   **/
  public IntegracaoEmissorPropostaPersist idProposta(Long idProposta) {
    this.idProposta = idProposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification code of the external proposal")
  @JsonProperty("idProposta")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegracaoEmissorPropostaPersist integracaoEmissorPropostaPersist = (IntegracaoEmissorPropostaPersist) o;
    return Objects.equals(this.observacao, integracaoEmissorPropostaPersist.observacao) &&
        Objects.equals(this.idProposta, integracaoEmissorPropostaPersist.idProposta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(observacao, idProposta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegracaoEmissorPropostaPersist {\n");
    
    sb.append("    observacao: ").append(toIndentedString(observacao)).append("\n");
    sb.append("    idProposta: ").append(toIndentedString(idProposta)).append("\n");
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

