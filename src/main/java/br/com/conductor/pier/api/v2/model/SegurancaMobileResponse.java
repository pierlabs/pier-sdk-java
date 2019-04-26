package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de resposta da seguran\u00E7a mobile
 **/

@ApiModel(description = "Objeto de resposta da seguran\u00E7a mobile")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class SegurancaMobileResponse   {
  
  private String canal = null;
  private String chapaPromotor = null;
  private String codOperacaoNeurotech = null;
  private String cpfCnpj = null;
  private String dataAtivacao = null;
  private String dataExpiracao = null;
  private String dataUtilizacao = null;
  private String deviceName = null;
  private String deviceToken = null;
  private Long id = null;
  private Long idConta = null;
  private String respostaNeurotech = null;


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
  private String tablet = null;
  private String token = null;

  
  /**
   * Canal de entrada
   **/
  public SegurancaMobileResponse canal(String canal) {
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
   * Chapa do promotor 
   **/
  public SegurancaMobileResponse chapaPromotor(String chapaPromotor) {
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
  public SegurancaMobileResponse codOperacaoNeurotech(String codOperacaoNeurotech) {
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
   * CNPJ ou CPF da pessoa
   **/
  public SegurancaMobileResponse cpfCnpj(String cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CNPJ ou CPF da pessoa")
  @JsonProperty("cpfCnpj")
  public String getCpfCnpj() {
    return cpfCnpj;
  }
  public void setCpfCnpj(String cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
  }

  
  /**
   * Data da ativa\u00E7\u00E3o do token
   **/
  public SegurancaMobileResponse dataAtivacao(String dataAtivacao) {
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
   * Data da expira\u00E7\u00E3o do token
   **/
  public SegurancaMobileResponse dataExpiracao(String dataExpiracao) {
    this.dataExpiracao = dataExpiracao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "Data da expira\u00E7\u00E3o do token")
  @JsonProperty("dataExpiracao")
  public String getDataExpiracao() {
    return dataExpiracao;
  }
  public void setDataExpiracao(String dataExpiracao) {
    this.dataExpiracao = dataExpiracao;
  }

  
  /**
   * Data da utiliza\u00E7\u00E3o do token
   **/
  public SegurancaMobileResponse dataUtilizacao(String dataUtilizacao) {
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
   * Nome do dispositivo
   **/
  public SegurancaMobileResponse deviceName(String deviceName) {
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
  public SegurancaMobileResponse deviceToken(String deviceToken) {
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
   * Identificador da seguran\u00E7a mobile
   **/
  public SegurancaMobileResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da seguran\u00E7a mobile")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identificador da conta
   **/
  public SegurancaMobileResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Resposta da Neurotech
   **/
  public SegurancaMobileResponse respostaNeurotech(String respostaNeurotech) {
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

  
  /**
   * Status da requisi\u00E7\u00E3o/solicita\u00E7\u00E3o do token
   **/
  public SegurancaMobileResponse statusRequisicao(StatusRequisicaoEnum statusRequisicao) {
    this.statusRequisicao = statusRequisicao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status da requisi\u00E7\u00E3o/solicita\u00E7\u00E3o do token")
  @JsonProperty("statusRequisicao")
  public StatusRequisicaoEnum getStatusRequisicao() {
    return statusRequisicao;
  }
  public void setStatusRequisicao(StatusRequisicaoEnum statusRequisicao) {
    this.statusRequisicao = statusRequisicao;
  }

  
  /**
   * Identificador do Tablet
   **/
  public SegurancaMobileResponse tablet(String tablet) {
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
   * Valor do token
   **/
  public SegurancaMobileResponse token(String token) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegurancaMobileResponse segurancaMobileResponse = (SegurancaMobileResponse) o;
    return Objects.equals(this.canal, segurancaMobileResponse.canal) &&
        Objects.equals(this.chapaPromotor, segurancaMobileResponse.chapaPromotor) &&
        Objects.equals(this.codOperacaoNeurotech, segurancaMobileResponse.codOperacaoNeurotech) &&
        Objects.equals(this.cpfCnpj, segurancaMobileResponse.cpfCnpj) &&
        Objects.equals(this.dataAtivacao, segurancaMobileResponse.dataAtivacao) &&
        Objects.equals(this.dataExpiracao, segurancaMobileResponse.dataExpiracao) &&
        Objects.equals(this.dataUtilizacao, segurancaMobileResponse.dataUtilizacao) &&
        Objects.equals(this.deviceName, segurancaMobileResponse.deviceName) &&
        Objects.equals(this.deviceToken, segurancaMobileResponse.deviceToken) &&
        Objects.equals(this.id, segurancaMobileResponse.id) &&
        Objects.equals(this.idConta, segurancaMobileResponse.idConta) &&
        Objects.equals(this.respostaNeurotech, segurancaMobileResponse.respostaNeurotech) &&
        Objects.equals(this.statusRequisicao, segurancaMobileResponse.statusRequisicao) &&
        Objects.equals(this.tablet, segurancaMobileResponse.tablet) &&
        Objects.equals(this.token, segurancaMobileResponse.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canal, chapaPromotor, codOperacaoNeurotech, cpfCnpj, dataAtivacao, dataExpiracao, dataUtilizacao, deviceName, deviceToken, id, idConta, respostaNeurotech, statusRequisicao, tablet, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegurancaMobileResponse {\n");
    
    sb.append("    canal: ").append(toIndentedString(canal)).append("\n");
    sb.append("    chapaPromotor: ").append(toIndentedString(chapaPromotor)).append("\n");
    sb.append("    codOperacaoNeurotech: ").append(toIndentedString(codOperacaoNeurotech)).append("\n");
    sb.append("    cpfCnpj: ").append(toIndentedString(cpfCnpj)).append("\n");
    sb.append("    dataAtivacao: ").append(toIndentedString(dataAtivacao)).append("\n");
    sb.append("    dataExpiracao: ").append(toIndentedString(dataExpiracao)).append("\n");
    sb.append("    dataUtilizacao: ").append(toIndentedString(dataUtilizacao)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    deviceToken: ").append(toIndentedString(deviceToken)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    respostaNeurotech: ").append(toIndentedString(respostaNeurotech)).append("\n");
    sb.append("    statusRequisicao: ").append(toIndentedString(statusRequisicao)).append("\n");
    sb.append("    tablet: ").append(toIndentedString(tablet)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

