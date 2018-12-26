package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.AplicacaoMobileEmissorResponse;
import br.com.conductor.pier.api.v2.model.CartaoEmissorResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa a resposta de uma inscricao APN
 **/

@ApiModel(description = "Representa a resposta de uma inscricao APN")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class InscricaoAPNResponse   {
  
  private AplicacaoMobileEmissorResponse aplicacaoMobile = null;
  private Boolean ativo = null;
  private CartaoEmissorResponse cartao = null;
  private String dataCriacao = null;
  private String dataDesativacao = null;
  private String deviceToken = null;
  private Long id = null;

  
  /**
   * Representa a aplica\u00E7\u00E3o mobile da inscri\u00E7\u00E3o
   **/
  public InscricaoAPNResponse aplicacaoMobile(AplicacaoMobileEmissorResponse aplicacaoMobile) {
    this.aplicacaoMobile = aplicacaoMobile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Representa a aplica\u00E7\u00E3o mobile da inscri\u00E7\u00E3o")
  @JsonProperty("aplicacaoMobile")
  public AplicacaoMobileEmissorResponse getAplicacaoMobile() {
    return aplicacaoMobile;
  }
  public void setAplicacaoMobile(AplicacaoMobileEmissorResponse aplicacaoMobile) {
    this.aplicacaoMobile = aplicacaoMobile;
  }

  
  /**
   * Indica se a inscri\u00E7\u00E3o est\u00E1 ativa
   **/
  public InscricaoAPNResponse ativo(Boolean ativo) {
    this.ativo = ativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indica se a inscri\u00E7\u00E3o est\u00E1 ativa")
  @JsonProperty("ativo")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * Representa o cart\u00E3o associado \u00E0 inscri\u00E7\u00E3o
   **/
  public InscricaoAPNResponse cartao(CartaoEmissorResponse cartao) {
    this.cartao = cartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Representa o cart\u00E3o associado \u00E0 inscri\u00E7\u00E3o")
  @JsonProperty("cartao")
  public CartaoEmissorResponse getCartao() {
    return cartao;
  }
  public void setCartao(CartaoEmissorResponse cartao) {
    this.cartao = cartao;
  }

  
  /**
   * Data da cria\u00E7\u00E3o da inscri\u00E7\u00E3o
   **/
  public InscricaoAPNResponse dataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data da cria\u00E7\u00E3o da inscri\u00E7\u00E3o")
  @JsonProperty("dataCriacao")
  public String getDataCriacao() {
    return dataCriacao;
  }
  public void setDataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  
  /**
   * Data da desativa\u00E7\u00E3o da inscri\u00E7\u00E3o
   **/
  public InscricaoAPNResponse dataDesativacao(String dataDesativacao) {
    this.dataDesativacao = dataDesativacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data da desativa\u00E7\u00E3o da inscri\u00E7\u00E3o")
  @JsonProperty("dataDesativacao")
  public String getDataDesativacao() {
    return dataDesativacao;
  }
  public void setDataDesativacao(String dataDesativacao) {
    this.dataDesativacao = dataDesativacao;
  }

  
  /**
   * Token do dispositivo
   **/
  public InscricaoAPNResponse deviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Token do dispositivo")
  @JsonProperty("deviceToken")
  public String getDeviceToken() {
    return deviceToken;
  }
  public void setDeviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
  }

  
  /**
   * Id da inscri\u00E7\u00E3o
   **/
  public InscricaoAPNResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id da inscri\u00E7\u00E3o")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InscricaoAPNResponse inscricaoAPNResponse = (InscricaoAPNResponse) o;
    return Objects.equals(this.aplicacaoMobile, inscricaoAPNResponse.aplicacaoMobile) &&
        Objects.equals(this.ativo, inscricaoAPNResponse.ativo) &&
        Objects.equals(this.cartao, inscricaoAPNResponse.cartao) &&
        Objects.equals(this.dataCriacao, inscricaoAPNResponse.dataCriacao) &&
        Objects.equals(this.dataDesativacao, inscricaoAPNResponse.dataDesativacao) &&
        Objects.equals(this.deviceToken, inscricaoAPNResponse.deviceToken) &&
        Objects.equals(this.id, inscricaoAPNResponse.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aplicacaoMobile, ativo, cartao, dataCriacao, dataDesativacao, deviceToken, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InscricaoAPNResponse {\n");
    
    sb.append("    aplicacaoMobile: ").append(toIndentedString(aplicacaoMobile)).append("\n");
    sb.append("    ativo: ").append(toIndentedString(ativo)).append("\n");
    sb.append("    cartao: ").append(toIndentedString(cartao)).append("\n");
    sb.append("    dataCriacao: ").append(toIndentedString(dataCriacao)).append("\n");
    sb.append("    dataDesativacao: ").append(toIndentedString(dataDesativacao)).append("\n");
    sb.append("    deviceToken: ").append(toIndentedString(deviceToken)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

