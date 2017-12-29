package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Resposta da requisi\u00C3\u00A7\u00C3\u00A3o de listagem de cart\u00C3\u00A3o
 **/

@ApiModel(description = "Resposta da requisi\u00C3\u00A7\u00C3\u00A3o de listagem de cart\u00C3\u00A3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoPayResponse   {
  
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

  
  /**
   * Id do cart\u00C3\u00A3o
   **/
  public CartaoPayResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id do cart\u00C3\u00A3o")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * N\u00C3\u00BAmero do cart\u00C3\u00A3o real criptografado
   **/
  public CartaoPayResponse numeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero do cart\u00C3\u00A3o real criptografado")
  @JsonProperty("numeroCartao")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * Data de validade do cart\u00C3\u00A3o
   **/
  public CartaoPayResponse dataValidadeCartao(String dataValidadeCartao) {
    this.dataValidadeCartao = dataValidadeCartao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data de validade do cart\u00C3\u00A3o")
  @JsonProperty("dataValidadeCartao")
  public String getDataValidadeCartao() {
    return dataValidadeCartao;
  }
  public void setDataValidadeCartao(String dataValidadeCartao) {
    this.dataValidadeCartao = dataValidadeCartao;
  }

  
  /**
   * Nome impresso no cart\u00C3\u00A3o criptografado
   **/
  public CartaoPayResponse nomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome impresso no cart\u00C3\u00A3o criptografado")
  @JsonProperty("nomeImpresso")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Identificador do emissor do cart\u00C3\u00A3o
   **/
  public CartaoPayResponse idEntidade(Long idEntidade) {
    this.idEntidade = idEntidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do emissor do cart\u00C3\u00A3o")
  @JsonProperty("idEntidade")
  public Long getIdEntidade() {
    return idEntidade;
  }
  public void setIdEntidade(Long idEntidade) {
    this.idEntidade = idEntidade;
  }

  
  /**
   * Nome do emissor do cart\u00C3\u00A3o
   **/
  public CartaoPayResponse nomeEntidade(String nomeEntidade) {
    this.nomeEntidade = nomeEntidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do emissor do cart\u00C3\u00A3o")
  @JsonProperty("nomeEntidade")
  public String getNomeEntidade() {
    return nomeEntidade;
  }
  public void setNomeEntidade(String nomeEntidade) {
    this.nomeEntidade = nomeEntidade;
  }

  
  /**
   * Status do cart\u00C3\u00A3o
   **/
  public CartaoPayResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status do cart\u00C3\u00A3o")
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
  public CartaoPayResponse dataValidadeChaveCriptograma(String dataValidadeChaveCriptograma) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartaoPayResponse cartaoPayResponse = (CartaoPayResponse) o;
    return Objects.equals(this.id, cartaoPayResponse.id) &&
        Objects.equals(this.numeroCartao, cartaoPayResponse.numeroCartao) &&
        Objects.equals(this.dataValidadeCartao, cartaoPayResponse.dataValidadeCartao) &&
        Objects.equals(this.nomeImpresso, cartaoPayResponse.nomeImpresso) &&
        Objects.equals(this.idEntidade, cartaoPayResponse.idEntidade) &&
        Objects.equals(this.nomeEntidade, cartaoPayResponse.nomeEntidade) &&
        Objects.equals(this.status, cartaoPayResponse.status) &&
        Objects.equals(this.dataValidadeChaveCriptograma, cartaoPayResponse.dataValidadeChaveCriptograma);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, numeroCartao, dataValidadeCartao, nomeImpresso, idEntidade, nomeEntidade, status, dataValidadeChaveCriptograma);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoPayResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numeroCartao: ").append(toIndentedString(numeroCartao)).append("\n");
    sb.append("    dataValidadeCartao: ").append(toIndentedString(dataValidadeCartao)).append("\n");
    sb.append("    nomeImpresso: ").append(toIndentedString(nomeImpresso)).append("\n");
    sb.append("    idEntidade: ").append(toIndentedString(idEntidade)).append("\n");
    sb.append("    nomeEntidade: ").append(toIndentedString(nomeEntidade)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dataValidadeChaveCriptograma: ").append(toIndentedString(dataValidadeChaveCriptograma)).append("\n");
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

