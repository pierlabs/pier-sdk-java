package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{cartao_pay_cadastro_response_description}}}
 **/

@ApiModel(description = "{{{cartao_pay_cadastro_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoPayCadastroResponse   {
  
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
  private String dataValidadeChaveCriptograma = null;
  private String cvv = null;
  private String chaveCriptograma = null;

  
  /**
   * {{{cartao_pay_base_response_id_value}}}
   **/
  public CartaoPayCadastroResponse id(Long id) {
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
  public CartaoPayCadastroResponse numeroCartao(String numeroCartao) {
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
  public CartaoPayCadastroResponse dataValidadeCartao(String dataValidadeCartao) {
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
  public CartaoPayCadastroResponse nomeImpresso(String nomeImpresso) {
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
  public CartaoPayCadastroResponse idEntidade(Long idEntidade) {
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
  public CartaoPayCadastroResponse nomeEntidade(String nomeEntidade) {
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
  public CartaoPayCadastroResponse status(StatusEnum status) {
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
   * {{{cartao_pay_response_data_validade_chave_criptograma_value}}}
   **/
  public CartaoPayCadastroResponse dataValidadeChaveCriptograma(String dataValidadeChaveCriptograma) {
    this.dataValidadeChaveCriptograma = dataValidadeChaveCriptograma;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{cartao_pay_response_data_validade_chave_criptograma_value}}}")
  @JsonProperty("dataValidadeChaveCriptograma")
  public String getDataValidadeChaveCriptograma() {
    return dataValidadeChaveCriptograma;
  }
  public void setDataValidadeChaveCriptograma(String dataValidadeChaveCriptograma) {
    this.dataValidadeChaveCriptograma = dataValidadeChaveCriptograma;
  }

  
  /**
   * {{{cartao_pay_cadastro_response_cvv_value}}}
   **/
  public CartaoPayCadastroResponse cvv(String cvv) {
    this.cvv = cvv;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_pay_cadastro_response_cvv_value}}}")
  @JsonProperty("cvv")
  public String getCvv() {
    return cvv;
  }
  public void setCvv(String cvv) {
    this.cvv = cvv;
  }

  
  /**
   * {{{cartao_pay_cadastro_response_chave_criptograma_value}}}
   **/
  public CartaoPayCadastroResponse chaveCriptograma(String chaveCriptograma) {
    this.chaveCriptograma = chaveCriptograma;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_pay_cadastro_response_chave_criptograma_value}}}")
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
    CartaoPayCadastroResponse cartaoPayCadastroResponse = (CartaoPayCadastroResponse) o;
    return Objects.equals(this.id, cartaoPayCadastroResponse.id) &&
        Objects.equals(this.numeroCartao, cartaoPayCadastroResponse.numeroCartao) &&
        Objects.equals(this.dataValidadeCartao, cartaoPayCadastroResponse.dataValidadeCartao) &&
        Objects.equals(this.nomeImpresso, cartaoPayCadastroResponse.nomeImpresso) &&
        Objects.equals(this.idEntidade, cartaoPayCadastroResponse.idEntidade) &&
        Objects.equals(this.nomeEntidade, cartaoPayCadastroResponse.nomeEntidade) &&
        Objects.equals(this.status, cartaoPayCadastroResponse.status) &&
        Objects.equals(this.dataValidadeChaveCriptograma, cartaoPayCadastroResponse.dataValidadeChaveCriptograma) &&
        Objects.equals(this.cvv, cartaoPayCadastroResponse.cvv) &&
        Objects.equals(this.chaveCriptograma, cartaoPayCadastroResponse.chaveCriptograma);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, numeroCartao, dataValidadeCartao, nomeImpresso, idEntidade, nomeEntidade, status, dataValidadeChaveCriptograma, cvv, chaveCriptograma);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoPayCadastroResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numeroCartao: ").append(toIndentedString(numeroCartao)).append("\n");
    sb.append("    dataValidadeCartao: ").append(toIndentedString(dataValidadeCartao)).append("\n");
    sb.append("    nomeImpresso: ").append(toIndentedString(nomeImpresso)).append("\n");
    sb.append("    idEntidade: ").append(toIndentedString(idEntidade)).append("\n");
    sb.append("    nomeEntidade: ").append(toIndentedString(nomeEntidade)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dataValidadeChaveCriptograma: ").append(toIndentedString(dataValidadeChaveCriptograma)).append("\n");
    sb.append("    cvv: ").append(toIndentedString(cvv)).append("\n");
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



