package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{compra_contestada_cartao_response_description}}}
 **/

@ApiModel(description = "{{{compra_contestada_cartao_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CompraContestadaCartaoResponse   {
  
  private Long idCartao = null;
  private Long agingContestacao = null;
  private String cartao = null;
  private String nome = null;
  private String bandeira = null;

  
  /**
   * {{{compra_contestada_cartao_response_id_cartao_value}}}
   **/
  public CompraContestadaCartaoResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_cartao_response_id_cartao_value}}}")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{compra_contestada_cartao_response_aging_contestacao_value}}}
   **/
  public CompraContestadaCartaoResponse agingContestacao(Long agingContestacao) {
    this.agingContestacao = agingContestacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_cartao_response_aging_contestacao_value}}}")
  @JsonProperty("agingContestacao")
  public Long getAgingContestacao() {
    return agingContestacao;
  }
  public void setAgingContestacao(Long agingContestacao) {
    this.agingContestacao = agingContestacao;
  }

  
  /**
   * {{{compra_contestada_cartao_response_cartao_value}}}
   **/
  public CompraContestadaCartaoResponse cartao(String cartao) {
    this.cartao = cartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_cartao_response_cartao_value}}}")
  @JsonProperty("cartao")
  public String getCartao() {
    return cartao;
  }
  public void setCartao(String cartao) {
    this.cartao = cartao;
  }

  
  /**
   * {{{compra_contestada_cartao_response_nome_value}}}
   **/
  public CompraContestadaCartaoResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_cartao_response_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{compra_contestada_cartao_response_bandeira_value}}}
   **/
  public CompraContestadaCartaoResponse bandeira(String bandeira) {
    this.bandeira = bandeira;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_cartao_response_bandeira_value}}}")
  @JsonProperty("bandeira")
  public String getBandeira() {
    return bandeira;
  }
  public void setBandeira(String bandeira) {
    this.bandeira = bandeira;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompraContestadaCartaoResponse compraContestadaCartaoResponse = (CompraContestadaCartaoResponse) o;
    return Objects.equals(this.idCartao, compraContestadaCartaoResponse.idCartao) &&
        Objects.equals(this.agingContestacao, compraContestadaCartaoResponse.agingContestacao) &&
        Objects.equals(this.cartao, compraContestadaCartaoResponse.cartao) &&
        Objects.equals(this.nome, compraContestadaCartaoResponse.nome) &&
        Objects.equals(this.bandeira, compraContestadaCartaoResponse.bandeira);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCartao, agingContestacao, cartao, nome, bandeira);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompraContestadaCartaoResponse {\n");
    
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    agingContestacao: ").append(toIndentedString(agingContestacao)).append("\n");
    sb.append("    cartao: ").append(toIndentedString(cartao)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    bandeira: ").append(toIndentedString(bandeira)).append("\n");
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



