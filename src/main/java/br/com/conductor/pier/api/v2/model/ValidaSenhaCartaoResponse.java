package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de resposta para a valida\u00C3\u00A7\u00C3\u00A3o de senha do cart\u00C3\u00A3o
 **/

@ApiModel(description = "Objeto de resposta para a valida\u00C3\u00A7\u00C3\u00A3o de senha do cart\u00C3\u00A3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ValidaSenhaCartaoResponse   {
  
  private String mensagem = null;
  private Long idStatusCartao = null;
  private String statusCartao = null;
  private Integer quantidadeTentativas = null;
  private Integer quantidadeMaximaTentativas = null;

  
  /**
   * Mensagem
   **/
  public ValidaSenhaCartaoResponse mensagem(String mensagem) {
    this.mensagem = mensagem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Mensagem")
  @JsonProperty("mensagem")
  public String getMensagem() {
    return mensagem;
  }
  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do status do cart\u00C3\u00A3o
   **/
  public ValidaSenhaCartaoResponse idStatusCartao(Long idStatusCartao) {
    this.idStatusCartao = idStatusCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do status do cart\u00C3\u00A3o")
  @JsonProperty("idStatusCartao")
  public Long getIdStatusCartao() {
    return idStatusCartao;
  }
  public void setIdStatusCartao(Long idStatusCartao) {
    this.idStatusCartao = idStatusCartao;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do status do cart\u00C3\u00A3o
   **/
  public ValidaSenhaCartaoResponse statusCartao(String statusCartao) {
    this.statusCartao = statusCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do status do cart\u00C3\u00A3o")
  @JsonProperty("statusCartao")
  public String getStatusCartao() {
    return statusCartao;
  }
  public void setStatusCartao(String statusCartao) {
    this.statusCartao = statusCartao;
  }

  
  /**
   * Quantidade tentativas
   **/
  public ValidaSenhaCartaoResponse quantidadeTentativas(Integer quantidadeTentativas) {
    this.quantidadeTentativas = quantidadeTentativas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade tentativas")
  @JsonProperty("quantidadeTentativas")
  public Integer getQuantidadeTentativas() {
    return quantidadeTentativas;
  }
  public void setQuantidadeTentativas(Integer quantidadeTentativas) {
    this.quantidadeTentativas = quantidadeTentativas;
  }

  
  /**
   * Quantidade m\u00C3\u00A1xima tentativas permitidas
   **/
  public ValidaSenhaCartaoResponse quantidadeMaximaTentativas(Integer quantidadeMaximaTentativas) {
    this.quantidadeMaximaTentativas = quantidadeMaximaTentativas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade m\u00C3\u00A1xima tentativas permitidas")
  @JsonProperty("quantidadeMaximaTentativas")
  public Integer getQuantidadeMaximaTentativas() {
    return quantidadeMaximaTentativas;
  }
  public void setQuantidadeMaximaTentativas(Integer quantidadeMaximaTentativas) {
    this.quantidadeMaximaTentativas = quantidadeMaximaTentativas;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidaSenhaCartaoResponse validaSenhaCartaoResponse = (ValidaSenhaCartaoResponse) o;
    return Objects.equals(this.mensagem, validaSenhaCartaoResponse.mensagem) &&
        Objects.equals(this.idStatusCartao, validaSenhaCartaoResponse.idStatusCartao) &&
        Objects.equals(this.statusCartao, validaSenhaCartaoResponse.statusCartao) &&
        Objects.equals(this.quantidadeTentativas, validaSenhaCartaoResponse.quantidadeTentativas) &&
        Objects.equals(this.quantidadeMaximaTentativas, validaSenhaCartaoResponse.quantidadeMaximaTentativas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mensagem, idStatusCartao, statusCartao, quantidadeTentativas, quantidadeMaximaTentativas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidaSenhaCartaoResponse {\n");
    
    sb.append("    mensagem: ").append(toIndentedString(mensagem)).append("\n");
    sb.append("    idStatusCartao: ").append(toIndentedString(idStatusCartao)).append("\n");
    sb.append("    statusCartao: ").append(toIndentedString(statusCartao)).append("\n");
    sb.append("    quantidadeTentativas: ").append(toIndentedString(quantidadeTentativas)).append("\n");
    sb.append("    quantidadeMaximaTentativas: ").append(toIndentedString(quantidadeMaximaTentativas)).append("\n");
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

