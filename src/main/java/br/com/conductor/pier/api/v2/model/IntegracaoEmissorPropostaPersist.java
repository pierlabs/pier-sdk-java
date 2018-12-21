package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{integracao_emissor_proposta_persist_descricao}}}
 **/

@ApiModel(description = "{{{integracao_emissor_proposta_persist_descricao}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class IntegracaoEmissorPropostaPersist   {
  
  private String observacao = null;
  private Long idProposta = null;

  
  /**
   * {{{integracao_emissor_proposta_persist_observacao}}}
   **/
  public IntegracaoEmissorPropostaPersist observacao(String observacao) {
    this.observacao = observacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{integracao_emissor_proposta_persist_observacao}}}")
  @JsonProperty("observacao")
  public String getObservacao() {
    return observacao;
  }
  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  
  /**
   * {{{integracao_emissor_proposta_persist_id_proposta}}}
   **/
  public IntegracaoEmissorPropostaPersist idProposta(Long idProposta) {
    this.idProposta = idProposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{integracao_emissor_proposta_persist_id_proposta}}}")
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

