package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{cartao_pay_atualizar_chave_response_description}}}
 **/

@ApiModel(description = "{{{cartao_pay_atualizar_chave_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoPayAtualizarChaveResponse   {
  
  private Long id = null;
  private String numeroCartao = null;
  private String dataValidadeCartao = null;
  private String nomeImpresso = null;
  private Long idEntidade = null;
  private String nomeEntidade = null;


  public enum StatusEnum {
    ATIVO("ATIVO"),
    INATIVO("INATIVO"),
    BLOQUEADO("BLOQUEADO");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status = null;
  private String chaveCriptograma = null;

  
  /**
   * {{{cartao_pay_base_response_id_value}}}
   **/
  public CartaoPayAtualizarChaveResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_pay_base_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{cartao_pay_base_response_numero_cartao_value}}}
   **/
  public CartaoPayAtualizarChaveResponse numeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_pay_base_response_numero_cartao_value}}}")
  @JsonProperty("numeroCartao")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * {{{cartao_pay_base_response_data_validade_cartao_value}}}
   **/
  public CartaoPayAtualizarChaveResponse dataValidadeCartao(String dataValidadeCartao) {
    this.dataValidadeCartao = dataValidadeCartao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{cartao_pay_base_response_data_validade_cartao_value}}}")
  @JsonProperty("dataValidadeCartao")
  public String getDataValidadeCartao() {
    return dataValidadeCartao;
  }
  public void setDataValidadeCartao(String dataValidadeCartao) {
    this.dataValidadeCartao = dataValidadeCartao;
  }

  
  /**
   * {{{cartao_pay_base_response_nome_impresso_value}}}
   **/
  public CartaoPayAtualizarChaveResponse nomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_pay_base_response_nome_impresso_value}}}")
  @JsonProperty("nomeImpresso")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * {{{cartao_pay_base_response_id_entidade_value}}}
   **/
  public CartaoPayAtualizarChaveResponse idEntidade(Long idEntidade) {
    this.idEntidade = idEntidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_pay_base_response_id_entidade_value}}}")
  @JsonProperty("idEntidade")
  public Long getIdEntidade() {
    return idEntidade;
  }
  public void setIdEntidade(Long idEntidade) {
    this.idEntidade = idEntidade;
  }

  
  /**
   * {{{cartao_pay_base_response_nome_entidade_value}}}
   **/
  public CartaoPayAtualizarChaveResponse nomeEntidade(String nomeEntidade) {
    this.nomeEntidade = nomeEntidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_pay_base_response_nome_entidade_value}}}")
  @JsonProperty("nomeEntidade")
  public String getNomeEntidade() {
    return nomeEntidade;
  }
  public void setNomeEntidade(String nomeEntidade) {
    this.nomeEntidade = nomeEntidade;
  }

  
  /**
   * {{{cartao_pay_base_response_status_value}}}
   **/
  public CartaoPayAtualizarChaveResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_pay_base_response_status_value}}}")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * {{{cartao_pay_atualizar_chave_response_chave_criptograma_value}}}
   **/
  public CartaoPayAtualizarChaveResponse chaveCriptograma(String chaveCriptograma) {
    this.chaveCriptograma = chaveCriptograma;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_pay_atualizar_chave_response_chave_criptograma_value}}}")
  @JsonProperty("chaveCriptograma")
  public String getChaveCriptograma() {
    return chaveCriptograma;
  }
  public void setChaveCriptograma(String chaveCriptograma) {
    this.chaveCriptograma = chaveCriptograma;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartaoPayAtualizarChaveResponse cartaoPayAtualizarChaveResponse = (CartaoPayAtualizarChaveResponse) o;
    return Objects.equals(this.id, cartaoPayAtualizarChaveResponse.id) &&
        Objects.equals(this.numeroCartao, cartaoPayAtualizarChaveResponse.numeroCartao) &&
        Objects.equals(this.dataValidadeCartao, cartaoPayAtualizarChaveResponse.dataValidadeCartao) &&
        Objects.equals(this.nomeImpresso, cartaoPayAtualizarChaveResponse.nomeImpresso) &&
        Objects.equals(this.idEntidade, cartaoPayAtualizarChaveResponse.idEntidade) &&
        Objects.equals(this.nomeEntidade, cartaoPayAtualizarChaveResponse.nomeEntidade) &&
        Objects.equals(this.status, cartaoPayAtualizarChaveResponse.status) &&
        Objects.equals(this.chaveCriptograma, cartaoPayAtualizarChaveResponse.chaveCriptograma);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, numeroCartao, dataValidadeCartao, nomeImpresso, idEntidade, nomeEntidade, status, chaveCriptograma);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoPayAtualizarChaveResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numeroCartao: ").append(toIndentedString(numeroCartao)).append("\n");
    sb.append("    dataValidadeCartao: ").append(toIndentedString(dataValidadeCartao)).append("\n");
    sb.append("    nomeImpresso: ").append(toIndentedString(nomeImpresso)).append("\n");
    sb.append("    idEntidade: ").append(toIndentedString(idEntidade)).append("\n");
    sb.append("    nomeEntidade: ").append(toIndentedString(nomeEntidade)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    chaveCriptograma: ").append(toIndentedString(chaveCriptograma)).append("\n");
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



