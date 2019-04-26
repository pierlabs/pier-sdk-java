package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de persist\u00EAncia da seguran\u00E7a mobile
 **/

@ApiModel(description = "Objeto de persist\u00EAncia da seguran\u00E7a mobile")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class SegurancaMobilePersist   {
  


  public enum StatusRequisicaoEnum {
    PENDENTE("PENDENTE"),
    APROVADA("APROVADA"),
    NEGADA("NEGADA"),
    CANCELADA("CANCELADA"),
    ATIVADO("ATIVADO");

    private String value;

    StatusRequisicaoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusRequisicaoEnum statusRequisicao = null;
  private String cpfCnpj = null;
  private String dataExpiracao = null;
  private String token = null;
  private String tablet = null;
  private String deviceName = null;
  private String deviceToken = null;
  private String canal = null;
  private String dataUtilizacao = null;
  private String dataAtivacao = null;
  private String chapaPromotor = null;
  private String codOperacaoNeurotech = null;
  private String respostaNeurotech = null;

  
  /**
   * Status da requisi\u00E7\u00E3o/solicita\u00E7\u00E3o do token
   **/
  public SegurancaMobilePersist statusRequisicao(StatusRequisicaoEnum statusRequisicao) {
    this.statusRequisicao = statusRequisicao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Status da requisi\u00E7\u00E3o/solicita\u00E7\u00E3o do token")
  @JsonProperty("statusRequisicao")
  public StatusRequisicaoEnum getStatusRequisicao() {
    return statusRequisicao;
  }
  public void setStatusRequisicao(StatusRequisicaoEnum statusRequisicao) {
    this.statusRequisicao = statusRequisicao;
  }

  
  /**
   * CNPJ ou CPF da pessoa
   **/
  public SegurancaMobilePersist cpfCnpj(String cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "CNPJ ou CPF da pessoa")
  @JsonProperty("cpfCnpj")
  public String getCpfCnpj() {
    return cpfCnpj;
  }
  public void setCpfCnpj(String cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
  }

  
  /**
   * Data da expira\u00E7\u00E3o do token
   **/
  public SegurancaMobilePersist dataExpiracao(String dataExpiracao) {
    this.dataExpiracao = dataExpiracao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", required = true, value = "Data da expira\u00E7\u00E3o do token")
  @JsonProperty("dataExpiracao")
  public String getDataExpiracao() {
    return dataExpiracao;
  }
  public void setDataExpiracao(String dataExpiracao) {
    this.dataExpiracao = dataExpiracao;
  }

  
  /**
   * Valor do token
   **/
  public SegurancaMobilePersist token(String token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do token")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * Identificador do Tablet
   **/
  public SegurancaMobilePersist tablet(String tablet) {
    this.tablet = tablet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do Tablet")
  @JsonProperty("tablet")
  public String getTablet() {
    return tablet;
  }
  public void setTablet(String tablet) {
    this.tablet = tablet;
  }

  
  /**
   * Nome do dispositivo
   **/
  public SegurancaMobilePersist deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do dispositivo")
  @JsonProperty("deviceName")
  public String getDeviceName() {
    return deviceName;
  }
  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  
  /**
   * Token do dispositivo
   **/
  public SegurancaMobilePersist deviceToken(String deviceToken) {
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
   * Canal de entrada
   **/
  public SegurancaMobilePersist canal(String canal) {
    this.canal = canal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Canal de entrada")
  @JsonProperty("canal")
  public String getCanal() {
    return canal;
  }
  public void setCanal(String canal) {
    this.canal = canal;
  }

  
  /**
   * Data da utiliza\u00E7\u00E3o do token
   **/
  public SegurancaMobilePersist dataUtilizacao(String dataUtilizacao) {
    this.dataUtilizacao = dataUtilizacao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "Data da utiliza\u00E7\u00E3o do token")
  @JsonProperty("dataUtilizacao")
  public String getDataUtilizacao() {
    return dataUtilizacao;
  }
  public void setDataUtilizacao(String dataUtilizacao) {
    this.dataUtilizacao = dataUtilizacao;
  }

  
  /**
   * Data da ativa\u00E7\u00E3o do token
   **/
  public SegurancaMobilePersist dataAtivacao(String dataAtivacao) {
    this.dataAtivacao = dataAtivacao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "Data da ativa\u00E7\u00E3o do token")
  @JsonProperty("dataAtivacao")
  public String getDataAtivacao() {
    return dataAtivacao;
  }
  public void setDataAtivacao(String dataAtivacao) {
    this.dataAtivacao = dataAtivacao;
  }

  
  /**
   * Chapa do promotor 
   **/
  public SegurancaMobilePersist chapaPromotor(String chapaPromotor) {
    this.chapaPromotor = chapaPromotor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Chapa do promotor ")
  @JsonProperty("chapaPromotor")
  public String getChapaPromotor() {
    return chapaPromotor;
  }
  public void setChapaPromotor(String chapaPromotor) {
    this.chapaPromotor = chapaPromotor;
  }

  
  /**
   * C\u00F3digo de opera\u00E7\u00E3o da Neurotech
   **/
  public SegurancaMobilePersist codOperacaoNeurotech(String codOperacaoNeurotech) {
    this.codOperacaoNeurotech = codOperacaoNeurotech;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de opera\u00E7\u00E3o da Neurotech")
  @JsonProperty("codOperacaoNeurotech")
  public String getCodOperacaoNeurotech() {
    return codOperacaoNeurotech;
  }
  public void setCodOperacaoNeurotech(String codOperacaoNeurotech) {
    this.codOperacaoNeurotech = codOperacaoNeurotech;
  }

  
  /**
   * Resposta da Neurotech
   **/
  public SegurancaMobilePersist respostaNeurotech(String respostaNeurotech) {
    this.respostaNeurotech = respostaNeurotech;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Resposta da Neurotech")
  @JsonProperty("respostaNeurotech")
  public String getRespostaNeurotech() {
    return respostaNeurotech;
  }
  public void setRespostaNeurotech(String respostaNeurotech) {
    this.respostaNeurotech = respostaNeurotech;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegurancaMobilePersist segurancaMobilePersist = (SegurancaMobilePersist) o;
    return Objects.equals(this.statusRequisicao, segurancaMobilePersist.statusRequisicao) &&
        Objects.equals(this.cpfCnpj, segurancaMobilePersist.cpfCnpj) &&
        Objects.equals(this.dataExpiracao, segurancaMobilePersist.dataExpiracao) &&
        Objects.equals(this.token, segurancaMobilePersist.token) &&
        Objects.equals(this.tablet, segurancaMobilePersist.tablet) &&
        Objects.equals(this.deviceName, segurancaMobilePersist.deviceName) &&
        Objects.equals(this.deviceToken, segurancaMobilePersist.deviceToken) &&
        Objects.equals(this.canal, segurancaMobilePersist.canal) &&
        Objects.equals(this.dataUtilizacao, segurancaMobilePersist.dataUtilizacao) &&
        Objects.equals(this.dataAtivacao, segurancaMobilePersist.dataAtivacao) &&
        Objects.equals(this.chapaPromotor, segurancaMobilePersist.chapaPromotor) &&
        Objects.equals(this.codOperacaoNeurotech, segurancaMobilePersist.codOperacaoNeurotech) &&
        Objects.equals(this.respostaNeurotech, segurancaMobilePersist.respostaNeurotech);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusRequisicao, cpfCnpj, dataExpiracao, token, tablet, deviceName, deviceToken, canal, dataUtilizacao, dataAtivacao, chapaPromotor, codOperacaoNeurotech, respostaNeurotech);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegurancaMobilePersist {\n");
    
    sb.append("    statusRequisicao: ").append(toIndentedString(statusRequisicao)).append("\n");
    sb.append("    cpfCnpj: ").append(toIndentedString(cpfCnpj)).append("\n");
    sb.append("    dataExpiracao: ").append(toIndentedString(dataExpiracao)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tablet: ").append(toIndentedString(tablet)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    deviceToken: ").append(toIndentedString(deviceToken)).append("\n");
    sb.append("    canal: ").append(toIndentedString(canal)).append("\n");
    sb.append("    dataUtilizacao: ").append(toIndentedString(dataUtilizacao)).append("\n");
    sb.append("    dataAtivacao: ").append(toIndentedString(dataAtivacao)).append("\n");
    sb.append("    chapaPromotor: ").append(toIndentedString(chapaPromotor)).append("\n");
    sb.append("    codOperacaoNeurotech: ").append(toIndentedString(codOperacaoNeurotech)).append("\n");
    sb.append("    respostaNeurotech: ").append(toIndentedString(respostaNeurotech)).append("\n");
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

