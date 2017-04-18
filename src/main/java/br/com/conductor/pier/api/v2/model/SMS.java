package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





/**
 * Objeto SMS
 **/

@ApiModel(description = "Objeto SMS")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class SMS   {
  
  private Long id = null;
  private Long nsu = null;
  private Long idEmissor = null;


  public enum TipoEventoEnum {
    RISCO_FRAUDE("RISCO_FRAUDE"),
    OUTROS("OUTROS");

    private String value;

    TipoEventoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TipoEventoEnum tipoEvento = null;


  public enum StatusEnum {
    PENDENTE("PENDENTE"),
    ENCAMINHADO("ENCAMINHADO"),
    ENVIADO("ENVIADO"),
    RESPONDIDO("RESPONDIDO"),
    ERRO("ERRO"),
    ERRO_RESPOSTA("ERRO_RESPOSTA"),
    SUCESSO_RESPOSTA("SUCESSO_RESPOSTA");

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
  private String descricaoStatus = null;
  private Long idPessoa = null;
  private Long idConta = null;
  private String celular = null;
  private String operadora = null;
  private String conteudo = null;
  private String resposta = null;
  private Date dataAgendamento = null;
  private Integer quantidadeTentativasEnvio = null;
  private Date dataInclusao = null;
  private Date dataAlteracaoStatus = null;
  private String protocolo = null;

  
  /**
   * C\u00C3\u00B3digo Identificador.
   **/
  public SMS id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo Identificador.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * N\u00C3\u00BAmero sequencial \u00C3\u00BAnico.
   **/
  public SMS nsu(Long nsu) {
    this.nsu = nsu;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero sequencial \u00C3\u00BAnico.")
  @JsonProperty("nsu")
  public Long getNsu() {
    return nsu;
  }
  public void setNsu(Long nsu) {
    this.nsu = nsu;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do emissor (id).
   **/
  public SMS idEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do emissor (id).")
  @JsonProperty("idEmissor")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * TipoEvento de notifica\u00C3\u00A7\u00C3\u00A3o
   **/
  public SMS tipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "TipoEvento de notifica\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("tipoEvento")
  public TipoEventoEnum getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   * Status de envio da notifica\u00C3\u00A7\u00C3\u00A3o
   **/
  public SMS status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Status de envio da notifica\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do status de envio da notifica\u00C3\u00A7\u00C3\u00A3o
   **/
  public SMS descricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Descri\u00C3\u00A7\u00C3\u00A3o do status de envio da notifica\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("descricaoStatus")
  public String getDescricaoStatus() {
    return descricaoStatus;
  }
  public void setDescricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
  }

  
  /**
   * C\u00C3\u00B3digo identificado da pessoa
   **/
  public SMS idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo identificado da pessoa")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da conta
   **/
  public SMS idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo identificador da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Apresenta o celular a ser eviado o SMS no formato 5588999999999 ou 5588999999999
   **/
  public SMS celular(String celular) {
    this.celular = celular;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o celular a ser eviado o SMS no formato 5588999999999 ou 5588999999999")
  @JsonProperty("celular")
  public String getCelular() {
    return celular;
  }
  public void setCelular(String celular) {
    this.celular = celular;
  }

  
  /**
   * Apresenta a operadora do celular a ser eviado o SMS
   **/
  public SMS operadora(String operadora) {
    this.operadora = operadora;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta a operadora do celular a ser eviado o SMS")
  @JsonProperty("operadora")
  public String getOperadora() {
    return operadora;
  }
  public void setOperadora(String operadora) {
    this.operadora = operadora;
  }

  
  /**
   * Apresenta o texto da notifica\u00C3\u00A7\u00C3\u00A3o a ser enviado
   **/
  public SMS conteudo(String conteudo) {
    this.conteudo = conteudo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o texto da notifica\u00C3\u00A7\u00C3\u00A3o a ser enviado")
  @JsonProperty("conteudo")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   * Apresenta o texto da resposta da notifica\u00C3\u00A7\u00C3\u00A3o que foi enviada
   **/
  public SMS resposta(String resposta) {
    this.resposta = resposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o texto da resposta da notifica\u00C3\u00A7\u00C3\u00A3o que foi enviada")
  @JsonProperty("resposta")
  public String getResposta() {
    return resposta;
  }
  public void setResposta(String resposta) {
    this.resposta = resposta;
  }

  
  /**
   * Apresenta a data e hora em que ser\u00C3\u00A1 enviado a notifica\u00C3\u00A7\u00C3\u00A3o
   **/
  public SMS dataAgendamento(Date dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta a data e hora em que ser\u00C3\u00A1 enviado a notifica\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("dataAgendamento")
  public Date getDataAgendamento() {
    return dataAgendamento;
  }
  public void setDataAgendamento(Date dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
  }

  
  /**
   * Quantidade de tentativas e envio da notifica\u00C3\u00A7\u00C3\u00A3o
   **/
  public SMS quantidadeTentativasEnvio(Integer quantidadeTentativasEnvio) {
    this.quantidadeTentativasEnvio = quantidadeTentativasEnvio;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quantidade de tentativas e envio da notifica\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("quantidadeTentativasEnvio")
  public Integer getQuantidadeTentativasEnvio() {
    return quantidadeTentativasEnvio;
  }
  public void setQuantidadeTentativasEnvio(Integer quantidadeTentativasEnvio) {
    this.quantidadeTentativasEnvio = quantidadeTentativasEnvio;
  }

  
  /**
   * Apresenta a data e em que o registro foi inclu\u00C3\u00ADdo na base para ser enviado
   **/
  public SMS dataInclusao(Date dataInclusao) {
    this.dataInclusao = dataInclusao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta a data e em que o registro foi inclu\u00C3\u00ADdo na base para ser enviado")
  @JsonProperty("dataInclusao")
  public Date getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(Date dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * Apresenta a data e em que o Stattjus do registro foi modificado
   **/
  public SMS dataAlteracaoStatus(Date dataAlteracaoStatus) {
    this.dataAlteracaoStatus = dataAlteracaoStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta a data e em que o Stattjus do registro foi modificado")
  @JsonProperty("dataAlteracaoStatus")
  public Date getDataAlteracaoStatus() {
    return dataAlteracaoStatus;
  }
  public void setDataAlteracaoStatus(Date dataAlteracaoStatus) {
    this.dataAlteracaoStatus = dataAlteracaoStatus;
  }

  
  /**
   * N\u00C3\u00BAmero do protocolo de envio de notifica\u00C3\u00A7\u00C3\u00B5es
   **/
  public SMS protocolo(String protocolo) {
    this.protocolo = protocolo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero do protocolo de envio de notifica\u00C3\u00A7\u00C3\u00B5es")
  @JsonProperty("protocolo")
  public String getProtocolo() {
    return protocolo;
  }
  public void setProtocolo(String protocolo) {
    this.protocolo = protocolo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SMS SMS = (SMS) o;
    return Objects.equals(this.id, SMS.id) &&
        Objects.equals(this.nsu, SMS.nsu) &&
        Objects.equals(this.idEmissor, SMS.idEmissor) &&
        Objects.equals(this.tipoEvento, SMS.tipoEvento) &&
        Objects.equals(this.status, SMS.status) &&
        Objects.equals(this.descricaoStatus, SMS.descricaoStatus) &&
        Objects.equals(this.idPessoa, SMS.idPessoa) &&
        Objects.equals(this.idConta, SMS.idConta) &&
        Objects.equals(this.celular, SMS.celular) &&
        Objects.equals(this.operadora, SMS.operadora) &&
        Objects.equals(this.conteudo, SMS.conteudo) &&
        Objects.equals(this.resposta, SMS.resposta) &&
        Objects.equals(this.dataAgendamento, SMS.dataAgendamento) &&
        Objects.equals(this.quantidadeTentativasEnvio, SMS.quantidadeTentativasEnvio) &&
        Objects.equals(this.dataInclusao, SMS.dataInclusao) &&
        Objects.equals(this.dataAlteracaoStatus, SMS.dataAlteracaoStatus) &&
        Objects.equals(this.protocolo, SMS.protocolo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nsu, idEmissor, tipoEvento, status, descricaoStatus, idPessoa, idConta, celular, operadora, conteudo, resposta, dataAgendamento, quantidadeTentativasEnvio, dataInclusao, dataAlteracaoStatus, protocolo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SMS {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nsu: ").append(toIndentedString(nsu)).append("\n");
    sb.append("    idEmissor: ").append(toIndentedString(idEmissor)).append("\n");
    sb.append("    tipoEvento: ").append(toIndentedString(tipoEvento)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    descricaoStatus: ").append(toIndentedString(descricaoStatus)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    celular: ").append(toIndentedString(celular)).append("\n");
    sb.append("    operadora: ").append(toIndentedString(operadora)).append("\n");
    sb.append("    conteudo: ").append(toIndentedString(conteudo)).append("\n");
    sb.append("    resposta: ").append(toIndentedString(resposta)).append("\n");
    sb.append("    dataAgendamento: ").append(toIndentedString(dataAgendamento)).append("\n");
    sb.append("    quantidadeTentativasEnvio: ").append(toIndentedString(quantidadeTentativasEnvio)).append("\n");
    sb.append("    dataInclusao: ").append(toIndentedString(dataInclusao)).append("\n");
    sb.append("    dataAlteracaoStatus: ").append(toIndentedString(dataAlteracaoStatus)).append("\n");
    sb.append("    protocolo: ").append(toIndentedString(protocolo)).append("\n");
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



