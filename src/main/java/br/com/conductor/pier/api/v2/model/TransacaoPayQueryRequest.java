package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





/**
 * {{{transacao_pay_query_request_description}}}
 **/

@ApiModel(description = "{{{transacao_pay_query_request_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TransacaoPayQueryRequest   {
  
  private String numeroCartao = null;
  private Long idCartao = null;
  private String origem = null;
  private List<String> sort = new ArrayList<String>();

  
  /**
   * {{{transacao_pay_generic_request_numero_cartao_value}}}
   **/
  public TransacaoPayQueryRequest numeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_pay_generic_request_numero_cartao_value}}}")
  @JsonProperty("numeroCartao")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * {{{transacao_pay_generic_request_id_cartao_value}}}
   **/
  public TransacaoPayQueryRequest idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_pay_generic_request_id_cartao_value}}}")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{transacao_pay_query_request_origem_value}}}
   **/
  public TransacaoPayQueryRequest origem(String origem) {
    this.origem = origem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_pay_query_request_origem_value}}}")
  @JsonProperty("origem")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  
  /**
   * {{{global_menssagem_sort_sort}}}
   **/
  public TransacaoPayQueryRequest sort(List<String> sort) {
    this.sort = sort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{global_menssagem_sort_sort}}}")
  @JsonProperty("sort")
  public List<String> getSort() {
    return sort;
  }
  public void setSort(List<String> sort) {
    this.sort = sort;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransacaoPayQueryRequest transacaoPayQueryRequest = (TransacaoPayQueryRequest) o;
    return Objects.equals(this.numeroCartao, transacaoPayQueryRequest.numeroCartao) &&
        Objects.equals(this.idCartao, transacaoPayQueryRequest.idCartao) &&
        Objects.equals(this.origem, transacaoPayQueryRequest.origem) &&
        Objects.equals(this.sort, transacaoPayQueryRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroCartao, idCartao, origem, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacaoPayQueryRequest {\n");
    
    sb.append("    numeroCartao: ").append(toIndentedString(numeroCartao)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    origem: ").append(toIndentedString(origem)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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



