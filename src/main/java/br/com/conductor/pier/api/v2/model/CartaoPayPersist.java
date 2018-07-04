package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{cartao_pay_persist_description}}}
 **/

@ApiModel(description = "{{{cartao_pay_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoPayPersist   {
  
  private String numeroCartao = null;
  private String dataValidade = null;
  private String cvv = null;
  private String numeroReceitaFederal = null;
  private String nomeImpresso = null;
  private String chavePublicaDevice = null;

  
  /**
   * {{{cartao_pay_persist_numero_cartao_value}}}
   **/
  public CartaoPayPersist numeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{cartao_pay_persist_numero_cartao_value}}}")
  @JsonProperty("numeroCartao")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * {{{cartao_pay_persist_data_validade_value}}}
   **/
  public CartaoPayPersist dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{cartao_pay_persist_data_validade_value}}}")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * {{{cartao_pay_persist_cvv_value}}}
   **/
  public CartaoPayPersist cvv(String cvv) {
    this.cvv = cvv;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_pay_persist_cvv_value}}}")
  @JsonProperty("cvv")
  public String getCvv() {
    return cvv;
  }
  public void setCvv(String cvv) {
    this.cvv = cvv;
  }

  
  /**
   * {{{cartao_pay_persist_numero_receita_federal_value}}}
   **/
  public CartaoPayPersist numeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_pay_persist_numero_receita_federal_value}}}")
  @JsonProperty("numeroReceitaFederal")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * {{{cartao_pay_persist_nome_impresso_value}}}
   **/
  public CartaoPayPersist nomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_pay_persist_nome_impresso_value}}}")
  @JsonProperty("nomeImpresso")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * {{{cartao_pay_persist_chave_publica_device_value}}}
   **/
  public CartaoPayPersist chavePublicaDevice(String chavePublicaDevice) {
    this.chavePublicaDevice = chavePublicaDevice;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{cartao_pay_persist_chave_publica_device_value}}}")
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



