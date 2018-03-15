package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Resposta da requisi\u00E7\u00E3o para confirma\u00E7\u00E3o da chave de criptograma
 **/

@ApiModel(description = "Resposta da requisi\u00E7\u00E3o para confirma\u00E7\u00E3o da chave de criptograma")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoPayConfirmarChaveResponse   {
  
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
  private String chaveCriptograma = null;

  
  /**
   * Id do cart\u00E3o
   **/
  public CartaoPayConfirmarChaveResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id do cart\u00E3o")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * N\u00FAmero do cart\u00E3o real criptografado
   **/
  public CartaoPayConfirmarChaveResponse numeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do cart\u00E3o real criptografado")
  @JsonProperty("numeroCartao")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * Data de validade do cart\u00E3o
   **/
  public CartaoPayConfirmarChaveResponse dataValidadeCartao(String dataValidadeCartao) {
    this.dataValidadeCartao = dataValidadeCartao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data de validade do cart\u00E3o")
  @JsonProperty("dataValidadeCartao")
  public String getDataValidadeCartao() {
    return dataValidadeCartao;
  }
  public void setDataValidadeCartao(String dataValidadeCartao) {
    this.dataValidadeCartao = dataValidadeCartao;
  }

  
  /**
   * Nome impresso no cart\u00E3o criptografado
   **/
  public CartaoPayConfirmarChaveResponse nomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome impresso no cart\u00E3o criptografado")
  @JsonProperty("nomeImpresso")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Identificador do emissor do cart\u00E3o
   **/
  public CartaoPayConfirmarChaveResponse idEntidade(Long idEntidade) {
    this.idEntidade = idEntidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do emissor do cart\u00E3o")
  @JsonProperty("idEntidade")
  public Long getIdEntidade() {
    return idEntidade;
  }
  public void setIdEntidade(Long idEntidade) {
    this.idEntidade = idEntidade;
  }

  
  /**
   * Nome do emissor do cart\u00E3o
   **/
  public CartaoPayConfirmarChaveResponse nomeEntidade(String nomeEntidade) {
    this.nomeEntidade = nomeEntidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do emissor do cart\u00E3o")
  @JsonProperty("nomeEntidade")
  public String getNomeEntidade() {
    return nomeEntidade;
  }
  public void setNomeEntidade(String nomeEntidade) {
    this.nomeEntidade = nomeEntidade;
  }

  
  /**
   * Status do cart\u00E3o
   **/
  public CartaoPayConfirmarChaveResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status do cart\u00E3o")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Data de validade da chave do criptograma
   **/
  public CartaoPayConfirmarChaveResponse dataValidadeChaveCriptograma(String dataValidadeChaveCriptograma) {
    this.dataValidadeChaveCriptograma = dataValidadeChaveCriptograma;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data de validade da chave do criptograma")
  @JsonProperty("dataValidadeChaveCriptograma")
  public String getDataValidadeChaveCriptograma() {
    return dataValidadeChaveCriptograma;
  }
  public void setDataValidadeChaveCriptograma(String dataValidadeChaveCriptograma) {
    this.dataValidadeChaveCriptograma = dataValidadeChaveCriptograma;
  }

  
  /**
   * Chave de gera\u00E7\u00E3o de transa\u00E7\u00E3o criptografada
   **/
  public CartaoPayConfirmarChaveResponse chaveCriptograma(String chaveCriptograma) {
    this.chaveCriptograma = chaveCriptograma;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Chave de gera\u00E7\u00E3o de transa\u00E7\u00E3o criptografada")
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
    CartaoPayConfirmarChaveResponse cartaoPayConfirmarChaveResponse = (CartaoPayConfirmarChaveResponse) o;
    return Objects.equals(this.id, cartaoPayConfirmarChaveResponse.id) &&
        Objects.equals(this.numeroCartao, cartaoPayConfirmarChaveResponse.numeroCartao) &&
        Objects.equals(this.dataValidadeCartao, cartaoPayConfirmarChaveResponse.dataValidadeCartao) &&
        Objects.equals(this.nomeImpresso, cartaoPayConfirmarChaveResponse.nomeImpresso) &&
        Objects.equals(this.idEntidade, cartaoPayConfirmarChaveResponse.idEntidade) &&
        Objects.equals(this.nomeEntidade, cartaoPayConfirmarChaveResponse.nomeEntidade) &&
        Objects.equals(this.status, cartaoPayConfirmarChaveResponse.status) &&
        Objects.equals(this.dataValidadeChaveCriptograma, cartaoPayConfirmarChaveResponse.dataValidadeChaveCriptograma) &&
        Objects.equals(this.chaveCriptograma, cartaoPayConfirmarChaveResponse.chaveCriptograma);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, numeroCartao, dataValidadeCartao, nomeImpresso, idEntidade, nomeEntidade, status, dataValidadeChaveCriptograma, chaveCriptograma);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoPayConfirmarChaveResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numeroCartao: ").append(toIndentedString(numeroCartao)).append("\n");
    sb.append("    dataValidadeCartao: ").append(toIndentedString(dataValidadeCartao)).append("\n");
    sb.append("    nomeImpresso: ").append(toIndentedString(nomeImpresso)).append("\n");
    sb.append("    idEntidade: ").append(toIndentedString(idEntidade)).append("\n");
    sb.append("    nomeEntidade: ").append(toIndentedString(nomeEntidade)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dataValidadeChaveCriptograma: ").append(toIndentedString(dataValidadeChaveCriptograma)).append("\n");
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

