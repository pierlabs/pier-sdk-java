package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto SMS
 **/

@ApiModel(description = "Objeto SMS")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class SMSEnvioResponse   {
  
  private Long id = null;
  private String status = null;
  private Long idConta = null;
  private String celular = null;
  private String conteudo = null;
  private Integer quantidadeTentativasEnvio = null;
  private String dataInclusao = null;
  private String cpf = null;

  
  /**
   * C\u00F3digo identificador
   **/
  public SMSEnvioResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Status do SMS
   **/
  public SMSEnvioResponse status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status do SMS")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * identificador da conta
   **/
  public SMSEnvioResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "identificador da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * N\u00FAmero do celular
   **/
  public SMSEnvioResponse celular(String celular) {
    this.celular = celular;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do celular")
  @JsonProperty("celular")
  public String getCelular() {
    return celular;
  }
  public void setCelular(String celular) {
    this.celular = celular;
  }

  
  /**
   * Conte\u00FAdo da mensagem
   **/
  public SMSEnvioResponse conteudo(String conteudo) {
    this.conteudo = conteudo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conte\u00FAdo da mensagem")
  @JsonProperty("conteudo")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   * N\u00FAmero de tentativas de envio
   **/
  public SMSEnvioResponse quantidadeTentativasEnvio(Integer quantidadeTentativasEnvio) {
    this.quantidadeTentativasEnvio = quantidadeTentativasEnvio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero de tentativas de envio")
  @JsonProperty("quantidadeTentativasEnvio")
  public Integer getQuantidadeTentativasEnvio() {
    return quantidadeTentativasEnvio;
  }
  public void setQuantidadeTentativasEnvio(Integer quantidadeTentativasEnvio) {
    this.quantidadeTentativasEnvio = quantidadeTentativasEnvio;
  }

  
  /**
   * Data de Inclus\u00E3o
   **/
  public SMSEnvioResponse dataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de Inclus\u00E3o")
  @JsonProperty("dataInclusao")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * CPF do cliente referente ao SMS enviado
   **/
  public SMSEnvioResponse cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CPF do cliente referente ao SMS enviado")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SMSEnvioResponse sMSEnvioResponse = (SMSEnvioResponse) o;
    return Objects.equals(this.id, sMSEnvioResponse.id) &&
        Objects.equals(this.status, sMSEnvioResponse.status) &&
        Objects.equals(this.idConta, sMSEnvioResponse.idConta) &&
        Objects.equals(this.celular, sMSEnvioResponse.celular) &&
        Objects.equals(this.conteudo, sMSEnvioResponse.conteudo) &&
        Objects.equals(this.quantidadeTentativasEnvio, sMSEnvioResponse.quantidadeTentativasEnvio) &&
        Objects.equals(this.dataInclusao, sMSEnvioResponse.dataInclusao) &&
        Objects.equals(this.cpf, sMSEnvioResponse.cpf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, idConta, celular, conteudo, quantidadeTentativasEnvio, dataInclusao, cpf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SMSEnvioResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    celular: ").append(toIndentedString(celular)).append("\n");
    sb.append("    conteudo: ").append(toIndentedString(conteudo)).append("\n");
    sb.append("    quantidadeTentativasEnvio: ").append(toIndentedString(quantidadeTentativasEnvio)).append("\n");
    sb.append("    dataInclusao: ").append(toIndentedString(dataInclusao)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
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

