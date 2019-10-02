package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de resposta do CVV din\u00E2mico
 **/

@ApiModel(description = "Objeto de resposta do CVV din\u00E2mico")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CvvDinamicoResponse   {
  
  private Long id = null;
  private Long idCartao = null;
  private String dataExpiracao = null;
  private String dataGeracao = null;
  private String cvv2 = null;

  
  /**
   * Identificador da entidade
   **/
  public CvvDinamicoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da entidade")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identificador do cart\u00E3o
   **/
  public CvvDinamicoResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do cart\u00E3o")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Data de expira\u00E7\u00E3o do CVV din\u00E2mico
   **/
  public CvvDinamicoResponse dataExpiracao(String dataExpiracao) {
    this.dataExpiracao = dataExpiracao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ", value = "Data de expira\u00E7\u00E3o do CVV din\u00E2mico")
  @JsonProperty("dataExpiracao")
  public String getDataExpiracao() {
    return dataExpiracao;
  }
  public void setDataExpiracao(String dataExpiracao) {
    this.dataExpiracao = dataExpiracao;
  }

  
  /**
   * Data de gera\u00E7\u00E3o do CVV din\u00E2mico
   **/
  public CvvDinamicoResponse dataGeracao(String dataGeracao) {
    this.dataGeracao = dataGeracao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ", value = "Data de gera\u00E7\u00E3o do CVV din\u00E2mico")
  @JsonProperty("dataGeracao")
  public String getDataGeracao() {
    return dataGeracao;
  }
  public void setDataGeracao(String dataGeracao) {
    this.dataGeracao = dataGeracao;
  }

  
  /**
   * CVV2
   **/
  public CvvDinamicoResponse cvv2(String cvv2) {
    this.cvv2 = cvv2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CVV2")
  @JsonProperty("cvv2")
  public String getCvv2() {
    return cvv2;
  }
  public void setCvv2(String cvv2) {
    this.cvv2 = cvv2;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CvvDinamicoResponse cvvDinamicoResponse = (CvvDinamicoResponse) o;
    return Objects.equals(this.id, cvvDinamicoResponse.id) &&
        Objects.equals(this.idCartao, cvvDinamicoResponse.idCartao) &&
        Objects.equals(this.dataExpiracao, cvvDinamicoResponse.dataExpiracao) &&
        Objects.equals(this.dataGeracao, cvvDinamicoResponse.dataGeracao) &&
        Objects.equals(this.cvv2, cvvDinamicoResponse.cvv2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idCartao, dataExpiracao, dataGeracao, cvv2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CvvDinamicoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    dataExpiracao: ").append(toIndentedString(dataExpiracao)).append("\n");
    sb.append("    dataGeracao: ").append(toIndentedString(dataGeracao)).append("\n");
    sb.append("    cvv2: ").append(toIndentedString(cvv2)).append("\n");
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

