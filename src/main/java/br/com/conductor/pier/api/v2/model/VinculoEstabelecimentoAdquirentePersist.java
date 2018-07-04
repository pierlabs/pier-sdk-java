package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{vinculo_estabelecimento_adquirente_persist_description}}}
 **/

@ApiModel(description = "{{{vinculo_estabelecimento_adquirente_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class VinculoEstabelecimentoAdquirentePersist   {
  
  private Long idEstabelecimento = null;
  private Long idAdquirente = null;
  private String codigoEstabelecimentoAdquirente = null;

  
  /**
   * {{{vinculo_estabelecimento_adquirente_persist_id_estabelecimento_value}}}
   **/
  public VinculoEstabelecimentoAdquirentePersist idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{vinculo_estabelecimento_adquirente_persist_id_estabelecimento_value}}}")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * {{{vinculo_estabelecimento_adquirente_persist_id_adquirente_value}}}
   **/
  public VinculoEstabelecimentoAdquirentePersist idAdquirente(Long idAdquirente) {
    this.idAdquirente = idAdquirente;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{vinculo_estabelecimento_adquirente_persist_id_adquirente_value}}}")
  @JsonProperty("idAdquirente")
  public Long getIdAdquirente() {
    return idAdquirente;
  }
  public void setIdAdquirente(Long idAdquirente) {
    this.idAdquirente = idAdquirente;
  }

  
  /**
   * {{{vinculo_estabelecimento_adquirente_persist_codigo_estabelecimento_adquirente_value}}}
   **/
  public VinculoEstabelecimentoAdquirentePersist codigoEstabelecimentoAdquirente(String codigoEstabelecimentoAdquirente) {
    this.codigoEstabelecimentoAdquirente = codigoEstabelecimentoAdquirente;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{vinculo_estabelecimento_adquirente_persist_codigo_estabelecimento_adquirente_value}}}")
  @JsonProperty("codigoEstabelecimentoAdquirente")
  public String getCodigoEstabelecimentoAdquirente() {
    return codigoEstabelecimentoAdquirente;
  }
  public void setCodigoEstabelecimentoAdquirente(String codigoEstabelecimentoAdquirente) {
    this.codigoEstabelecimentoAdquirente = codigoEstabelecimentoAdquirente;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VinculoEstabelecimentoAdquirentePersist vinculoEstabelecimentoAdquirentePersist = (VinculoEstabelecimentoAdquirentePersist) o;
    return Objects.equals(this.idEstabelecimento, vinculoEstabelecimentoAdquirentePersist.idEstabelecimento) &&
        Objects.equals(this.idAdquirente, vinculoEstabelecimentoAdquirentePersist.idAdquirente) &&
        Objects.equals(this.codigoEstabelecimentoAdquirente, vinculoEstabelecimentoAdquirentePersist.codigoEstabelecimentoAdquirente);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idEstabelecimento, idAdquirente, codigoEstabelecimentoAdquirente);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VinculoEstabelecimentoAdquirentePersist {\n");
    
    sb.append("    idEstabelecimento: ").append(toIndentedString(idEstabelecimento)).append("\n");
    sb.append("    idAdquirente: ").append(toIndentedString(idAdquirente)).append("\n");
    sb.append("    codigoEstabelecimentoAdquirente: ").append(toIndentedString(codigoEstabelecimentoAdquirente)).append("\n");
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



