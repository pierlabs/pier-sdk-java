package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{vinculo_operacao_response_description}}}
 **/

@ApiModel(description = "{{{vinculo_operacao_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class VinculoOperacaoResponse   {
  
  private Long idProduto = null;
  private Long idOperacao = null;
  private String codigoProcessamento = null;
  private Integer codigoMCC = null;

  
  /**
   * {{{vinculo_operacao_response_id_produto_value}}}
   **/
  public VinculoOperacaoResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{vinculo_operacao_response_id_produto_value}}}")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{vinculo_operacao_response_id_operacao_value}}}
   **/
  public VinculoOperacaoResponse idOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{vinculo_operacao_response_id_operacao_value}}}")
  @JsonProperty("idOperacao")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * {{{vinculo_operacao_response_codigo_processamento_value}}}
   **/
  public VinculoOperacaoResponse codigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{vinculo_operacao_response_codigo_processamento_value}}}")
  @JsonProperty("codigoProcessamento")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * {{{vinculo_operacao_response_codigo_m_c_c_value}}}
   **/
  public VinculoOperacaoResponse codigoMCC(Integer codigoMCC) {
    this.codigoMCC = codigoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{vinculo_operacao_response_codigo_m_c_c_value}}}")
  @JsonProperty("codigoMCC")
  public Integer getCodigoMCC() {
    return codigoMCC;
  }
  public void setCodigoMCC(Integer codigoMCC) {
    this.codigoMCC = codigoMCC;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VinculoOperacaoResponse vinculoOperacaoResponse = (VinculoOperacaoResponse) o;
    return Objects.equals(this.idProduto, vinculoOperacaoResponse.idProduto) &&
        Objects.equals(this.idOperacao, vinculoOperacaoResponse.idOperacao) &&
        Objects.equals(this.codigoProcessamento, vinculoOperacaoResponse.codigoProcessamento) &&
        Objects.equals(this.codigoMCC, vinculoOperacaoResponse.codigoMCC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProduto, idOperacao, codigoProcessamento, codigoMCC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VinculoOperacaoResponse {\n");
    
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    idOperacao: ").append(toIndentedString(idOperacao)).append("\n");
    sb.append("    codigoProcessamento: ").append(toIndentedString(codigoProcessamento)).append("\n");
    sb.append("    codigoMCC: ").append(toIndentedString(codigoMCC)).append("\n");
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



