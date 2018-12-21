package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.TipoTransacaoAjusteResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Type of adjustment
 **/

@ApiModel(description = "Type of adjustment")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoAjusteResponse   {
  
  private Long id = null;
  private String descricao = null;
  private Boolean flagPagamentoLojista = null;
  private List<TipoTransacaoAjusteResponse> transacoes = new ArrayList<TipoTransacaoAjusteResponse>();

  
  /**
   * Identifier Code of the adjustment type
   **/
  public TipoAjusteResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier Code of the adjustment type")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Description of the adjustment type
   **/
  public TipoAjusteResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the adjustment type")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Identifies whether the payment was made in an establishment
   **/
  public TipoAjusteResponse flagPagamentoLojista(Boolean flagPagamentoLojista) {
    this.flagPagamentoLojista = flagPagamentoLojista;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Identifies whether the payment was made in an establishment")
  @JsonProperty("flagPagamentoLojista")
  public Boolean getFlagPagamentoLojista() {
    return flagPagamentoLojista;
  }
  public void setFlagPagamentoLojista(Boolean flagPagamentoLojista) {
    this.flagPagamentoLojista = flagPagamentoLojista;
  }

  
  /**
   * Transactions by adjusts type
   **/
  public TipoAjusteResponse transacoes(List<TipoTransacaoAjusteResponse> transacoes) {
    this.transacoes = transacoes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Transactions by adjusts type")
  @JsonProperty("transacoes")
  public List<TipoTransacaoAjusteResponse> getTransacoes() {
    return transacoes;
  }
  public void setTransacoes(List<TipoTransacaoAjusteResponse> transacoes) {
    this.transacoes = transacoes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoAjusteResponse tipoAjusteResponse = (TipoAjusteResponse) o;
    return Objects.equals(this.id, tipoAjusteResponse.id) &&
        Objects.equals(this.descricao, tipoAjusteResponse.descricao) &&
        Objects.equals(this.flagPagamentoLojista, tipoAjusteResponse.flagPagamentoLojista) &&
        Objects.equals(this.transacoes, tipoAjusteResponse.transacoes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descricao, flagPagamentoLojista, transacoes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoAjusteResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    flagPagamentoLojista: ").append(toIndentedString(flagPagamentoLojista)).append("\n");
    sb.append("    transacoes: ").append(toIndentedString(transacoes)).append("\n");
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

