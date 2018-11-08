package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{produto_pacote_tarifa_response_descricao}}}
 **/

@ApiModel(description = "{{{produto_pacote_tarifa_response_descricao}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ProdutoPacoteTarifaResponse   {
  
  private Boolean flagDefault = null;
  private Long id = null;
  private Long idPacoteTarifa = null;
  private Long idProduto = null;

  
  /**
   * {{{produto_pacote_tarifa_response_flag_default_descricao}}}
   **/
  public ProdutoPacoteTarifaResponse flagDefault(Boolean flagDefault) {
    this.flagDefault = flagDefault;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{produto_pacote_tarifa_response_flag_default_descricao}}}")
  @JsonProperty("flagDefault")
  public Boolean getFlagDefault() {
    return flagDefault;
  }
  public void setFlagDefault(Boolean flagDefault) {
    this.flagDefault = flagDefault;
  }

  
  /**
   * {{{produto_pacote_tarifa_response_id_descricao}}}
   **/
  public ProdutoPacoteTarifaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{produto_pacote_tarifa_response_id_descricao}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{produto_pacote_tarifa_response_id_pacote_tarifa_descricao}}}
   **/
  public ProdutoPacoteTarifaResponse idPacoteTarifa(Long idPacoteTarifa) {
    this.idPacoteTarifa = idPacoteTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{produto_pacote_tarifa_response_id_pacote_tarifa_descricao}}}")
  @JsonProperty("idPacoteTarifa")
  public Long getIdPacoteTarifa() {
    return idPacoteTarifa;
  }
  public void setIdPacoteTarifa(Long idPacoteTarifa) {
    this.idPacoteTarifa = idPacoteTarifa;
  }

  
  /**
   * {{{produto_pacote_tarifa_response_id_produto_descricao}}}
   **/
  public ProdutoPacoteTarifaResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{produto_pacote_tarifa_response_id_produto_descricao}}}")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProdutoPacoteTarifaResponse produtoPacoteTarifaResponse = (ProdutoPacoteTarifaResponse) o;
    return Objects.equals(this.flagDefault, produtoPacoteTarifaResponse.flagDefault) &&
        Objects.equals(this.id, produtoPacoteTarifaResponse.id) &&
        Objects.equals(this.idPacoteTarifa, produtoPacoteTarifaResponse.idPacoteTarifa) &&
        Objects.equals(this.idProduto, produtoPacoteTarifaResponse.idProduto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flagDefault, id, idPacoteTarifa, idProduto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProdutoPacoteTarifaResponse {\n");
    
    sb.append("    flagDefault: ").append(toIndentedString(flagDefault)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idPacoteTarifa: ").append(toIndentedString(idPacoteTarifa)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
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

