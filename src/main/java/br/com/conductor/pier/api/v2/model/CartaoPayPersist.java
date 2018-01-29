package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso atualizar cart\u00C3\u00A3o
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso atualizar cart\u00C3\u00A3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoPayPersist   {
  
  private String numeroCartao = null;
  private String dataValidade = null;
  private String cvv = null;
  private String numeroReceitaFederal = null;
  private String nomeImpresso = null;
  private String chavePublicaDevice = null;

  
  /**
   * N\u00C3\u00BAmero do cart\u00C3\u00A3o criptografado
   **/
  public CartaoPayPersist numeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00C3\u00BAmero do cart\u00C3\u00A3o criptografado")
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
  public CartaoPayPersist dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data de validade do cart\u00C3\u00A3o")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * CVV do cart\u00C3\u00A3o criptografado
   **/
  public CartaoPayPersist cvv(String cvv) {
    this.cvv = cvv;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CVV do cart\u00C3\u00A3o criptografado")
  @JsonProperty("cvv")
  public String getCvv() {
    return cvv;
  }
  public void setCvv(String cvv) {
    this.cvv = cvv;
  }

  
  /**
   * CPF do portador do cart\u00C3\u00A3o criptografado
   **/
  public CartaoPayPersist numeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CPF do portador do cart\u00C3\u00A3o criptografado")
  @JsonProperty("numeroReceitaFederal")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * Nome impresso no cart\u00C3\u00A3o criptografado
   **/
  public CartaoPayPersist nomeImpresso(String nomeImpresso) {
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
   * Chave p\u00C3\u00BAblica do dispositivo criptografada
   **/
  public CartaoPayPersist chavePublicaDevice(String chavePublicaDevice) {
    this.chavePublicaDevice = chavePublicaDevice;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Chave p\u00C3\u00BAblica do dispositivo criptografada")
  @JsonProperty("chavePublicaDevice")
  public String getChavePublicaDevice() {
    return chavePublicaDevice;
  }
  public void setChavePublicaDevice(String chavePublicaDevice) {
    this.chavePublicaDevice = chavePublicaDevice;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartaoPayPersist cartaoPayPersist = (CartaoPayPersist) o;
    return Objects.equals(this.numeroCartao, cartaoPayPersist.numeroCartao) &&
        Objects.equals(this.dataValidade, cartaoPayPersist.dataValidade) &&
        Objects.equals(this.cvv, cartaoPayPersist.cvv) &&
        Objects.equals(this.numeroReceitaFederal, cartaoPayPersist.numeroReceitaFederal) &&
        Objects.equals(this.nomeImpresso, cartaoPayPersist.nomeImpresso) &&
        Objects.equals(this.chavePublicaDevice, cartaoPayPersist.chavePublicaDevice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroCartao, dataValidade, cvv, numeroReceitaFederal, nomeImpresso, chavePublicaDevice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoPayPersist {\n");
    
    sb.append("    numeroCartao: ").append(toIndentedString(numeroCartao)).append("\n");
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    cvv: ").append(toIndentedString(cvv)).append("\n");
    sb.append("    numeroReceitaFederal: ").append(toIndentedString(numeroReceitaFederal)).append("\n");
    sb.append("    nomeImpresso: ").append(toIndentedString(nomeImpresso)).append("\n");
    sb.append("    chavePublicaDevice: ").append(toIndentedString(chavePublicaDevice)).append("\n");
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

